 package clientenglishgame;

import datauser.DataUser;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.attribute.DosFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pham anh tuan
 */
class ClientGame extends javax.swing.JFrame{

    /**
     * Creates new form ClientGame
     */
    
    private InetAddress  ip = null;
    private ObjectInputStream objectInputStream = null;
    private ObjectOutputStream objectOutputStream = null;
    private Socket  socket = null;
    private int curretPoint = 3;
    private int tiemFaile = 0;
    
    public ClientGame(String nameClient) {
        initComponents();
        this.lbNameClient.setText(nameClient);
        this.setTitle("CLIENT APLICATION");
        this.lbCountPoint.setText(curretPoint + "");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNameClient = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taMain = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lbCountPoint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        lbNameClient.setBackground(new java.awt.Color(255, 153, 51));
        lbNameClient.setForeground(new java.awt.Color(0, 0, 0));
        lbNameClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientenglishgame/customer.png"))); // NOI18N
        lbNameClient.setText("CLIENT");
        lbNameClient.setOpaque(true);

        jScrollPane1.setBackground(new java.awt.Color(255, 51, 51));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnSend.setBackground(new java.awt.Color(255, 102, 0));
        btnSend.setForeground(new java.awt.Color(0, 0, 0));
        btnSend.setText("SEND");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 204, 204));

        taMain.setBackground(new java.awt.Color(255, 204, 204));
        taMain.setColumns(20);
        taMain.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        taMain.setForeground(new java.awt.Color(0, 0, 0));
        taMain.setLineWrap(true);
        taMain.setRows(5);
        taMain.setToolTipText("");
        taMain.setWrapStyleWord(true);
        taMain.setCaretColor(new java.awt.Color(255, 204, 204));
        taMain.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        taMain.setEnabled(false);
        jScrollPane2.setViewportView(taMain);

        jLabel3.setBackground(new java.awt.Color(255, 153, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientenglishgame/coins.png"))); // NOI18N
        jLabel3.setText("POINT");
        jLabel3.setOpaque(true);

        lbCountPoint.setBackground(new java.awt.Color(0, 255, 255));
        lbCountPoint.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbCountPoint.setForeground(new java.awt.Color(0, 0, 0));
        lbCountPoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCountPoint.setText("0");
        lbCountPoint.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbNameClient, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCountPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNameClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCountPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try {
            // TODO add your handling code here:
            String text = this.jTextArea1.getText();
            this.jTextArea1.setText("");
            DataUser dataUserClient = new DataUser(text,curretPoint);
            objectOutputStream.writeObject(dataUserClient);
            if(text.equals("exit"))
            {
                socket.close();
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(ClientGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    
    public void ClientConnection()
    {
        try {
            ip = InetAddress.getByName("localhost");
            socket = new Socket(ip, 1997);
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            
            int first  = 0;
            while(true)
            {
                
                DataUser dataUserServer = (DataUser) objectInputStream.readObject();
                if(dataUserServer.getData().equals("stop"))
                {
                    taMain.setText("YOU LOSE");
                   lbCountPoint.setText(dataUserServer.getPointCurrent() + "");
                    socket.close();
                    break;
                }
                else if(dataUserServer.getData().equals("win"))
                {
                    taMain.setText("YOU WIN");
                    lbCountPoint.setText(dataUserServer.getPointCurrent() + "");
                    socket.close();
                    break;
                }
                else if(dataUserServer != null && dataUserServer.getPointCurrent() >= 0)
                {
                    this.taMain.setText(dataUserServer.getData());
                    
                    
                    if(first != 0)
                    {
                        this.curretPoint = dataUserServer.getPointCurrent();
                    }
                    this.lbCountPoint.setText(curretPoint + "");
                }
                first++;
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbCountPoint;
    private javax.swing.JLabel lbNameClient;
    private javax.swing.JTextArea taMain;
    // End of variables declaration//GEN-END:variables
}
