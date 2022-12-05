import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PoringConstructor implements ActionListener{
    private JFrame window;
    private JButton addButton;
    private int numberOfPoring = 0;
    private Poring poring;
//    private JRadioButton radio1, radio2, radio3;
    private JList list;
    private JPanel panel;
    private String test[] = {"H1", "H2", "H3", "H4", "H5", "H6"};

    public PoringConstructor(){
        window = new JFrame();
        addButton = new JButton("Add");
        panel = new JPanel();
        list = new JList(test);
//        radio1 = new JRadioButton("Test1");
//        radio2 = new JRadioButton("Test2");
//        radio3 = new JRadioButton("Test3");
        
        addButton.addActionListener(this);
         
//        panel.setLayout(new FlowLayout());
//        panel.add(radio1);  
//        panel.add(radio2);  
//        panel.add(radio3);
        
//        ButtonGroup group = new ButtonGroup();
//        group.add(radio1);
//        group.add(radio2);
//        group.add(radio3);
        
        
        window.setLayout(new FlowLayout());
        window.add(addButton);  window.add(list);
        
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
