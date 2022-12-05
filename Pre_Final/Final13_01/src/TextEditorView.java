import java.awt.*;
import javax.swing.*;
public class TextEditorView {
    private JFrame window;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newMenu, openMenu, saveMenu, closeMenu;
    private JTextArea textArea;
    
    public TextEditorView(){
        window = new JFrame();
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newMenu = new JMenuItem("New");
        openMenu = new JMenuItem("Open");
        saveMenu = new JMenuItem("Save");
        closeMenu = new JMenuItem("Close");
        textArea = new JTextArea(20,45);
        
        menuBar.add(fileMenu);
        
        fileMenu.add(newMenu);
        fileMenu.add(openMenu);
        fileMenu.add(saveMenu);
        fileMenu.addSeparator();
        fileMenu.add(closeMenu);
        
        window.setLayout(new FlowLayout());
        window.setJMenuBar(menuBar); window.add(textArea);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public JFrame getWindow() {
        return window;
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }

    public JMenu getFileMenu() {
        return fileMenu;
    }

    public JMenuItem getNewMenu() {
        return newMenu;
    }

    public JMenuItem getOpenMenu() {
        return openMenu;
    }

    public JMenuItem getSaveMenu() {
        return saveMenu;
    }

    public JMenuItem getCloseMenu() {
        return closeMenu;
    }

    public JTextArea getTextArea() {
        return textArea;
    }
    
}
