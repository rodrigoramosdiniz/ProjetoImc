/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimc;

/**
 *
 * @author Rodrigo
 */
public class IMCJanela extends javax.swing.JPanel {

    /**
     * Creates new form IMCJanela
     */
    public IMCJanela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoAltura = new javax.swing.JTextField();
        CampoPeso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoResultado = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        CampoBotaoIMC = new javax.swing.JButton();
        botaoCampoLimpar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Digite a Altura:");

        jLabel2.setText("Digite o Peso:");

        CampoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoAlturaActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado:");

        CampoResultado.setEditable(false);
        CampoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoResultadoActionPerformed(evt);
            }
        });

        CampoBotaoIMC.setText("Calcular");
        jSplitPane1.setLeftComponent(CampoBotaoIMC);

        botaoCampoLimpar.setText("Limpar");
        jSplitPane1.setRightComponent(botaoCampoLimpar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoPeso)
                            .addComponent(CampoAltura))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CampoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CampoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoAlturaActionPerformed

    private void CampoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoResultadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoAltura;
    private javax.swing.JButton CampoBotaoIMC;
    private javax.swing.JTextField CampoPeso;
    private javax.swing.JTextField CampoResultado;
    private javax.swing.JButton botaoCampoLimpar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getCampoAltura() {
        return CampoAltura;
    }

    public void setCampoAltura(javax.swing.JTextField CampoAltura) {
        this.CampoAltura = CampoAltura;
    }

    public javax.swing.JButton getCampoBotaoIMC() {
        return CampoBotaoIMC;
    }

    public void setCampoBotaoIMC(javax.swing.JButton CampoBotaoIMC) {
        this.CampoBotaoIMC = CampoBotaoIMC;
    }

    public javax.swing.JTextField getCampoPeso() {
        return CampoPeso;
    }

    public void setCampoPeso(javax.swing.JTextField CampoPeso) {
        this.CampoPeso = CampoPeso;
    }

    public javax.swing.JTextField getCampoResultado() {
        return CampoResultado;
    }

    public void setCampoResultado(javax.swing.JTextField CampoResultado) {
        this.CampoResultado = CampoResultado;
    }

    public javax.swing.JButton getBotaoCampoLimpar() {
        return botaoCampoLimpar;
    }

    public void setBotaoCampoLimpar(javax.swing.JButton botaoCampoLimpar) {
        this.botaoCampoLimpar = botaoCampoLimpar;
    }
}
