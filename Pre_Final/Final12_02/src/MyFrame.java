import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame implements MouseListener{
    private JFrame window;
    private MyClock clock;
    
    public MyFrame(){
        window = new JFrame();
        clock = new MyClock();
        Thread thread = new Thread(clock);
        thread.start();
        
        window.setLayout(new FlowLayout());
        window.add(clock);
        
        clock.addMouseListener(this);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450, 150);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    
    public static void main(String args[]){
        new MyFrame();
    }

    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {
        clock.setIsPause(!clock.getIsPause());
        System.out.println(clock.getIsPause());
    }
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
