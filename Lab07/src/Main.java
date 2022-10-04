import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
//        new CalculatorSample();
//        new TellerGUI();
//        new SimpleCalGUI();
//        new MmGUI();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> { new MmGUI(); });
    }
}
