import java.sql.*;

public class Q24 {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/JAVA_SEM4";
    private static final String USERNAME = "NEGI_BOSS";
    private static final String PASSWORD = "qWeRtY";
    
    public static void main(String[] args) {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            insertData(connection, "rohit", "rohitsharma@gmail.com", "delhi");

            updateData(connection, 1, "rohit", "rohitsharma@gmail.com", "bangalore");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertData(Connection connection, String name, String email, String city) throws SQLException {
        String sql = "INSERT INTO users (name, email, city) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, email);
        statement.setString(3, city);
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Data inserted successfully.");
        }
        statement.close();
    }

    private static void updateData(Connection connection, int id, String name, String email, String city) throws SQLException {
        String sql = "UPDATE users SET name=?, email=?, city=? WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, email);
        statement.setString(3, city);
        statement.setInt(4, id);
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Data updated successfully.");
        }
        statement.close();
    }
}

