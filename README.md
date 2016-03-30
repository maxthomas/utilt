# utilt
[![Circle CI](https://circleci.com/gh/maxthomas/utilt.svg?style=svg)](https://circleci.com/gh/maxthomas/utilt)
![Maven Badges](https://maven-badges.herokuapp.com/maven-central/edu.jhu.hlt/utilt/badge.svg)
[![javadoc.io](https://javadocio-badges.herokuapp.com/edu.jhu.hlt/utilt/badge.svg)](http://www.javadoc.io/doc/edu.jhu.hlt/utilt/)

This library attempts to make Java a little less painful.

Latest Maven dependency
---
```xml
<dependency>
  <groupId>edu.jhu.hlt</groupId>
  <artifactId>utilt</artifactId>
  <version>2.0.0</version>
</dependency>
```

## `SystemErrDisabler`
Toggle writing to `System.err` - useful if tools you don't own
have calls that aren't worth keeping around.

## `AutoCloseableIterator`
Combination of `Iterator<K>` and `AutoCloseable`, inspired by C#'s
[IDisposable](http://msdn.microsoft.com/en-us/library/system.idisposable.aspx)
interface.

## `edu.jhu.hlt.utilt.io`
Contains classes that can wrap `java.nio.file.Path` objects, checking
if the objects are directories or missing. Useful for avoiding calls to
Java's `Files` class everywhere.

## `LoggedUncaughtExceptionHandler`
Implementation of `UncaughtExceptionHandler` that uses `slf4j` to log
the exception.
