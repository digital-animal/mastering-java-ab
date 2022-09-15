# instruction to run the application

    collection of java programs from the `course mastering java`

## running projects

    to run any of the project cd into that direcoty

## for project 01-10 run project by just compiling and running on jvm

    javac $sourceFileName
    java $compiledClassFile

    or

    ./run $sourceFileName (for linux only)


### for project 11-28 run project by running one of the following commands

    mvn clean compile exec:java  <!-- if maven installed -->

    ./mvnw clean compile exec:java  <!-- for linux, if maven not installed -->

    mvnw clean compile exec:java  <!-- for windows, if maven not installed -->

### to run a particular project edit the pom.xml in the following section

    <mainClass>packageName.className</mainClass>

    example.
    <mainClass>com.zahid.customer.CustomerTest</mainClass>


## simple java projects 

    01-introduction
    02-data-types
    03-setup-Environment
    04-features-architecture
    05-operator-expression
    06-string-printing
    07-conditional-statements
    08-loops
    09-arrays
    10-methods


## java projects with maven

    11-object-oriented-programming
    12-inheritance
    13-abstractclass
    14-interface
    15-innerclass
    16-static-final
    17.Packages
    17-package-using-maven
    18-exception-handling
    18.Exception_Handling
    19-multithreading
    20-lang-package
    21-annotationdoc
    22-lambda-expression
    23-javaio-stream
    24-java-generics
    25-collection-framework
    26-datetime-api
    27-network-programming
    28-jdbc-sqlite