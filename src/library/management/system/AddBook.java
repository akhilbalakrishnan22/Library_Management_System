/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author akhil
 */
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
        initComponents();
    }
    
    Connection con;
    PreparedStatement ps;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBookPanel = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        b_id = new javax.swing.JLabel();
        bId = new javax.swing.JTextField();
        b_title = new javax.swing.JLabel();
        bTitle = new javax.swing.JTextField();
        b_author = new javax.swing.JLabel();
        bAuthor = new javax.swing.JTextField();
        b_isbn = new javax.swing.JLabel();
        bIsbn = new javax.swing.JTextField();
        b_publisher = new javax.swing.JLabel();
        bPublisher = new javax.swing.JTextField();
        b_price = new javax.swing.JLabel();
        bPrice = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(370, 200));
        setMinimumSize(new java.awt.Dimension(640, 430));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBookPanel.setMinimumSize(new java.awt.Dimension(640, 430));
        addBookPanel.setPreferredSize(new java.awt.Dimension(640, 430));

        heading.setFont(new java.awt.Font("Yrsa SemiBold", 1, 30)); // NOI18N
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("BOOK INFORMATION");

        b_id.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        b_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_id.setText("Book Id:");

        bId.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N

        b_title.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        b_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_title.setText("Title:");

        bTitle.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N

        b_author.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        b_author.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_author.setText("Author:");

        bAuthor.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N

        b_isbn.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        b_isbn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_isbn.setText("Isbn:");

        bIsbn.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N

        b_publisher.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        b_publisher.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_publisher.setText("Publisher:");

        bPublisher.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N

        b_price.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        b_price.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_price.setText("Price:");

        bPrice.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N

        addBtn.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addBtn.setIconTextGap(10);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close x16px.png"))); // NOI18N
        closeBtn.setText("Close");
        closeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        closeBtn.setIconTextGap(10);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addBookPanelLayout = new javax.swing.GroupLayout(addBookPanel);
        addBookPanel.setLayout(addBookPanelLayout);
        addBookPanelLayout.setHorizontalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_id)
                    .addComponent(b_title)
                    .addComponent(b_author)
                    .addComponent(b_isbn)
                    .addComponent(b_publisher)
                    .addComponent(b_price))
                .addGap(35, 35, 35)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bId)
                        .addComponent(bTitle)
                        .addComponent(bAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(bIsbn)
                        .addComponent(bPublisher))
                    .addComponent(bPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        addBookPanelLayout.setVerticalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading)
                .addGap(33, 33, 33)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_id)
                    .addComponent(bId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_title)
                    .addComponent(bTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_author)
                    .addComponent(bAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_isbn)
                    .addComponent(bIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_publisher)
                    .addComponent(bPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_price)
                    .addComponent(bPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(addBookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeBtnMouseClicked
    
    private void setFieldsNull(){
        bId.setText("");
        bTitle.setText("");
        bAuthor.setText("");
        bIsbn.setText("");
        bPublisher.setText("");
        bPrice.setText("");
    }
    
    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        // TODO add your handling code here:
        String id = bId.getText();
        String title = bTitle.getText();
        String author = bAuthor.getText();
        String isbn = bIsbn.getText();
        String publisher = bPublisher.getText();
        String price = bPrice.getText();
//        System.out.println(id+" "+title+" "+author+" "+isbn+" "+publisher+" "+price);
        
        if(id.isEmpty() || title.isEmpty() || author.isEmpty() || isbn.isEmpty() || publisher.isEmpty() || price.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter book details.");
        }
        else{
            try{
                String sql = "insert into books(Book_id, Title, Author, Isbn, Publisher, Price) values('"+id+"', '"+title+"', '"+author+"', '"+isbn+"', '"+publisher+"', '"+price+"')";
                ps = ConnectionClass.getConnection().prepareStatement(sql);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "New book added successfully.");
                setFieldsNull();
            }
            catch(SQLException e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_addBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBookPanel;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField bAuthor;
    private javax.swing.JTextField bId;
    private javax.swing.JTextField bIsbn;
    private javax.swing.JTextField bPrice;
    private javax.swing.JTextField bPublisher;
    private javax.swing.JTextField bTitle;
    private javax.swing.JLabel b_author;
    private javax.swing.JLabel b_id;
    private javax.swing.JLabel b_isbn;
    private javax.swing.JLabel b_price;
    private javax.swing.JLabel b_publisher;
    private javax.swing.JLabel b_title;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel heading;
    // End of variables declaration//GEN-END:variables
}
