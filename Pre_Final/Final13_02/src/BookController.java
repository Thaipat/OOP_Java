import java.awt.event.*;
import javax.swing.JOptionPane;
public class BookController implements ActionListener, WindowListener{
    private BookView view;
    private BookAdd bookAdd;
    private Book book;
    private BookModel model;
    private int index;
    
    public BookController(){
        view = new BookView();
        model = new BookModel();
        index = Integer.parseInt(view.getIndexTextField().getText());
        
        
        view.getAddButton().addActionListener(this);
        view.getUpdateButton().addActionListener(this);
        view.getDeleteButton().addActionListener(this);
        view.getLeftButton().addActionListener(this);
        view.getRightButton().addActionListener(this);
        view.getWindow().addWindowListener(this);
    }
    public void actionPerformed(ActionEvent ev){
        if(ev.getActionCommand()=="Add"){
            bookAdd = new BookAdd();
            bookAdd.getInsertButton().addActionListener(this);
        }else if(ev.getActionCommand()=="Insert"){
            book = new Book(bookAdd.getNameTextField().getText(), Double.parseDouble(bookAdd.getPriceTextField().getText()), (String)bookAdd.getComboBox().getSelectedItem());
            JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
            model.addBook(book);
            bookAdd.getWindow().dispose();
        }else if(ev.getActionCommand()=="<<<" && index > 0){
            index--;
            if(index == 0){
                view.getIndexTextField().setText(index+"");
                view.getNameTextField().setText("");
                view.getPriceTextField().setText("");
                view.getComboBox().setSelectedItem("General");
            }else{
                view.getIndexTextField().setText(index+"");
                view.getNameTextField().setText(((Book)(model.getBooks().get(index))).getName());
                view.getPriceTextField().setText(((Book)(model.getBooks().get(index))).getPrice()+"");
                view.getComboBox().setSelectedItem(((Book)(model.getBooks().get(index))).getType()+"");
            }
        }else if(ev.getActionCommand()==">>>" && index+1<model.getBooks().size()){
            index++;
            view.getIndexTextField().setText(index+"");
            view.getNameTextField().setText(((Book)(model.getBooks().get(index))).getName());
            view.getPriceTextField().setText(((Book)(model.getBooks().get(index))).getPrice()+"");
            view.getComboBox().setSelectedItem(((Book)(model.getBooks().get(index))).getType()+"");
        }else if(ev.getActionCommand()=="Update"){
            model.getBooks().set(index, new Book(view.getNameTextField().getText(), Double.parseDouble(view.getPriceTextField().getText()), (String)view.getComboBox().getSelectedItem()));
            JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
        }else if(ev.getActionCommand()=="Delete" && index > 0){
            model.getBooks().remove(index);
            index--;
            if(index == 0){
                view.getIndexTextField().setText(index+"");
                view.getNameTextField().setText("");
                view.getPriceTextField().setText("");
                view.getComboBox().setSelectedItem("General");
            }else{
                view.getIndexTextField().setText(index+"");
                view.getNameTextField().setText(((Book)(model.getBooks().get(index))).getName());
                view.getPriceTextField().setText(((Book)(model.getBooks().get(index))).getPrice()+"");
                view.getComboBox().setSelectedItem(((Book)(model.getBooks().get(index))).getType()+"");
            }
            JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void windowOpened(WindowEvent e) {model.loadFile();}
    public void windowClosing(WindowEvent e) {model.saveFile();}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}
