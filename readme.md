
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

```xml
	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.junit</groupId>
				<artifactId>junit-bom</artifactId>
				<version>5.7.0</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>

	<dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter</artifactId>
			<scope>test</scope>
		</dependency>
	<dependencies>

```

[pom.xml](https://github.com/junit-team/junit5-samples/blob/r5.7.0/junit5-jupiter-starter-maven/pom.xml)

# TroubleShooting 


- [java version change after maven update](https://stackoverflow.com/questions/28509928/java-version-automatically-change-to-java-1-5-after-maven-update)

```java
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.2</version> <!-- or whatever current version -->
				<configuration>
					<source>11</source>
					<target>11</target>
				</configuration>
			</plugin>
```

- [@BeforeAll doesn't work](https://stackoverflow.com/questions/49441049/junit-5-does-not-execute-method-annotated-with-beforeeach)

```java
			<plugin>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>2.19.1</version>
				<dependencies>
					<dependency>
						<groupId>org.junit.platform</groupId>
						<artifactId>junit-platform-surefire-provider</artifactId>
						<version>1.1.0</version>
					</dependency>
				</dependencies>
			</plugin>


		</plugins>
	</build>
```

  
