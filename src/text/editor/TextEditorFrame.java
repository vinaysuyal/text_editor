package text.editor;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextEditorFrame extends javax.swing.JFrame implements DocumentListener {
    private boolean needforsave;
    JFileChooser jfc;
    File f;
    TextEditorFrame tf;
    public TextEditorFrame() {
        f=null;
        tf=this;
        initComponents();
        needforsave=false;
        jTextArea1.getDocument().addDocumentListener(tf);
     /*   jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        jButton6.addActionListener(this);*/
        jMenuItem1.addActionListener((ActionEvent e)->
                {
                    newFile();
                }
        );
        
        jMenuItem2.addActionListener((ActionEvent e)->
                {
                    openFile();
                }
        );
              
        jMenuItem3.addActionListener((ActionEvent e)->
                {
                    if(needforsave)
                        callForSave();
                    System.exit(0);
                }
        );
        jMenuItem4.addActionListener((ActionEvent e)->
                {
                    jTextArea1.cut();
                }
        );
        jMenuItem5.addActionListener((ActionEvent e)->
                {
                    jTextArea1.copy();
                }
        );
        jMenuItem6.addActionListener((ActionEvent e)->
                {
                    jTextArea1.paste();
                }
        );
        jMenuItem7.addActionListener((ActionEvent e)->
                {
                    saveFileAs();
                }
        );
        jMenuItem8.addActionListener((ActionEvent e)->
                {
                    save();
                }
        );
     /*   jButton7.addActionListener((ActionEvent e)->
                {
                    Runtime r=Runtime.getRuntime();
                    try{
                    System.out.println(f.getAbsolutePath());
                    r.exec("javac D:\\One.java");
                    r.exec("java D:\\One");
                    }
                    catch(Exception ex)
                {
                    
                }
                }
        );*/
                
                
                
        jButton1.addActionListener((ActionEvent e) -> {
            newFile();            
        });
        jButton2.addActionListener((ActionEvent e) -> {
            openFile();
        });
        jButton3.addActionListener((ActionEvent e) -> {
            save();
        });
        jButton4.addActionListener((ActionEvent e) -> {
            jTextArea1.cut();
        });
        jButton5.addActionListener((ActionEvent e) -> {
            jTextArea1.copy();
        });
        jButton6.addActionListener((ActionEvent e) -> {
            jTextArea1.paste();
        });
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text/editor/new.gif"))); // NOI18N
        jButton1.setToolTipText("New");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text/editor/open.gif"))); // NOI18N
        jButton2.setToolTipText("Open");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text/editor/save.gif"))); // NOI18N
        jButton3.setToolTipText("Save");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text/editor/cut.gif"))); // NOI18N
        jButton4.setToolTipText("Cut");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text/editor/copy.gif"))); // NOI18N
        jButton5.setToolTipText("Copy");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text/editor/paste.gif"))); // NOI18N
        jButton6.setToolTipText("Paste");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);

        jButton7.setToolTipText("Run");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton7);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Total Characters:");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setPreferredSize(new java.awt.Dimension(10, 216));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(10, 216));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open");
        jMenu1.add(jMenuItem2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Save");
        jMenu1.add(jMenuItem8);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Save As");
        jMenu1.add(jMenuItem7);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Exit");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Cut");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Copy");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Paste");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insertUpdate(DocumentEvent e) {
       jLabel1.setText("Total Characters : "+ jTextArea1.getText().length());
       needforsave=true;
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
      jLabel1.setText("Total Characters : "+ jTextArea1.getText().length());
      needforsave=true;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        
    }
    private void save()
    {
       if(f==null)
                {
            jfc=new JFileChooser("D:\\");
            int x1 = jfc.showSaveDialog(tf);
            f=jfc.getSelectedFile();
                }
            try(FileWriter writer=new FileWriter(f);)
            {
                writer.write(jTextArea1.getText());
            }
            catch(Exception ex)
            {
                
            } 
            needforsave=false;
    }
    
    private void saveFileAs()
    {
            jfc=new JFileChooser("D:\\");
            int x1 = jfc.showSaveDialog(tf);
            f=jfc.getSelectedFile();
            try(FileWriter writer=new FileWriter(f);)
            {
                writer.write(jTextArea1.getText());
            }
            catch(Exception ex)
            {
                
            } 
    }
    
    private void callForSave()
    {
         int x=JOptionPane.showConfirmDialog(this,"Save the file", "Save/Exit", JOptionPane.YES_NO_OPTION);
                    if(x==JOptionPane.YES_OPTION)
                        save();
    }
    private void newFile()
    {
        if(needforsave)
                callForSave();
            jTextArea1.setText(null);
            needforsave=false;
            f=null;
    }
    private void openFile()
    {
        if(needforsave)
                callForSave();
            jfc=new JFileChooser("D:\\");
            int x1 = jfc.showOpenDialog(tf);
            if (x1 == JFileChooser.APPROVE_OPTION) {
                f=jfc.getSelectedFile();
            }
            try (final FileReader reader = new FileReader(f)) {
                x1 = 0;
                char arr[]=new char[(int)f.length()];
                int read = reader.read(arr);
                jTextArea1.setText(new String(arr));
                needforsave=false;
                this.setTitle(f.getAbsolutePath());
            }catch(Exception ex)
            {
                
            }
    }
}
