/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.modelo.controller.MarcaController;
import br.com.modelo.negocio.Marca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isequiel_borges
 */
public class InserirMarcas extends javax.swing.JFrame {
    private MarcaTableModel modelo;   
    
    
    /**
     * Creates new form AtualizarMarca
     */
    public InserirMarcas(MarcaTableModel md) {
        initComponents();
        modelo = md;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txMarca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 350));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        jLabel1.setText("Inserir Marca");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 15, 340, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 87, 40, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 140, 50, 15);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(70, 80, 230, 30);
        getContentPane().add(txMarca);
        txMarca.setBounds(70, 130, 230, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Limpar");
        getContentPane().add(jButton1);
        jButton1.setBounds(243, 250, 100, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 250, 80, 23);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 440, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Marca m = new Marca();
        m.setNome(txMarca.getText());
       
        MarcaController mc =  new MarcaController();
        mc.inserir(m);
        
        modelo.addMarca(buscarMarca(m.getNome()));
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

     private Marca buscarMarca(String nome){
         MarcaController mc = new MarcaController();
         return mc.getMarcByNome(nome);
     }
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txMarca;
    // End of variables declaration//GEN-END:variables
}
