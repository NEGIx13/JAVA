import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;

public class Q15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton("Click Me!");
        
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        };
        
        button.addActionListener(listener);
        button.setBounds(100, 100, 100, 30); 

        frame.add(button);
        
 //       frame.getContentPane().add(button, BorderLayout.CENTER);
        
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
