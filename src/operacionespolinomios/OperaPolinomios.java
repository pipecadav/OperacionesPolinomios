/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionespolinomios;

import java.util.regex.Pattern;

/**
 *
 * @author Carolina
 */
public class OperaPolinomios extends javax.swing.JFrame {

    Polinomio polinomB = new Polinomio();
    Polinomio polinomA = new Polinomio();
    /**
     * Creates new form OperaPolinomios
     */
    
    public static Polinomio SepararPolinomio(String pPolinomio){ 
        Polinomio unPolinomio = new Polinomio();
        String Pol = " ";
        String partes[];
        String separar[];
        partes = Pol.split(Pattern.quote("+"));
        for(int i = 0; i<partes.length; i++){
            separar = partes[i].split(Pattern.quote("X"));
            int a = Integer.parseInt(separar[0]);
            int b = Integer.parseInt(separar[1]);
            unPolinomio.AlmacenarTermino(a, b);
        }
        return unPolinomio;
    }    
    public OperaPolinomios() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PolinomioA = new javax.swing.JTextField();
        PolinomioB = new javax.swing.JTextField();
        Sumar = new javax.swing.JButton();
        MultiplicarCoef = new javax.swing.JButton();
        MutiplicarPolinomios = new javax.swing.JButton();
        Derivar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese Polinomios");

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Resultado");

        PolinomioA.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        PolinomioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PolinomioAActionPerformed(evt);
            }
        });

        PolinomioB.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        PolinomioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PolinomioBActionPerformed(evt);
            }
        });

        Sumar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Sumar.setText("Sumar dos polinomios");
        Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarActionPerformed(evt);
            }
        });

        MultiplicarCoef.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        MultiplicarCoef.setText("Multiplicar por coeficiente");

        MutiplicarPolinomios.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        MutiplicarPolinomios.setText("Multiplicar dos polinomios");

        Derivar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Derivar.setText("Derivar polinomio");

        Resultado.setColumns(20);
        Resultado.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(PolinomioA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(PolinomioB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Derivar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MutiplicarPolinomios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MultiplicarCoef, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PolinomioA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PolinomioB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(Derivar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(MutiplicarPolinomios))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(MultiplicarCoef))
                            .addComponent(Sumar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PolinomioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PolinomioAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PolinomioAActionPerformed

    private void PolinomioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PolinomioBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PolinomioBActionPerformed

    private void SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarActionPerformed
       
       
    }//GEN-LAST:event_SumarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OperaPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperaPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperaPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperaPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperaPolinomios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Derivar;
    private javax.swing.JButton MultiplicarCoef;
    private javax.swing.JButton MutiplicarPolinomios;
    private javax.swing.JTextField PolinomioA;
    private javax.swing.JTextField PolinomioB;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton Sumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
