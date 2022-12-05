import java.awt.*;
import javax.swing.*;
public class BookView {
    private JLabel nameLabel, priceLabel, typeLabel;
    private JFrame window;
    private JTextField nameTextField, priceTextField, indexTextField;
    private JComboBox comboBox;
    private JButton leftButton, rightButton, addButton, updateButton, deleteButton;
    private JPanel namePanel, pricePanel, typePanel, indexPanel, optionPanel;
    private String combo[] = {"General", "Computer", "Math&Sci", "Photo3"};
    
    public BookView(){
        window = new JFrame();
        namePanel = new JPanel();
        pricePanel = new JPanel();
        typePanel = new JPanel();
        indexPanel = new JPanel();
        optionPanel = new JPanel();
        nameLabel = new JLabel("Name");
        priceLabel = new JLabel("Price");
        typeLabel = new JLabel("Type");
        nameTextField = new JTextField();
        priceTextField = new JTextField();
        indexTextField = new JTextField(5);
        comboBox = new JComboBox(combo);
        leftButton = new JButton("<<<");
        rightButton = new JButton(">>>");
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        
        indexTextField.setText("0");
        indexTextField.setEnabled(false);
        indexTextField.setDisabledTextColor(Color.black);
        
        namePanel.setLayout(new GridLayout(1,2));
        namePanel.add(nameLabel);   namePanel.add(nameTextField);
        
        pricePanel.setLayout(new GridLayout(1,2));
        pricePanel.add(priceLabel); pricePanel.add(priceTextField);
        
        typePanel.setLayout(new GridLayout(1,2));
        typePanel.add(typeLabel);   typePanel.add(comboBox);
        
        indexPanel.setLayout(new FlowLayout());
        indexPanel.add(leftButton); indexPanel.add(indexTextField); indexPanel.add(rightButton);
        
        optionPanel.setLayout(new FlowLayout());
        optionPanel.add(addButton); optionPanel.add(updateButton);  optionPanel.add(deleteButton);
        
        window.setLayout(new GridLayout(5,1));
        window.add(namePanel);  window.add(pricePanel); window.add(typePanel);
        window.add(indexPanel); window.add(optionPanel);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
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

    public JFrame getWindow() {
        return window;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public JTextField getPriceTextField() {
        return priceTextField;
    }

    public JTextField getIndexTextField() {
        return indexTextField;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public JButton getLeftButton() {
        return leftButton;
    }

    public JButton getRightButton() {
        return rightButton;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getUpdateButton() {
        return updateButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JPanel getNamePanel() {
        return namePanel;
    }

    public JPanel getPricePanel() {
        return pricePanel;
    }

    public JPanel getTypePanel() {
        return typePanel;
    }

    public JPanel getIndexPanel() {
        return indexPanel;
    }

    public JPanel getOptionPanel() {
        return optionPanel;
    }

    public String[] getCombo() {
        return combo;
    }
    
}
