# Count Lines with comments or not for JAVA
[Repository in GitHub here](https://github.com/JffMv/Count-Lines-with-comments-or-not)

In java can count with comments or not, in others files just count rows.


## Getting Started

For clone this repository you use this command:
 ```
 git clone https://github.com/JffMv/Count-Lines-with-comments-or-not
 ```

### Prerequisites

Have installed:
maven 3.9.6
[Install Maven](https://maven.apache.org/download.cgi#Installation)


git 2.44
[Install Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

java
[Install Java](https://www.oracle.com/co/java/technologies/downloads/)


## Running the tests

For Run Test you need the command:

```
 mvn test
```

## Deployment

The process were building project maven with the command:

```
mvn archetype:generate -DgroupId=edu.escuelaing.arsw.ASE.app -DartifactId=count_line -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

```

Then we have verify the class App.java and the pom.xml, run the project with:

```
mvn package
```


For generate documentation update the pom.xml add and later use "mvn package":

```
<reporting>
    <plugins>
    <plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-javadoc-plugin</artifactId>
    <version>2.10.1</version>
    <configuration>
    </configuration>
    </plugin>
    </plugins>
</reporting>
```

and the use in order this commands for run documentation:

```
mvn javadoc:javadoc
mvn javadoc:jar
mvn javadoc:aggregate
mvn javadoc:aggregate-jar
mvn javadoc:test-javadoc
mvn javadoc:test-jar
mvn javadoc:test-aggregate
mvn javadoc:test-aggregate-jar
```

if you want see this documentation go to file located


```
...\target\apidocs\index.html

```
Then we start designing the app with the next model:
![Diagram.png](src/main/resources/img.png)

All methods are static, so the classes no call anything object, only use the methods for the aim.

Run the project seen console with where X is phy or loc while Y is where save the project:
```
java -cp target/count_lines-1.0-SNAPSHOT.jar edu.escuelaing.arsw.ASE.app.App X "Y\count_lines"

```
and result print path the file or files in this folder and amount the rows in determinate document.
For example:
```
...\count_lines\target\testapidocs\stylesheet.css is a file and your number of rows is: 786
```
## Built With

* [Java](https://www.java.com/es/) - The language used
* [Maven](https://maven.apache.org/) - Dependency Management



## Authors

* **Yeferson Mesa**

## License

This project is licensed under the MIT License - see the [LICENSE.txt](LICENSE.txt) file for details
