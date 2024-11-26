# Asteroid EMS LDK


### config in build.gradle.kts

```kts
repositories {
    maven("https://r.irepo.space/maven")
}

dependencies {
    // all modules
    implementation("io.asteroid.ldk:all:1.0.3")

    // common module
    implementation("io.asteroid.ldk:common:1.0.3")

    // license module
    implementation("io.asteroid.ldk:license:1.0.3")

    // obfuscate module
    implementation("io.asteroid.ldk:obfuscate:1.0.3")
}
```

### config in build.gradle

```groovy
repositories {
    maven { url 'https://r.irepo.space/maven' }
}

dependencies {
    // all modules
    implementation 'io.asteroid.ldk:all:1.0.3'

    // common module
    implementation 'io.asteroid.ldk:common:1.0.3'

    // license module
    implementation 'io.asteroid.ldk:license:1.0.3'

    // obfuscate module
    implementation 'io.asteroid.ldk:obfuscate:1.0.3'
}
```

### config in pom.xml

```xml

<repositories>
    <repository>
        <id>irepo</id>
        <url>https://r.irepo.space/maven</url>
    </repository>
</repositories>

<dependencies>
<!-- all modules -->
<dependency>
    <groupId>io.asteroid.ldk</groupId>
    <artifactId>all</artifactId>
    <version>1.0.3</version>
</dependency>

<!-- common module -->
<dependency>
    <groupId>io.asteroid.ldk</groupId>
    <artifactId>common</artifactId>
    <version>1.0.3</version>
</dependency>

<!-- license module -->
<dependency>
    <groupId>io.asteroid.ldk</groupId>
    <artifactId>license</artifactId>
    <version>1.0.3</version>
</dependency>

<!-- obfuscate module -->
<dependency>
    <groupId>io.asteroid.ldk</groupId>
    <artifactId>obfuscate</artifactId>
    <version>1.0.3</version>
</dependency>
</dependencies>
```