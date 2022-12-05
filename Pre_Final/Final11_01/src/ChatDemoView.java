import java.awt.*;
import javax.swing.*;
public class ChatDemoView {
    private JFrame window;
    private JTextArea chat;
    private JTextField text;
    private JButton submit, reset;
    private JPanel allbutton;
    
    public ChatDemoView(){
        window = new JFrame();
        chat = new JTextArea(20, 45);
        text = new JTextField();
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        allbutton = new JPanel();
        
        chat.setEnabled(false);
        
        allbutton.setLayout(new FlowLayout());
        allbutton.add(submit);  allbutton.add(reset);
        
        window.setLayout(new BorderLayout());
        window.add(chat, BorderLayout.NORTH);
        window.add(text, BorderLayout.CENTER);
        window.add(allbutton, BorderLayout.SOUTH);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public JFrame getWindow() {
        return window;
    }

    public JTextArea getChat() {
        return chat;
    }

    public JTextField getText() {
        return text;
    }

    public JButton getSubmit() {
        return submit;
    }

    public JButton getReset() {
        return reset;
    }

    public JPanel getAllbutton() {
        return allbutton;
    }
    
}
