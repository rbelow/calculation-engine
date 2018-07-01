# Java Fundamentals

Good applications have good error handling

## Exceptions and Error Handling

Traditional approach of checking error codes/flags is too intrusive

Exceptions provide a non-intrusive way to signal errors (try/catch/finally)

It's not legal to divide by zero (why?) so programs crash

`BufferedReader` (built-in Java class) provides an efficient way to read content

`FileReader` (built-in Java class) takes on the details of reading content from a file

`Integer` is a primitive type wrapper class

Variables declared inside a block are not visible outside the block (try/catch/finally)

Any time we clean up a resource (e. g. `reader = new BuferredReader(new FileReader("C:\\Numbers.txt")); reader.close()`) be sure
to check against initialization value (e. g. `BufferedReader reader = null; finally { if (reader != null) reader.close(); }``)

`finally` can also have an error so `finally { try { } catch(Exception e) { } }`

Errors are represented by Exceptions! Exceptions are Objects!

Object => Throwable => Error => LinkageError - JVM related error. We do not handle this kind of errors normally

Object => Throwable => Exception => RuntimeException (Unchecked exceptions) - Our program errors e. g. NullPointerException

Object => Throwable => Exception => IOException (Checked exceptions: The compiler looks if we handle this type of exceptions in our program)

Exceptions can be handled by type. First assignable catch is selected (from top to bottom). *Start catch blocks with most specific exception types!*

`NumberFormatException` inherits from `RuntimeException` it's a _unchecked exception_ (the compiler does not require to handle them)

Java looks up the call stack for exception handling: Exceptions propagate up the call stack!

Exceptions are part of a method's contract: Method is responsible for any checked exceptions that might occur. Catch the exception / *Document that the exception might occur (`throws` clause)*

*The caller of a specific class knows generally better how/why to handle the class method's exception*

The `throws` clause of an overriding method must be compatible with the `throws` clause of the overridden method

Create exception instance before throwing (provide meaningful detail). Most exception classes provide a constructor that accepts a String message or other detail. Include originating exception (`initCause` method, many provide a constructor that accepts the originating exception)

You can create custom exception types but *in most cases it's better to use existing exception types!*

## Working with Packages

Naming packages with the reverse domain name structure: com.pluralsight.travel

Current package, java.lang package (http://bit.ly/javalang), does not to be fully qualified when using them

*`import` is only a mapper for the compiler!*

Single type import: `import com.xyzcompany.bar.Beer` (preferred way to import types)

Import on demand: `import com.xyzcompany.bar.*` (exposes code to potential breakages)

What when you want to import the Flight type from 2 different packages?

Packages provide _access boundaries_. Access modifiers: no access modifier, `public`, `private`, `protected`

Package folder structure can be placed into an archive file (jar file: can be compressed and have a manifest - http://bit.ly/jarmanifest)

Build managers like Gradle and Maven can create jar files. Also IDEs and JDK can create jar files

Run your java program from cmd with: `java com.pluralsight.myapp.Main`

Java jar documentation: http://bit.ly/psjavajar

Generate jar files with IntelliJ with "File > Project Structure... > Project Settings > Artifacts > + > JAR" and "Build > Build Artifacts..." (other IDEs follow a more standardised way)

Execute the jar with cmd: `java -jar CalcEngine.jar` (the jar file specifies in the manifest where the entry point is)

A jar file is only a zip file with the addition of a manifest
