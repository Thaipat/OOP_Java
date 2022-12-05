import java.awt.event.*;
public class EasyCalController implements ActionListener{
    private EasyCalView view;
    private int num1, num2;
    
    public EasyCalController(){
        view = new EasyCalView();
        view.getPlusButton().addActionListener(this);
        view.getMinusButton().addActionListener(this);
        view.getTimeButton().addActionListener(this);
        view.getDivideButton().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ev){
        if(view.getNum1TextField().getText() != "" && view.getNum2TextField().getText() != ""){
            num1 = Integer.parseInt(view.getNum1TextField().getText());
            num2 = Integer.parseInt(view.getNum2TextField().getText());
        }
        if(ev.getActionCommand()=="+"){
            view.getAnsTextField().setText((num1+num2)+"");
        }else if(ev.getActionCommand()=="-"){
            view.getAnsTextField().setText((num1-num2)+"");
        }else if(ev.getActionCommand()=="x"){
            view.getAnsTextField().setText((num1*num2)+"");
        }else if(ev.getActionCommand()=="/"){
            view.getAnsTextField().setText((num1/num2)+"");
        }
    }
}
