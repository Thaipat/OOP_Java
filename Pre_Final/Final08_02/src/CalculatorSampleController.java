import java.awt.event.*;
public class CalculatorSampleController implements ActionListener{
    private CalculatorSampleView view;
    private String op="start";
    private int sum = 0;
    private int num;
    private boolean isReset = false;
    
    public CalculatorSampleController(){
        view = new CalculatorSampleView();
        
//        view.getAnsTextField().setText(sum+"");
        
        view.getButton0().addActionListener(this);view.getButton1().addActionListener(this);view.getButton2().addActionListener(this);
        view.getButton3().addActionListener(this);view.getButton4().addActionListener(this);view.getButton5().addActionListener(this);
        view.getButton6().addActionListener(this);view.getButton7().addActionListener(this);view.getButton8().addActionListener(this);
        view.getButton9().addActionListener(this);view.getButtonPlus().addActionListener(this);view.getButtonMinus().addActionListener(this);
        view.getButtonTime().addActionListener(this);view.getButtonDivide().addActionListener(this);view.getButtonEqual().addActionListener(this);
        view.getButtonC().addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev){
        if(!view.getAnsTextField().getText().equals("")){
            num = Integer.parseInt(view.getAnsTextField().getText());
        }
        if(ev.getActionCommand()=="c"){
            op = "start";
            sum = 0;
            view.getAnsTextField().setText("");
        }else if(ev.getActionCommand()=="+"){
            op = "+";
            sum = num;
            isReset = false;
            System.out.println(sum);
        }else if(ev.getActionCommand()=="-"){
            op = "-";
            sum = num;
            isReset = false;
        }else if(ev.getActionCommand()=="x"){
            op = "x";
            sum = num;
            isReset = false;
        }else if(ev.getActionCommand()=="/"){
            op = "/";
            sum = num;
            isReset = false;
        }else if(ev.getActionCommand()=="=" && op != "start"){
            if(op == "+"){
                sum += num;
            }else if(op == "-"){
                sum -= num;
            }else if(op == "x"){
                sum *= num;
            }else if(op == "/"){
                sum /= num;
            }
            view.getAnsTextField().setText(sum+"");
        }else{
            if(op != "start"){
                if(!isReset){
                    view.getAnsTextField().setText("");
                    isReset = true;
                }
                view.getAnsTextField().setText(view.getAnsTextField().getText()+ev.getActionCommand());
            }else{
                view.getAnsTextField().setText(view.getAnsTextField().getText()+ev.getActionCommand());
            }
        }
    }
}
