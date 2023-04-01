/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiComponents.PHC;

import BloodBank.BloodUserClass;
import BloodBank.BloodUserDirectory;
import BloodBank.RequestBlood;
import BloodBank.RequestBloodDirectory;
import Business.EcoSystem;
import Bussiness.model.PHC.DoctorDirectory;
import Bussiness.model.PHC.EMTDirectory;
import Bussiness.model.PHC.Encounter;
import Bussiness.model.PHC.EncounterHistory;
import Bussiness.model.PHC.HospitalDirectory;
import Bussiness.model.PHC.Patient;
import Bussiness.model.PHC.PatientDirectory;
import Bussiness.model.PHC.Person;
import Bussiness.model.PHC.PersonDirectory;
import Bussiness.model.PHC.VitalSigns;
import Bussiness.model.PHC.UserAccount;
import java.time.LocalDateTime;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validations.VerifyNumber;

/**
 *
 * @author foram
 */
public class AppointmentJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form AppointmentJPanel
     */
    private javax.swing.JSplitPane jSplitPane1;
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    HospitalDirectory hospitalDirectory;
    DoctorDirectory doctorDirectory;
    EcoSystem business;
    UserAccount account;
    VitalSigns vitalSigns;
    
    EMTDirectory eMTDirectory;
    BloodUserClass blood;
    BloodUserDirectory bloodUserDirectory;
    RequestBlood rb;
    RequestBloodDirectory rbd;
            

    public AppointmentJPanel(javax.swing.JSplitPane jSplitPane1, UserAccount account, EcoSystem business, PersonDirectory personDirectory, PatientDirectory patientDirectory, EncounterHistory encounterHistory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory, VitalSigns vitalSigns,
             EMTDirectory eMTDirectory, BloodUserClass blood, BloodUserDirectory bloodUserDirectory, RequestBlood rb,RequestBloodDirectory rbd) {
        initComponents();
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        this.hospitalDirectory = hospitalDirectory;
        this.jSplitPane1 = jSplitPane1;
        this.doctorDirectory = doctorDirectory;
        this.business = business;
        this.vitalSigns = vitalSigns;
        this.eMTDirectory = eMTDirectory;
        this.blood = blood;
        this.bloodUserDirectory = bloodUserDirectory;
        this.rb = rb;
        this.rbd = rbd;

        displayPersonTableDetails();
        displayPatientTableDetails();
        addVerifiers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void addVerifiers() {
        InputVerifier integerVerifier = new VerifyNumber();
        heartRateTxt.setInputVerifier(integerVerifier);
        txtBloodPressure.setInputVerifier(integerVerifier);
        heightTxt.setInputVerifier(integerVerifier);
        weightTxt.setInputVerifier(integerVerifier);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vaccBG = new javax.swing.ButtonGroup();
        apptBG = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        RegularAptBtn = new javax.swing.JButton();
        heartRateLbl = new javax.swing.JLabel();
        heartRateTxt = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        heightLbl = new javax.swing.JLabel();
        weightLbl = new javax.swing.JLabel();
        isVaccinated = new javax.swing.JLabel();
        heightTxt = new javax.swing.JTextField();
        weightTxt = new javax.swing.JTextField();
        yesRB = new javax.swing.JRadioButton();
        noRB = new javax.swing.JRadioButton();
        vaccineBookBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        ApptType = new javax.swing.JLabel();
        regularRB = new javax.swing.JRadioButton();
        vaccRB = new javax.swing.JRadioButton();
        requestVaccineBtn = new javax.swing.JButton();
        clearBtn1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PatientID", "Name", "Age", "City", "Community", "ID", "House No", "Address", "Zip Code"
            }
        ));
        jScrollPane2.setViewportView(tblPatient);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Appointment Booking Details");

        lblBloodPressure.setText("Blood Pressure:");

        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        btnCheck.setBackground(new java.awt.Color(51, 153, 255));
        btnCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        RegularAptBtn.setBackground(new java.awt.Color(51, 153, 255));
        RegularAptBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegularAptBtn.setText("Book Regular Appointment");
        RegularAptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegularAptBtnActionPerformed(evt);
            }
        });

        heartRateLbl.setText("Heart Rate:");

        heartRateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartRateTxtActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(51, 153, 255));
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        heightLbl.setText("Height:");

        weightLbl.setText("Weight:");

        isVaccinated.setText("Are you vaccinated for flu?");

        weightTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTxtActionPerformed(evt);
            }
        });

        vaccBG.add(yesRB);
        yesRB.setText("YES");
        yesRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRBActionPerformed(evt);
            }
        });

        vaccBG.add(noRB);
        noRB.setText("NO");
        noRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRBActionPerformed(evt);
            }
        });

        vaccineBookBtn.setBackground(new java.awt.Color(51, 153, 255));
        vaccineBookBtn.setForeground(new java.awt.Color(255, 255, 255));
        vaccineBookBtn.setText("Book Vaccination Appt");
        vaccineBookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vaccineBookBtnMouseClicked(evt);
            }
        });
        vaccineBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineBookBtnActionPerformed(evt);
            }
        });

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "City", "Community", "ID", "Apartment Number", "Address", "Zip Code"
            }
        ));
        tblPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPerson);

        ApptType.setText("Appointment Type:");

        apptBG.add(regularRB);
        regularRB.setText("Regular");
        regularRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularRBActionPerformed(evt);
            }
        });

        apptBG.add(vaccRB);
        vaccRB.setText("Vaccination");
        vaccRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccRBActionPerformed(evt);
            }
        });

        requestVaccineBtn.setBackground(new java.awt.Color(51, 153, 255));
        requestVaccineBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestVaccineBtn.setText("Request Vaccine");
        requestVaccineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestVaccineBtnActionPerformed(evt);
            }
        });

        clearBtn1.setBackground(new java.awt.Color(51, 153, 255));
        clearBtn1.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn1.setText("EMT");
        clearBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn1ActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(51, 153, 255));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back<<");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment Booking Portal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBloodPressure)
                                            .addComponent(heartRateLbl))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(heartRateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(weightLbl)
                                            .addComponent(heightLbl))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(heightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ApptType)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vaccRB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(regularRB))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(isVaccinated)
                                        .addGap(18, 18, 18)
                                        .addComponent(yesRB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(noRB))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vaccineBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RegularAptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(requestVaccineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {heartRateTxt, heightTxt, txtBloodPressure, weightTxt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBloodPressure)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heartRateLbl)
                            .addComponent(heartRateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightLbl)
                            .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApptType)
                            .addComponent(vaccRB)
                            .addComponent(regularRB)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(heightLbl)
                        .addComponent(heightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(isVaccinated)
                        .addComponent(yesRB)
                        .addComponent(noRB)))
                .addGap(24, 24, 24)
                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegularAptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaccineBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requestVaccineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {RegularAptBtn, btnCheck, btnSearch, clearBtn, vaccineBookBtn});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonMouseClicked

    }//GEN-LAST:event_tblPersonMouseClicked

    private void vaccineBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineBookBtnActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblPatient.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row ");
        } else {
            String patientName = String.valueOf(model.getValueAt(selectedRowIndex, 0));
            if (null != patientName && noRB.isSelected() && vaccRB.isSelected()) {
                JOptionPane.showMessageDialog(this, "Vaccination Appointment is Confirmed ");
            } else {
                JOptionPane.showMessageDialog(this, "Appointment Cannot be booked ");
            }     
        }
  
    }//GEN-LAST:event_vaccineBookBtnActionPerformed

    private void vaccineBookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaccineBookBtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_vaccineBookBtnMouseClicked

    private void noRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noRBActionPerformed

    private void yesRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRBActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_yesRBActionPerformed

    private void weightTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTxtActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:

        heartRateTxt.setText("");
        txtBloodPressure.setText("");
        weightTxt.setText("");
        heightTxt.setText("");
        
    }//GEN-LAST:event_clearBtnActionPerformed

    private void heartRateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartRateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heartRateTxtActionPerformed

    private void RegularAptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegularAptBtnActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblPatient.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
      
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row ");
        }else {
            String patientName = String.valueOf(model.getValueAt(selectedRowIndex, 0));
            if (null != patientName) {
                JOptionPane.showMessageDialog(this, "Regular Appointment is Confirmed ");
            } else {
                JOptionPane.showMessageDialog(this, "Patient Invalid ");
            }
        }
    }//GEN-LAST:event_RegularAptBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CreateJPanel createPane = new CreateJPanel(jSplitPane1, account, business, personDirectory, patientDirectory, encounterHistory, doctorDirectory, hospitalDirectory, vitalSigns, eMTDirectory, blood, bloodUserDirectory, rb, rbd);
        jSplitPane1.setRightComponent(createPane);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        SearchJPanel searchPane = new SearchJPanel(encounterHistory, patientDirectory, personDirectory, jSplitPane1, hospitalDirectory, doctorDirectory, vitalSigns, eMTDirectory, blood, bloodUserDirectory,rb, rbd);
        jSplitPane1.setRightComponent(searchPane);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPerson.getSelectedRow();
        Person selectPerson = personDirectory.getListOfPerson().get(selectedRowIndex);
        double bloodPressure = Integer.parseInt(txtBloodPressure.getText());
        double heartRate = Integer.parseInt(heartRateTxt.getText());
        vitalSigns = new VitalSigns();
        vitalSigns.setBloodPressure(bloodPressure);
        vitalSigns.setHeartRate(heartRate);
        vitalSigns.setHeight(Integer.parseInt(heightTxt.getText()));
        vitalSigns.setWeight(Integer.parseInt(weightTxt.getText()));
        vitalSigns.isVaccinated();

        Patient patient = new Patient(vitalSigns);
        boolean isStable = patient.isPatientNormal(selectPerson.getAgeOfPerson());

        if (isStable == false) {
            patientDirectory.addPatient(patient);
            patient.setPatientD(String.valueOf(selectPerson.getIdOfPerson()));
            patient.setNameOfPerson(selectPerson.getNameOfPerson());
            patient.setAgeOfPerson(selectPerson.getAgeOfPerson());
            patient.setHouse(selectPerson.getHouse());
            patient.setIdOfPerson(selectPerson.getIdOfPerson());
            patient.setVitalSigns(vitalSigns);
            displayPatientTableDetails();
        }

        Encounter encounter = new Encounter(vitalSigns);

        encounter.setPatientID(patient.getPatientD());
        encounter.setDateOfVisit(LocalDateTime.now());
        encounter.setIsStable(patient.isPatientNormal(selectPerson.getAgeOfPerson()));
        encounter.setVitalSigns(vitalSigns);
        if(vaccRB.isSelected()){
            encounter.setAppointmentType("VACCINATION");
        } else if(regularRB.isSelected()){
            encounter.setAppointmentType("REGULAR");
        }
        encounterHistory.addEncounter(encounter);

    }//GEN-LAST:event_btnCheckActionPerformed

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void regularRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regularRBActionPerformed

    private void requestVaccineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestVaccineBtnActionPerformed
        // TODO add your handling code here:

        VaccineJPanel vaccine = new VaccineJPanel(jSplitPane1, account, encounterHistory, patientDirectory, personDirectory, hospitalDirectory, doctorDirectory, vitalSigns, eMTDirectory, blood, bloodUserDirectory, rb, rbd);
        jSplitPane1.setRightComponent(vaccine);
    }//GEN-LAST:event_requestVaccineBtnActionPerformed

    private void clearBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn1ActionPerformed
        // TODO add your handling code here:
        EMTJPanel emt = new EMTJPanel(personDirectory, eMTDirectory, jSplitPane1, business, bloodUserDirectory, blood, rb, rbd);
        jSplitPane1.setRightComponent(emt);
    }//GEN-LAST:event_clearBtn1ActionPerformed

    private void vaccRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccRBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApptType;
    private javax.swing.JButton RegularAptBtn;
    private javax.swing.ButtonGroup apptBG;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton clearBtn1;
    private javax.swing.JLabel heartRateLbl;
    private javax.swing.JTextField heartRateTxt;
    private javax.swing.JLabel heightLbl;
    private javax.swing.JTextField heightTxt;
    private javax.swing.JLabel isVaccinated;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JRadioButton noRB;
    private javax.swing.JRadioButton regularRB;
    private javax.swing.JButton requestVaccineBtn;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.ButtonGroup vaccBG;
    private javax.swing.JRadioButton vaccRB;
    private javax.swing.JButton vaccineBookBtn;
    private javax.swing.JLabel weightLbl;
    private javax.swing.JTextField weightTxt;
    private javax.swing.JRadioButton yesRB;
    // End of variables declaration//GEN-END:variables

    private void displayPatientTableDetails() {
        DefaultTableModel tblmodel = (DefaultTableModel) tblPatient.getModel();
        tblmodel.setRowCount(0);
        for (Patient patient : patientDirectory.getListOfPatients()) {
            Object[] row = new Object[10];
            row[0] = patient.getIdOfPerson();
            row[1] = patient.getNameOfPerson();
            row[2] = patient.getAgeOfPerson();
            row[3] = patient.getHouse().getNameOfCity();
            row[4] = patient.getHouse().getNameOfCommunity();
            row[5] = patient.getIdOfPerson();
            row[6] = patient.getHouse().getApartmentNumber();
            row[7] = patient.getHouse().getStreetName();
            row[8] = patient.getHouse().getZipCode();
            tblmodel.addRow(row);
        }
    }

    private void displayPersonTableDetails() {
        DefaultTableModel tblmodel = (DefaultTableModel) tblPerson.getModel();
        tblmodel.setRowCount(0);
        for (Person person : personDirectory.getListOfPerson()) {
            Object[] row = new Object[10];
            row[0] = person.getNameOfPerson();
            row[1] = person.getAgeOfPerson();
            row[2] = person.getHouse().getNameOfCity();
            row[3] = person.getHouse().getNameOfCommunity();
            row[4] = person.getIdOfPerson();
            row[5] = person.getHouse().getApartmentNumber();
            row[6] = person.getHouse().getStreetName();
            row[7] = person.getHouse().getZipCode();

            tblmodel.addRow(row);
        }
    }
}