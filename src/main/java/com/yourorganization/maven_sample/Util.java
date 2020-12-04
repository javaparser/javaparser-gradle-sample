package com.yourorganization.maven_sample;

import com.github.javaparser.utils.CodeGenerationUtils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Util {


    /**
     * Temporary addition until JavaParser itself contains a similar method.
     * This is almost identical to the maven equivalent at CodeGenerationUtils#mavenModuleRoot()
     * <p>
     * Useful for locating source code within your Gradle project. Finds the classpath for the given class,
     * then backs up out of multiple directories, until reaching the directory containing build.gradle -
     * typically this is "build/(test-)classes/java/main" (four traversals)
     * or "build/libs/javaparser-gradle-sample-shadow-1.0-SNAPSHOT" (three)
     */
    public static Path gradleModuleRoot(Class<?> c) {
        String buildFileName = "build.gradle";


        Path other = Paths.get(".");
        Path normalize = CodeGenerationUtils
                .classLoaderRoot(c)
                .resolve(other)
                .normalize();

        // If it's not a directory, or if it is a directory and the build file isn't present, go up a level.
        while (!normalize.toFile().isDirectory() || !normalize.resolve(buildFileName).toFile().exists()) {
            System.out.println("source root not found at + " + normalize + ", trying next directory up");
            other = other.resolve("..");
            normalize = CodeGenerationUtils
                    .classLoaderRoot(c)
                    .resolve(other)
                    .normalize();
        }

        return normalize;
    }

}
