import java.awt.*;
import javax.swing.*;
public class MyFrame {
    private JFrame window;
    private MyClock clock;
    private Thread t;
    public MyFrame(){
        window = new JFrame();
        clock = new MyClock();
        t = new Thread(clock);
        t.start();
        
        window.setLayout(new FlowLayout());
        window.add(clock);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450, 150);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    public static void main(String[] args){
        new MyFrame();
    }
}
