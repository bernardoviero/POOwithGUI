package viewer;

import javax.swing.JButton;
import javax.swing.JTextField;


public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    public JButton getjButton_visualizar() {
        return jButton_visualizar;
    }

    public void setjButton_visualizar(JButton jButton_visualizar) {
        this.jButton_visualizar = jButton_visualizar;
    }

    public JButton getjButton1() {
        return jButton_retornar;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton_retornar = jButton1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton_retornar = new javax.swing.JButton();
        jTextField_nome = new javax.swing.JTextField();
        jButton_salvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jTextField_cargo = new javax.swing.JTextField();
        jButton_visualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("CADASTRO");

        jButton_retornar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_retornar.setText("Menu");

        jButton_salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_salvar.setText("SALVAR");

        jLabel2.setText("Nome");

        jLabel3.setText("Email");

        jLabel4.setText("Cargo");

        jButton_visualizar.setText("VISUALIZAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton_retornar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_salvar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nome)
                            .addComponent(jTextField_email)
                            .addComponent(jTextField_cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_visualizar)
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_salvar)
                    .addComponent(jButton_retornar))
                .addGap(18, 18, 18)
                .addComponent(jButton_visualizar)
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjButton_salvar() {
        return jButton_salvar;
    }

    public JTextField getjTextField_cargo() {
        return jTextField_cargo;
    }

    public void setjTextField_cargo(JTextField jTextField_cargo) {
        this.jTextField_cargo = jTextField_cargo;
    }

    public JTextField getjTextField_email() {
        return jTextField_email;
    }

    public void setjTextField_email(JTextField jTextField_email) {
        this.jTextField_email = jTextField_email;
    }

    public void setjButton_salvar(JButton jButton_salvar) {
        this.jButton_salvar = jButton_salvar;
    }

    public JTextField getjTextField_nome() {
        return jTextField_nome;
    }

    public void setjTextField_nome(JTextField jTextField_nome) {
        this.jTextField_nome = jTextField_nome;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_retornar;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JButton jButton_visualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField_cargo;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_nome;
    // End of variables declaration//GEN-END:variables
}
