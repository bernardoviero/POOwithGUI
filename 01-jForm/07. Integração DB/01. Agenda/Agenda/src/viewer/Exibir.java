package viewer;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Exibir extends javax.swing.JFrame {

    public Exibir() {
        initComponents();
    }

    public JButton getjButton_fechar() {
        return jButton_fechar;
    }

    public JButton getjButton_editar() {
        return jButton_editar;
    }

    public void setjButton_editar(JButton jButton_editar) {
        this.jButton_editar = jButton_editar;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton_excluir() {
        return jButton_excluir;
    }

    public void setjButton_excluir(JButton jButton_excluir) {
        this.jButton_excluir = jButton_excluir;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
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
        jButton_editar = new javax.swing.JButton();
        jButton_excluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_exibicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "EMAIL", "CARGO"
            }
        ));
        jScrollPane1.setViewportView(jTable_exibicao);

        jButton_fechar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fechar.png"))); // NOI18N
        jButton_fechar.setText("FECHAR");

        jButton_retornarCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_retornarCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jButton_retornarCadastrar.setText("CADASTRAR");

        jButton_editar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jButton_editar.setText("EDITAR");

        jButton_excluir.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.png"))); // NOI18N
        jButton_excluir.setText("EXCLUIR");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        jButton1.setText("LISTAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_retornarCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_fechar)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_retornarCadastrar)
                    .addComponent(jButton_fechar)
                    .addComponent(jButton_editar)
                    .addComponent(jButton_excluir)
                    .addComponent(jButton1))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_editar;
    private javax.swing.JButton jButton_excluir;
    private javax.swing.JButton jButton_fechar;
    private javax.swing.JButton jButton_retornarCadastrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_exibicao;
    // End of variables declaration//GEN-END:variables
}
