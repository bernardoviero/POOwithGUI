package exercicio003;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Interface03 extends javax.swing.JFrame {

    Arquivo arquivo = new Arquivo();

    public Interface03() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_lerArquivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_dados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_lerArquivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_lerArquivo.setText("LER ARQUIVO");
        jButton_lerArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lerArquivoActionPerformed(evt);
            }
        });

        jTable_dados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable_dados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_lerArquivo)
                        .addGap(172, 172, 172))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton_lerArquivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_lerArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lerArquivoActionPerformed
        try {
            ArrayList nomes = arquivo.leitorNome("dados");
            jTable_dados.setValueAt(nomes.get(0), 0, 0);
            jTable_dados.setValueAt(nomes.get(1), 1, 0);
            jTable_dados.setValueAt(nomes.get(2), 2, 0);
            
            ArrayList emails = arquivo.leitorEmail("dados");
            jTable_dados.setValueAt(emails.get(0), 0, 1);
            jTable_dados.setValueAt(emails.get(1), 1, 1);
            jTable_dados.setValueAt(emails.get(2), 2, 1);
        } catch (IOException ex) {
            Logger.getLogger(Interface03.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_lerArquivoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_lerArquivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_dados;
    // End of variables declaration//GEN-END:variables
}
