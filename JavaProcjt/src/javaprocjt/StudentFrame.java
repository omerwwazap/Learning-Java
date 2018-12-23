/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprocjt;

/**
 *
 * @author leven
 */
public class StudentFrame extends javax.swing.JFrame {

    int index;
    ContactFrame cf =new ContactFrame();
    
    public StudentFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        clearIdButton = new javax.swing.JButton();
        stuMessageLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crsMessageLabel = new javax.swing.JLabel();
        pCodeField = new javax.swing.JTextField();
        cNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        Contact = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setText("Student ID:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 30);
        jPanel1.add(idField);
        idField.setBounds(110, 20, 110, 30);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton);
        searchButton.setBounds(253, 20, 80, 30);

        clearIdButton.setText("Clear ID");
        clearIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearIdButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clearIdButton);
        clearIdButton.setBounds(253, 60, 80, 30);
        jPanel1.add(stuMessageLabel);
        stuMessageLabel.setBounds(10, 60, 200, 30);

        jPanel2.setLayout(null);

        jLabel2.setText("Project Code");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 80, 30);

        jLabel3.setText("Procejt Name:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 50, 100, 30);

        jLabel4.setText("Project Desc");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 190, 80, 30);

        crsMessageLabel.setToolTipText("");
        crsMessageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(crsMessageLabel);
        crsMessageLabel.setBounds(80, 110, 120, 30);

        pCodeField.setEditable(false);
        jPanel2.add(pCodeField);
        pCodeField.setBounds(110, 10, 120, 30);

        cNameField.setEditable(false);
        jPanel2.add(cNameField);
        cNameField.setBounds(110, 50, 120, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 330, 180);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Help?");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 110, 50, 30);

        Contact.setText("Contact of Student");
        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });
        jPanel2.add(Contact);
        Contact.setBounds(190, 190, 170, 30);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(closeButton);
        closeButton.setBounds(240, 430, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        int id = Integer.parseInt(idField.getText());
       
        boolean val;
        val = BilkentSYS.checkRedundancy(id);
        int tid;

        AcademicUnits tmp;
        if (val) {
            for (int i = 0; i < BilkentSYS.getStudents().size(); i++) {
                tmp = BilkentSYS.getStudents().get(i);
                tid = tmp.getIdNumber();
                if (tid == id) {
                    index = i;
                }
            }
            stuMessageLabel.setText("Student Exists!");
            //(String title, String field, int owner, String Shortdesc, boolean needhelp)
            //Project pro =BilkentSYS.searchprojects(id);
             //field
             
            pCodeField.setText(BilkentSYS.searchprojects(id).getField());
            cNameField.setText(BilkentSYS.searchprojects(id).getTitle());
            jTextArea1.setText(BilkentSYS.searchprojects(id).getShortdesc());
         
             if (BilkentSYS.searchprojects(id).gethelp()) {
                 crsMessageLabel.setText("Need Help");}
             else { crsMessageLabel.setText("No help needed");}
  
        }  
        else { stuMessageLabel.setText("No Student Record!");}
   
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearIdButtonActionPerformed
        idField.setText("");
    }//GEN-LAST:event_clearIdButtonActionPerformed

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
        // TODO add your handling code here:
        
        cf.setVisible(true);
    }//GEN-LAST:event_ContactActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Contact;
    private javax.swing.JTextField cNameField;
    private javax.swing.JButton clearIdButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel crsMessageLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField pCodeField;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel stuMessageLabel;
    // End of variables declaration//GEN-END:variables
}
