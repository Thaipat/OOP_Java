import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TellerGUI implements ActionListener{
    private JFrame window;
    private JPanel topPanel, allButton;
    private JLabel balanceLabel, amountLabel;
    private JTextField balanceTextField, amountTextField;
    private JButton depositButton, withdrawButton, exitButton;
    
    public TellerGUI(int balance){
        window = new JFrame("Teller GUI");
        topPanel = new JPanel();
        allButton = new JPanel();
        balanceLabel = new JLabel("Balance");
        amountLabel = new JLabel("Amount");
        balanceTextField = new JTextField(balance+"");
        amountTextField = new JTextField();
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        exitButton = new JButton("Exit");
        
        balanceTextField.setEnabled(false);
        
        topPanel.setLayout(new GridLayout(2,2));
        topPanel.add(balanceLabel); topPanel.add(balanceTextField);
        topPanel.add(amountLabel);  topPanel.add(amountTextField);
        
        allButton.setLayout(new FlowLayout());
        allButton.add(depositButton);   allButton.add(withdrawButton);  allButton.add(exitButton);
        
        window.setLayout(new BorderLayout());
        window.add(topPanel, BorderLayout.NORTH);
        window.add(allButton, BorderLayout.CENTER);
        
        depositButton.addActionListener(this);  withdrawButton.addActionListener(this);
        exitButton.addActionListener(this);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ev){
        if(ev.getActionCommand()=="Deposit"){
            balanceTextField.setText((Integer.parseInt(balanceTextField.getText())+Integer.parseInt(amountTextField.getText()))+"");
        }else if(ev.getActionCommand()=="Withdraw" && Integer.parseInt(balanceTextField.getText()) >= Integer.parseInt(amountTextField.getText())){
            balanceTextField.setText((Integer.parseInt(balanceTextField.getText())-Integer.parseInt(amountTextField.getText()))+"");
        }else if(ev.getActionCommand()=="Exit"){
            System.exit(0);
        }
    }
    
    public static void main(String args[]){
        new TellerGUI(6000);
    }
}
