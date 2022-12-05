import javax.swing.*;
import java.awt.*;
public class CalculatorSampleView {
    private JFrame window;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonEqual, buttonPlus, buttonMinus, buttonTime, buttonDivide, buttonC;
    private JTextField ansTextField;
    private JPanel allButton;
    
    public CalculatorSampleView(){
        window = new JFrame("My Calculator");
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonTime = new JButton("x");
        buttonDivide = new JButton("/");
        buttonEqual = new JButton("=");
        buttonC = new JButton("c");
        ansTextField = new JTextField();
        allButton = new JPanel();
        
        ansTextField.setEnabled(false);
        ansTextField.setDisabledTextColor(Color.black);
        
        allButton.setLayout(new GridLayout(4, 4));
        allButton.add(button7); allButton.add(button8); allButton.add(button9); allButton.add(buttonPlus);
        allButton.add(button4); allButton.add(button5); allButton.add(button6); allButton.add(buttonMinus);
        allButton.add(button1); allButton.add(button2); allButton.add(button3); allButton.add(buttonTime);
        allButton.add(button0); allButton.add(buttonC); allButton.add(buttonEqual); allButton.add(buttonDivide);
        
        window.setLayout(new BorderLayout());
        window.add(ansTextField, BorderLayout.NORTH);
        window.add(allButton, BorderLayout.CENTER);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setSize(400, 300);
        window.setVisible(true);
    }

    public JFrame getWindow() {
        return window;
    }

    public JButton getButton0() {
        return button0;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public JButton getButton7() {
        return button7;
    }

    public JButton getButton8() {
        return button8;
    }

    public JButton getButton9() {
        return button9;
    }

    public JButton getButtonEqual() {
        return buttonEqual;
    }

    public JButton getButtonPlus() {
        return buttonPlus;
    }

    public JButton getButtonMinus() {
        return buttonMinus;
    }

    public JButton getButtonTime() {
        return buttonTime;
    }

    public JButton getButtonDivide() {
        return buttonDivide;
    }

    public JButton getButtonC() {
        return buttonC;
    }

    public JTextField getAnsTextField() {
        return ansTextField;
    }

    public JPanel getAllButton() {
        return allButton;
    }
    
}
