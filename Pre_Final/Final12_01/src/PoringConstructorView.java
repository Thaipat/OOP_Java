import java.awt.*;
import javax.swing.*;
public class PoringConstructorView {
    private JFrame window;
    private JButton addButton;
    
    public PoringConstructorView(){
        window = new JFrame();
        addButton = new JButton("Add");
        
        addButton.setFont(new Font("Tahoma", Font.BOLD, 80));
        
        window.setLayout(new FlowLayout());
        window.add(addButton);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);
    }

    public JFrame getWindow() {
        return window;
    }

    public JButton getAddButton() {
        return addButton;
    }
    
    
}
