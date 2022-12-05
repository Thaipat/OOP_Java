import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Poring implements Runnable, MouseListener{
    private JFrame window;
    private JLabel poringImg;
    private JTextField numberOfPoring;
    
    public Poring(int number){
        window = new JFrame();
        poringImg = new JLabel(new ImageIcon("Poring.png"));
        numberOfPoring = new JTextField(number+"");
        
        numberOfPoring.setEnabled(false);
        
        numberOfPoring.setBorder(null);
        numberOfPoring.setBackground(null);
        numberOfPoring.setDisabledTextColor(Color.black);
        
        poringImg.addMouseListener(this);
        
        window.setResizable(false);
        
        window.setLayout(new FlowLayout());
        window.add(poringImg);  window.add(numberOfPoring);
        
        window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        window.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation((int)(Math.random()*(dimension.getWidth()-window.getWidth())), (int)(Math.random()*(dimension.getHeight()-window.getHeight())));
        window.setVisible(true);
    }
    
    public void run(){
        try{
            while(true){
                Thread.sleep(200);
                window.setLocation(window.getX()+1, window.getY()+1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        window.dispose();
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
