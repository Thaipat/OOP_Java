import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ChatDemoController implements ActionListener, WindowListener{
    private ChatDemoView view;
    private ChatDemoModel model;
    
    public ChatDemoController(){
        view = new ChatDemoView();
        model = new ChatDemoModel();
        
        view.getChat().setText(model.getTextSave());
        
        view.getSubmit().addActionListener(this);
        view.getReset().addActionListener(this);
        view.getWindow().addWindowListener(this);
    }
    
    public void actionPerformed(ActionEvent ev){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        if(ev.getActionCommand()=="Submit"){
            view.getChat().setText(view.getChat().getText()+(dtf.format(LocalDateTime.now()))+" : "+view.getText().getText()+"\n");
            view.getText().setText("");
        }else if(ev.getActionCommand()=="Reset"){
            view.getChat().setText("");
            view.getText().setText("");
        }
    }
    public void windowOpened(WindowEvent e) {model.load(view);}
    public void windowClosing(WindowEvent e) {model.save(view.getChat().getText());}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}
