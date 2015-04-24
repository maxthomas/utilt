# utilt
This library attempts to make Java a little less painful.

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

Latest Maven dependency
---
```xml
<dependency>
  <groupId>edu.jhu.hlt</groupId>
  <artifactId>utilt</artifactId>
  <version>1.3.1</version>
</dependency>
```
