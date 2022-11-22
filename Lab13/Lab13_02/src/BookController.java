import java.awt.event.*;
import javax.swing.*;
public class BookController implements ActionListener{
    BookView bookView;
    BookAdd bookAdd;
    BookModel model;
    Book book;
    private int index;
    private String bookName, bookType;
    private double bookPrice;
    
    public BookController(){
        bookView = new BookView();
        model = new BookModel();
        index = Integer.parseInt(bookView.getCollectionTextField().getText());
        bookName = ((Book)(model.getBooks().get(index))).getName();
        bookType = ((Book)(model.getBooks().get(index))).getType();
        bookPrice = ((Book)(model.getBooks().get(index))).getPrice();
        
        
        bookView.getAddButton().addActionListener(this);
        bookView.getUpdateButton().addActionListener(this);
        bookView.getDeleteButton().addActionListener(this);
        bookView.getLeftButton().addActionListener(this);
        bookView.getRightButton().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand() == "Add"){
            bookAdd = new BookAdd();
            bookAdd.getInsertButton().addActionListener(this);
        }else if(ae.getActionCommand() == "Insert"){
            book = new Book(bookAdd.getNameTextField().getText(), Integer.parseInt(bookAdd.getPriceTextField().getText()), (String)(bookAdd.getTypeComboBox().getSelectedItem()));
            model.addBook(book);
            JOptionPane.showMessageDialog(null, "Done it.", "",JOptionPane.PLAIN_MESSAGE);
            bookAdd.getBookAddWindow().dispose();
        }else if(ae.getActionCommand() == "Update"){
            JOptionPane.showMessageDialog(null, "Done it.", "Update",JOptionPane.PLAIN_MESSAGE);
        }else if(ae.getActionCommand() == "Delete"){
            JOptionPane.showMessageDialog(null, "Done it.", "Delete",JOptionPane.PLAIN_MESSAGE);
        }else if(ae.getActionCommand() == "<<<" && index > 0){
            index--;
            if(index == 0){
                bookView.getNameTextField().setText("");
                bookView.getPriceTextField().setText("");
                bookView.getCollectionTextField().setText(index+"");
            }else{
                bookView.getNameTextField().setText(((Book)(model.getBooks().get(index))).getName());
                bookView.getPriceTextField().setText(((Book)(model.getBooks().get(index))).getPrice()+"");
                bookView.getCollectionTextField().setText(index+"");
            }
            
        }else if(ae.getActionCommand() == ">>>" && index+1 < model.getBooks().size()){
            index++;
            bookView.getNameTextField().setText(((Book)(model.getBooks().get(index))).getName());
            bookView.getPriceTextField().setText(((Book)(model.getBooks().get(index))).getPrice()+"");
            bookView.getCollectionTextField().setText(index+"");
        }
    }
}
