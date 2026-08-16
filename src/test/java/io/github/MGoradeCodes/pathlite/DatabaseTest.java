package io.github.MGoradeCodes.pathlite;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DatabaseTest {

    @Test
    void databaseCanConnect() throws SQLException {
        Database db = new Database();

        db.setDir("test-databases");

        Connection connection =
                db.createDb("test").getConnection();

        assertNotNull(connection);

        connection.close();
    }
}