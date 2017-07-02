#! /usr/bin/env python
# -*- coding: utf-8

from __future__ import unicode_literals

from collections import defaultdict
import re

data = list(map(lambda line: line[:-1].decode('UTF-8'), open('Korean__Words.csv')))
#data = list(map(lambda line: line[:-1].decode('UTF-8'), open('Korean__Words.csv')))[57:58]

LEFT_RE = re.compile(r'^(.*)\((.*)\)$')
RIGHT_RE = re.compile(r'^(.*?)\((.*?)\)')

sure_non_matches = []
non_matches = []
length_mismatches = []
with_alternatives = []
matches = []
meanings = defaultdict(list)

def strip_quotes(s):
    if s.startswith('"') and s.endswith('"'):
        return s[1:-1]
    return s

def is_han(c):
    '\u4e00' < c < '\u9fff'

def words_to_clojure(matches):
    return "(def words [\n{}])\n\n".format("\n".join(
        '            ["{k}" "{h}" "{tr}"]'
        .format(
            k=korean,
            ks=" " * (16 - len(korean) * 2),
            h=hanja,
            hs="\t",
            tr=translation)
        for korean, hanja, translation, _ in matches))

def meanings_to_clojure(meanings):
    return "(def hanja {\n" + "\n".join(
        '            \\{h} "{m}"'.format(
            h=k, m=v)
        for k, v in meanings.items()) + "})\n\n"

def main():
    for row in data:
        if '(kor.)' in row:
            sure_non_matches.append("KOR  {}".format(row))
            continue
        # if all(not is_han(c) for c in row):
        #     print row.encode('UTF-8')
        #     continue
        # continue
        korean, translation, hanja, meaning = list(map(strip_quotes, row.split('\t')))
        if not hanja:
            # old style note
            m = LEFT_RE.match(korean)
            if not m:
                non_matches.append("LEFT  {}".format(row))
                continue
            korean, hanja = m.groups()
            korean = korean.strip()

            m = RIGHT_RE.match(translation)
            if not m:
                non_matches.append("RIGHT {}".format(row))
                continue

            translation, meaning = m.groups()

        if len(korean) != len(hanja):
            if korean[-2:] == "하다":
                if hanja.endswith('-'):
                    hanja += '-'
                else:
                    hanja += '--'

        record = (korean, hanja, translation.strip(), meaning)

        if len(korean) != len(hanja):
            if '/' in hanja:
                with_alternatives.append(record)
                continue

            length_mismatches.append(record)
            continue

        for h_c, m in zip(hanja, meaning.split('-')):
            meanings[h_c].append(m.strip())

        matches.append(record)

    clean_meanings = {k: ", ".join(x for x in list(set(v)) if x)
                      for k, v in meanings.items()
                      if any(v) and k.strip()}

    # print("{}/{}/{} non-matches:".format(len(sure_non_matches), len(non_matches), len(data)))
    # s = "\n".join(sure_non_matches)
    s = "\n".join(non_matches)

    # s = "\n".join("{k}{ks}{h}{hs}{tr}".format(
    #     k=korean,
    #     ks=" " * (16 - len(korean) * 2),
    #     h=hanja,
    #     hs="\t",
    #     tr=translation,
    #     m=meaning)
    #               for korean, hanja, translation, meaning in matches)
    # s = "\n".join("\t".join(r) for r in sure_non_matches)

    # s = meanings_to_clojure(clean_meanings)
    # s += words_to_clojure(matches)

    # s = "\n".join("{}: {}".format(k, v) for k, v in clean_meanings.items())


    print(s.encode('UTF-8'))


if __name__ == '__main__':
    main()
