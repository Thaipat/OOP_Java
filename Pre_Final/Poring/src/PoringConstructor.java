import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PoringConstructor implements ActionListener{
    private JFrame window;
    private JButton addButton;
    private int numberOfPoring = 0;
    private Poring poring;

    public PoringConstructor(){
        window = new JFrame();
        addButton = new JButton("Add");
        
        addButton.addActionListener(this);
        
        window.setLayout(new FlowLayout());
        window.add(addButton);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        numberOfPoring++;
        poring = new Poring(numberOfPoring);
        Thread thread = new Thread(poring);
        thread.start();
    }
}
