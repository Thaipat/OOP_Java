import java.awt.*;
import javax.swing.*;
public class MmGUI extends JFrame{
    private JFrame f;
    private JMenuBar mb;
    private JMenu m1, m2, m3, m4;
    private JMenuItem mi1, mi2, mi3, mi4, mi5;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    public MmGUI(){
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
        f = new JFrame("SubMenuItem Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        m4 = new JMenu("New");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        mi4 = new JMenuItem("Window");
        mi5 = new JMenuItem("Message");
        
        f.setJMenuBar(mb);
        mb.add(m1); mb.add(m2); mb.add(m3);
        m1.add(m4); m1.addSeparator();
        m1.add(mi1); m1.addSeparator();
        m1.add(mi2); m1.addSeparator();
        m1.add(mi3);
        m4.add(mi4); m4.addSeparator(); m4.add(mi5);
        m1.setMnemonic('F');
//        m4.setMnemonic('F');
        
        frame1.setSize(300,150);
        frame1.setVisible(true);
        frame2.setSize(300,200);
        frame2.setVisible(true);
        frame3.setSize(400,280);
        frame3.setVisible(true);
        
        int x1 = frame1.getX();
        int y1 = frame1.getY();
        frame1.setLocation(x1+70, y1+350);
        frame2.setLocation(x1+300, y1+100);
        frame3.setLocation(x1+650, y1+250);
        
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        
        f.add(desktopPane, BorderLayout.CENTER);
        f.setSize(1200,720);
        f.setVisible(true);
    }
}
