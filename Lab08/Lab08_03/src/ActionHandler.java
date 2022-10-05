
import java.awt.event.*;

public class ActionHandler extends CalculatorSample implements ActionListener{
    private int temp = 0;
    private String check = "";
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(bn0)){
            txt.setText(txt.getText()+"0");
        }else if(ev.getSource().equals(bn1)){
            txt.setText(txt.getText()+"1");
        }else if(ev.getSource().equals(bn2)){
            txt.setText(txt.getText()+"2");
        }else if(ev.getSource().equals(bn3)){
            txt.setText(txt.getText()+"3");
        }else if(ev.getSource().equals(bn4)){
            txt.setText(txt.getText()+"4");
        }else if(ev.getSource().equals(bn5)){
            txt.setText(txt.getText()+"5");
        }else if(ev.getSource().equals(bn6)){
            txt.setText(txt.getText()+"6");
        }else if(ev.getSource().equals(bn7)){
            txt.setText(txt.getText()+"7");
        }else if(ev.getSource().equals(bn8)){
            txt.setText(txt.getText()+"8");
        }else if(ev.getSource().equals(bn9)){
            txt.setText(txt.getText()+"9");
        }else if(ev.getSource().equals(bnp)){
            temp = Integer.parseInt(txt.getText());
            check = "+";
            txt.setText("");
        }else if(ev.getSource().equals(bnm)){
            temp = Integer.parseInt(txt.getText());
            check = "-";
            txt.setText("");
        }else if(ev.getSource().equals(bnt)){
            temp = Integer.parseInt(txt.getText());
            check = "X";
            txt.setText("");
        }else if(ev.getSource().equals(bnd)){
            temp = Integer.parseInt(txt.getText());
            check = "/";
            txt.setText("");
        }else if(ev.getSource().equals(bnc)){
            temp = 0;
            txt.setText("");
        }else if(ev.getSource().equals(bne)){
            if(check.equals("+")){
                temp += Integer.parseInt(this.txt.getText());
            }else if(check.equals("-")){
                temp -= Integer.parseInt(this.txt.getText());
            }else if(check.equals("X")){
                temp *= Integer.parseInt(this.txt.getText());
            }else if(check.equals("/")){
                temp /= Integer.parseInt(this.txt.getText());
            }
            txt.setText(temp+"");
        }
        System.out.println(temp);
    }
}
