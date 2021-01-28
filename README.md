## Solution

It is a gradle console project.

## Prerequisites

- Java 11 SE or above.
- Gradle 6.3 or above.

### Compile and Execution

For `Gradle` run the following commands to compile & execute

##### Linux

Open a terminal window in the project root, then type and execute the following commands.

```
./gradlew clean build jar
java -jar build/libs/clover.jar <absolute_path_to_input_file>
```

##### Windows

Open a powershell/command window in the project root, then type and execute the following commands.

```
.\gradlew clean build jar
java -jar .\build\libs\clover.jar <absolute_path_to_input_file>
```
