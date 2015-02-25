# utilt
This library attempts to make Java a little less painful.

## `edu.jhu.hlt.utilt.io`
Contains classes that can wrap `java.nio.file.Path` objects, checking
if the objects are directories or missing. Useful for avoiding calls to
Java's `Files` class everywhere.

## `LoggedUncaughtExceptionHandler`
Implementation of `UncaughtExceptionHandler` that uses `slf4j` to log
the exception.

Latest Maven dependency
---
```xml
<dependency>
  <groupId>edu.jhu.hlt</groupId>
  <artifactId>utilt</artifactId>
  <version>1.1.0</version>
</dependency>
```
