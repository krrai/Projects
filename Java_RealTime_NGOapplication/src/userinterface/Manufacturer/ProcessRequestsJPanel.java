/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Manufacturer;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Organization.ManufacturerOrganization;
import Business.WorkQueue.WorkRequest;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Preethi Jerome
 */
public class ProcessRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessRequestsJPanel
     */
    JPanel userProcessContainer;
   UserAccount userAccount;
   Enterprise enterprise;
   Organization organization;
    ManufacturerOrganization mo;
    public ProcessRequestsJPanel(JPanel userProcessContainer, UserAccount userAccount,Enterprise enterprise,Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.organization=organization;
        mo = (ManufacturerOrganization)organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAssign2 = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        brnRefrsh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DistrRequestJtable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Approve/Reject Distributor Request");

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAssign2.setText("Assign To Self>>");
        btnAssign2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssign2ActionPerformed(evt);
            }
        });

        btnProcess.setText("Process Request>>");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        brnRefrsh.setText("Refresh>>");
        brnRefrsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnRefrshActionPerformed(evt);
            }
        });

        DistrRequestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Requested Medicine", "Sender", "Receiver", "Status", "Created Time", "Resolved Resolve"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DistrRequestJtable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAssign2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(brnRefrsh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 107, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAssign2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(brnRefrsh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 107, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAssign2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssign2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = DistrRequestJtable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a request.");
        }

        //   ClinicShipmentWorkRequest request = (ClinicShipmentWorkRequest) providerRequestJtable.getValueAt(selectedRow,0);
        WorkRequest request = (WorkRequest) DistrRequestJtable.getValueAt(selectedRow,0);
        request.setReceiver(userAccount);
        request.setStatus("inProgress");
        btnProcess.setEnabled(true);
        populateTable();
    }//GEN-LAST:event_btnAssign2ActionPerformed

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) DistrRequestJtable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : mo.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver();
            row[3] = request.getStatus();
            dtm.addRow(row);
        }
    }
    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int selectedRow = DistrRequestJtable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest) DistrRequestJtable.getValueAt(selectedRow, 0);
        int ok=JOptionPane.showConfirmDialog(null, "Do you want to approve this request?", "Approve/Reject Distributor Request", JOptionPane.YES_NO_CANCEL_OPTION);

        if(ok==0){

            // System.out.println("enterprise" + enterprise.getName()+ "network"+ network.getRole() );
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                System.out.println("o::" + o.getName() + "enterprise"+ enterprise.getName() );

                userAccount.getWorkQueue().getWorkRequestList().add(request);
                o.getWorkQueue().getWorkRequestList().add(request);
                request.setStatus("Request Completed");
                request.setResolveDate(time());
                request.setReceiver(userAccount);
                JOptionPane.showMessageDialog(null, "Request Approved. Inventory is updated.");
                populateTable();
                break;
            }
        }
        else{
            request.setReceiver(userAccount);
            request.setResolveDate(time());
            request.setStatus("Request Rejected");
            request.setRequest("Inventory Cannot be Increased At this time.");
        }

        btnProcess.setEnabled(false);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void brnRefrshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnRefrshActionPerformed

        populateTable();
    }//GEN-LAST:event_brnRefrshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DistrRequestJtable;
    private javax.swing.JButton brnRefrsh;
    private javax.swing.JButton btnAssign2;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}