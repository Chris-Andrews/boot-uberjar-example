# boot-uberjar-example [![Build Status][badge]][build]

This example project demonstrates how to package a Clojure application
as a jar that can be executed with `java -jar`, using the [Boot] build tool.

To create a jar, run `boot build`.  Then run it with `java -jar target/project.jar`

You can also run the project's `-main` method without creating an uberjar with:

    ./build.boot

[Boot]:  http://boot-clj.com/
[badge]: https://travis-ci.org/adzerk-oss/boot-uberjar-example.png?branch=master
[build]: https://travis-ci.org/adzerk-oss/boot-uberjar-example
