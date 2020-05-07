/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.editor;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ACER
 */
public class TextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
        
        for(UIManager.LookAndFeelInfo l:UIManager.getInstalledLookAndFeels())
        {
            if(l.getName().equals("Windows"))
             UIManager.setLookAndFeel(l.getClassName());
        }
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
        {
            System.out.println(e);
        }
        
        
        TextEditorFrame textEditorFrame=new TextEditorFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");
        textEditorFrame.setTitle("Khatmal Untitled File");
        textEditorFrame.setIconImage(icon);
        textEditorFrame.setSize(800,600);
        textEditorFrame.setLocationRelativeTo(null);
        textEditorFrame.setVisible(true);
    }
    
}
