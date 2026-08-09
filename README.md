# PathLite

PathLite is a lightweight Java library that makes working with **SQLite databases** simple and fast. It is designed for small projects, desktop apps, bots, and tools where you want a database without writing a lot of boilerplate JDBC code.

## Features

* Simple SQLite database access
* Minimal setup
* Lightweight and easy to learn
* Works with standard JDBC
* Suitable for Java desktop applications and bots

---

## Installation

Add PathLite to your Maven project.

### Maven

```xml
<dependency>
    <groupId>io.github.MGoradeCodes</groupId>
    <artifactId>pathlite</artifactId>
    <version>1.0.0</version>
</dependency>
```

---

## Requirements

* Java 21 or newer
* SQLite JDBC driver

Example dependency:

```xml
<dependency>
    <groupId>org.xerial</groupId>
    <artifactId>sqlite-jdbc</artifactId>
    <version>3.46.0.0</version>
</dependency>
```

---

## Quick Start

```java
import io.github.MGoradeCodes.pathlite.DB;

public class Main {
    public static void main(String[] args) throws Exception {
        DB db = new DB("data/app.db");

        // Use your DB instance here
        System.out.println("Database connected!");
    }
}
```

---

## Project Structure

```text
data/
└── app.db
```

PathLite will create the database file if it does not already exist.

---

## Use Cases

* JavaFX desktop applications
* Swing applications
* Discord bots
* Small utilities and tools
* Learning JDBC and SQLite

---

## Why PathLite?

JDBC is powerful, but it can feel verbose for small projects. PathLite provides a cleaner starting point while still using standard JDBC underneath, so you can expand your application later without being locked into a custom database engine.

---

## Maven Central

PathLite is published on Maven Central.

Search for:

* **Group:** `io.github.MGoradeCodes`
* **Artifact:** `pathlite`

---

## License

This project is licensed under the **MIT License**.

---

## Author

**Manthan Gorade**

GitHub: https://github.com/MGoradeCodes
