/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author akhil
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
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

        returnBookPanel = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        b_id = new javax.swing.JLabel();
        bId = new javax.swing.JTextField();
        s_id = new javax.swing.JLabel();
        sId = new javax.swing.JTextField();
        issueDate = new javax.swing.JLabel();
        returnDate = new javax.swing.JLabel();
        rDate = new javax.swing.JTextField();
        iDate = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(370, 200));
        setMinimumSize(new java.awt.Dimension(640, 430));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnBookPanel.setMinimumSize(new java.awt.Dimension(640, 430));
        returnBookPanel.setPreferredSize(new java.awt.Dimension(640, 430));

        heading.setFont(new java.awt.Font("Yrsa SemiBold", 1, 30)); // NOI18N
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("RETURN BOOK");

        b_id.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        b_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_id.setText("Book Id:");

        bId.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N

        s_id.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        s_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        s_id.setText("Student Id:");

        sId.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N

        issueDate.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        issueDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        issueDate.setText("Issue Date:");

        returnDate.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        returnDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        returnDate.setText("Return Date:");

        rDate.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N

        iDate.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N

        searchButton.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        searchButton.setIconTextGap(6);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        returnBtn.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        returnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        returnBtn.setText("Return");
        returnBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        returnBtn.setIconTextGap(10);
        returnBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBtnMouseClicked(evt);
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

        javax.swing.GroupLayout returnBookPanelLayout = new javax.swing.GroupLayout(returnBookPanel);
        returnBookPanel.setLayout(returnBookPanelLayout);
        returnBookPanelLayout.setHorizontalGroup(
            returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(returnBookPanelLayout.createSequentialGroup()
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(returnBookPanelLayout.createSequentialGroup()
                        .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(returnBookPanelLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(returnDate)
                                .addGap(18, 18, 18)
                                .addComponent(rDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(returnBookPanelLayout.createSequentialGroup()
                                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(returnBookPanelLayout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(issueDate))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnBookPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b_id)
                                            .addComponent(s_id))))
                                .addGap(32, 32, 32)
                                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(returnBookPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        returnBookPanelLayout.setVerticalGroup(
            returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading)
                .addGap(47, 47, 47)
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_id)
                    .addComponent(bId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s_id)
                    .addComponent(sId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueDate)
                    .addComponent(iDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnDate)
                    .addComponent(rDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(returnBookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

     private void setFieldsNull(){
        bId.setText("");
        sId.setText("");
        iDate.setText("");
        rDate.setText("");
    }
    
    private void returnBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBtnMouseClicked
        // TODO add your handling code here:
        String b_id = bId.getText();
        String s_id = sId.getText();     
        String issue_date = iDate.getText();
        String return_date = rDate.getText();
        
        if(b_id.isEmpty() || s_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter book id and student id");
            setFieldsNull();
        }
        else{
            try{
                String sql0 = "select Book_id from books where Book_id=?";
                ps = ConnectionClass.getConnection().prepareStatement(sql0);
                ps.setString(1, b_id);
                ResultSet rs = ps.executeQuery();
                
                String sql1 = "select Student_id from students where Student_id=?";
                ps = ConnectionClass.getConnection().prepareStatement(sql1);
                ps.setString(1, s_id);
                ResultSet r = ps.executeQuery();
                
                int book_Id = 0;
                int stu_Id = 0;
                
                if(rs.absolute(1) && r.absolute(1)){
                    book_Id = rs.getInt("Book_id");
//                    System.out.println(book_Id);
                    stu_Id = r.getInt("Student_id");
//                    System.out.println(stu_Id);
                     
                    try{
                        
                        String sql4 = "select Book_id, Student_id from issue_books where Book_id=? and Student_id=?";
                        ps = ConnectionClass.getConnection().prepareStatement(sql4);
                        ps.setString(1, b_id);
                        ps.setString(2, s_id);
                        ResultSet rx = ps.executeQuery();
                        
                        if(rx.absolute(1)){
                            try{
                                String sql2 = "insert into return_books(Book_id, Student_id, Issue_date, Return_date) values('"+b_id+"', '"+s_id+"', '"+issue_date+"', '"+return_date+"')";
                                ps = ConnectionClass.getConnection().prepareStatement(sql2);
                                ps.executeUpdate();

                                String sql3 = "delete from issue_books where Book_id=? and Student_id=?";
                                ps = ConnectionClass.getConnection().prepareStatement(sql3);
                                ps.setString(1, b_id);
                                ps.setString(2, s_id);
                                ps.executeUpdate();

                                JOptionPane.showMessageDialog(this, "Book returned successfully.");
                                setFieldsNull();
                            }
                            catch(SQLException e){
                                System.out.println(e);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Student had not issued that book.");
                            setFieldsNull();
                        }
                    }
                    catch(SQLException ex){
                        System.out.println(ex);
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Book or student not found.");
                    setFieldsNull();
                }
            }
            catch(SQLException ee){
                System.out.println(ee);
            }            
        }       
    }//GEN-LAST:event_returnBtnMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // TODO add your handling code here:
        String b_Id = bId.getText();
        String s_Id = sId.getText();
        
        if(b_Id.isEmpty() || s_Id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter student id and book id");
            setFieldsNull();
        }
        else{
            try{
                String sql0 = "select Book_id from books where Book_id=?";
                ps = ConnectionClass.getConnection().prepareStatement(sql0);
                ps.setString(1, b_Id);
//                System.out.println(sql0);
                ResultSet rx = ps.executeQuery();
                
                String sql1 = "select Student_id from students where Student_id=?";
                ps = ConnectionClass.getConnection().prepareStatement(sql1);
                ps.setString(1, s_Id);
//                System.out.println(sql1);
                ResultSet r = ps.executeQuery();
                
                int book_Id = 0;
                int stu_Id = 0;
                
                if(rx.absolute(1) && r.absolute(1)){
                    book_Id = rx.getInt("Book_id");
//                    System.out.println(book_Id);
                    stu_Id = r.getInt("Student_id");
//                    System.out.println(stu_Id);
                   
                    try{
                        String sql = "select*from issue_books where Book_id=? and Student_id=?";
                        ps = ConnectionClass.getConnection().prepareStatement(sql);
                        ps.setString(1, b_Id);
                        ps.setString(2, s_Id);
                        ResultSet rs = ps.executeQuery();

                        if(rs.absolute(1)){
                                String bID = rs.getString("Book_id");
                                String sID = rs.getString("Student_id");
                                String issueDate = rs.getString("Issue_date");
                                String returnDate = rs.getString("Return_date");

                                iDate.setText(issueDate);
                                iDate.setEditable(false);
                                rDate.setText(returnDate);
                                rDate.setEditable(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Student had not issued that book");
                            setFieldsNull();
                        }
                    }
                    catch(SQLException ee){
                        System.out.println(ee);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Student ot book not found.");
                    setFieldsNull();
                }                
            }
            catch(SQLException e){
                System.out.println(e);
            }            
        }
    }//GEN-LAST:event_searchButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bId;
    private javax.swing.JLabel b_id;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel heading;
    private javax.swing.JTextField iDate;
    private javax.swing.JLabel issueDate;
    private javax.swing.JTextField rDate;
    private javax.swing.JPanel returnBookPanel;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel returnDate;
    private javax.swing.JTextField sId;
    private javax.swing.JLabel s_id;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
