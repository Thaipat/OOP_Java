import java.io.*;
public class TextEditorModel {
    public void loadFile(File f, TextEditorView view){
        try(FileReader fr = new FileReader(f);){
            int ch;
            while((ch=fr.read()) != -1){
                view.getTextArea().setText(view.getTextArea().getText()+(char)ch);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void saveFile(File f, TextEditorView view){
        try(FileWriter fw = new FileWriter(f)){
            fw.write(view.getTextArea().getText());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
