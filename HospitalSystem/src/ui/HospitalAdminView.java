package ui;

import hospitalsystem.JDBCConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Appointment;
import model.ListDirectory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author arpitarai
 */
public class HospitalAdminView extends javax.swing.JFrame {

    /**
     * Creates new form HospitalAdminView
     */
    ListDirectory appointmentList;

    public HospitalAdminView() {
        initComponents();
        patientTable();
        doctorTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientAppointments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchPatientID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deletePatient = new javax.swing.JTextField();
        deletePatientDocView = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        patientAppointments1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        doctorName = new javax.swing.JTextField();
        userID = new javax.swing.JTextField();
        community = new javax.swing.JTextField();
        community1 = new javax.swing.JTextField();
        createDoctor = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        update1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 228, 228));
        jPanel1.setForeground(new java.awt.Color(255, 204, 255));

        jButton4.setBackground(new java.awt.Color(176, 224, 230));
        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NORTHEASTERN UNIVERSITY HOSPITAL MANAGEMENT SYSTEM");

        patientAppointments.setBackground(new java.awt.Color(231, 239, 246));
        patientAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Symptoms", "Doctor Appointed", "Community", "Patient Email"
            }
        ));
        patientAppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientAppointmentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(patientAppointments);

        jLabel1.setText("Search ");

        searchPatientID.setBackground(new java.awt.Color(231, 239, 246));
        searchPatientID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchPatientIDKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        jLabel2.setText("Patient Details");

        jLabel3.setText("Delete Patient");

        deletePatient.setBackground(new java.awt.Color(231, 239, 246));

        deletePatientDocView.setBackground(new java.awt.Color(250, 128, 114));
        deletePatientDocView.setText("DELETE");
        deletePatientDocView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientDocViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(deletePatient)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(deletePatientDocView))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(jButton4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(deletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(deletePatientDocView)
                .addGap(0, 98, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Patients", jPanel1);

        jPanel2.setBackground(new java.awt.Color(240, 228, 228));

        jButton3.setBackground(new java.awt.Color(176, 224, 230));
        jButton3.setText("LOGOUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NORTHEASTERN UNIVERSITY HOSPITAL MANAGEMENT SYSTEM");

        patientAppointments1.setBackground(new java.awt.Color(231, 239, 246));
        patientAppointments1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Hospital Name", "Community", "Doctor Email"
            }
        ));
        patientAppointments1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientAppointments1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(patientAppointments1);

        jLabel8.setText("Doctor Name");

        jLabel9.setText("Email ID");

        jLabel10.setText("Hospital Name");

        jLabel11.setText("Community");

        doctorName.setBackground(new java.awt.Color(231, 239, 246));

        userID.setBackground(new java.awt.Color(231, 239, 246));

        community.setBackground(new java.awt.Color(231, 239, 246));

        community1.setBackground(new java.awt.Color(231, 239, 246));

        createDoctor.setBackground(new java.awt.Color(135, 206, 250));
        createDoctor.setText("Create Doctor");
        createDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDoctorActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(250, 128, 114));
        update.setText("Delete Doctor");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        jLabel12.setText("Doctors and Details");

        update1.setBackground(new java.awt.Color(135, 206, 250));
        update1.setText("Update Doctor");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addComponent(jButton3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(createDoctor)
                        .addGap(18, 18, 18)
                        .addComponent(update1)
                        .addGap(18, 18, 18)
                        .addComponent(update)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(143, 143, 143))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(38, 38, 38)
                                    .addComponent(community, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(58, 58, 58)
                                        .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(doctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(community1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(129, 129, 129)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel6))
                .addGap(57, 57, 57)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(community1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(community, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createDoctor)
                    .addComponent(update1)
                    .addComponent(update))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Doctors", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        NortheasternHospitalManagementSystem logInPage = new NortheasternHospitalManagementSystem();
        logInPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        NortheasternHospitalManagementSystem logInPage = new NortheasternHospitalManagementSystem();
        logInPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void deletePatientDocViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientDocViewActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) patientAppointments.getModel();
        try {
            try ( Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();
                Appointment appointment = new Appointment();
                appointment.setUserID(deletePatient.getText());

                String sql = "DELETE FROM JDBC_HospitalSchema.Appointment WHERE userid ='" + appointment.getUserID() + "'";
                System.out.println(sql);
                int a = statement.executeUpdate(sql);
                if (0 == a) {
                    JOptionPane.showMessageDialog(this, "Deletion Failed, enter the correct details!");
                    return;
                }
                appointmentList = new ListDirectory();
                JOptionPane.showMessageDialog(this, "Employee Deleted successfully!");
                model.setRowCount(0);
                deletePatient.setText("");

            }
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            JOptionPane.showMessageDialog(this, exception);
        }
        patientTable();
    }//GEN-LAST:event_deletePatientDocViewActionPerformed

    private void createDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDoctorActionPerformed
        // TODO add your handling code here:
        appointmentList = new ListDirectory();
        Appointment appointment = appointmentList.addAppointment();
        appointment.setUserID(userID.getText());
        appointment.setDoctor(doctorName.getText());
        appointment.setHospitalName(community1.getText());
        appointment.setCommunity(community.getText());

        if (appointment.getUserID() == null || appointment.getUserID().trim().isEmpty() || "".equals(appointment.getUserID())
                || appointment.getDoctor() == null || appointment.getDoctor().trim().isEmpty() || "".equals(appointment.getDoctor())
                || appointment.getHospitalName() == null || appointment.getHospitalName().trim().isEmpty() || "".equals(appointment.getHospitalName())
                || appointment.getCommunity() == null || appointment.getCommunity().trim().isEmpty() || "".equals(appointment.getCommunity())) {
            JOptionPane.showMessageDialog(this, "Please Enter all credentials!");
            return;
        }

        try {
            try ( Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO JDBC_HospitalSchema.DoctorTable " + "(DoctorUserID, Community, Hospital, DoctorName)"
                        + "VALUES ('" + appointment.getUserID() + "' ,'" + appointment.getCommunity() + "' , '" + appointment.getHospitalName() + "' , '" + appointment.getDoctor() + "');";

                statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Doctor created Successfully!!");
                userID.setText("");
                doctorName.setText("");
                community.setText("");
                community1.setText("");

            }
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            JOptionPane.showMessageDialog(this, "Please Enter the registerd Email ID of Doctor");
            userID.setText("");
        }
        doctorTable();
    }//GEN-LAST:event_createDoctorActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = patientAppointments1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select the row you want to UPDATE");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) patientAppointments1.getModel();
        appointmentList = new ListDirectory();
        Appointment appointment = appointmentList.addAppointment();
        appointment.setUserID(userID.getText());
        appointment.setDoctor(doctorName.getText());
        appointment.setHospitalName(community1.getText());
        appointment.setCommunity(community.getText());
        if (appointment.getUserID() == null || appointment.getUserID().trim().isEmpty() || "".equals(appointment.getUserID())
                || appointment.getDoctor() == null || appointment.getDoctor().trim().isEmpty() || "".equals(appointment.getDoctor())
                || appointment.getHospitalName() == null || appointment.getHospitalName().trim().isEmpty() || "".equals(appointment.getHospitalName())
                || appointment.getCommunity() == null || appointment.getCommunity().trim().isEmpty() || "".equals(appointment.getCommunity())) {
            JOptionPane.showMessageDialog(this, "Please Enter all credentials!");
            return;
        }

        try {
            try ( Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();
                String sql = "UPDATE JDBC_HospitalSchema.DoctorTable SET Community = '" + appointment.getCommunity()
                        + "' , Hospital = '" + appointment.getHospitalName() + "' ,DoctorName = '" + appointment.getDoctor()
                        + "' where DoctorUserID ='" + appointment.getUserID() + "'";
                System.out.println(sql);
                int a = statement.executeUpdate(sql);
                if (a == 0) {
                    JOptionPane.showMessageDialog(this, "Updation Failed!");

                    return;
                }
                JOptionPane.showMessageDialog(this, "Doctor UPDATED successfully!");
                model.setRowCount(0);
                userID.setText("");
                doctorName.setText("");
                community1.setText("");
                community.setText("");

            }
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            JOptionPane.showMessageDialog(this, exception);
        }
        doctorTable();
    }//GEN-LAST:event_update1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = patientAppointments1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select the row you want to DELETE");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) patientAppointments1.getModel();

        try {
            try ( Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();
                Appointment appointment = new Appointment();
                appointment.setUserID(userID.getText());

                String sql = "DELETE FROM JDBC_HospitalSchema.DoctorTable WHERE DoctorUserid ='" + appointment.getUserID() + "'";
                System.out.println(sql);
                int a = statement.executeUpdate(sql);
                if (a == 0) {
                    JOptionPane.showMessageDialog(this, "Deletion Failed!");

                    return;
                }
                appointmentList = new ListDirectory();
                JOptionPane.showMessageDialog(this, "Doctor Deleted successfully!");
                model.setRowCount(0);
                userID.setText("");
                doctorName.setText("");
                community1.setText("");
                community.setText("");

            }
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            JOptionPane.showMessageDialog(this, exception);
        }
        doctorTable();
    }//GEN-LAST:event_updateActionPerformed

    private void patientAppointments1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientAppointments1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) patientAppointments1.getModel();
        int selectedRowIndex = patientAppointments1.getSelectedRow();
        String docName = (String) model.getValueAt(selectedRowIndex, 0);
        String userId = (String) model.getValueAt(selectedRowIndex, 3);
        String hospitalName = (String) model.getValueAt(selectedRowIndex, 1);
        String communityName = (String) model.getValueAt(selectedRowIndex, 2);
        userID.setText(userId);
        doctorName.setText(docName);
        community1.setText(hospitalName);
        community.setText(communityName);
    }//GEN-LAST:event_patientAppointments1MouseClicked

    private void patientAppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientAppointmentsMouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) patientAppointments.getModel();
        int selectedRowIndex = patientAppointments.getSelectedRow();
        String patientName = (String) model.getValueAt(selectedRowIndex, 4);
        deletePatient.setText(patientName);
    }//GEN-LAST:event_patientAppointmentsMouseClicked

    private void searchPatientIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchPatientIDKeyReleased
        // TODO add your handling code here:
        String query = searchPatientID.getText();
        filterSearch(query);

    }//GEN-LAST:event_searchPatientIDKeyReleased

    public void patientTable() {
        DefaultTableModel model = (DefaultTableModel) patientAppointments.getModel();
        try {
            try ( Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();
                String sql = "Select * from JDBC_HospitalSchema.Appointment";
                ResultSet resultSet = statement.executeQuery(sql);
                appointmentList = new ListDirectory();
                while (resultSet.next()) {
                    Appointment appointment = appointmentList.addAppointment();
                    appointment.setPatientName(resultSet.getString("PatientName"));
                    appointment.setSymptoms(resultSet.getString("Symptoms"));
                    appointment.setDoctor(resultSet.getString("Doctor"));
                    appointment.setCommunity(resultSet.getString("CommunityName"));
                    appointment.setUserID(resultSet.getString("UserID"));

                    // appointment.setDate(resultSet.getString("Date"));
                    System.out.println(" Apppointment Time : " + appointment.getTime());

                    model.setRowCount(0);
                    for (Appointment appointmentObj : appointmentList.getAppointment()) {
                        Object[] row = new Object[5];
                        row[0] = appointmentObj.getPatientName();
                        row[1] = appointmentObj.getSymptoms();
                        row[2] = appointmentObj.getDoctor();
                        row[3] = appointmentObj.getCommunity();
                        row[4] = appointmentObj.getUserID();

                        model.addRow(row);
                    }

                }

            }
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            JOptionPane.showMessageDialog(this, exception);
        }
    }

    public void doctorTable() {
        DefaultTableModel model = (DefaultTableModel) patientAppointments1.getModel();
        try {
            try ( Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();
                String sql = "Select * from JDBC_HospitalSchema.DoctorTable";
                ResultSet resultSet = statement.executeQuery(sql);
                appointmentList = new ListDirectory();
                while (resultSet.next()) {
                    Appointment appointment = appointmentList.addAppointment();
                    appointment.setHospitalName(resultSet.getString("Hospital"));
                    appointment.setDoctor(resultSet.getString("DoctorName"));
                    appointment.setCommunity(resultSet.getString("Community"));
                    appointment.setUserID(resultSet.getString("DoctorUserID"));

                    model.setRowCount(0);
                    for (Appointment appointmentObj : appointmentList.getAppointment()) {
                        Object[] row = new Object[5];
                        row[0] = appointmentObj.getDoctor();
                        row[1] = appointmentObj.getHospitalName();
                        row[2] = appointmentObj.getCommunity();
                        row[3] = appointmentObj.getUserID();

                        model.addRow(row);
                    }

                }

            }
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            JOptionPane.showMessageDialog(this, exception);
        }
    }

    private void filterSearch(String query) {
        DefaultTableModel model = (DefaultTableModel) patientAppointments.getModel();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        patientAppointments.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(query));
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HospitalAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HospitalAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HospitalAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HospitalAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HospitalAdminView().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField community;
    private javax.swing.JTextField community1;
    private javax.swing.JButton createDoctor;
    private javax.swing.JTextField deletePatient;
    private javax.swing.JButton deletePatientDocView;
    private javax.swing.JTextField doctorName;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable patientAppointments;
    private javax.swing.JTable patientAppointments1;
    private javax.swing.JTextField searchPatientID;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    private javax.swing.JTextField userID;
    // End of variables declaration//GEN-END:variables
}
