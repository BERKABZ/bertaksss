/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.olaco;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class RegistrationForm extends javax.swing.JFrame {
String username, password1, password2, firstname,lastname, address;

    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        cmbgender = new javax.swing.JComboBox<>();
        chkshow = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        chkProgram = new javax.swing.JCheckBox();
        chkVG = new javax.swing.JCheckBox();
        chkTL = new javax.swing.JCheckBox();
        chkUD = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        rbtnJava = new javax.swing.JRadioButton();
        rbtnPython = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        LogIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION FORM");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Username:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Confirm Password:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("First Name:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Last Name:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Address:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Sex:");

        txtuser.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtuser.setForeground(new java.awt.Color(153, 153, 153));
        txtuser.setText("username");
        txtuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtuserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtuserFocusLost(evt);
            }
        });
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        pass.setForeground(new java.awt.Color(153, 153, 153));
        pass.setText("password");
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        pass2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        pass2.setForeground(new java.awt.Color(153, 153, 153));
        pass2.setText("password");
        pass2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass2FocusLost(evt);
            }
        });
        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });

        txtfname.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtfname.setForeground(new java.awt.Color(153, 153, 153));
        txtfname.setText("first name");
        txtfname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtfname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfnameFocusLost(evt);
            }
        });

        txtlname.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtlname.setForeground(new java.awt.Color(153, 153, 153));
        txtlname.setText("last name");
        txtlname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtlname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtlnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtlnameFocusLost(evt);
            }
        });

        txtadd.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtadd.setForeground(new java.awt.Color(153, 153, 153));
        txtadd.setText("address");
        txtadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaddFocusLost(evt);
            }
        });

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS", " " }));

        chkshow.setText("show");
        chkshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkshowActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Skills:");

        chkProgram.setText("Programming");

        chkVG.setText("Visual Graphics");

        chkTL.setText("Team Lead");

        chkUD.setText("UI/UX Design");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Specialization:");

        rbtnJava.setText("Java");

        rbtnPython.setText("Python");

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel11.setText("Already have an account?");

        LogIn.setForeground(new java.awt.Color(0, 51, 255));
        LogIn.setText("Log In");
        LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtuser)
                                    .addComponent(pass)
                                    .addComponent(pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtfname)
                                    .addComponent(txtlname)
                                    .addComponent(txtadd)
                                    .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(chkshow))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkTL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnJava, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkProgram))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkVG)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chkUD, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbtnPython, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkshow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkProgram)
                    .addComponent(chkVG))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTL)
                    .addComponent(chkUD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnJava)
                    .addComponent(rbtnPython))
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(LogIn))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        
    }//GEN-LAST:event_txtuserActionPerformed

    private void LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseClicked
        LogIn l = new LogIn();
        l.show();
        this.hide();
    }//GEN-LAST:event_LogInMouseClicked

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2ActionPerformed

    private void chkshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkshowActionPerformed
        if(chkshow.isSelected()){
            pass.setEchoChar((char)0);
            pass2.setEchoChar((char)0);

        }else{
            pass.setEchoChar('*');
            pass2.setEchoChar('*');

        }
    }//GEN-LAST:event_chkshowActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String Username = txtuser.getText();
        String password1 = pass.getText();
        String password2 = pass2.getText();
        String firstname = txtfname.getText();
        String lastname = txtlname.getText();
        String address = txtadd.getText();
        
        if (Username.isEmpty() || password1.isEmpty() || password2.isEmpty() || firstname.isEmpty()|| lastname.isEmpty() || address.isEmpty()) {
            txtuser.setBackground(Color.RED);
            pass.setBackground(Color.RED);
            pass2.setBackground(Color.RED);
            txtfname.setBackground(Color.RED);
            txtlname.setBackground(Color.RED);
            txtadd.setBackground(Color.RED);
            System.out.println("Please fill in all fields.");
            return;
        } 
         if (!password1.equals(password2)) {
        
        pass2.setBackground(Color.RED); 
        System.out.println("Passwords do not match. Please try again.");
        return;
    }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Username + ".txt"))) {
            writer.write(Username);
            writer.newLine();
            writer.write(password1);
            writer.newLine();
            writer.write(password2);
            writer.newLine();
            writer.write(firstname);
            writer.newLine();
            writer.write(lastname);
            writer.newLine();
            writer.write(address);
            writer.newLine();

            if (chkProgram.isSelected()) {
                writer.write(chkProgram.getText() + "\n");
            }
            if (chkTL.isSelected()) {
                writer.write(chkTL.getText() + "\n");
            }
            if (chkUD.isSelected()) {
                writer.write(chkUD.getText() + "\n");
            }
            if (chkVG.isSelected()) {
                writer.write(chkVG.getText() + "\n");
            }
            String btngrpspec = "";
            if (rbtnJava.isSelected()) {
            btngrpspec = "rbtnJava";
            } else if (rbtnPython.isSelected()) {
            btngrpspec = "rbtnPython";
            } else {
            System.out.println("Please select a Specialization.");
            return;
            }
            writer.write((String) cmbgender.getSelectedItem());
            writer.close();
            System.out.println("Data has been successfully saved to the file.");
            
            
    // ... (previous code remains unchanged)

    // Writing programming specialization to the file
    if (rbtnJava.isSelected()) {
        writer.write("Programming Specialization: Java");
        writer.newLine();
    } else if (rbtnPython.isSelected()) {
        writer.write("Programming Specialization: Python");
        writer.newLine();
    } else {
        System.out.println("Please select a Specialization.");
        return;
    }

    // ... (remaining code remains unchanged)

} catch (IOException e) {
    e.printStackTrace();
}

            
       
        LogIn l = new LogIn();
        l.show();
        this.hide();
    }//GEN-LAST:event_submitActionPerformed

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        pass.setBackground(Color.WHITE);
        pass.setText("");
        pass.setForeground(Color.BLACK);
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        String ps1 = pass.getText();
        if(ps1.isEmpty()){
            pass.setText("password");
            pass.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_passFocusLost

    private void pass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass2FocusGained
        pass2.setBackground(Color.WHITE);
        pass2.setText("");
        pass2.setForeground(Color.BLACK);
    }//GEN-LAST:event_pass2FocusGained

    private void pass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass2FocusLost
        String ps2 = pass2.getText();
        if(ps2.isEmpty()){
            pass2.setText("confirmpassword");
            pass2.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_pass2FocusLost

    private void txtaddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddFocusGained
        txtadd.setBackground(Color.WHITE);
        txtadd.setText("");
        txtadd.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtaddFocusGained

    private void txtaddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddFocusLost
        String add = txtadd.getText();
        if(add.isEmpty()){
            txtadd.setText("address");
            txtadd.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtaddFocusLost

    private void txtfnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfnameFocusLost
        String fname = txtfname.getText();
        if(fname.isEmpty()){
            txtfname.setText("firstname");
            txtfname.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtfnameFocusLost

    private void txtfnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfnameFocusGained
        txtfname.setBackground(Color.WHITE);
        txtfname.setText("");
        txtfname.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtfnameFocusGained

    private void txtuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuserFocusGained
       txtuser.setBackground(Color.WHITE);
        txtuser.setText("");
        txtuser.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtuserFocusGained

    private void txtuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuserFocusLost
        String user = txtuser.getText();
        if(user.isEmpty()){
            txtuser.setText("username");
            txtuser.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtuserFocusLost

    private void txtlnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlnameFocusGained
        txtlname.setBackground(Color.WHITE);
        txtlname.setText("");
        txtlname.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtlnameFocusGained

    private void txtlnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlnameFocusLost
        String fname = txtlname.getText();
        if(fname.isEmpty()){
            txtlname.setText("firstname");
            txtlname.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtlnameFocusLost

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogIn;
    private javax.swing.JCheckBox chkProgram;
    private javax.swing.JCheckBox chkTL;
    private javax.swing.JCheckBox chkUD;
    private javax.swing.JCheckBox chkVG;
    private javax.swing.JCheckBox chkshow;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JRadioButton rbtnJava;
    private javax.swing.JRadioButton rbtnPython;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
