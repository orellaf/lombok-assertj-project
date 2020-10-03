
# Configuration assertj

- [assertj generator maven plugin](https://joel-costigliola.github.io/assertj/assertj-assertions-generator-maven-plugin.html)
- [clean goal maven custom](https://maven.apache.org/plugins/maven-clean-plugin/examples/delete_additional_files.html)

# Lombok

## Custom toString

```java
@ToString.Exclude
private Path path;
```

[source](https://projectlombok.org/features/ToString)

## Custom equals

```java
@EqualsAndHashCode.Exclude
private String location;
```

[source](https://projectlombok.org/features/EqualsAndHashCode)

# Junit5

[pom.xml](https://github.com/junit-team/junit5-samples/blob/r5.7.0/junit5-jupiter-starter-maven/pom.xml)

# TroubleShooting 


- [java version change after maven update](https://stackoverflow.com/questions/28509928/java-version-automatically-change-to-java-1-5-after-maven-update)
- [@BeforeAll doesn't work](https://stackoverflow.com/questions/49441049/junit-5-does-not-execute-method-annotated-with-beforeeach)
  
