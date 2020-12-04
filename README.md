JavaParser and Gradle sample
---

A fully working sample Gradle project that parses and generates code with [JavaParser](http://www.javaparser.org)

This is targeted at people without [Gradle](https://gradle.org/) experience.

To build it, you will need to download and unpack the latest (or recent) version of Gradle (https://gradle.org/install/)
and put the `gradle` command on your path. Alternatively, you can use the (included) gradle wrapper.

Then, you will need to install a Java 1.8 (or higher) JDK (not JRE!), and make sure you can run `java` from the command line.

Now you can run `gradle shadowJar` - Gradle will compile your project and put the
 resulting jar file in the `build` directory.

If you like to run from the command line, execute 
`java -jar build/libs/javaparser-gradle-sample-shadow-1.0-SNAPSHOT-beta.jar`.

How you run this code is up to you, but usually you would start by using an IDE 
like [NetBeans](https://netbeans.org/), [Intellij IDEA](https://www.jetbrains.com/idea/), 
or [Eclipse](https://eclipse.org/ide/).

Note that the JavaParser dependencies may lag behind the official releases a bit.

If you notice some problems with this setup, please open an issue.
