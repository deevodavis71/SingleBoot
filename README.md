# SingleBoot

Execute each of the following from the root of the project...

From Root
=========

	Compile all modules from root (library + app1 + app2)
	mvn clean install

	Compile Application1 and its dependencies (app1 + library)
	mvn clean install -pl application1/web -am

	Compile Application2 and its dependencies (app2 + library)
	mvn clean install -pl application2/web -am

	Compile just the shared library (library only)
	mvn clean install -pl library -am

From Application1 Sub Folder
============================

	Compile Application1 and its dependencies (app1 + library)
	mvn clean install


From Application2 Sub Folder
============================

	Compile Application2 and its dependencies (app1 + library)
	mvn clean install
