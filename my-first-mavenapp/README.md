# Setting Up and running  Maven Project via command line

* Create Maven project 

```
mvn archetype:generate -DgroupId=sdu.cbse.mavenexample -DartifactId=my-first-mavenapp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

* Install dependencies 
```
mvn clean install
```
## add build plugin into the pom.xml
```xml

  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.2.0</version>
        <configuration>
          <archive>
            <manifest>
              <mainClass>sdu.cbse.mavenexample.App</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>
    </plugins>
  </build>

```

## Install dependencies
```angular2html
mvn clean package

```

## Run the project 
```
mvn exec:java -Dexec.mainClass="sdu.cbse.mavenexample.App"
```
## Check Manifest File
```
jar xf target/my-first-mavenapp-1.0-SNAPSHOT.jar META-INF/MANIFEST.MF
cat META-INF/MANIFEST.MF
```
* It Should  include
  * * Manifest File: Ensure that the META-INF/MANIFEST.MF file in your JAR includes the Main-Class attribute.

  * * Java Version: Make sure you are using a compatible version of Java.

  * * Dependencies: Ensure all required dependencies are included.

## Run the Jar
```angular2html
java -jar target/my-first-mavenapp-1.0-SNAPSHOT.jar
```