(ns koreansrs.data)

(def hanja {
            \禁 "forbid"
            \退 "retreat"
            \待 "wait"
            \劇 "drama (violent?)"
            \專 "exclusively"
            \預 "요금, 현금, 금성"
            \外 "outside"
            \料 "무료, 현금, 예금, 금성, material, regulate, materials"
            \洞 "ravine, hole"
            \造 "make"
            \被 "suffer"
            \未 "not"
            \熱 "hot, 열정"
            \然 "certainly"
            \方 "direction, square"
            \吸 "breath"
            \强 "strong"
            \放 "방송, 학생, 유학, drive out"
            \駁 "refute"
            \血 "blood"
            \必 "중요하다, 요구, 주요, 성격, 성관계, right away"
            \勇 "brave"
            \反 "repeat"
            \敎 "teach"
            \金 "metal (money), metal(money)"
            \卒 "finish"
            \濕 "wet"
            \摘 "pick"
            \薑 "ginger"
            \賣 "예매, 판매"
            \止 "stop"
            \知 "know"
            \除 "deduct"
            \早 "early"
            \周 "round"
            \士 "scholar"
            \罪 "sin"
            \揭 "lift up"
            \念 "think"
            \蹴 "농구, 야구"
            \全 "perfect"
            \滿 "full"
            \扇 "fan"
            \球 "ball"
            \的 "target"
            \切 "correspond(?), correspond"
            \個 "individual"
            \輕 "leicht"
            \華 "shine"
            \列 "자전거, 주차"
            \視 "look at"
            \紙 "paper, 설문지"
            \謝 "thank"
            \銜 "bit"
            \星 "star"
            \無 "nothing, 무화과, 요금"
            \氣 "air"
            \客 "guest"
            \交 "환승, 환전, 환절기, 환불, 환율, mix, exchange"
            \循 "revolve"
            \是 "this, right"
            \單 "single, 간단하다, 단어, 단, 전단"
            \失 "실례, 실망, 분실물, 실종신고, 수첩, 손수건, 선수, 세수, 수술, 박수, 실수, 실례, 분실물, 실종신고, 희망, lose, 실망, 실수, 실종신고, 장례식"
            \證 "evidence"
            \該 "prepare/should(?)"
            \張 "extend"
            \暴 "violent"
            \刷 "print"
            \憶 "recall"
            \貸 "lend"
            \疾 "disease"
            \則 "norm, rule"
            \配 "distribute"
            \運 "move, transport, 운동"
            \契 "bond"
            \毒 "poison"
            \偏 "incline, be biased, 편견, 식도, 식사량"
            \驗 "examine"
            \留 "stay"
            \號 "shout"
            \盤 "tray"
            \姦 "adultery"
            \注 "richten"
            \火 "fire"
            \景 "scenery, scenery (sunshine?)"
            \差 "difference"
            \共 "together"
            \味 "taste"
            \直 "straight"
            \基 "base"
            \卽 "namely"
            \狼 "wolf"
            \巾 "towel"
            \老 "old"
            \樂 "music"
            \弄 "경험담, 상담"
            \宇 "house"
            \見 "see"
            \上 "above"
            \認 "recognize"
            \發 "send out"
            \經 "pass through"
            \演 "perform"
            \算 "count"
            \沙 "사과, 청진기, 식기, 가습기, sand"
            \唘 "enlighten"
            \趣 "what attracts one's attention, 조미료, 의미"
            \況 "much more, let alone"
            \販 "매진, 예매"
            \用 "use, 용건, 신용 카드, 식용유, 비용, 응용"
            \醫 "의료, 약사, 교사, 간호사, 의사, 치료, 진료"
            \踪 "trace"
            \颱 "storm"
            \足 "satisfy"
            \爲 "do, make"
            \油 "oil"
            \便 "convenient, convenience, ease"
            \磁 "porcelain"
            \計 "count, calculate, calculate"
            \衆 "crowd"
            \效 "effect"
            \構 "frame"
            \拍 "clap"
            \歌 "song"
            \腐 "spoiled"
            \牒 "letter"
            \仕 "serve"
            \潔 "pure"
            \受 "receive"
            \勝 "win"
            \費 "spend"
            \濟 "pass over"
            \惡 "bad"
            \民 "Volk"
            \緣 "reason"
            \寧 "peaceful"
            \濯 "wash"
            \慰 "comfort"
            \割 "현금 인출기"
            \靴 "shoes"
            \偶 "couple"
            \數 "count"
            \移 "remove"
            \氏 "family name"
            \噴 "spout"
            \送 "send"
            \指 "finger"
            \消 "extinguish"
            \隊 "(z.B. Rassel"
            \完 "complete"
            \式 "rule (ceremony), ceremony, rule, ceremony"
            \息 "rest, breathe"
            \北 "north"
            \愛 "love"
            \修 "cultivate"
            \初 "beginning, first"
            \宜 "fitting"
            \期 "period of time, time limit"
            \東 "동, 동독일, 양말, 동독일, 동양, 독특한"
            \産 "product"
            \檢 "검색, 토론, 검토, 색인, 색출하다, inspect"
            \談 "talk"
            \脫 "peel off"
            \險 "narrow pass, dangerous"
            \設 "give"
            \平 "flat, calm"
            \撮 "영향"
            \週 "단말기"
            \紳 "gentleman"
            \課 "work"
            \悶 "agonize"
            \人 "person, human, man"
            \爽 "refreshing"
            \觀 "관광, look"
            \面 "face"
            \母 "mother, father, 부모님, 자음"
            \克 "overcome"
            \今 "now"
            \才 "talent"
            \富 "rich"
            \住 "hausen, verweilen"
            \駐 "열차, 자전거"
            \拒 "depend"
            \處 "place(?), place"
            \返 "return"
            \南 "south"
            \相 "상대방, 상관없다, 인상착의, 농담, 경험담, mutual, appearance"
            \廚 "kitchen"
            \菜 "vegetable, vegetables, 야채, 잡채"
            \束 "bind"
            \賞 "reward"
            \衡 "balance"
            \科 "subject"
            \散 "disperse"
            \出 "come out, 출발, 출근, 일출, 외출, 긴장"
            \濤 "wave"
            \雪 "snow"
            \葡 "grapes"
            \護 "guard"
            \淸 "clear"
            \建 "build"
            \板 "board"
            \言 "words"
            \脂 "grease"
            \萄 "grape"
            \最 "most"
            \中 "middle"
            \再 "again"
            \成 "finish, accomplish"
            \椒 "pepper, spices"
            \化 "change"
            \徙 "remove"
            \力 "strength, strength, power, power"
            \級 "상급, class, level"
            \管 "pipe"
            \報 "report"
            \夢 "dream"
            \復 "recover, 반복, 예습, 연습, 습관"
            \披 "open"
            \洪 "flood"
            \申 "report"
            \水 "water, water / earth"
            \傷 "injure"
            \常 "ordinary"
            \格 "pattern, character"
            \貿 "trade"
            \所 "place/thing, place"
            \黃 "yellow"
            \病 "병문안, 고아원, 입원, disease"
            \筆 "writing brush"
            \請 "request"
            \重 "heavy"
            \題 "title"
            \低 "low"
            \酒 "wine"
            \規 "rule"
            \策 "plan"
            \招 "invite"
            \光 "light/bright/shine"
            \活 "활동, 생활, move, lebendig"
            \鏡 "mirror"
            \抑 "suppress"
            \難 "hard"
            \日 "sun, day"
            \器 "instrument, receptacle"
            \型 "model"
            \浪 "reckless, wasteful"
            \硬 "hard"
            \幸 "fortunate"
            \持 "hold"
            \技 "skill"
            \憂 "anxiety"
            \有 "exist"
            \程 "schedule"
            \小 "small"
            \美 "beautiful"
            \笑 "laugh"
            \易 "easy, exchange"
            \件 "article (thing)"
            \團 "mass"
            \從 "obey"
            \加 "add, 가입, 습도, 사기"
            \津 "overflow"
            \性 "nature, character, sex, gender"
            \輩 "fellow"
            \隨 "follow"
            \微 "tiny"
            \鬱 "melancholy"
            \帳 "curtain(?), curtain"
            \家 "house, specialist"
            \誠 "sincere"
            \態 "attitude"
            \年 "year"
            \狀 "form, letter"
            \囊 "sack"
            \故 "reason, 고장"
            \密 "hide"
            \轉 "roll"
            \前 "front, first"
            \手 "수술, 선수, 손수건, 실수, 세수, 박수, hand"
            \緊 "urgent, 출장"
            \免 "avoid"
            \背 "back"
            \迎 "receive"
            \擔 "bear"
            \彙 "group"
            \付 "refer"
            \線 "line"
            \祝 "축제, 축하하다"
            \飜 "통역"
            \歡 "pleasure, 환영회"
            \章 "chapter"
            \陣 "Formation"
            \顧 "sich umwenden"
            \實 "real, fruit"
            \雨 "rain"
            \業 "business"
            \幼 "infantile"
            \危 "danger"
            \乳 "milk"
            \畵 "picture"
            \職 "official duty"
            \在 "exist"
            \役 "work"
            \書 "write, writing"
            \好 "good, like"
            \砂 "sand"
            \約 "promise"
            \分 "part, divide"
            \月 "발급하다"
            \尊 "respect"
            \考 "think"
            \明 "bright, clear, bright"
            \劑 "medicine"
            \或 "perhaps, or"
            \弘 "정보, 보고서"
            \條 "article"
            \夜 "night"
            \謠 "ballad"
            \粥 "Brei"
            \與 "give"
            \木 "tree"
            \炭 "coal"
            \花 "flower"
            \徳 "ethics, morality, power, virtue"
            \進 "move forward"
            \冷 "cold"
            \父 "father, mother"
            \愼 "careful"
            \綿 "cotton"
            \績 "weave"
            \區 "partition"
            \心 "heart, heart, center"
            \變 "change, 변화"
            \廉 "integrity"
            \服 "obey, submit (oneself) to, take, clothes"
            \友 "friend"
            \告 "tell"
            \族 "tribe"
            \虎 "tiger"
            \子 "전자, 여자, 남자, 과자, 의자, 연음, 녹음, son"
            \韓 "korean"
            \離 "abreisen"
            \法 "law"
            \換 "환승, 환절기, 환불, 환율, 교환, 환산, exchange, 교환, 환불, 환승, 환전, 환절기, 환산, 환승, 환전, 환불, 환율, 교환, 계산, 환전, 환절기, 환불, 환율, 교환, 환산"
            \裝 "정장, 포장, decorate"
            \赤 "red"
            \試 "test"
            \寫 "사진, 묘사, 도서관"
            \射 "shoot"
            \公 "public"
            \路 "road"
            \議 "discuss"
            \音 "sound, 비음화, 녹음, 성량, 성악, 성악"
            \遲 "심각"
            \浴 "bathe"
            \究 "research"
            \雹 "hail"
            \決 "decide"
            \能 "to be able"
            \會 "meet, meeting"
            \託 "entrust"
            \複 "복사, 복잡하다, 인도, 식도, 도중, 복잡하다, 복도, 사진, 묘사, 복사, 복도, 잡채, 잡지"
            \昉 "fat"
            \逍 "gemächlich, gelassen"
            \階 "stairs"
            \圓 "round"
            \講 "darlegen, erklären"
            \思 "참고하다"
            \生 "be born, to be born"
            \定 "settle, fix, settle, set(tle)"
            \大 "big"
            \辨 "distinguish"
            \頭 "head"
            \醬 "thick sauce"
            \支 "환불, 선불"
            \皮 "skin/leather"
            \稱 "call, declare"
            \育 "educate"
            \丹 "red"
            \節 "joint"
            \居 "live"
            \鷄 "chicken"
            \奇 "호기심, 유적지, strange"
            \筋 "muscle"
            \泊 "stay"
            \恍 "rapture"
            \問 "ask"
            \黎 "black"
            \提 "carry in one hand, propose, 제시, 안내, 초안"
            \展 "spread"
            \藏 "hide"
            \套 "envelope"
            \論 "discuss"
            \回 "return"
            \固 "solidify, strength"
            \內 "inside, 안내, 시내, 내장, 미용실, 용서"
            \苦 "bitter"
            \質 "character, quality, substance"
            \菓 "자음, 남자, 의자"
            \目 "eye"
            \話 "talk"
            \使 "messenger"
            \具 "equipment, equip"
            \競 "compete"
            \聽 "진료, 사기, 가습기"
            \要 "필요하다, 중요하다, 주요, 구하다, important"
            \境 "환경"
            \暇 "leisure"
            \刀 "knife"
            \須 "should"
            \希 "실망"
            \疑 "doubt"
            \園 "garden"
            \港 "bay, harbor"
            \店 "shop"
            \存 "exist"
            \香 "향, 향수, 요리, 음료수, 자료, 재료, 조미료, fragrance, 향수, 향신료"
            \領 "command"
            \功 "merits"
            \各 "each"
            \患 "anxiety"
            \漢 "han"
            \接 "connect"
            \座 "sit/seat"
            \環 "ring, 경우"
            \犯 "offend"
            \傳 "transmit, 전통, 전단"
            \露 "open, exposed"
            \段 "stairs, stair"
            \營 "manage"
            \康 "peaceful"
            \收 "gather"
            \核 "seed"
            \治 "의료, 진료"
            \詞 "word"
            \調 "조미료, 강조, 조절, 조절, 강조, 조사, 취미, adjust, harmonize"
            \社 "society"
            \局 "circumstance"
            \應 "respond"
            \案 "table, file, 제안, 초안, 시내, 내용, 내장"
            \半 "half"
            \癌 "cancer"
            \淑 "pure"
            \壓 "pressure"
            \齒 "치과, 칫솔, 충치, 약사, tooth, 치약, 충치, 칫솔, 교과서, 과목"
            \願 "want"
            \博 "extensive"
            \保 "protect"
            \募 "gather"
            \神 "god"
            \淡 "watery"
            \籠 "축구, 야구"
            \形 "form"
            \給 "geben"
            \表 "table, list, table, list; surface, outside, external, surface, outside, external"
            \婦 "daughter in law"
            \短 "장점"
            \端 "end, correct"
            \慮 "consider"
            \深 "지각"
            \想 "imagine"
            \絶 "sever"
            \選 "선수, 선택, 호기심, 선수, 선호, 택일, 선택, 선호, 수첩, 손수건, 실수, 세수, 박수, select"
            \系 "connect"
            \追 "follow, pursue"
            \繼 "지속"
            \勿 "don't"
            \慾 "greed"
            \逃 "escape"
            \包 "장식, 정장, pack"
            \猖 "frenzy"
            \圍 "surround"
            \續 "continue"
            \酬 "repay"
            \沐 "wash"
            \讚 "praise"
            \障 "obstruct"
            \負 "bear"
            \連 "결과, 결혼, connect, 휴가"
            \甚 "extremely"
            \誤 "mistake"
            \印 "print, seal, stamp"
            \天 "heaven"
            \風 "wind"
            \含 "include"
            \京 "capital"
            \禮 "etiquette"
            \由 "cause"
            \貰 "rent"
            \聲 "음성, 양, 식사량, 수량, 성량, 음성, 음악"
            \房 "room"
            \整 "put in order"
            \流 "유행, 자음, 음치, flow, 유음, 행사, 행동, 여행, 은행"
            \哀 "grievous"
            \係 "relate"
            \魅 "demon"
            \映 "reflect"
            \奉 "serve"
            \屋 "house"
            \珊 "coral"
            \野 "field"
            \術 "Kunstfertigkeit"
            \習 "복습, 연습, 예습"
            \體 "body"
            \學 "lernen, learn"
            \煙 "rauchen"
            \揚 "raise"
            \雜 "잡채, 복잡하다, 잡지, 복잡하다, 채소, 야채, 잡채, 복잡하다, 출팔사, 항공사"
            \機 "machine, opportunity"
            \衣 "clothes"
            \步 "walk"
            \勤 "diligent"
            \旦 "morning"
            \字 "letter"
            \製 "article, make"
            \豫 "예매, 예습, 예약, 예정, 예감, 방법, 예매, 예방, 예약, 예정, 예감, 연습, 복습, 습관, beforehand, 예매, 예습, 예약, 예정, 예감, 매진, 판매"
            \只 "방금"
            \道 "road"
            \副 "secondary"
            \統 "govern (?), govern"
            \義 "righteous"
            \蟲 "치약, 치과, 칫솔"
            \卵 "egg"
            \合 "combine, unite, join"
            \庫 "warehouse"
            \凍 "freeze"
            \紀 "period"
            \市 "도시, 안내, 내용, 내장, market"
            \錄 "record"
            \理 "regulate, regulate, Vernunft"
            \肉 "meat"
            \開 "open"
            \較 "compare"
            \唐 "당황하다, 냉면, 당면"
            \投 "throw"
            \得 "obtain"
            \備 "prepare"
            \餘 "remain"
            \稚 "young"
            \原 "source, origin"
            \素 "originally"
            \否 "not"
            \館 "public building"
            \喫 "eat"
            \訪 "visit"
            \本 "origin"
            \三 "인형"
            \防 "protect"
            \守 "keep"
            \診 "청진기, 의료, 치료, examine"
            \眼 "eye"
            \宿 "lodge"
            \品 "article, article, character"
            \療 "heal"
            \豆 "bean"
            \對 "mutual, opposing, counter"
            \- "단어, 단위, 단, 전단"
            \軍 "제대"
            \描 "사진, 복사"
            \過 "excess"
            \結 "join, connect"
            \姓 "Geschlecht, surname"
            \動 "move"
            \答 "답장, answer"
            \志 "intention"
            \痛 "pain"
            \婚 "marriage"
            \作 "make, compose, write, finish"
            \塞 "blocked"
            \員 "Personal"
            \解 "explain, explain, untie, break up, solve"
            \院 "house"
            \若 "like"
            \孤 "미아, 병원, 입원"
            \票 "ticket"
            \可 "right/allowed/appropriate"
            \異 "different"
            \至 "reach"
            \干 "shield"
            \勵 "encourage"
            \迷 "고아원"
            \部 "group"
            \惹 "provoke"
            \酸 "acid"
            \空 "empty"
            \門 "gate"
            \亂 "disorder, chaos"
            \稅 "tax"
            \震 "thunder"
            \洋 "ocean/western"
            \不 "not"
            \後 "after"
            \向 "toward"
            \湯 "boil"
            \朗 "낭독, 낭송"
            \候 "weather"
            \旅 "travel"
            \紛 "실사, 실종신고, 물가"
            \果 "fruit"
            \簡 "simple"
            \暢 "pleasant"
            \別 "different"
            \室 "room"
            \妨 "hinder"
            \說 "speak"
            \席 "seat"
            \瞬 "blinzeln"
            \錯 "error"
            \就 "approach, 직윈, 퇴직"
            \新 "new, 신랑, 신문, 신입생, 신문, 신입생, 신부"
            \及 "reach"
            \根 "root"
            \攻 "attack"
            \寄 "숙박비, 숙소"
            \均 "even"
            \燈 "lamp"
            \行 "go, move, 행동, 여행, 은행, 사고, 사실, 식사"
            \楓 "maple tree"
            \評 "평가, criticise, comment, 평, 물가"
            \比 "compare"
            \曆 "calendar, calender"
            \糖 "sugar"
            \秘 "conceal"
            \櫚 "palm branch"
            \壽 "life"
            \象 "appearance"
            \廢 "abolish, abandon"
            \古 "old"
            \適 "suit"
            \度 "degree"
            \譯 "translate"
            \飮 "음료, 과식, 식도, 식탁, 건물, 동물, 물가, 박물관, 분실물, 청과물, 음식물, 요리, 무료, 새료, 조미료, drink"
            \山 "mountain"
            \女 "woman"
            \兒 "child"
            \援 "rescue, help"
            \推 "추천, 추측"
            \白 "white"
            \達 "complete, finish, send"
            \距 "distant"
            \一 "one"
            \劃 "ausdenken/planen"
            \點 "dot"
            \漆 "Lack"
            \安 "peaceful"
            \興 "rise"
            \事 "기사, business"
            \養 "bring up"
            \同 "same"
            \窓 "window"
            \圖 "picture"
            \宙 "house"
            \記 "record"
            \際 "brink"
            \多 "many, 다행, 모양"
            \許 "allow"
            \索 "검색, 외출, 일출, 출근, 출발, 출장, 출퇴근, 출판사, 현금 인출기, 검색, 현금 인출기"
            \率 "ratio, lead"
            \粧 "make up"
            \玩 "enjoy"
            \童 "child"
            \溫 "warm"
            \優 "actor"
            \維 "preserve"
            \萬 "many, 만약, 연상, 연하, 필기"
            \肯 "affirm"
            \停 "stay"
            \都 "city, 시내, all"
            \場 "place"
            \容 "face, form, 내용, 미용실, face"
            \券 "document"
            \隻 "single, one of a pair"
            \示 "exhibit"
            \施 "perform"
            \濁 "muddy"
            \終 "end"
            \資 "wealth"
            \築 "build"
            \版 "block (book)"
            \蛋 "bird's egg"
            \廣 "broad"
            \像 "shape"
            \獎 "ermahnen"
            \近 "near to"
            \顔 "face"
            \工 "artisan"
            \藝 "skill"
            \食 "과식, 식도, 식사량, 식탁, 식혜, 정식, 편식, food, 식도, 식사량, 세련, 세탁, 세수, 양, 성량, 수량, 편식, 복도, 도중"
            \信 "trust"
            \間 "interval"
            \陰 "shade"
            \電 "lightning"
            \呼 "call"
            \省 "visit (esp. elders)"
            \番 "turn"
            \椅 "chair"
            \還 "return"
            \將 "general(?)"
            \來 "come"
            \下 "below"
            \納 "give"
            \貌 "appearance"
            \葬 "bury"
            \休 "연휴"
            \源 "source"
            \悔 "regret"
            \誘 "induce"
            \減 "decrease"
            \攝 "hold up"
            \速 "quick"
            \師 "teacher"
            \親 "intimate"
            \責 "responsibility"
            \/ "flat, even"
            \鮮 "fresh"
            \弱 "weak"
            \疲 "tired"
            \主 "lord, 주요"
            \覺 "conscious"
            \充 "full"
            \草 "grass, Stroh"
            \額 "amount"
            \色 "color"
            \硏 "grind, examine"
            \車 "car"
            \靑 "blue"
            \著 "manifest (entstehen)"
            \高 "high"
            \任 "(take) charge"
            \睡 "sleep"
            \因 "cause"
            \入 "enter"
            \自 "self, 신용 카드, 신호등, 자동차, 자전거, 자초지종, 자존심, 자신, 자동차, 자신, 자초지종, 자존심, 운전하다, 열차, 주차"
            \顯 "appear"
            \揮 "shake"
            \影 "촬영"
            \雰 "fog"
            \極 "extreme, utmost"
            \勸 "advice"
            \登 "climb"
            \臺 "stand"
            \沒 "sink"
            \購 "buy"
            \避 "avoid, hide"
            \現 "show, appear"
            \企 "plan"
            \掃 "sweep"
            \航 "navigate"
            \文 "sentence, writing"
            \銀 "silver"
            \例 "example"
            \福 "blessing"
            \討 "attack, suppress"
            \讓 "concede"
            \世 "world"
            \通 "pass through(?), pass through"
            \舞 "dance"
            \亡 "ruin"
            \眠 "sleep"
            \僚 "comrade"
            \魔 "evil spirit"
            \助 "help"
            \怪 "동물, 건물, 물가, 박물관"
            \醯 "vinegar"
            \種 "kind"
            \地 "earth, line"
            \害 "harm"
            \盞 "wine cup"
            \着 "attach"
            \參 "participation"
            \求 "요구, seek"
            \情 "sentiment"
            \症 "symptom"
            \遊 "play, 야유회, 관람"
            \操 "grasp, operate"
            \界 "border"
            \量 "수량, 성량, 식사량, measure"
            \黑 "black"
            \材 "material"
            \藥 "치약, 우체국, 약국, 의사, 교사, 간호사"
            \代 "interchange"
            \旗 "flag"
            \湖 "lake"
            \務 "endeavour"
            \識 "record, register, know, recognize"
            \臟 "inner organ"
            \曲 "bent"
            \口 "녹음, 자음"
            \照 "illuminate"
            \獨 "독특한, 특별히, 특징, 특히"
            \快 "cheerful"
            \國 "nation"
            \物 "goods, 음식물, 평가"
            \郵 "mail, 우표, 약국"
            \陶 "pottery"
            \歸 "come back"
            \遺 "leave behind"
            \俳 "actor"
            \壁 "wall"
            \者 "man"
            \授 "give"
            \看 "watch"
            \邊 "edge"
            \名 "name"
            \正 "정문, 정확, 장식, 포장, correct, 정장, 정문, 확실, 확인하다, primary"
            \意 "meaning"
            \聞 "hear"
            \時 "time"
            \洗 "wash, 세탁, 세련, 식기 세척, 기수첩, 손수건, 실수, 세수, 박수"
            \準 "rule"
            \標 "check, mark"
            \殘 "remain"
            \望 "hope"
            \悚 "fear"
            \感 "feel"
            \語 "words"
            \急 "urgent"
            \亦 "혹시"
            \利 "benefit"
            \當 "suitable"
            \末 "end"
            \身 "body"
            \擇 "select"
            \窮 "exhausted"
            \先 "선배, 환불, 지불, 선불, 후배"
            \鼻 "소화, 화장대, 변화, Nase"
            \確 "certain"
            \落 "fall down"
            \於 "/interjection/"
            \始 "begin"
            \激 "excite, incite"
            \削 "cut"
            \海 "sea, ocean"
            \集 "gather"
            \婉 "pure, beautiful"
            \延 "사장, 장점"
            \奏 "inform"
            \頂 "summit"
            \類 "class"
            \每 "every"
            \他 "other"
            \潛 "dive"
            \惚 "rapture"
            \關 "상관, 관련, 관심, 성관계, bolt, 상관, 관계, 관련, 관심, 면세점"
            \勞 "endeavour/work, work"
            \季 "season"
            \波 "wave"
            \健 "strong"
            \詩 "poetry"
            \旬 "ten days"
            \致 "send, present"
            \長 "사장, 연장, 단점, long"
            \零 "zero"
            \特 "특별히, 독특한, 특히, 독특한, 특별히, 특징, special"
            \司 "preside"
            \命 "life"
            \西 "west"
            \諾 "approve"
            })


