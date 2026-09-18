import javax.swing.*;

public class ProgramWindow {
    public ProgramWindow() {
        JFrame jFrame = new JFrame("Секундомер");
        jFrame.setSize(300, 200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        JLabel label = new JLabel();
        label.setBounds(100, 100, 100, 50);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        jFrame.add(label);
    }
}
