/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGOAdminWorkArea;

import Business.EcoSystem;
import Business.Inventory.Patient;
import Business.Enterprise.DRCEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Network.Network;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.DRCManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DRCWorkRequest;
import Business.WorkQueue.PatientWorkRequest1;
import Business.WorkQueue.WorkRequest;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
//import Business.WorkRequest.WorkRequest;
//import Business.business.Business;
//import Business.enterprise.CDCEnterprise;
//import Business.enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Preethi Jerome
 */
public class ApproveRequestJPanel1 extends javax.swing.JPanel {

    /**
     * Creates new form ApproveDRCRequestJPanel
     */
    JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem business;
    private Network network;
    private NGOAdminOrganization ngorganization;
    private ArrayList<WorkRequest> workRequests;
    public ApproveRequestJPanel1(JPanel userProcessContainer, Enterprise enterprise, EcoSystem business,Organization organization, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.ngorganization=(NGOAdminOrganization)organization;
        updateWorkLists();
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        providerRequestJtable = new javax.swing.JTable();
        btnAssign2 = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        brnRefrsh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Approve Request from Volunteer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 380, 30));

        providerRequestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(providerRequestJtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 700, 260));

        btnAssign2.setText("Assign To Self>>");
        btnAssign2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssign2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssign2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 140, 30));

        btnProcess.setText("Process Request>>");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 140, 30));

        brnRefrsh.setText("Refresh>>");
        brnRefrsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnRefrshActionPerformed(evt);
            }
        });
        jPanel1.add(brnRefrsh, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 140, 30));

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1488, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnAssign2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssign2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = providerRequestJtable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a request.");
            return;
        }

        WorkRequest request = workRequests.get(selectedRow);
        request.setReceiver(account);
        request.setStatus("In Progress");
        populateTable();
    }//GEN-LAST:event_btnAssign2ActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        int selectedRequestNumber = providerRequestJtable.getSelectedRow();
        if(selectedRequestNumber < 0){
            JOptionPane.showMessageDialog(null,"Please select a request.");
            return;
        }
        Organization drcManager = null;
        for (Network networkObj : business.getNetworkList()) {
            for (Enterprise enterpriseObj : networkObj.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterpriseObj instanceof DRCEnterprise) {
                    for (Organization  org : enterpriseObj.getOrganizationDirectory().getOrganizationList())
                        if (org instanceof DRCManagerOrganization)
                            drcManager = org;
                }
            }
        }
                
        DRCWorkRequest workRequest = new DRCWorkRequest();
        PatientWorkRequest1 patientWorkRequest = 
                (PatientWorkRequest1)workRequests.get(selectedRequestNumber);
        
        if(patientWorkRequest.getStatus() != "In Progress") {
            JOptionPane.showMessageDialog(null,"Please assign to yourself before processing.");
            return;
        }
        workRequest.setDisability(patientWorkRequest.getDisability());
        workRequest.getPerson().setDescription(patientWorkRequest.getDescription());
        workRequest.getPerson().setName(patientWorkRequest.getPerson().getName());
        workRequest.getPerson().setEmailId(patientWorkRequest.getPerson().getEmailId());
        workRequest.getPerson().setPhonenumber(patientWorkRequest.getPerson().getPhonenumber());
        workRequest.getPerson().setEmergencynumber(patientWorkRequest.getPerson().getEmergencynumber());
        workRequest.getAddress().setCity(patientWorkRequest.getAddress().getCity());
        workRequest.getAddress().setZip(patientWorkRequest.getAddress().getZip());
        workRequest.getAddress().setAddress(patientWorkRequest.getAddress().getAddress());
        workRequest.getAddress().setCountry(patientWorkRequest.getAddress().getCountry());
        workRequest.getAddress().setState(patientWorkRequest.getAddress().getState());
        workRequest.setSender(account);
        workRequest.setVolunteer(patientWorkRequest.getVolunteer());
        workRequest.setReceiver(null);
        workRequest.setStatus("Request Sent to DRC");

        drcManager.getWorkQueue().getWorkRequestList().add(workRequest);
        workRequests.remove(selectedRequestNumber);
        populateTable();
    }//GEN-LAST:event_btnProcessActionPerformed

    private void brnRefrshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnRefrshActionPerformed
        populateTable();
    }//GEN-LAST:event_brnRefrshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void updateWorkLists() {
        Organization inorg = null;
        for (Network networkObj : business.getNetworkList()) {
            for (Enterprise enterpriseObj : networkObj.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterpriseObj instanceof NGOEnterprise) {
                    for (Organization org : enterpriseObj.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof NGOAdminOrganization)
                            inorg = org;
                    }
                }
            }
        }
        workRequests = inorg.getWorkQueue().getWorkRequestList();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) providerRequestJtable.getModel();
        dtm.setRowCount(0);
        
        for (WorkRequest request : workRequests) {
            Object[] row = new Object[4];
            PatientWorkRequest1 patientWorkRequest = (PatientWorkRequest1)request;
            Patient person = patientWorkRequest.getPerson();
            row[0] = patientWorkRequest.getDisability();
            row[1] = patientWorkRequest.getSender().getEmployee().getName();
            row[2] = patientWorkRequest.getReceiver() == null ? 
                        "n/a" : patientWorkRequest.getReceiver();
            row[3] = patientWorkRequest.getStatus();
            dtm.addRow(row);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnRefrsh;
    private javax.swing.JButton btnAssign2;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable providerRequestJtable;
    // End of variables declaration//GEN-END:variables
}