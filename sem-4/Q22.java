import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q22 extends JFrame {
    private JTextField textField;
    private JTextArea textArea;
    private JCheckBox checkBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JComboBox<String> comboBox;

    public Q22() {
        setTitle("Swing Controls Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text Field
        textField = new JTextField(20);

        // Text Area
        textArea = new JTextArea(5, 20);
        JScrollPane textAreaScrollPane = new JScrollPane(textArea);

        // Check Box
        checkBox = new JCheckBox("Check Box");

        // Radio Buttons
        radioButton1 = new JRadioButton("Option 1");
        radioButton2 = new JRadioButton("Option 2");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);

        // Combo Box
        String[] comboBoxItems = {"Item 1", "Item 2", "Item 3"};
        comboBox = new JComboBox<>(comboBoxItems);

        // Button
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textFieldValue = textField.getText();
                String textAreaValue = textArea.getText();
                boolean checkBoxSelected = checkBox.isSelected();
                String radioButtonValue = radioButton1.isSelected() ? "Option 1" : "Option 2";
                String comboBoxValue = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(Q22.this,
                    "Text Field Value: " + textFieldValue + "\n" +
                    "Text Area Value: " + textAreaValue + "\n" +
                    "Check Box Selected: " + checkBoxSelected + "\n" +
                    "Radio Button Selected: " + radioButtonValue + "\n" +
                    "Combo Box Selected: " + comboBoxValue);
            }
        });

        // Layout
        JPanel panel = new JPanel(new GridLayout(7, 1));
        panel.add(new JLabel("Text Field:"));
        panel.add(textField);
        panel.add(new JLabel("Text Area:"));
        panel.add(textAreaScrollPane);
        panel.add(checkBox);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(new JLabel("Combo Box:"));
        panel.add(comboBox);
        panel.add(button);

        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Q22 demo = new Q22();
            demo.setVisible(true);
        });
    }   
}
