package io.github.MGoradeCodes.pathlite;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private Path directory = Paths.get("databases");

    String dbName;

    public Database() {
        initDirectory();
    }

    public void setDir(String inputDir) {
        this.directory = Paths.get(inputDir);
        initDirectory();
    }

    private void initDirectory() {
        try {
            Files.createDirectories(directory);
        } catch (IOException e) {
            throw new RuntimeException("Failed to create directory", e);
        }
    }

    private String normalize(String dbName) {
        return dbName.endsWith(".db") ? dbName : dbName + ".db";
    }

    public Database createDb(String dbName) {
        this.dbName = normalize(dbName);
        return this;
    }

    public Connection getConnection() throws SQLException {
        Path dbPath = directory.resolve(normalize(dbName));
        String url = "jdbc:sqlite:" + dbPath.toAbsolutePath();
        return DriverManager.getConnection(url);
    }
}