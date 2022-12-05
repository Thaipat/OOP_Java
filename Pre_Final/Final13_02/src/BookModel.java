import java.util.*;
import java.io.*;
public class BookModel {
    private ArrayList books = new ArrayList();
    private Book book = new Book("", 0, "");
    
    public BookModel(){
        books.add(this.book);
    }
    
    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList getBooks() {
        return books;
    }
    
    public void loadFile(){
        try(FileInputStream fin = new FileInputStream("Book.data");
            ObjectInputStream in = new ObjectInputStream(fin)){
            books = (ArrayList) in.readObject();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void saveFile(){
        try(FileOutputStream fout = new FileOutputStream("Book.data");
            ObjectOutputStream out = new ObjectOutputStream(fout)){
            out.writeObject(books);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
