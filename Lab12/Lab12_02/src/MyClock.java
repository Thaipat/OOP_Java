import java.util.Calendar;
import javax.swing.*;
import java.awt.*;
public class MyClock extends JLabel implements Runnable{
    int i;
    public void run(){
        try{
            while(true){
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
                
//                int sec = i%60;
//                int min = (i/60)%60;
//                int hour = (i/3600)%24;
                
                this.setEnabled(false);
                this.setBorder(null);
                this.setFont(new Font("Tahoma",Font.BOLD, 80));
                this.setText(String.format("%02d:%02d:%02d", hour, min, sec));
                Thread.sleep(1000);
                i++;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
