import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private final Path directory;
    private final Path path;

    public Database(String inputDir) {
        try {
            path = Paths.get(inputDir);
            Files.createDirectories(path);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        this.directory = path;
    }

    public Connection getConnection(String dbName)
            throws SQLException {
        Path dbPath = directory.resolve(dbName);
        String url = "jdbc:sqlite:" + dbPath.toAbsolutePath();

        return DriverManager.getConnection(url);
    }
}