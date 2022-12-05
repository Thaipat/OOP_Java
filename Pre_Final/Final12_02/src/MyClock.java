import javax.swing.*;
import java.util.*;
import java.awt.*;
public class MyClock extends JLabel implements Runnable{
    private int timer=0;
    private boolean isPause=false;
    public void run(){
        try{
            while(true){
                checkPause();
                Calendar d = Calendar.getInstance();
//                int sec = d.get(Calendar.SECOND);
//                int min = d.get(Calendar.MINUTE);
//                int hour = d.get(Calendar.HOUR);

                int hour = timer/3600%24; 
                int min = timer/60%60;
                int sec = timer%60;

                this.setFont(new Font("Tamoha", Font.BOLD, 80));
                this.setText(String.format("%02d:%02d:%02d", hour, min, sec));
                Thread.sleep(1000);
                timer++;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void checkPause(){
        while(isPause){
            try{
                this.wait();
            }catch(Exception e){
//                System.out.println(e);
            }
        }
    }
    
    public boolean getIsPause(){
        return isPause;
    }
    
    public void setIsPause(boolean isPause){
        this.isPause = isPause;
    }
}
