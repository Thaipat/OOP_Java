import java.awt.event.*;
public class PoringConstructorController implements ActionListener{
    private PoringConstructorView view;
    private Poring poring;
    private int numberOfPoring = 0;
    
    public PoringConstructorController(){
        view = new PoringConstructorView();
        
        view.getAddButton().addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev){
        numberOfPoring++;
        poring = new Poring(numberOfPoring);
        Thread thread = new Thread(poring);
        thread.start();
    }
    
}
