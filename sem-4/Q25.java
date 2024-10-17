import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Q25 extends JFrame {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/JAVA_SEM4";
    private static final String USERNAME = "NEGI_BOSS";
    private static final String PASSWORD = "qWeRtY";

    private JTextArea textArea;

    public Q25() {
        setTitle("Database Data Display");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        fetchDataFromDatabase();
        setVisible(true);
    }

    private void fetchDataFromDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM your_table_name");

            StringBuilder data = new StringBuilder();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String city = resultSet.getString("city");
                data.append("ID: ").append(id).append(", Name: ").append(name).append(", Email: ").append(email).append(", City: ").append(city).append("\n");
            }
            textArea.setText(data.toString());

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Q25::new);
    }
}
