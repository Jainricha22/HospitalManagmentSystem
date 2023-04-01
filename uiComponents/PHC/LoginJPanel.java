/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiComponents.PHC;

import BloodBank.BloodDonorJPanel;
import BloodBank.BloodUserClass;
import BloodBank.BloodUserDirectory;
import BloodBank.RequestBlood;
import BloodBank.RequestBloodDirectory;
import Business.EcoSystem;
import Business.Network;
import Business.Pharmacy.Organizations.PharmacyOrganization;
import Business.Roles.Role;
import static Business.Roles.Role.BLOODBANK_USER;
import static Business.Roles.Role.DENTIST;
import static Business.Roles.Role.PHARMACY_ADMIN;
import static Business.Roles.Role.SUPER_ADMIN;
import Business.WorkQueue.WorkQueue;
import Business.db40Utility.DB4OUtil;

import javax.swing.JOptionPane;
import Bussiness.model.PHC.DoctorDirectory;
import Bussiness.model.PHC.EMTDirectory;
import Bussiness.model.PHC.EncounterHistory;
import Bussiness.model.PHC.HospitalDirectory;
import Bussiness.model.PHC.PatientDirectory;
import Bussiness.model.PHC.PersonDirectory;
import Bussiness.model.PHC.VitalSigns;
import Bussiness.model.PHC.UserAccount;
import Enterprise.Enterprise;
import com.db4o.ObjectSet;

import uiComponents.DentalHospital.Doctor.DentistWorkAreaJPanel;
import uiComponents.DentalHospital.FrontDesk.FrontDeskWorkAreaJPanel;
import uiComponents.DentalPatientRole.DentalPatientJPanel;
import uiComponents.Pharmacy.PharmacyAdminWorkAreaJPanel;

/**
 *
 * @author foram
 */
public class loginJPanel extends javax.swing.JPanel {

    private javax.swing.JSplitPane jSplitPane1;

    /**
     * Creates new form LoginJPanel
     */
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    EncounterHistory encounterHistory;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hispDirectory;
    UserAccount account;
    EcoSystem business;
    VitalSigns vitalSigns;
    PharmacyOrganization org;
    Network network;
    Enterprise enterprise;
    WorkQueue wq;

    EMTDirectory eMTDirectory;
    BloodUserClass blood;
    BloodUserDirectory bloodUserDirectory;
    RequestBlood rb;
    RequestBloodDirectory rbd;

    public loginJPanel(javax.swing.JSplitPane jSplitPane1, UserAccount account, EcoSystem business, PersonDirectory personDirectory, PatientDirectory patientDirectory,
            EncounterHistory encounterHistory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory, VitalSigns vitalSigns, PharmacyOrganization org,
            Network network, Enterprise enterprise, EMTDirectory eMTDirectory,
            BloodUserClass blood,
            BloodUserDirectory bloodUserDirectory,
            RequestBlood rb,
            RequestBloodDirectory rbd) {
        initComponents();

        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        this.doctorDirectory = doctorDirectory;
        this.hispDirectory = hospitalDirectory;
        this.jSplitPane1 = jSplitPane1;
        this.account = account;
        this.business = business;
        this.vitalSigns = vitalSigns;
        this.org = org;
        this.eMTDirectory = eMTDirectory;
        this.blood = blood;
        this.bloodUserDirectory = bloodUserDirectory;
        this.rb = rb;
        this.rbd = rbd;
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
        loginLbl = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        dropdownRole = new javax.swing.JComboBox<>();

        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        loginLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLbl.setText("LOGIN");
        jPanel1.add(loginLbl);
        loginLbl.setBounds(260, 50, 213, 50);

        role.setText("Role:");
        jPanel1.add(role);
        role.setBounds(240, 250, 30, 25);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(340, 200, 181, 23);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(340, 150, 181, 23);

        passwordLbl.setText("Password:");
        jPanel1.add(passwordLbl);
        passwordLbl.setBounds(240, 210, 62, 17);

        usernameLbl.setText("User Name:");
        jPanel1.add(usernameLbl);
        usernameLbl.setBounds(240, 160, 69, 17);

        loginBtn.setBackground(new java.awt.Color(51, 153, 255));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn);
        loginBtn.setBounds(330, 320, 150, 50);

        dropdownRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLOODBANK_USER" }));
        dropdownRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownRoleActionPerformed(evt);
            }
        });
        jPanel1.add(dropdownRole);
        dropdownRole.setBounds(340, 243, 180, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here

        UserAccount superUser = new UserAccount("fk", "fk", Role.SYSTEM_ADMINISTRATOR);

        String usernameText = username.getText();
        String passwordText = password.getText();
        String dropdownrole = dropdownRole.getSelectedItem().toString();

        if (usernameText.isEmpty() || passwordText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and Password field's cannot be empty");
            return;
        } else if (dropdownrole == null || Role.fromString(dropdownrole) == null) {
            JOptionPane.showMessageDialog(null, "Please select a role");
            return;
        }

        Role role = Role.fromString(dropdownrole);
        UserAccount user = new UserAccount(usernameText, passwordText, role);
        ObjectSet result = DB4OUtil.getDBInstance().queryByExample(user);

        if (user.equals(superUser) || !result.isEmpty()) {
            JOptionPane.showMessageDialog(this, "LOGIN SUCCESSFULL");
            switch (role) {
                case SYSTEM_ADMINISTRATOR:
                    SystemAdminJPanel systemAdminPane = new SystemAdminJPanel(jSplitPane1, account, business, personDirectory, patientDirectory, encounterHistory, doctorDirectory, hispDirectory);
                    jSplitPane1.setRightComponent(systemAdminPane);
                    break;
                case PATIENT:
                    CreateJPanel createPane = new CreateJPanel(jSplitPane1, account, business, personDirectory, patientDirectory, encounterHistory, doctorDirectory, hispDirectory, vitalSigns, eMTDirectory, blood, bloodUserDirectory, rb, rbd);
                    jSplitPane1.setRightComponent(createPane);
                    break;
                case HOSPITAL_ADMINISTRATOR:
                    HospitalAdminJPanel hospitalAdminPane = new HospitalAdminJPanel(personDirectory, patientDirectory, encounterHistory, doctorDirectory, hispDirectory, jSplitPane1, vitalSigns);
                    jSplitPane1.setRightComponent(hospitalAdminPane);
                    break;
                case PHARMACY_ADMIN:
                    PharmacyAdminWorkAreaJPanel pharmacy = new PharmacyAdminWorkAreaJPanel(jSplitPane1, account, org, enterprise, network, business);
                    jSplitPane1.setRightComponent(pharmacy);
                    break;
                case DENTIST:
                    DentistWorkAreaJPanel dentist = new DentistWorkAreaJPanel(business, account);
                    jSplitPane1.setRightComponent(dentist);
                    break;
                case RECEPTIONIST:
                    FrontDeskWorkAreaJPanel desk = new FrontDeskWorkAreaJPanel(business);
                    jSplitPane1.setRightComponent(desk);
                    break;
                case DENTAL_PATIENT:
                    DentalPatientJPanel dental = new DentalPatientJPanel(business, jSplitPane1, account, org, enterprise, network);
                    jSplitPane1.setRightComponent(dental);
                    break;
                case SUPER_ADMIN:
                    AddUserPanel makeUser = new AddUserPanel();
                    jSplitPane1.setRightComponent(makeUser);
                    break;
                case BLOODBANK_USER:
                    BloodDonorJPanel bc = new BloodDonorJPanel(jSplitPane1, business, bloodUserDirectory, blood, rb, rbd);
                    jSplitPane1.setRightComponent(bc);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "SELECT ROLE");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "INVALID CREDENTIALS");
        }


    }//GEN-LAST:event_loginBtnActionPerformed

    private void dropdownRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownRoleActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dropdownRole;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel role;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
