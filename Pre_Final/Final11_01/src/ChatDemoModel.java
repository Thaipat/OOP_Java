import java.io.*;
public class ChatDemoModel {
    private String textSave = "";
    
    public void load(ChatDemoView view){
        try(FileReader fr = new FileReader("ChatDemo.dat");){
            int i;
            while((i=fr.read()) != -1){
                textSave += (char)i;
            }
            view.getChat().setText(textSave);
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
    public void save(String txt){
        try(FileWriter fileWriter = new FileWriter("ChatDemo.dat");){
            fileWriter.write(txt);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public String getTextSave() {
        return textSave;
    }
    
}
