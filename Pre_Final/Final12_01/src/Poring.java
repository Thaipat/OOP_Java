import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Poring implements MouseListener, Runnable{
    private JFrame window;
    private JLabel poringImg;
    private JTextField number;
    
    public Poring(int numberOfPoring){
        window = new JFrame();
        poringImg = new JLabel(new ImageIcon("Poring.png"));
        number = new JTextField(numberOfPoring+"");
        
        number.setBorder(null);
        number.setEnabled(false);
        number.setBackground(null);
        number.setDisabledTextColor(Color.black);
        number.setFont(new Font("Tomaha", Font.BOLD, 14));
        
        window.setLayout(new FlowLayout());
        window.add(poringImg);  window.add(number);
        
        poringImg.addMouseListener(this);
        
        window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        window.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation((int)(Math.random()*(dimension.getWidth()-window.getWidth())), (int)(Math.random()*(dimension.getHeight()-window.getHeight())));
        window.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {
        window.dispose();
    }
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void run() {
        try{
            while(true){
                Thread.sleep(50);
                window.setLocation(window.getX()+1, window.getY()+1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
