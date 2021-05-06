.PHONY: dev-setup
dev-setup: dev-setup-node_modules dev-setup-react-native

.PHONY: dev-setup-node_modules
dev-setup-node_modules:
	rm -rf node_modules
	npm install

.PHONY: dev-setup-react-native
dev-setup-react-native:
	rm -rf react-native
	npx react-native init hanjahanzi --version=0.64.1
	mv hanjahanzi react-native
	echo 'import "./cljs-out/index.js";' > react-native/index.js

.PHONY: dev-watch-1-shadow-cljs
dev-watch-1-shadow-cljs:
	npx shadow-cljs watch app web

.PHONY: dev-watch-2-react-native-metro
dev-watch-2-react-native-metro:
	(cd react-native; npx react-native start)

.PHONY: dev-run-android
dev-run-android:
	(cd react-native; npx react-native run-android)
