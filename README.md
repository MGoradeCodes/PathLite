<p align="center">
  <img src="Assets/Banner.png" alt="PathLite Banner">
</p>

# PathLite

Tiny SQLite directory-based connection helper for Java.

## Installation

```xml
<dependency>
    <groupId>io.github.mgoradecodes</groupId>
    <artifactId>pathlite</artifactId>
    <version>1.1.0</version>
</dependency>
```

## Quick Start

```java
import io.github.MGoradeCodes.pathlite.Database;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {

        Database db = new Database();

        // Creates/uses databases/users.db
        Connection conn = db.getConnection("users");

        System.out.println("Connected!");
        conn.close();
    }
}
```

## Custom Database Directory

```java
Database db = new Database();

db.setDir("C:/MyApp/Data");

// Creates/uses C:/MyApp/Data/users.db
Connection conn = db.getConnection("users");
```

## Features

- Automatic database directory creation
- Default `databases/` folder
- Custom database directory support
- Automatic `.db` extension handling
- Lightweight wrapper around SQLite JDBC
- Works alongside standard JDBC

## Example JDBC Usage

```java
Database db = new Database();

try (Connection conn = db.getConnection("users")) {

    String sql = """
        CREATE TABLE IF NOT EXISTS users (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            username TEXT,
            balance REAL
        )
    """;

    conn.createStatement().execute(sql);
}
```

## Requirements

- Java 26+
- SQLite JDBC

## License

MIT License
