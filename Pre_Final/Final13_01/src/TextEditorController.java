import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class TextEditorController implements ActionListener{
    private TextEditorView view;
    private TextEditorModel model;
    
    public TextEditorController(){
        view = new TextEditorView();
        model = new TextEditorModel();
        
        view.getNewMenu().addActionListener(this);
        view.getOpenMenu().addActionListener(this);
        view.getSaveMenu().addActionListener(this);
        view.getCloseMenu().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ev){
        if(ev.getActionCommand()=="New"){
            view.getTextArea().setText("");
        }else if(ev.getActionCommand()=="Open"){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(view.getWindow());
            File f = fc.getSelectedFile();
            model.loadFile(f, view);
        }else if(ev.getActionCommand()=="Save"){
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(view.getWindow());
            File f = fc.getSelectedFile();
            model.saveFile(f, view);
        }else if(ev.getActionCommand()=="Close"){
            System.exit(0);
        }
    }
}
