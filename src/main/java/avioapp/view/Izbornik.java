/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.view;

import avioapp.utility.Utility;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle(Utility.getNazivAplikacije());
        new Vrijeme().start();
    }
    
       private class Vrijeme extends Thread{
       
        SimpleDateFormat df = new SimpleDateFormat(
                Utility.getFormatDatumaIVremena());
        
        @Override
        public void run() {
            
           lblVrijeme.setText(df.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               
            }
            run();
        }
       
   }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        lblVrijeme = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menbIzbornik = new javax.swing.JMenu();
        menPutnici = new javax.swing.JMenuItem();
        menLetovi = new javax.swing.JMenuItem();
        menAvioni = new javax.swing.JMenuItem();
        menBooking = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        menIzlaz = new javax.swing.JMenuItem();
        menLista = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menPomoc = new javax.swing.JMenu();
        menOProgramu = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setRollover(true);

        lblVrijeme.setText("Vrijeme");
        jToolBar1.add(lblVrijeme);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Izbornik.jpg"))); // NOI18N

        menbIzbornik.setText("Izbornik");

        menPutnici.setText("Putnici");
        menPutnici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menPutniciActionPerformed(evt);
            }
        });
        menbIzbornik.add(menPutnici);

        menLetovi.setText("Letovi");
        menLetovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menLetoviActionPerformed(evt);
            }
        });
        menbIzbornik.add(menLetovi);

        menAvioni.setText("Avioni");
        menAvioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAvioniActionPerformed(evt);
            }
        });
        menbIzbornik.add(menAvioni);

        menBooking.setText("Booking");
        menBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menBookingActionPerformed(evt);
            }
        });
        menbIzbornik.add(menBooking);
        menbIzbornik.add(separator);

        menIzlaz.setText("Izlaz");
        menIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menIzlazActionPerformed(evt);
            }
        });
        menbIzbornik.add(menIzlaz);

        jMenuBar1.add(menbIzbornik);

        menLista.setText("Lista");

        jMenuItem1.setText("Putnici");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menLista.add(jMenuItem1);

        jMenuItem2.setText("Letovi");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menLista.add(jMenuItem2);

        jMenuBar1.add(menLista);

        menPomoc.setText("Pomoć");

        menOProgramu.setText("O programu");
        menOProgramu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOProgramuActionPerformed(evt);
            }
        });
        menPomoc.add(menOProgramu);

        jMenuBar1.add(menPomoc);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menPutniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menPutniciActionPerformed
        new FormaPutnici().setVisible(true);
    }//GEN-LAST:event_menPutniciActionPerformed

    private void menLetoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menLetoviActionPerformed
        new FormaLetovi().setVisible(true);
    }//GEN-LAST:event_menLetoviActionPerformed

    private void menIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menIzlazActionPerformed
       dispose();
    }//GEN-LAST:event_menIzlazActionPerformed

    private void menAvioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAvioniActionPerformed
        new FormaAvioni().setVisible(true);
    }//GEN-LAST:event_menAvioniActionPerformed

    private void menBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menBookingActionPerformed
        new FormaBooking().setVisible(true);
    }//GEN-LAST:event_menBookingActionPerformed

    private void menOProgramuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOProgramuActionPerformed
        new OProgramu().setVisible(true);
    }//GEN-LAST:event_menOProgramuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //new FormaListaPutnici().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //new FormaListaLetovi().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblVrijeme;
    private javax.swing.JMenuItem menAvioni;
    private javax.swing.JMenuItem menBooking;
    private javax.swing.JMenuItem menIzlaz;
    private javax.swing.JMenuItem menLetovi;
    private javax.swing.JMenu menLista;
    private javax.swing.JMenuItem menOProgramu;
    private javax.swing.JMenu menPomoc;
    private javax.swing.JMenuItem menPutnici;
    private javax.swing.JMenu menbIzbornik;
    private javax.swing.JPopupMenu.Separator separator;
    // End of variables declaration//GEN-END:variables
}
