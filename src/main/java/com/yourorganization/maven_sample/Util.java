package com.yourorganization.maven_sample;

import com.github.javaparser.utils.CodeGenerationUtils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Util {


    /**
     * Temporary addition until JavaParser itself contains a similar method.
     * This is almost identical to the maven equivalent at CodeGenerationUtils#mavenModuleRoot()
     *
     * Useful for locating source code within your Gradle project. Finds the classpath for the given class,
     * then backs up out of multiple directories, until reaching the directory containing build.gradle
     * "build/(test-)classes/java/main"
     */
    public static Path gradleModuleRoot(Class<?> c) {
        return CodeGenerationUtils
                .classLoaderRoot(c)
                .resolve(Paths.get("..", "..", "..", ".."))
                .normalize();
    }

}
