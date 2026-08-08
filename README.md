# PathLite

Tiny SQLite directory-based connection helper for Java.

PathLite automatically creates the database directory if it does not exist and provides a simple way to open SQLite database connections.

## Maven

```xml
<dependency>
    <groupId>io.github.mgoradecodes</groupId>
    <artifactId>pathlite</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

```java
import io.github.mgoradecodes.pathlite.Database;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {

        // Creates the directory if it does not exist
        Database db = new Database("C:/Apps/MyApp");

        // Opens (or creates) users.db inside that directory
        try (Connection con = db.getConnection("users.db")) {
            System.out.println("Connected successfully!");
        }
    }
}
```

## What it does

* Creates the target directory automatically.
* Opens SQLite connections using JDBC.
* Stores database files inside the specified directory.

## Example

```java
Database db = new Database("data");
Connection con = db.getConnection("app.db");
```

This creates:

```text
data/
└── app.db
```

## Requirements

* Java 26+
* SQLite JDBC (`org.xerial:sqlite-jdbc`)

## License

MIT License.
