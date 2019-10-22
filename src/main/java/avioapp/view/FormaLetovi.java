/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.view;

import avioapp.controller.ObradaAvion;
import avioapp.controller.ObradaLet;
import avioapp.model.Avion;
import avioapp.model.Let;
import avioapp.utility.AvioappException;
import avioapp.utility.Utility;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class FormaLetovi extends ProjektView<Let> {

    private ObradaLet obrada;

    public FormaLetovi() {
        initComponents();
        setLocationRelativeTo(null);
        obrada = new ObradaLet();
        setTitle(Utility.getNazivAplikacije() + " Letovi ");
        btnTrazi.setText("\uD83D\uDD0D");

        dpDatumOdlaska.setDateTimeStrict(Utility.convertToLocalDateTimeViaInstant(new Date()));
        dpDatumDolaska.setDateTimeStrict(Utility.convertToLocalDateTimeViaInstant(new Date()));

        ucitajAvione();
        ucitaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIme = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPolaziste = new javax.swing.JTextField();
        txtOdrediste = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dpDatumOdlaska = new com.github.lgooddatepicker.components.DateTimePicker();
        dpDatumDolaska = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        cmbAvion = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmIzlaz = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Podaci o letu"));

        jLabel1.setText("Šifra leta");

        jLabel2.setText("Datum i vrijeme odlaska");

        jLabel4.setText("Polazište");

        jLabel5.setText("Odredište");

        jLabel6.setText("Datum i vrijeme dolaska");

        jLabel3.setText("Avion");

        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista letova"));

        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dpDatumOdlaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpDatumDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtPolaziste, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOdrediste, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cmbAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTrazi))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAvion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTrazi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpDatumOdlaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpDatumDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPolaziste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOdrediste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jMenu1.setText("Izbornik");

        itmIzlaz.setText("Izlaz");
        itmIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmIzlazActionPerformed(evt);
            }
        });
        jMenu1.add(itmIzlaz);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Let i = new Let();

        spremi(i);
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed

        Let i = lista.getSelectedValue();
        if (i == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite stavku");
            return;
        }

        spremi(i);
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        Let i = lista.getSelectedValue();
        if (i == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite stavku");
            return;

        }

        if (JOptionPane.showConfirmDialog(
                null, //roditelj, bude null
                "Sigurno obrisati let" + " " + i.getImeLeta(),//tijelo dijaloga
                "Brisanje leta", // naslov
                JOptionPane.YES_NO_OPTION, //vrsta opcija
                JOptionPane.QUESTION_MESSAGE) //ikona
                == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            obrada.brisi(i);
        } catch (AvioappException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
            return;
        }

        ucitaj();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjetActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        if (txtUvjet.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(null, "Minimalno dva znaka");
            return;
        }
        DefaultListModel<Let> model = new DefaultListModel<>();
        obrada.getImeLeta(txtUvjet.getText().trim()).forEach((let) -> {
            model.addElement(let);
        });
        lista.setModel(model);
    }//GEN-LAST:event_btnTraziActionPerformed

    private void itmIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmIzlazActionPerformed
        dispose();
    }//GEN-LAST:event_itmIzlazActionPerformed

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        Let i = lista.getSelectedValue();
        if (i == null) {
            return;
        }
        postaviVrijednosti(i);
    }//GEN-LAST:event_listaValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Avion> cmbAvion;
    private com.github.lgooddatepicker.components.DateTimePicker dpDatumDolaska;
    private com.github.lgooddatepicker.components.DateTimePicker dpDatumOdlaska;
    private javax.swing.JMenuItem itmIzlaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Let> lista;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtOdrediste;
    private javax.swing.JTextField txtPolaziste;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    protected void spremi(Let i) {

        i.setPolaziste(txtPolaziste.getText());
        i.setOdrediste(txtOdrediste.getText());
        i.setImeLeta(txtIme.getText());
        i.setAvion((Avion) cmbAvion.getSelectedItem());

        try {
            obrada.spremi(i);
        } catch (AvioappException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
            return;
        }

        ucitaj();

    }

    private boolean kontrolaDatumOdlaska(Let v) {
        if (dpDatumOdlaska.getDateTimeStrict() == null) {
            JOptionPane.showMessageDialog(null, "Obavezan unos datuma odlaska!");
            return false;
        }
        v.setDatumOdlaska(Utility.convertToDateViaSqlTimestamp(dpDatumOdlaska.getDateTimeStrict()));
        return true;
    }

    private boolean kontrolaDatumDolaska(Let v) {
        if (dpDatumDolaska.getDateTimeStrict() == null) {
            JOptionPane.showMessageDialog(null, "Obavezan unos datuma dolaska!");
            return false;
        }
        v.setDatumDolaska(Utility.convertToDateViaSqlTimestamp(dpDatumDolaska.getDateTimeStrict()));
        return true;
    }

    @Override
    protected void ucitaj() {
        {
            DefaultListModel<Let> model = new DefaultListModel<>();
            obrada.getEntiteti().forEach(
                    (let) -> {
                        model.addElement(let);
                    });

            lista.setModel(model);
            lista.repaint();
        }
    }

    @Override
    protected boolean kontrola(Let entitet) {
        return kontrolaDatumDolaska(entitet) && kontrolaDatumOdlaska(entitet);
    }

    @Override
    protected void postaviVrijednosti(Let i) {
        txtIme.setText(i.getImeLeta());
        txtPolaziste.setText(i.getPolaziste());
        txtOdrediste.setText(i.getOdrediste());
        dpDatumOdlaska.setDateTimeStrict(Utility.convertToLocalDateTimeViaInstant(i.getDatumOdlaska()));
        dpDatumDolaska.setDateTimeStrict(Utility.convertToLocalDateTimeViaInstant(i.getDatumDolaska()));
        cmbAvion.setSelectedItem(i.getAvion());
    }

    private void ucitajAvione() {
        DefaultComboBoxModel<Avion> m = new DefaultComboBoxModel<>();
        Avion av = new Avion();
        av.setSifra(0);
        av.setProizvodac("Odaberite avion");

        m.addElement(av);

        new ObradaAvion().getEntiteti().forEach((avion) -> {
            m.addElement(avion);
        });

        cmbAvion.setModel(m);
    }
}
