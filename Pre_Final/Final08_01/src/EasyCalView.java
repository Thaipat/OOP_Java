import javax.swing.*;
import java.awt.*;
public class EasyCalView {
    private JFrame window;
    private JButton plusButton, minusButton, timeButton, divideButton;
    private JTextField num1TextField, num2TextField, ansTextField;
    private JPanel buttonPanel;
    
    public EasyCalView(){
        window = new JFrame();
        plusButton = new JButton("+");
        minusButton = new JButton("-");
        timeButton = new JButton("x");
        divideButton = new JButton("/");
        num1TextField = new JTextField();
        num2TextField = new JTextField();
        ansTextField = new JTextField();
        buttonPanel = new JPanel();
        
        ansTextField.setEnabled(false);
        ansTextField.setDisabledTextColor(Color.black);
        
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(plusButton);    buttonPanel.add(minusButton);
        buttonPanel.add(timeButton);    buttonPanel.add(divideButton);
        
        window.setLayout(new GridLayout(4,1));
        window.add(num1TextField);  window.add(num2TextField);
        window.add(buttonPanel);    window.add(ansTextField);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);
    }

    public JFrame getWindow() {
        return window;
    }

    public JButton getPlusButton() {
        return plusButton;
    }

    public JButton getMinusButton() {
        return minusButton;
    }

    public JButton getTimeButton() {
        return timeButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }

    public JTextField getNum1TextField() {
        return num1TextField;
    }

    public JTextField getNum2TextField() {
        return num2TextField;
    }

    public JTextField getAnsTextField() {
        return ansTextField;
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }
    
}