(def words [["동료" "同僚" "Kollege"]
            ["소식" "消息" "Nachricht, etwas (hören von jmd.)"]
            ["환영회" "歡迎會" "Begrüßungsfeier, Empfang"]
            ["축하하다" "祝賀--" "gratulieren (celebrate - congratulate) "]
            ["신입생" "新入生" "ein neuer Schüler"]
            ["연락" "連落" "Verbindung, Kontakt"]
            ["다양하다" "多樣--" "verschieden sein, mannigfaltig sein (many  - style) "]
            ["완성" "完成" "Vervollständigung"]
            ["토론회" "討論會" "Debattiergesellschaft"]
            ["전시회" "展示會" "Ausstellung"]
            ["모집하다" "募集--" "anwerben (gather - gather) "]
            ["가입" "加入" "Eintritt, Anschluss"]
            ["신청서" "申請書" "(schriftliche) Anmeldung, Bewerbung"]
            ["신청" "申請" "Gesuch, Bitte, Ansuchen"]
            ["기간" "期間" "Frist, Termin, Zeitpunkt"]
            ["활동" "活動" "Tätigkeit"]
            ["학기" "學期" "Semester"]
            ["연극" "演劇" "Theater(vorstellung)"]
            ["특별히" "特別-" "besonders, speziell"]
            ["토론" "討論" "Debatte, Diskussion"]
            ["관심" "關心" "Interesse, (An)teilnahme"]
            ["관광지" "觀光地" "Sehenswürdigkeit"]
            ["동양" "東洋" "Orient, Asien (east - ocean/western) "]
            ["역사" "歷史" "Geschichte (pass through - history) "]
            ["내용" "內容" "Inhalt (inside - face, form) "]
            ["경제" "經濟" "Wirtschaft"]
            ["기사" "記事" "(Zeitungs)artikel"]
            ["가요" "歌謠" "Lied"]
            ["환영하다" "歡迎--" "willkommen (pleasure - receive -) "]
            ["답하다" "答--" "(be)antworten (answer) "]
            ["시기" "時期" "Zeit, Periode, Zeitpunkt"]
            ["인사" "人事" "Gruß"]
            ["축구" "蹴球" "Fußball (kick - ball) "]
            ["이사" "移徙" "Umzug "]
            ["취미" "趣味" "Hobby, Interesse, Geschmack (vorantreiben - taste) "]
            ["별명" "別名" "Spitzname"]
            ["이유" "理由" "Grund, Anlass"]
            ["특히" "特-" "besonders, vor allem (special -) "]
            ["친하다" "親--" "sehr gut befreundet sein"]
            ["교통" "交通" "Verkehr, Beförderung, Transport"]
            ["대중" "大衆" "Volk, Masse"]
            ["노선도" "路線圖" "Liniennetzplan"]
            ["표" "表" "Verzeichnis, Tabelle, Aufstellung"]
            ["장점" "長點" "starke Eigenschaft, Vorzug"]
            ["할인" "割引" "Ermäßigung, Rabatt (cut - pull) "]
            ["현금" "現金" "Bargeld"]
            ["교통비" "交通費" "Beförderungskosten"]
            ["어휘" "語彙" "Wortschatz"]
            ["공원" "公園" "Park"]
            ["병원" "病院" "Krankenhaus (disease - house) "]
            ["약국" "藥局" "Apotheke (medicine - bureau) "]
            ["편의점" "便宜店" "convenience store"]
            ["주유소" "注油所" "Tankstelle"]
            ["안경점" "眼鏡店" "Optikerladen"]
            ["문구점" "文具店" "Schreibwarenladen"]
            ["세탁소" "洗濯所" "Wäscherei"]
            ["사진관" "寫眞館" "Fotostudio (copy - true - public building) "]
            ["음식물" "飮食物" "Lebensmittel (drink - food - goods) "]
            ["방법" "方法" "Methode, Art"]
            ["구성" "構成" "zusammensetzen, bauen, konstruieren"]
            ["방문" "訪問" "Besuch"]
            ["단말기" "端末機" "Terminal, Endgerät"]
            ["환승" "換乘" "das Umsteigen (exchange - ride) "]
            ["답장" "答狀" "Antwort"]
            ["제목" "題目" "Titel, Subject, Überschrift"]
            ["사실" "事實" "Fakt, Tatsache, tak naprawde"]
            ["수첩" "手帖" "Notizbuch (hand - document) "]
            ["계획" "計劃" "Plan, Entwurf"]
            ["용건" "用件" "Angelegenheit"]
            ["연음" "連音" "Liaison (Phonetik) "]
            ["참고하다" "參考--" "(in einem Wörterbuch) nachschlagen"]
            ["주의" "注意" "Achtung"]
            ["낭독" "朗讀" "Vortrag (clear - read) "]
            ["단점" "短點" "Schwäche, Nachteil (short - dot) "]
            ["장단점" "長短點" "Vor- und Nachteile, Stärken und Schwächen (long - short - dot) "]
            ["확인" "確認" "bestätigen, sichergehen"]
            ["정확" "正確" "Genauigkeit, Präzision, Richtigkeit (correct - certain) "]
            ["발표" "發表" "veröffentlichen, bekanntmachen"]
            ["칠판" "漆板" "Wandtafel"]
            ["반대" "反對" "Gegenteil"]
            ["안경" "眼鏡" "Brille"]
            ["구조" "構造" "Struktur, Aufbau, Organisation"]
            ["종류" "種類" "Art, Sorte, Gattung"]
            ["독특한" "獨特-" "einzigartig, besonders (alone - special -) "]
            ["호칭" "呼稱" "Anrede"]
            ["상급생" "上級生" "Student eines älteren Jahrgangs"]
            ["상급" "上級" "höherer Rang, höhere Klasse"]
            ["가족" "家族" "Familie"]
            ["관계" "關係" "Beziehung, Verhältnis (bolt - relate) "]
            ["친근" "親近" "nahe verwandt"]
            ["반영" "反映" "Widerspiegelung, Reflexion"]
            ["사고" "思考" "die Denkweise (think - think) "]
            ["혹시" "或是" "vielleicht, etwa, wenn, falls"]
            ["시" "詩" "Gedicht, Vers "]
            ["시인" "詩人" "Dichter, Poet"]
            ["낭송" "朗誦" "Rezitation (clear - recite) "]
            ["부모님" "父母-" "Eltern"]
            ["부분" "部分" "Teil, Abschnitt, Portion"]
            ["급" "級" "Klasse, Rang, Stufe, Level (class) "]
            ["요리사" "料理師" "Koch"]
            ["배달" "配達" "Lieferung"]
            ["주문" "注文" "Bestellung, Auftrag"]
            ["종업원" "從業員" "Angestellter"]
            ["금연" "禁煙" "Rauchverbot"]
            ["흡연" "吸煙" "Rauchen"]
            ["생선" "生鮮" "Fisch"]
            ["요리" "料理" "Kochen, Gericht"]
            ["포도주" "葡萄酒" "Wein"]
            ["출장" "出張" "Dienstreise (come out - extend) "]
            ["두통" "頭痛" "Kopfschmerzen"]
            ["공사" "工事" "Bau(arbeiten)"]
            ["도서관" "圖書館" "Bibliothek"]
            ["원인" "原因" "Ursache, Anlass"]
            ["양" "量" "Menge (measure) "]
            ["무료" "無料" "kostenlos (nothing - aufzählen) "]
            ["인기" "人氣" "Beliebtheit, Popularität"]
            ["유람선" "遊覽船" "Vergnügungsdampfer (play - inspect - ship) "]
            ["입학" "入學" "Eintritt in Bildungseinrichtung"]
            ["교통사고" "交通事故" "Verkehrsunfall"]
            ["복잡하다" "複雜--" "verworren, kompliziert (double - mixed) "]
            ["황사" "黃砂" "the yellow dust"]
            ["등산" "登山" "Bergsteigen, Bergsport"]
            ["단풍" "丹楓" "Ahorn, die Herbstfarbe des Laubes"]
            ["공짜" "空-" "für nichts, umsonst"]
            ["전채 요리" "前菜 料理" "Vorspeise"]
            ["죽" "粥" "Brei "]
            ["주요리" "主料理" "Hauptgericht"]
            ["택일" "擇一" "eines unter mehreren auswählen"]
            ["후식" "後食" "Nachtisch"]
            ["정하다" "定--" "bestimmen, festsetzen, entscheiden, fixieren"]
            ["정식" "定食" "(mehr-Gänge-)Menü"]
            ["잡채" "雜菜" "(mixed - vegetables) ein gemischtes Gericht aus Gemüsen und Fleisch mit Glasnudeln  "]
            ["계란" "鷄卵" "Hühnerei"]
            ["된장" "-醬" "Sojabohnenpaste"]
            ["선택" "選擇" "(Aus)wahl (select - select) "]
            ["한잔하다" "-盞--" "etwas trinken gehen "]
            ["의논하다" "議論--" "erörtern"]
            ["제안" "提案" "Vorschlag (carry in one hand, propose - table, file) "]
            ["불규칙" "不規則" "Unregelmäßigkeit"]
            ["중요하다" "重要--" "bedeutsam, wichtig"]
            ["열" "熱" "Fieber (hot) "]
            ["방송" "放送" "Sendung, Rundfunk"]
            ["순서" "順序" "Ordnung, Reihenfolge (obey - order) "]
            ["채소" "菜蔬" "Gemüse (vegetable - vegetable) "]
            ["권하다" "勸--" "raten, empfehlen (advice - ) "]
            ["연결" "連結" "Verbinden (connect - join) "]
            ["감기" "感氣" "Erkältung"]
            ["고향" "故鄕" "Heimatort (reason - country) "]
            ["개인" "個人" "privat, persönlich"]
            ["술잔" "-盞" "Trinkglas "]
            ["성격" "性格" "Charakter, Wesen"]
            ["친절하다" "親切--" "freundlich zu jmd. sein"]
            ["화" "火" "Ärger, Wut, Zorn"]
            ["창피" "猖披" "Schande, Scham "]
            ["방학" "放學" "Ferien (drive out - learn) "]
            ["여행사" "旅行社" "Reisebüro"]
            ["일정" "日程" "(Reise-)Programm"]
            ["산책" "散策" "Spaziergang "]
            ["박물관" "博物館" "Museum"]
            ["관람" "觀覽" "das Besichtigen (look - inspect) "]
            ["숙박비" "宿泊費" "Unterkunftskosten"]
            ["휴가" "休暇" "Ferien, Urlaub (rest - leisure) "]
            ["자신" "自身" "sich selbst"]
            ["과실" "果實" "Frucht"]
            ["물가" "物價" "(Waren)preis, Wert (goods - value) "]
            ["월급" "月給" "Monatsgehalt (Monat - geben) "]
            ["동네" "洞-" "Neighborhood "]
            ["거리" "距離" "Entfernung"]
            ["장학금" "獎學金" "Stipendium"]
            ["포장" "包裝" "Verpackung (pack - decorate) "]
            ["복도" "複道" "Korridor, Gang (double - road) "]
            ["운전하다" "運轉--" "(ein Fahrzeug) fahren (move, transport - bewegen - ) "]
            ["건물" "建物" "Gebäude"]
            ["고객" "顧客" "Kunde"]
            ["기회" "機會" "Gelegenheit"]
            ["자세하다" "仔細--" "ausführlich, genau beschreiben (detailed - thin) "]
            ["고장" "故障" "Schaden, Fehler, Mangel"]
            ["재료" "材料" "Zutaten"]
            ["두부" "豆腐" "Tofu "]
            ["고추" "苦椒" "Chilli(schote)"]
            ["직전에" "直前-" "kurz zuvor"]
            ["향" "香" "Duft (Aroma) (fragrance) "]
            ["야채" "野菜" "Gemüse"]
            ["분수" "分數" "Bruchzahl"]
            ["주방" "廚房" "Küche "]
            ["달력" "-曆" "Kalender"]
            ["서" "西" "Westen "]
            ["남" "南" "Süden "]
            ["동" "東" "Osten (east) "]
            ["북" "北" "Norden "]
            ["동독일" "東獨逸" "Ostdeutschland (east - alone - easy) "]
            ["위한" "爲-" "für jmd, um jds. Willen "]
            ["상담" "相談" "Beratung (mutual - talk) "]
            ["매진" "賣盡" "Ausverkauf (sell - exhaust) "]
            ["직원" "職員" "Personal"]
            ["창가" "窓-" "Fensterseite (Flugzeug)"]
            ["녹음" "錄音" "(Ton)aufnahme"]
            ["과제" "課題" "Aufgabe, Auftrag"]
            ["교사" "敎師" "Lehrkraft"]
            ["모음" "母音" "Vokal (mother - sound) "]
            ["자음" "子音" "Konsonant (son - sound) "]
            ["제시" "提示" "present(ation)"]
            ["유음" "流音" "Fließlaut (flow - sound) "]
            ["탈락" "脫落" "Auslassung"]
            ["비음" "鼻音" "Nasalllaut "]
            ["구개음" "口蓋音" "Gaumenlaut (mouth - cover - sound) "]
            ["출발" "出發" "Abreise"]
            ["국제" "國際" "international"]
            ["급하다" "急--" "in Eile sein"]
            ["회의" "會議" "Beratung, Besprechung, Sitzung, Versammlung"]
            ["수술" "手術" "Operation"]
            ["성적" "成績" "Zensur, Resultat, Leistung"]
            ["입원" "入院" "Aufnahme ins Krankenhaus"]
            ["잡지" "雜誌" "Zeitschrift (various - hold, book) "]
            ["기능" "機能" "Funktion, Feature (eines Gerätes)"]
            ["미용실" "美容室" "Friseursalon"]
            ["조퇴하다" "早退--" "früher gehen (Schule, Büro)"]
            ["계속" "繼續" "Fortsetzung (connect - continue) "]
            ["당면" "唐麵" "Glasnudeln (dismay - noodles) "]
            ["음료" "飮料" "Getränk (drink - materials) "]
            ["태도" "態度" "Haltung, (Ein)stellung, Verhalten"]
            ["당황하다" "唐慌/惶" "bestürzt, perplex sein (dismay - puzzle / fear) "]
            ["서류" "書類" "Schriftstück, Dokument, Unterlagen"]
            ["등록" "登錄" "Eintragung, Registrierung (Meldeamt)"]
            ["여권" "旅券" "Reisepass"]
            ["물론" "勿論" "natürlich, selbstverständlich, freilich"]
            ["제시간에" "-時間-" "pünktlich, rechtzeitig"]
            ["의견" "意見" "Meinung, Ansicht, Auffassung"]
            ["회" "膾" "roher Fisch (raw meat) "]
            ["해수욕" "海水浴" "Seebad"]
            ["배낭" "背囊" "Rucksack"]
            ["통로" "通路" "Durchgang"]
            ["저렴하다" "低廉--" "billig, preiswert"]
            ["시내" "市內" "Stadtmitte, Zentrum (market - inside) "]
            ["기념품" "記念品" "Andenken, Souvenir"]
            ["면세점" "免稅店" "duty-free-Laden"]
            ["결심" "決心" "Entschluss"]
            ["건강" "健康" "Gesundheit"]
            ["세계일주" "世界一周" "Weltreise"]
            ["운전면허증" "運轉免許證" "Führerschein"]
            ["대기업" "大企業" "Großunternehmen"]
            ["취직하다" "就職--" "eine Stelle antreten (approach - official duty) "]
            ["변경" "變更" "Änderung (change - change) "]
            ["예약" "豫約" "Vorbestellung, Reservierung"]
            ["한복" "韓服" "koreanische Tracht"]
            ["야경" "夜景" "Ansicht bei Nacht"]
            ["주로" "主-" "hauptsächlich, vornehmlich, zum größten Teil (lord -) "]
            ["촬영" "撮影" "Aufnahme, das Fotografieren (collect, take - shadow) "]
            ["전혀" "全-" "ganz, total"]
            ["결정" "決定" "Entscheidung, Festlegung"]
            ["성함" "姓銜" "Name (höflich 이름) "]
            ["면접" "面接" "Interview"]
            ["경험" "經驗" "Erfahrung, Erlebnis"]
            ["조언" "助言" "Ratschlag"]
            ["경험담" "經驗談" "Erlebnis-erzähl-gespräch"]
            ["선호" "選好" "Präferenz (select - like) "]
            ["식혜" "食醯" "Süßes Getränk aus fermentiertem Reis "]
            ["상황" "狀況" "Situation, Umstände"]
            ["화려" "華櫚" "Pracht, Prunk "]
            ["설문지" "設問紙" "Fragebogen"]
            ["성인" "成人" "Erwachsener"]
            ["외모" "外貌" "(z.B. das eigene) Aussehen"]
            ["고민" "苦悶" "Qual"]
            ["수학여행" "修學旅行" "Klassenfahrt"]
            ["항공사" "航空社" "Fluggesellschaft"]
            ["증권" "證券" "Wertpapier"]
            ["광고" "廣告" "Reklame, Werbung"]
            ["면접시험" "面接試驗" "mündliche Prüfung"]
            ["긴장" "緊張" "(An)spannung (urgent - extend), (An)gespanntheit "]
            ["대기실" "待機室" "Wartesaal"]
            ["결과" "結果" "Ergebnis (einer Prüfung)"]
            ["사원" "社員" "Angestellter"]
            ["표시하다" "表示--" "kundgeben"]
            ["능력" "能力" "Fähigkeit, Können"]
            ["희망" "希望" "Hoffnung, Wunsch, Erwartung (hope - hope) "]
            ["지원자" "志願者" "Bewerber, Aspirant"]
            ["봉사 활동" "奉仕 活動" "Freiwilligenarbeit"]
            ["번역" "飜譯" "Übersetzung (flip over - translate) "]
            ["졸업" "卒業" "Abgang, Graduierung (von einer Schule)"]
            ["전공" "專攻" "Hauptfach"]
            ["지도" "地圖" "(Land)karte"]
            ["점원" "店員" "Verkäufer"]
            ["관광객" "觀光客" "Tourist"]
            ["안내" "案內" "Auskunft, Führen (table, file - inside) "]
            ["극장" "劇場" "Theater"]
            ["주차" "駐車" "Parken (halt - cart) "]
            ["전문점" "專門店" "Fachgeschäft, Spezialgeschäft"]
            ["행동" "行動" "Handlung, Tat, Aktion"]
            ["지속" "持續" "Fortdauer, Aufrechterhaltung"]
            ["간단하다" "-單--" "einfach, kurz, bündig (- single -) "]
            ["강조" "强調" "Betonung"]
            ["공항" "空港" "Flughafen"]
            ["예매" "豫賣" "Vorverkauf (beforehand - sell) "]
            ["설명" "說明" "Erklärung"]
            ["연주" "演奏" "musikalische Darbietung, Performance"]
            ["정문" "正門" "Haupteingang"]
            ["개업" "開業" "(Geschäfts)eröffnung"]
            ["분위기" "雰圍氣" "Atmosphäre, Flair"]
            ["전통" "傳統" "Tradition, Überlieferung"]
            ["공연" "公演" "öffentliche Aufführung"]
            ["일광욕" "日光浴" "Sonnenbad"]
            ["해변" "海邊" "Küste, Strand"]
            ["숙소" "宿所" "Unterkunft"]
            ["가능" "可能" "Möglichkeit"]
            ["통장" "通帳" "Sparbuch"]
            ["향수" "香水" "Parfüm"]
            ["체험" "體驗" "körperliche Erfahrung, Erlebnis"]
            ["소화" "消化" "Verdauung"]
            ["행사" "行事" "Ereignis, Begebenheit (go, move - business) "]
            ["지각" "遲刻" "Verspätung (late - carve) "]
            ["도시" "都市" "Stadt (city - market) "]
            ["축제" "祝祭" "Feier, Fest (celebrate - sacrificial rites) "]
            ["정보" "情報" "Auskunft, Information"]
            ["외투" "外套" "Mantel"]
            ["장소" "場所" "Platz, Stelle, Lage, Position"]
            ["표현" "表現" "Ausdruck (expression)"]
            ["출근" "出勤" "zum Dienst gehen, an die Arbeit gehen"]
            ["퇴근" "退勤" "vom Dienst nach Hause gehen"]
            ["출퇴근" "出退勤" "Rushhour"]
            ["피하다" "避--" "meiden"]
            ["음료수" "飮料水" "Trinkwasser"]
            ["냉장고" "冷藏庫" "Kühlschrank"]
            ["대중목욕탕" "大衆沐浴湯" "Badehaus fürs Volk"]
            ["순간" "瞬間" "Augenblick, Moment"]
            ["분명하다" "分明--" "klar wie Kloßbrühe"]
            ["당연하다" "當然--" "sich von selbst verstehen"]
            ["해당하다" "該當--" "sich beziehen auf"]
            ["비음화" "鼻音化" "Nasalierung (Nase - sound - change) "]
            ["조사" "調査" "Untersuchung (adjust, harmonize - investigate) "]
            ["홍보" "弘報" "Public Relations (extensive - report) "]
            ["전문가" "專門家" "Fachmann"]
            ["감정" "感情" "Gefühl"]
            ["잡지사" "雜誌社" "Zeitschriftenunternehmen (mixed - hold - society) "]
            ["편집" "編輯" "Redaktion (compile - edit) "]
            ["필기" "筆記" "das Schreiben"]
            ["합격" "合格" "das Bestehen (einer Prüfung)"]
            ["직접" "直接" "Unvermitteltheit"]
            ["고아원" "孤兒院" "Waisenhaus (lonely - child - house) "]
            ["지갑" "紙匣" "Portemonnaie (paper - case) "]
            ["목적" "目的" "Zweck, Absicht"]
            ["심하다" "甚--" "heftig"]
            ["독감" "毒感" "Grippe"]
            ["유행" "流行" "verbreitet (flow - go) "]
            ["예방" "豫防" "Vorbeugung (beforehand - protect) "]
            ["주사" "注射" "Spritze"]
            ["환경" "環境" "Umwelt (ring - boundary) "]
            ["문제" "問題" "Problem"]
            ["심각" "深刻" "(tief)ernst, severe (deep - carve) "]
            ["야근" "夜勤" "Nachtschicht"]
            ["세수" "洗手" "das Gesicht waschen (wash - hand) "]
            ["옷장" "-帳" "Kleiderschrank"]
            ["정리" "整理" "An/Einordnung"]
            ["치료" "治療" "Behandlung (govern - heal) "]
            ["예금" "預金" "Spareinlage (beforehand - metal(money)) "]
            ["치과" "齒科" "Zahnheilkunde (tooth - subject) "]
            ["초대" "招待" "Einladung"]
            ["충치" "蟲齒" "fauler Zahn (worm, insect - tooth) "]
            ["병문안" "病問安" "Krankenbesuch"]
            ["선배" "先輩" "ich bin seine Bitch (first - fellow) "]
            ["후배" "後輩" "er ist meine Bitch"]
            ["환자" "患者" "Patient, Kranker"]
            ["전염" "傳染" "Infektion (transmit - infect) "]
            ["예방법" "豫防法" "Vorbeugungsmaßnahme "]
            ["편식" "偏食" "einseitige Ernährung (incline, be biased - food) "]
            ["외출" "外出" "draußen sein"]
            ["규칙적" "規則的" "regelmäßig"]
            ["환절기" "換節期" "Wechsel der Jahreszeiten"]
            ["공기" "空氣" "Luft"]
            ["노약자" "老弱者" "Alte und Schwache"]
            ["영양체" "營養體" "Nahrungsergänzungsmittel"]
            ["지적하다" "指摘--" "hinweisen"]
            ["조절" "調節" "Kontrolle"]
            ["당장" "當場" "auf der Stelle"]
            ["식사량" "食事量" "Portion (food - business - measure) "]
            ["과식" "過食" "Völlerei "]
            ["신문" "新聞" "Zeitung"]
            ["수칙" "守則" "Anweisung, Regel"]
            ["최고" "最高" """the best way ..."""]
            ["조미료" "調味料" "Würze (adjust, harmonize - taste - materials) "]
            ["지방" "脂昉" "Fett "]
            ["영양" "營養" "Nahrung"]
            ["불균형" "不均衡" "Unausgeglichenheit"]
            ["냉동" "冷凍" "Tiefkühl"]
            ["수면" "睡眠" "Schlaf "]
            ["피로" "疲勞" "Müdigkeit"]
            ["여유" "餘裕" "Gelassenheit (remain - wealthy) "]
            ["영향" "影響" "Einfluss, Wirkung (shadow - echo) "]
            ["긍정" "肯定" "Bejahung, Affirmation"]
            ["적당하다" "適當--" "passen, taugen"]
            ["추측" "推測" "Vermutung (push, expel - conjecture) "]
            ["교수" "敎授" "Professor"]
            ["연구" "硏究" "Studium, Forschung (grind - examine, research) "]
            ["과목" "科目" "Fachgebiet"]
            ["덕분" "徳分" "Wohlwollen, Gunst"]
            ["가구" "家具" "(Wohnungs)einrichtung"]
            ["예습" "豫習" "Vorbereitung (beforehand - study) "]
            ["복습" "復習" "Wiederholung (recover - study) "]
            ["철저" "徹底" "Gründlichkeit (penetrate - bottom) "]
            ["추천" "推薦" "Empfehlung (push, expel - recommend) "]
            ["용돈" "用-" "Taschengeld (use -) "]
            ["양복" "洋服" "Anzug"]
            ["만년필" "萬年筆" "Füller (many - year - writing brush) "]
            ["예정" "豫定" "Vorhaben"]
            ["입학식" "入學式" "Schulanfangsfeier"]
            ["정장" "正裝" "Festkleidung (right - decorate) "]
            ["상대방" "相對方" "das Gegenüber"]
            ["우회" "迂廻" "Umweg (roundabout way - turn) "]
            ["거절" "拒絶" "refuse"]
            ["확실" "確實" "Gewissheit"]
            ["화가" "畵家" "Maler"]
            ["역시" "亦是" "und auch (also - this, right) "]
            ["소질" "素質" "Veranlagung"]
            ["전자 제품" "電子 製品" "electronic device"]
            ["전원" "電源" "Stromquelle"]
            ["요금" "料金" "Gebühren (aufzählen - metal(money)) "]
            ["교환" "交換" "Austauschen (mix, exchange - exchange) "]
            ["실수" "失手" "Versehen, Irrtum, Fehler (lose (vereiteln) - hand) "]
            ["영수증" "領收證" "Empfangsbescheinigung, Kassenzettel"]
            ["식탁" "食卓" "Esstisch (food - high) "]
            ["화장대" "化粧臺" "Schminktisch"]
            ["세탁기" "洗濯機" "Waschmaschine"]
            ["청소기" "淸掃機" "Staubsauger"]
            ["선풍기" "扇風機" "Ventilator"]
            ["식기 세척기" "食器 洗滌器" "Geschirrspülmaschine (food - receptacle) (wash - wash - instrument) "]
            ["가습기" "加濕器" "Luftbefeuchter (add - wet - instrument) "]
            ["특징" "特徵" "Merkmal (special, characteristic - summon) "]
            ["원목" "原木" "aus Holz"]
            ["구입" "購入" "Anschaffung, Kauf"]
            ["판매" "販賣" "Verkauf (sell - sell) "]
            ["중고" "中古" "gebraucht"]
            ["재질" "材質" "Materialqualität"]
            ["후기" "後記" "Review"]
            ["평" "評" "Kritik (criticise, comment) "]
            ["작성자" "作成者" "Verfasser"]
            ["작성일" "作成日" "Erstellungsdatum"]
            ["평가" "評價" "Bewertung (comment, criticise - value) "]
            ["만족" "滿足" "Zufriedenheit"]
            ["반복" "反復" "Wiederholung"]
            ["강력" "强力" "mächtig, stark"]
            ["대체로" "大體-" "im Allgemeinen, im Großen und Ganzen"]
            ["계산" "計算" "(Be)rechnung"]
            ["가전제품" "家電製品" "elektrische Haushaltsgeräte"]
            ["냉동실" "冷凍室" "Tiefkühlfach"]
            ["냉장실" "冷藏室" "(nicht Tief)kühlfach"]
            ["습도" "濕度" "Feuchtigkeit"]
            ["건조" "乾燥" "Vertrocknen, Trockenheit (dry - dry) "]
            ["청과물" "靑果物" "Gemüse und Obst"]
            ["수산업" "水産業" "Fischerei"]
            ["의류" "衣類" "Kleider, Anziehsachen"]
            ["인상착의" "人相着衣" "appearance"]
            ["진료" "診療" "Behandlung (examine - heal) "]
            ["근육" "筋肉" "Muskeln "]
            ["경기" "競技" "Sport, Wettbewerb"]
            ["농구" "籠球" "Basketball (bamboo basket - ball) "]
            ["선수" "選手" "Spieler (select - hand) "]
            ["인형" "人形" "Puppe"]
            ["운동화" "運動靴" "Sportschuhe"]
            ["면" "綿" "Baumwolle "]
            ["영화배우" "映畵俳優" "Filmschauspieler "]
            ["다행" "多幸" "Glück as in lucky"]
            ["장례식" "葬禮式" "Beerdigung"]
            ["계절" "季節" "Jahreszeit"]
            ["분실물" "紛失物" "verlorene Sache (confused - lose - goods) "]
            ["미아" "迷兒" "verlaufenes Kind (charm, bewitch - child) "]
            ["장식" "裝飾" "Verzierung (decorate - decorate) "]
            ["손수건" "-手巾" "Stofftaschentuch"]
            ["교실" "敎室" "Klassenzimmer"]
            ["묘사" "描寫" "Darstellung, Schilderung (draw - copy) "]
            ["즉시" "卽時" "sofort, gleich"]
            ["질투" "嫉妬" "Eifersucht, Neid (envy - jealousy) "]
            ["이상형" "理想型" "Idealtyp"]
            ["활발" "活潑" "Tätigkeit, Aktivität (lebendig - sprinkle) "]
            ["실망" "失望" "Enttäuschung (lose - hope) "]
            ["판단" "判斷" "Urteil (judge - cut off) "]
            ["구체적" "具體的" "konkret, spezifisch"]
            ["야구" "野球" "Baseball"]
            ["장래" "將來" "Zukunft"]
            ["부자" "富者" "ein reicher Mensch"]
            ["청진기" "聽診器" "Stethoskop (hear, listen - examine - instrument) "]
            ["야유회" "野遊會" "Ausflug"]
            ["구하다" "求--" "bitten (seek -) "]
            ["기본" "基本" "Grundlagen, Basics"]
            ["동의" "同意" "Zustimmen"]
            ["일출" "日出" "Sonnenaufgang"]
            ["일몰" "日沒" "Sonnenuntergang"]
            ["삼각형" "三角形" "Dreieck (three - horn - form) "]
            ["원" "圓" "Kreis "]
            ["단락" "段落" "Absatz"]
            ["계단" "階段" "Treppe"]
            ["자신" "自信" "Selbstbewusstsein (self - trust) "]
            ["반달" "半-" "Halbmond"]
            ["초승달" "初生-" "Neumond"]
            ["연휴" "連休" "mehrere freie Tage hintereinander (connect - rest) "]
            ["실례" "失禮" "Unhöflichkeit (lose - etiquette) "]
            ["실례" "實例" "Beispiel"]
            ["예식장" "禮式場" "designierter Festraum"]
            ["자료" "資料" "Material"]
            ["보고서" "報告書" "Bericht"]
            ["작성" "作成" "verfassen, anfertigen"]
            ["사항" "事項" "particulars, matters, facts (business - item) "]
            ["연고" "軟膏" "Salbe (soft - fat) "]
            ["상처" "傷處" "Wunde"]
            ["근처" "近處" "nahe Umgebung"]
            ["애완" "愛玩" "Vorliebe, Lieblings- "]
            ["동물" "動物" "Tier"]
            ["약사" "藥師" "Apotheker (drug - teacher) "]
            ["연장" "延長" "Verlängerung (z.B. Visum) (delay - long) "]
            ["우표" "郵票" "Briefmarke"]
            ["도장" "圖章" "Stempel, Siegel"]
            ["재학" "在學" "das Studentsein"]
            ["증명서" "證明書" "Bescheinigung"]
            ["부족" "不足" "Mangel, Defizit"]
            ["대신" "代身" "Ersatz"]
            ["전부" "全部" "alles (alle Teile)"]
            ["우체국" "郵遞局" "Postamt (mail - replace, change - bureau) "]
            ["도중" "道中" "unterwegs"]
            ["환전" "換錢" "Geld tauschen (exchange - money) "]
            ["전등" "電燈" "elektrisches Licht"]
            ["치약" "齒藥" "Zahnpasta (tooth - medicine) "]
            ["평균" "平均" "Durchschnitt"]
            ["악몽" "惡夢" "Alptraum "]
            ["반응" "反應" "Reaktion"]
            ["응하다" "應--" "erwidern, annehmen"]
            ["방금" "方今" "jetzt eben"]
            ["지금" "只今" "jetzt (only - now) "]
            ["사장" "社長" "Direktor"]
            ["검토" "檢討" "überprüfen, durchsehen (inspect - attack) "]
            ["단어" "單語" "Wort"]
            ["서명" "書名" "Buchtitel"]
            ["저자" "著者" "Autor"]
            ["출판사" "出版社" "Verlag"]
            ["전체" "全體" "Gesamtheit, das Ganze (für unzählbare Dinge)"]
            ["검색" "檢索" "Suche (inspect - seek) "]
            ["복사" "複寫" "Kopie (double - copy) "]
            ["시작" "始作" "Start, Beginn"]
            ["대접" "待接" "Bewirtung"]
            ["발급하다" "發給--" "ausstellen (eine Karte)"]
            ["의지" "意志" "Wille"]
            ["부동산" "不動産" "Immobilien"]
            ["인도" "人道" "Gehweg"]
            ["식도" "食道" "Speiseröhre (food - road) "]
            ["부전공" "副專攻" "Nebenfach"]
            ["서점" "書店" "Buchladen"]
            ["약속" "約束" "Versprechen, Vereinbarung"]
            ["식당" "食堂" "Restaurant (food - hall) "]
            ["금지" "禁止" "Verbot"]
            ["생활" "生活" "Leben, Lebensumstände"]
            ["색인" "索引" "Index, Verzeichnis (inspect - draw, pull) "]
            ["색출" "索出" "Herausfinden, expose (seek - come out) "]
            ["독일" "獨逸" "Germany (alone - easy) "]
            ["자전거" "自轉車" "Fahrrad (self - roll - cart) "]
            ["식용유" "食用油" "Speiseoel"]
            ["향신료" "香辛料" "Gewürze (fragrance - bitter - materials) "]
            ["목표" "目標" "goal, objective"]
            ["통역" "通譯" "Dolmetschen"]
            ["습관" "習慣" "Gewohnheit (study - accustomed) "]
            ["교과서" "敎科書" "Lehrbuch"]
            ["주소" "住所" "Adresse"]
            ["상상" "想像" "Imagination"]
            ["문장" "文章" "Satz, a written composition"]
            ["언어" "言語" "Sprache"]
            ["창문" "窓門" "Fenster"]
            ["열차" "列車" "Zug (arrange - cart) "]
            ["무화과" "無花果" "Feige"]
            ["신부" "新婦" "Braut (new - daughter in law) "]
            ["여명" "黎明" "Tagesanbruch"]
            ["음치" "音癡" "unmusikalischer Mensch (sound - foolish) "]
            ["주말" "週末" "Wochenende (week - end) "]
            ["신랑" "新郞" "Bräutigam (new - lad (Bursche, Typ)) "]
            ["상태" "狀態" "Zustand, Verhältnisse"]
            ["수업" "授業" "Unterricht"]
            ["기숙사" "寄宿舍" "Wohnheim (send - lodge - house) "]
            ["농담" "弄談" "Scherz (play with - talk) "]
            ["연하" "年下" "Jüngersein (als)"]
            ["연상" "年上" "Ältersein (als)"]
            ["자초지종" "自初至終" "the whole story"]
            ["자존심" "自尊心" "Selbstachtung, Ehre"]
            ["용서" "容恕" "verzeihen, vergeben (face, form - pardon, forgive) "]
            ["기분" "氣分" "Stimmung, Befinden"]
            ["생리" "生理" "Physiologie (Periode)"]
            ["학생" "學生" "Schüler"]
            ["비용" "費用" "Kosten, Ausgaben"]
            ["부담" "負擔" "Bürde, Last"]
            ["신경" "神經" "Nerv(en)"]
            ["식초" "食醋" "Essig (food - vinegar) "]
            ["교회" "敎會" "Kirche"]
            ["성공" "成功" "Erfolg"]
            ["환율" "換率" "Wechselkurs (exchange - ratio) "]
            ["시대" "時代" "Zeitalter, Epoche"]
            ["칫솔" "齒-" "Zahnbuerste"]
            ["인쇄" "印刷" "Drucken"]
            ["보험" "保險" "Versicherung"]
            ["우주" "宇宙" "cosmos, space "]
            ["제대" "除隊" "Entlassung aus der Armee, Ausdienen"]
            ["수량" "數量" "Quantität"]
            ["단위" "單位" "(Maß)einheit (single - position) "]
            ["경우" "境遇" "(Im) Fall (von) (boundary - meet) "]
            ["열정" "熱情" "Leidenschaft"]
            ["표정" "表情" "(Gesichts)ausdruck"]
            ["욕심" "慾心" "Gier"]
            ["일단" "一旦" "sobald, zuerst"]
            ["관세" "關稅" "Zoll (bolt - tax) "]
            ["의사" "醫師" "Arzt (doctor - teacher) "]
            ["의료" "醫療" "medical (doctor - heal) "]
            ["결혼" "結婚" "Hochzeit"]
            ["목록" "目錄" "Liste"]
            ["전화" "電話" "Telefonieren"]
            ["조명" "照明" "Lampe"]
            ["신호등" "信號燈" "Ampel"]
            ["도배" "塗褙" "Tapezieren (malern - Tapete) "]
            ["귀환" "歸還" "Rückkehr"]
            ["선불" "先拂" "Bezahlung im Voraus (first - brush away) "]
            ["피부" "皮膚" "Haut (skin/leather - skin) "]
            ["미안" "未安" "regrettable"]
            ["안녕" "安寧" "Frieden, Ruhe"]
            ["지불" "支拂" "das Bezahlen (support - brush away) "]
            ["면도" "面刀" "Rasieren"]
            ["면상" "面上" "Gesicht"]
            ["속도" "速度" "Geschwindigkeit"]
            ["군대" "軍隊" "Armee (military - (z.B. Rassel-)bande) "]
            ["음력" "陰曆" "Mondkalender"]
            ["필요성" "必要性" "Notwendigkeit (right away - important - nature, character) "]
            ["명칭" "名稱" "offizieller Name"]
            ["환산" "換算" "umrechnen (exchange - count) "]
            ["산업" "産業" "Industrie"]
            ["규격" "規格" "Standard, Norm"]
            ["과자" "菓子" "Snack, candy (fruit - son) "]
            ["의미" "意味" "Bedeutung"]
            ["기적" "奇蹟" "Wunder (strange - trace) "]
            ["통일" "統一" "Unification"]
            ["호기심" "好奇心" "Neugierde"]
            ["사과" "沙果" "Apfel"]
            ["사기" "沙器" "Porzellan, Tonware, Keramik (sand - instrument) "]
            ["음성" "音聲" "Stimme (sound - voice) "]
            ["성량" "聲量" "Lautstärke der Stimme (voice - measure) "]
            ["음악" "音樂" "Musik (sound - pleasure, music) "]
            ["성악" "聲樂" "vocal music (voice - pleasure, music) "]
            ["언급" "言及" "Erwähnung, Referenz, Allusion"]
            ["인하다" "因--" "sich gründen, stützen auf"]
            ["화급" "火急" "dringend"]
            ["방면" "方面" "Richtung"]
            ["박수" "拍手" "Applaus"]
            ["혁명" "革命" "Revolution (improve, correct - life) "]
            ["생강" "生薑" "Ingwer"]
            ["지진" "地震" "Erdbeben"]
            ["발견" "發見" "Entdeckung"]
            ["시계" "時計" "Uhr"]
            ["요구" "要求" "demand (important - seek) "]
            ["수강" "受講" "eine Vorlesung besuchen"]
            ["천재" "天才" "Genie"]
            ["괴물" "怪物" "Monster (weird - goods) "]
            ["유가족" "遺家族" "hinterlassene Familie"]
            ["편견" "偏見" "Vorurteil, Bias"]
            ["감사" "感謝" "thanks, gratitude"]
            ["성관계" "性關係" "Geschlechtsverkehr"]
            ["방해" "妨害" "disturbance, hindrance"]
            ["피해" "被害" "damage, injury, harm"]
            ["죄송" "罪悚" "sorry, regrettable"]
            ["은행" "銀行" "Bank"]
            ["간호사" "看護師" "Krankenschwester"]
            ["퇴직" "退職" "retire"]
            ["어색하다" "語塞--" "awkward"]
            ["예감" "豫感" "(Vor)ahnung"]
            ["유학" "留學" "Studieren im Ausland"]
            ["실력" "實力" "Fähigkeit, Kompetenz"]
            ["칭찬" "稱讚" "praise, admiration"]
            ["공감" "共感" "Mitgefühl"]
            ["무대" "舞臺" "Bühne"]
            ["평일" "平日" "Werktag"]
            ["응용" "應用" "(practical) application, practice"]
            ["의자" "椅子" "Stuhl"]
            ["단" "單" "nur"]
            ["의심" "疑心" "Zweifel, Verdacht"]
            ["범인" "犯人" "Verbrecher; Verdächtiger"]
            ["차이" "差異" "Unterschied"]
            ["약간" "若干" "somewhat, a few"]
            ["만약" "萬若" "wenn, falls"]
            ["의무" "義務" "Pflicht"]
            ["궁리" "窮理" "consideration, contemplation"]
            ["전단" "傳單" "leaflet"]
            ["초안" "草案" "Entwurf"]
            ["방식" "方式" "Verfahren, Methode"]
            ["주변" "周邊" "Umkreis"]
            ["실종신고" "失踪申告" "Vermisstenanzeige"]
            ["질문" "質問" "Frage"]
            ["원어민" "原語民" "Muttersprachler"]
            ["생성" "生成" "erstellen (z.B. Verzeichnis)"]
            ["금성" "金星" "Venus"]
            ["천문학" "天文學" "Astronomie"]
            ["천사" "天使" "Engel"]
            ["심지어" "甚至於" "worst of all"]
            ["유치원" "幼稚園" "Kindergarten"]
            ["수준" "水準" "level, standard"]
            ["인간" "人間" "Mensch"]
            ["존재" "存在" "Geschöpf, Existenz"]
            ["소소하다" "小小--" "trivial, insignificant"]
            ["별의별" "別-別" "of various and unusual sorts"]
            ["주위" "周圍" "Umgebung"]
            ["해소" "解消" "Auflösung, Annullierung"]
            ["유식" "有識" "educated, well-informed"]
            ["만끽" "滿喫" "enjoy, marvel"]
            ["인체" "人體" "human body"]
            ["관하다" "關--" "concern, be about, refer to"]
            ["지식" "知識" "knowledge, information"]
            ["온도" "溫度" "Temperatur"]
            ["학술적" "學術的" "wissenschaftlich"]
            ["신체" "身體" "Körper"]
            ["주요" "主要" "principal, main"]
            ["내장" "內臟" "internal organs"]
            ["우연" "偶然" "chance, accident"]
            ["변화" "變化" "change, mutation"]
            ["담당" "擔當" "Zuständigkeit"]
            ["솔직" "率直" "straightforwardness"]
            ["오해" "誤解" "Missverständnis"]
            ["이해" "理解" "Verstehen"]
            ["해결" "解決" "settle, solve"]
            ["정의" "定義" "Definition"]
            ["조건" "條件" "Bedingung"]
            ["이론" "理論" "Theorie"]
            ["저질" "低質" "low quality, oft im Scherz"]
            ["섭씨" "攝氏" "Celsius"]
            ["미지수" "未知數" "Unbekannte, x"]
            ["유래" "由來" "Herkunft"]
            ["지극" "至極" "äußerst, höchst"]
            ["논리" "論理" "Logik"]
            ["방정식" "方程式" "Gleichung"]
            ["극도" "極度" "Maximum, extreme"]
            ["명백" "明白" "offensichtlich, klar"]
            ["공학" "工學" "Engineering, Technology"]
            ["서력" "西曆" "westlicher (gregorianischer) Kalender, christliche Zeitrechnung"]
            ["세기" "世紀" "Jahrhundert"]
            ["과정" "課程" "(Lehr)kurs"]
            ["등유" "燈油" "Petroleum"]
            ["휘발유" "揮發油" "Benzin"]
            ["경유" "輕油" "Diesel"]
            ["재혼" "再婚" "Re-marriage"]
            ["이혼" "離婚" "Scheidung"]
            ["정류소" "停留所" "Haltestelle"]
            ["각종" "各種" "alle mögliche, sonstige"]
            ["실험" "實驗" "Experiment"]
            ["증명" "證明" "Beweis"]
            ["표준어" "標準語" "Standard-, Hochsprache"]
            ["위로" "慰勞" "Trost"]
            ["이별" "離別" "Trennung, Abschied"]
            ["당하다" "當--" "erleiden"]
            ["상" "賞" "Prize"]
            ["망신" "亡身" "Schande"]
            ["핵심" "核心" "Kernpunkt, Pointe, Quintessenz"]
            ["논문" "論文" "Abhandlung, Dissertation"]
            ["청첩장" "請牒狀" "Hochzeitseinladungsbrief"]
            ["미소" "微笑" "Lächeln"]
            ["복권" "福券" "Lotterie"]
            ["행복" "幸福" "Glücklichkeit"]
            ["불평" "不平" "sich beschweren, sich beklagen"]
            ["국기" "國旗" "Nationalflagge"]
            ["단속" "團束" "Kontrolle, Beaufsichtigung"]
            ["박사" "博士" "(wiss.) Doktor"]
            ["반칙" "反則" "Foul, Regelverletzung"]
            ["선반" "-盤" "shelf, rack"]
            ["계정" "計定" "Konto (Facebook)"]
            ["계좌" "計座" "(Bank)konto"]
            ["귀성" "歸省" "(z.B. Eltern) zu Hause besuchen"]
            ["동거" "同居" "zusammen wohnen"]
            ["동기" "同期" "gleicher Jahrgang"]
            ["목재" "木材" "Holz (Material)"]
            ["배경" "背景" "Hintergrund, Szene(rie)"]
            ["소문" "所聞" "Gerücht"]
            ["전방" "前方" "(50m) weiter (vorne)"]
            ["절대" "絶對" "absolut"]
            ["감속" "減速" "Geschwindigkeitsreduzierung"]
            ["건축" "建築" "construction, building, erection"]
            ["경영" "經營" "administration, operation, running (school, business)"]
            ["계발" "唘發" "Erleuchtung, Entwicklung"]
            ["귀경" "歸京" "return to Seoul (to the capital)"]
            ["감지" "感知" "Wahrnehmung, becoming aware"]
            ["단백질" "蛋白質" "Protein, Eiweiß"]
            ["당류" "糖類" "sugars"]
            ["대표" "代表" "repräsentieren"]
            ["마술" "魔術" "Magie"]
            ["시도" "視度" "Sichtbarkeit, Sichtweite"]
            ["시도" "試圖" "Versuch, trial, attempt"]
            ["중순" "中旬" "die mittleren 10 tage"]
            ["진입" "進入" "Ein-, An-, Zufahrt, Eintritt"]
            ["해외" "海外" "Ausland"]
            ["고통" "苦痛" "pain"]
            ["본인" "本人" "diejenige Person"]
            ["타인" "他人" "andere Person(en)"]
            ["지칭" "指稱" "nennen, refer to .. as"]
            ["부친" "父親" "der eigene Vater"]
            ["구분" "區分" "distinguish"]
            ["분수대" "噴水臺" "Wasserfontäne"]
            ["일부" "一部" "ein Teil"]
            ["파도" "波濤" "Welle"]
            ["수/지평선" "水/地平線" "(Wasser/Land) Horizont"]
            ["객실" "客室" "Raum (für einen Gast, z.B. Hotel)"]
            ["척" "隻" "Zählwort: Schiff/Boot"]
            ["호랑이" "虎狼-" "Tiger"]
            ["충족" "充足" "erfüllen (eine Bedingung)"]
            ["유지" "維持" "maintain, keep"]
            ["게시판" "揭示-" "Schwarzes Brett"]
            ["추억" "追憶" "a (sad, happy) memory, Erinnerung"]
            ["기억" "記憶" "Gedächtnis, remember"]
            ["체육" "體育" "Sport(unterricht)"]
            ["교육" "敎育" "Education"]
            ["인칭" "人稱" "Person (gramm.)"]
            ["책임" "責任" "Verantwortung"]
            ["회상하다" "回想--" "zurückblicken, sich in Erinnerung rufen"]
            ["소풍" "逍風" "Picknick"]
            ["담임" "擔任" "(a teacher in) charge"]
            ["정" "情" "Gefühle (für jmd. haben)"]
            ["인상" "印象" "Eindruck, Impression"]
            ["후회" "後悔" "regret"]
            ["낭비" "浪費" "verschwenden"]
            ["충분히" "充分-" "genug"]
            ["동창" "同窓" "classmate"]
            ["시절" "時節" "(die alten) Tage"]
            ["용기" "勇氣" "Mut"]
            ["고백" "告白" "confession"]
            ["경치" "景致" "scene(ry), view"]
            ["혹은" "或-" "or"]
            ["일생" "一生" "one's lifetime"]
            ["회계사" "會計士" "accountant"]
            ["공무원" "公務員" "Beamter"]
            ["근무" "勤務" "Dienst"]
            ["시야" "視野" "Blickfeld, Sicht (die ~ ist gut)"]
            ["안정" "安定" "stabil"]
            ["재능" "才能" "talent"]
            ["직진" "直進" "sich geradeaus vorwärts bewegen"]
            ["동화" "童話" "Märchen"]
            ["삭제" "削除" "Löschen, Streichen"]
            ["작별" "作別" "Abschiednahme"]
            ["기후" "氣候" "Klima"]
            ["현실" "現實" "Wirklichkeit"]
            ["영하" "零下" "sub-zero"]
            ["폭우" "暴雨" "Starkregen"]
            ["폭설" "暴雪" "starker Schneefall"]
            ["폭풍" "暴風" "Sturm"]
            ["일교차" "日較差" "Minimum und Maximum im Tagesverlauf"]
            ["비교" "比較" "Vergleich"]
            ["노인" "老人" "alter Mensch"]
            ["홍수" "洪水" "Hochwasser"]
            ["태풍" "颱風" "Taifun"]
            ["우박" "雨雹" "Hagel"]
            ["기업" "企業" "company, business, corporation, enterprise"]
            ["신호" "信號" "Signal"]
            ["실시간" "實時間" "Echtzeit"]
            ["절전" "節電" "Energiesparen"]
            ["절약" "節約" "Sparsamkeit"]
            ["조심" "操心" "Vorsicht"]
            ["무역" "貿易" "Handel"]
            ["난이" "難易" "schwer und leicht"]
            ["도통" "都統" "insgesamt, vollständig"]
            ["염려" "念慮" "Sorge"]
            ["참석" "參席" "attendance, participation"]
            ["인정" "認定" "zugeben, akzeptieren"]
            ["투표" "投票" "Stimme, Wahl"]
            ["양보" "讓步" "nachgeben"]
            ["달성" "達成" "achieve, accomplish"]
            ["승리" "勝利" "Sieg"]
            ["응원" "應援" "Hilfe, Beistand"]
            ["천상" "天上" "Himmel, Paradies"]
            ["연기" "演技" "Schauspiel"]
            ["장면" "場面" "Szene, Auftritt"]
            ["중점" "重點" "Fokus"]
            ["최초" "最初" "allererste"]
            ["현명" "顯名" "weise"]
            ["도피" "逃避" "Flucht"]
            ["난폭" "亂暴" "violent, wild"]
            ["대피소" "待避所" "shelter"]
            ["명품" "名品" "a fine article, a masterpiece"]
            ["압력" "壓力" "Druck (pressure)"]
            ["자원" "資源" "Ressourcen"]
            ["효과" "效果" "Effekt"]
            ["자격" "資格" "Qualifikation, Zertifikat"]
            ["동원" "動員" "mobilization"]
            ["생존" "生存" "lebendig"]
            ["간통" "姦通" "Ehebruch, Seitensprung"]
            ["폐지" "廢止" "Abschaffung"]
            ["보수적" "保守的" "konservativ"]
            ["표지판" "標識板" "Schild"]
            ["기사" "技士" "Fahrer"]
            ["칠흑" "漆黑" "pitch-black"]
            ["제작진" "製作陣" "(film) crew"]
            ["적외선" "赤外線" "Infrarotstrahlen"]
            ["잠입" "潛入" "eindringen, infiltrieren"]
            ["본격적" "本格的" "actual, real, full-scale"]
            ["극복" "克服" "überwinden, conquer"]
            ["체계" "體系" "System"]
            ["주입식" "注入式" "cramming method, Auswendiglernen-Methode"]
            ["장벽" "障壁" "Mauer"]
            ["문학" "文學" "literature (as an art form)"]
            ["연구실" "硏究室" "study room, laboratory"]
            ["요구" "要求" "demand"]
            ["대출" "貸出" "loan, lending, mortgage, borrowing"]
            ["반납하다" "返納--" "return, give back"]
            ["편식하다" "偏食--" "sich einseitig ernähren"]
            ["유창하다" "流暢--" "fluent, eloquent"]
            ["현재" "現在" "current"]
            ["충분하다" "充分--" "to be sufficient"]
            ["집세" "-貰" "Miete"]
            ["개강" "開講" "course opening"]
            ["개설" "開設" "establishment, opening"]
            ["여부" "與否" "whether or not (noun)"]
            ["격려하다" "激勵--" "motivieren, ermutigen"]
            ["필수" "必須" "necessity"]
            ["대중문화" "大衆文化" "popular culture"]
            ["단정하다" "端正--" "sauber, ordentlich (angezogen sein), decent"]
            ["노숙자/인" "露宿者/人" "homeless person"]
            ["청혼하다" "請婚--" "to propose (marriage)"]
            ["탄산" "炭酸" "Kohlensäure"]
            ["우울하다" "憂鬱--" "melancholisch"]
            ["수면제" "睡眠劑" "Schlafmittel"]
            ["복용하다" "服用--" "einnehmen (Medizin)"]
            ["자유" "自由" "Freiheit"]
            ["신사" "紳士" "Gentleman"]
            ["숙녀" "淑女" "Lady"]
            ["황홀하다" "恍惚--" "entzückt"]
            ["미래" "未來" "Zukunft"]
            ["직장" "職場" "work place"]
            ["상사" "上司" "Vorgesetzter"]
            ["불만" "不滿" "unzufrieden, Mißfallen"]
            ["안부" "安否" "(sich nach dem) Befinden (erkundigen)"]
            ["안색" "顔色" "skin color"]
            ["야단" "惹端" "Rüge"]
            ["야외" "野外" "draußen"]
            ["상쾌하다" "爽快--" "refreshing, invigorating"]
            ["적성" "適性" "Fähigkeiten, skill"]
            ["보수" "報酬" "pay"]
            ["회상" "回想" "recollect"]
            ["시설" "施設" "facilities"]
            ["동창회" "同窓會" "Klassentreffen"]
            ["감상" "感想" "Eindruck (eines Filmes, ...)"]
            ["흥미 진진하다" "興味 津津--" "höchst spannend"]
            ["실감" "實感" "Eindruck von Realitätsnähe"]
            ["긴장감" "緊張感" "Spannung"]
            ["실화" "實話" "wahre Geschichte"]
            ["가사" "歌詞" "lyrics"]
            ["완곡하다" "婉曲--" "schonend (beibringen), euphemistisch"]
            ["격음" "激音" "harter Konsonant (ㅍㅌㅊㅋ(ㅎ))"]
            ["경음" "硬音" "gespannter Konsonant (ㅃㄸㅆㅉㄲ)"]
            ["평음" "平音" "normaler Konsonant (ㅂㄷㅅㅈㄱ)"]
            ["격음화" "激音化" "Konsonantenverhärtung"]
            ["결합하다" "結合--" "kombinieren"]
            ["동호회" "同好會" "common interest club"]
            ["정기" "定期" "fixed period, regular"]
            ["도자기" "陶磁器" "Porzellanware"]
            ["특이하다" "特異--" "eigentümlich, besonders"]
            ["품질" "品質" "Qualität"]
            ["착각" "錯覺" "Irrtum, Sinnestäuschung, Mißverstehen"]
            ["분리하다" "分離--" "(Müll) trennen"]
            ["애절하다" "哀切--" "herzzerreißend, qualvoll"]
            ["사연" "事緣" "Umstände, circumstances"]
            ["우정" "友情" "Freundschaft"]
            ["이성" "異姓" "das jeweils andere Geschlecht"]
            ["결국" "結局" "ultimately"]
            ["핏기" "-氣" "complexion"]
            ["혈관" "血管" "Blutgefäß"]
            ["권유하다" "勸誘--" "invite, persuade"]
            ["억양" "抑揚" "Intonation"]
            ["형태" "形態" "Form, Morphologie"]
            ["한옥" "韓屋" "Korean-style house"]
            ["보호하다" "保護--" "protect"]
            ["정상" "頂上" "Gipfel (Berg)"]
            ["향상" "向上" "improve"]
            ["작가" "作家" "Autor"]
            ["여가" "餘暇" "Freizeit"]
            ["수락" "受諾" "accept"]
            ["소설" "小說" "novel"]
            ["최신" "最新" "latest, newest"]
            ["단원" "團員" "member"]
            ["시민" "市民" "Bürger"]
            ["모집" "募集" "recruitment"]
            ["지시하다" "指示--" "to point out"]
            ["매번" "每番" "jedes Mal"]
            ["탈피" "脫皮" "self-renewal"]
            ["해초" "海草" "Meerespflanze"]
            ["산호" "珊湖" "Korallen"]
            ["장비" "裝備" "Ausstattung, Equipment"]
            ["포함" "包含" "include, contain"]
            ["일상" "日常" "Alltag"]
            ["사동사" "使動詞" "causative verb"]
            ["고유어" "固有語" "(korean) native word"]
            ["한자" "漢字" "Hanja"]
            ["수필" "隨筆" "essay"]
            ["형용사" "形容詞" "adjective"]
            ["체중" "體重" "Körpergewicht"]
            ["집중" "集中" "Konzentration, Fokus"]
            ["노화" "老化" "Älterwerden"]
            ["유모차" "乳母車" "Kinderwagen"]
            ["교류" "交流" "interchange, exchange"]
            ["계기" "契機" "opportunity, motivation"]
            ["설득하다" "說得--" "persuade, überreden"]
            ["허락" "許諾" "to allow, permit"]
            ["현장" "現場" "site"]
            ["악기" "樂器" "Musikinstrument"]
            ["지휘" "指揮" "führen, dirigieren"]
            ["해열제" "解熱劑" "Fiebersenkungsmedizin"]
            ["응급실" "應急室" "Notaufnahme"]
            ["주동사" "主動詞" "nicht kausatives Verb"]
            ["수건" "手巾" "Handtuch"]
            ["응급 처치" "應急 處置" "Erste Hilfe (emergency removal)"]
            ["사정" "事情" "Umstände, Sachlage"]
            ["평소" "平素" "für gewöhnlich"]
            ["부탁" "付託" "Bitte"]
            ["업무" "業務" "duties"]
            ["검진" "檢診" "check-up, Untersuchung"]
            ["성실" "誠實" "ehrlich"]
            ["변비" "便秘" "Verstopfung"]
            ["고생" "苦生" "trouble, hardship, suffering"]
            ["불면증" "不眠症" "Schlaflosigkeit"]
            ["안과" "眼科" "Augenheilkunde"]
            ["진료" "診療" "Untersuchung und Behandlung"]
            ["아역" "兒役" "Kinderschauspieler"]
            ["취향" "趣向" "Vorliebe, Geschmack"]
            ["생생하다" "生生--" "vivid, lifelike"]
            ["서예" "書藝" "Kalligraphie"]
            ["암" "癌" "Krebs"]
            ["혈압" "血壓" "Blutdruck"]
            ["효능" "效能" "Wirkung"]
            ["주부" "主婦" "house wife"]
            ["담백하다" "淡白--" "einfach, plain (z.B. Essen)"]
            ["신선하다" "新選--" "frisch"]
            ["열량" "熱量" "Energiegehalt"]
            ["소용" "所用" "usefulness"]
            ["과로" "過勞" "Überanstrengung"]
            ["증상" "症狀" "(Krankheits-) Symptom"]
            ["능률" "能率" "Effizienz"]
            ["만병" "萬病" "alle (Arten von) Krankheiten"]
            ["근원" "根源" "Quelle, Wurzel (allen Übels)"]
            ["질병" "疾病" "Krankheit"]
            ["심리" "心理" "mental, psychological"]
            ["도심" "都心" "downtown, inner city"]
            ["순환" "循環" "Umlauf, Zirkulation, (Blut)kreislauf"]
            ["일시" "一時" "temporär, einmalig"]
            ["통계" "統計" "Statistik"]
            ["과반수" "過半數" "Mehrheit"]
            ["세계화" "世界化" "Globalisierung"]
            ["적절하다" "適切--" "appropriate"]
            ["대상" "對象" "target, subject"]
            ["공해" "公害" "public hazard (pollution)"]
            ["과학" "科學" "Wissenschaft"]
            ["매력" "魅力" "attraktiv, charming, appealing"]
            ["탁하다" "濁--" "dicke (Luft)"]
            ["취업" "就業" "ins Arbeitsleben (wieder)eintreten"]
            ["지방" "地方" "Gegend, Region"]
            ["신중하다" "愼重--" "bedachtsam, sorgfältig"]
            ["전망" "展望" "forecast, outlook, prospect"]
            ["인심" "人心" "Gemüt (der Menschen)"]
            ["초순" "初旬" "die ersten zehn Tage eines Monats"]
            ["수필집" "隨筆集" "a collection of essays"]
            ["간결하다" "簡潔--" "concise, terse, succinct"]
            ["문체" "文體" "writing style"]
            ["평" "評" "Review, Kritik"]
            ["참석하다" "參席--" "teilnehmen"]
            ["위험" "危險" "Gefahr"]
            ["비밀" "秘密" "Geheimnis"]
            ["최근" "最近" "nearest, most recent"]
            ["변명" "辨明" "Rechtfertigung, Erklärung"]
            ["부인하다" "否認--" "deny, negate"]
            ["반박하다" "反駁--" "dispute, take issue with"]
            ["작품" "作品" "ein (künstlerisches) Werk"]
            ["잔액" "殘額" "money left over"]
            ["의문" "疑問" "Zweifel, Verwunderung"]
            ["재생" "再生" "play, wiedergeben (button)"]
            ["인류" "人類" "mankind"]
            ["수명" "壽命" "life span"]
            ])
