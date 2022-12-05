import javax.swing.*;
import java.awt.*;
public class BookAdd {
    private JFrame window;
    private JLabel nameLabel, priceLabel, typeLabel;
    private JTextField nameTextField, priceTextField;
    private JComboBox comboBox;
    private JButton insertButton;
    private JPanel topPanel, bottomPanel;
    private String combo[] = {"General", "Computer", "Math&Sci", "Photo3"};
    
    public BookAdd(){
        window = new JFrame();
        nameLabel = new JLabel("Name");
        priceLabel = new JLabel("Price");
        typeLabel = new JLabel("Type");
        nameTextField = new JTextField();
        priceTextField = new JTextField();
        comboBox = new JComboBox(combo);
        insertButton = new JButton("Insert");
        topPanel = new JPanel();
        bottomPanel = new JPanel();
        
        topPanel.setLayout(new GridLayout(3,2));
        topPanel.add(nameLabel);    topPanel.add(nameTextField);
        topPanel.add(priceLabel);   topPanel.add(priceTextField);
        topPanel.add(typeLabel);    topPanel.add(comboBox);
        
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(insertButton);
        
        window.setLayout(new BorderLayout());
        window.add(topPanel, BorderLayout.NORTH);
        window.add(bottomPanel, BorderLayout.SOUTH);
        
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public JFrame getWindow() {
        return window;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public JLabel getPriceLabel() {
        return priceLabel;
    }

    public JLabel getTypeLabel() {
        return typeLabel;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public JTextField getPriceTextField() {
        return priceTextField;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public JButton getInsertButton() {
        return insertButton;
    }

    public JPanel getTopPanel() {
        return topPanel;
    }

    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    public String[] getCombo() {
        return combo;
    }
    
}
