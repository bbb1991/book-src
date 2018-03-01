import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
	    System.out.println("Hello there!");
        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");) {
            System.out.println("Got connection!");
            int major = connection.getMetaData().getDriverMajorVersion();
            int minor = connection.getMetaData().getDriverMinorVersion();
            System.out.printf("Driver version: %d.%d%n", major, minor);
        } catch (SQLException e) {
            System.err.println("Cannot get new connection!");
            e.printStackTrace();
        }
    }
}

