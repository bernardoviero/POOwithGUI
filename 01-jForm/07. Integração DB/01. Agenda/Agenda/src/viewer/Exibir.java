package viewer;

import javax.swing.JButton;
import javax.swing.JTable;

public class Exibir extends javax.swing.JFrame {

    public Exibir() {
        initComponents();
    }

    public JButton getjButton_fechar() {
        return jButton_fechar;
    }

    public void setjButton_fechar(JButton jButton_fechar) {
        this.jButton_fechar = jButton_fechar;
    }

    public JButton getjButton_retornarCadastrar() {
        return jButton_retornarCadastrar;
    }

    public void setjButton_retornarCadastrar(JButton jButton_retornarCadastrar) {
        this.jButton_retornarCadastrar = jButton_retornarCadastrar;
    }

    public JTable getjTable_exibicao() {
        return jTable_exibicao;
    }

    public void setjTable_exibicao(JTable jTable_exibicao) {
        this.jTable_exibicao = jTable_exibicao;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_exibicao = new javax.swing.JTable();
        jButton_fechar = new javax.swing.JButton();
        jButton_retornarCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_exibicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "EMAIL", "CARGO"
            }
        ));
        jTable_exibicao.setEnabled(false);
        jScrollPane1.setViewportView(jTable_exibicao);

        jButton_fechar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_fechar.setText("FECHAR");

        jButton_retornarCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_retornarCadastrar.setText("CADASTRAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_retornarCadastrar)
                        .addGap(476, 476, 476)
                        .addComponent(jButton_fechar)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_retornarCadastrar)
                    .addComponent(jButton_fechar))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_fechar;
    private javax.swing.JButton jButton_retornarCadastrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_exibicao;
    // End of variables declaration//GEN-END:variables
}
