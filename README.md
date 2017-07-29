# SingleBoot

Execute each of the following from the root of the project...

Compile all modules (library + app1 + app2)
mvn clean install

Compile Application1 and its dependencies (app1 + library)
mvn clean install -pl application1 -am

Compile Application2 and its dependencies (app2 + library)
mvn clean install -pl application2 -am

Compile just the shared library (library only)
mvn clean install -pl library -am


