import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Q21 extends JFrame implements AdjustmentListener {
    private JScrollBar redScrollBar;
    private JScrollBar greenScrollBar;
    private JScrollBar blueScrollBar;
    private JPanel colorPanel;

    public Q21() {
        setTitle("RGB Color Picker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        redScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        greenScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        blueScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.BLACK);

        redScrollBar.addAdjustmentListener(this);
        greenScrollBar.addAdjustmentListener(this);
        blueScrollBar.addAdjustmentListener(this);

        JPanel scrollPanel = new JPanel();
        scrollPanel.setLayout(new GridLayout(3, 1));
        scrollPanel.add(redScrollBar);
        scrollPanel.add(greenScrollBar);
        scrollPanel.add(blueScrollBar);

        getContentPane().add(scrollPanel, BorderLayout.NORTH);
        getContentPane().add(colorPanel, BorderLayout.CENTER);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        int red = redScrollBar.getValue();
        int green = greenScrollBar.getValue();
        int blue = blueScrollBar.getValue();

        Color color = new Color(red, green, blue);
        colorPanel.setBackground(color);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Q21 colorPicker = new Q21();
            colorPicker.setVisible(true);
        });
    }
}
