package vistas;

import clientermi.conexionRMI;
import clientermi.conexion_RMI_to_PP;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class vistaPrincipal extends javax.swing.JFrame {

    private conexionRMI conexion = new conexionRMI();
    private conexion_RMI_to_PP conexion_rmi_to_pp = new conexion_RMI_to_PP();

    public vistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        valida_submitButton = new javax.swing.JButton();
        rutLabel = new javax.swing.JLabel();
        rutTextfield = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        comunaLabel = new javax.swing.JLabel();
        nombreTextfield = new javax.swing.JTextField();
        comunaTextfield = new javax.swing.JTextField();
        rutverifTextfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        escribeFileFrame = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        escribeFileButton = new javax.swing.JButton();
        jFrame3 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        rutverifTextfield1 = new javax.swing.JTextField();
        nombreLabel1 = new javax.swing.JLabel();
        comunaLabel1 = new javax.swing.JLabel();
        comunaTextfield1 = new javax.swing.JTextField();
        nombreTextfield1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rutLabel1 = new javax.swing.JLabel();
        rutTextfield1 = new javax.swing.JTextField();
        valida_submitButton1 = new javax.swing.JButton();
        partidoTextfield = new javax.swing.JTextField();
        partidoLabel = new javax.swing.JLabel();
        registro_PP_Frame = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        rutLabel5 = new javax.swing.JLabel();
        partidoLabel5 = new javax.swing.JLabel();
        partidoTextfield5 = new javax.swing.JTextField();
        rutTextfield5 = new javax.swing.JTextField();
        guionLabel5 = new javax.swing.JLabel();
        rutverifTextfield5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        desinscribirFrame = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        rutLabel6 = new javax.swing.JLabel();
        rutTextfield6 = new javax.swing.JTextField();
        guionLabel6 = new javax.swing.JLabel();
        rutverifTextfield6 = new javax.swing.JTextField();
        desinscribirButton6 = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        inscribe_REButton = new javax.swing.JButton();
        inscribe_REPPButton = new javax.swing.JButton();
        inscribe_PPButton = new javax.swing.JButton();
        desinscribe_PPButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cargaMasivaButton = new javax.swing.JButton();

        jFrame1.setTitle("Inscribirse en los Registros Electorales");
        jFrame1.setResizable(false);
        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame1WindowClosing(evt);
            }
        });

        valida_submitButton.setText("Registrar Nuevo Usuario");
        valida_submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valida_submitButtonActionPerformed(evt);
            }
        });

        rutLabel.setText("Rut");

        nombreLabel.setText("Nombre");

        comunaLabel.setText("Comuna");

        jLabel1.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valida_submitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(comunaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(rutLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comunaTextfield)
                            .addComponent(nombreTextfield)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rutTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rutverifTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutLabel)
                    .addComponent(rutTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(rutverifTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comunaLabel)
                    .addComponent(comunaTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(valida_submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        escribeFileFrame.setResizable(false);

        escribeFileButton.setText("escribirenFile");
        escribeFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribeFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(escribeFileButton)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(escribeFileButton)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout escribeFileFrameLayout = new javax.swing.GroupLayout(escribeFileFrame.getContentPane());
        escribeFileFrame.getContentPane().setLayout(escribeFileFrameLayout);
        escribeFileFrameLayout.setHorizontalGroup(
            escribeFileFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escribeFileFrameLayout.setVerticalGroup(
            escribeFileFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jFrame3.setTitle("Inscribirse en los Registros Electorales eligiendo un Partido Político");
        jFrame3.setResizable(false);
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosing(evt);
            }
        });

        nombreLabel1.setText("Nombre");

        comunaLabel1.setText("Comuna");

        jLabel2.setText("-");

        rutLabel1.setText("Rut");

        valida_submitButton1.setText("Registrar Nuevo Usuario");
        valida_submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valida_submitButton1ActionPerformed(evt);
            }
        });

        partidoLabel.setText("Partido Político");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valida_submitButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rutLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comunaLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(partidoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(rutTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(rutverifTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comunaTextfield1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(nombreTextfield1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(partidoTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutLabel1)
                    .addComponent(rutTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(rutverifTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel1)
                    .addComponent(nombreTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comunaLabel1)
                    .addComponent(comunaTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partidoLabel)
                    .addComponent(partidoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(valida_submitButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        registro_PP_Frame.setTitle("Registro de Partido Político");
        registro_PP_Frame.setResizable(false);
        registro_PP_Frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                registro_PP_FrameWindowClosing(evt);
            }
        });

        rutLabel5.setText("Rut");

        partidoLabel5.setText("Partido Político");

        guionLabel5.setText("-");

        jButton1.setText("Inscribirse en Partido Político");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rutLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(partidoLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(partidoTextfield5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rutTextfield5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(guionLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rutverifTextfield5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutLabel5)
                    .addComponent(rutTextfield5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guionLabel5)
                    .addComponent(rutverifTextfield5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partidoLabel5)
                    .addComponent(partidoTextfield5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registro_PP_FrameLayout = new javax.swing.GroupLayout(registro_PP_Frame.getContentPane());
        registro_PP_Frame.getContentPane().setLayout(registro_PP_FrameLayout);
        registro_PP_FrameLayout.setHorizontalGroup(
            registro_PP_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registro_PP_FrameLayout.setVerticalGroup(
            registro_PP_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        desinscribirFrame.setTitle("Desinscribirse de un Partido Político");
        desinscribirFrame.setResizable(false);
        desinscribirFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                desinscribirFrameWindowClosing(evt);
            }
        });

        rutLabel6.setText("Rut");

        guionLabel6.setText("-");

        desinscribirButton6.setText("Desinscribir");
        desinscribirButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desinscribirButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(rutLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(desinscribirButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(rutTextfield6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guionLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rutverifTextfield6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutLabel6)
                    .addComponent(rutTextfield6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guionLabel6)
                    .addComponent(rutverifTextfield6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(desinscribirButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout desinscribirFrameLayout = new javax.swing.GroupLayout(desinscribirFrame.getContentPane());
        desinscribirFrame.getContentPane().setLayout(desinscribirFrameLayout);
        desinscribirFrameLayout.setHorizontalGroup(
            desinscribirFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desinscribirFrameLayout.setVerticalGroup(
            desinscribirFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");
        setResizable(false);

        inscribe_REButton.setText("Inscribirse en los Registros Electorales");
        inscribe_REButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribe_REButtonActionPerformed(evt);
            }
        });

        inscribe_REPPButton.setText("Inscribirse en los Registros Electorales eligiendo un Partido Político");
        inscribe_REPPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribe_REPPButtonActionPerformed(evt);
            }
        });

        inscribe_PPButton.setText("Inscribirse en un Partido Político");
        inscribe_PPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribe_PPButtonActionPerformed(evt);
            }
        });

        desinscribe_PPButton.setText("Desinscribirse de un Partido Político");
        desinscribe_PPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desinscribe_PPButtonActionPerformed(evt);
            }
        });

        ImageIcon icon = new ImageIcon("bandera.png");
        jLabel3.setIcon(icon);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("República de los Sistemas Distribuidos");

        cargaMasivaButton.setText("Carga Masiva");
        cargaMasivaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaMasivaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(cargaMasivaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inscribe_REButton, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(inscribe_PPButton, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(inscribe_REPPButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(desinscribe_PPButton, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(inscribe_REButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inscribe_REPPButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inscribe_PPButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desinscribe_PPButton)
                .addGap(28, 28, 28)
                .addComponent(cargaMasivaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valida_submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valida_submitButtonActionPerformed
        String rutFinal = this.rutTextfield.getText().concat(this.rutverifTextfield.getText());
        String nombreFinal = this.nombreTextfield.getText();
        String comunaFinal = this.comunaTextfield.getText();
        //##############################################################
        System.out.println(rutFinal);
        System.out.println(nombreFinal);
        System.out.println(comunaFinal);
        //##############################################################
        if ((this.rutTextfield.getText().isEmpty()) || (this.rutverifTextfield.getText().isEmpty()) || (this.nombreTextfield.getText().isEmpty()) || (this.comunaTextfield.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Uno o más campos están vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int registro_valido;
            try {
                //Intentamos conectarnos con el servidor
                //Si hay exito empezamos a consumir servicios
                if (conexion.iniciarRegistry()) {
                    registro_valido = conexion.getServidor().validaRE(rutFinal, nombreFinal, comunaFinal);
                    switch (registro_valido) {
                        case -1:
                            JOptionPane.showMessageDialog(this, "Rut ya se encuentra ingresado", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        case -2:
                            JOptionPane.showMessageDialog(this, "Rut no es numérico o k", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        case -3:
                            JOptionPane.showMessageDialog(this, "Nombre ya se encuentra ingresado", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        case -4:
                            JOptionPane.showMessageDialog(this, "Comuna inválida", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        case 0:
                            int registroExitoso;
                            registroExitoso = conexion.getServidor().registra_newuser_RE(rutFinal, nombreFinal, comunaFinal);
                            if (registroExitoso == 1) {
                                JOptionPane.showMessageDialog(this, "Registro de nuevo usuario realizado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(this, "Registro de nuevo usuario fallido", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo Conectar", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (RemoteException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_valida_submitButtonActionPerformed

    private void inscribe_REButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribe_REButtonActionPerformed
        jFrame1.pack();
        jFrame1.setVisible(true);
    }//GEN-LAST:event_inscribe_REButtonActionPerformed

    private void jFrame1WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1WindowClosing
        this.rutTextfield.setText("");
        this.rutverifTextfield.setText("");
        this.nombreTextfield.setText("");
        this.comunaTextfield.setText("");
    }//GEN-LAST:event_jFrame1WindowClosing

    private void escribeFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribeFileButtonActionPerformed
        int se_realizo_exitosamente;
        try {
            if (conexion_rmi_to_pp.iniciarRegistry()) {
                se_realizo_exitosamente = conexion_rmi_to_pp.getServidor().llama_a_re();
                if (se_realizo_exitosamente == 1) {
                    JOptionPane.showMessageDialog(this, "LO LOGRASTE, se ha escrito :)", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "NO se logro escribir :(", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo Conectar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_escribeFileButtonActionPerformed

    private void valida_submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valida_submitButton1ActionPerformed
        int esta_reg_enPP;
        int estaRegRE;
        int regPP_logrado;
        int regRE_realizadoOK;
        int regPP_logrado_beta;
        String rutFinal = this.rutTextfield1.getText().concat(this.rutverifTextfield1.getText());
        String nombreFinal = this.nombreTextfield1.getText();
        String comunaFinal = this.comunaTextfield1.getText();
        String partidoFinal = this.partidoTextfield.getText();
        if ((this.rutTextfield1.getText().isEmpty())
                || (this.rutverifTextfield1.getText().isEmpty())
                || (this.nombreTextfield1.getText().isEmpty())
                || (this.comunaTextfield1.getText().isEmpty())
                || (this.partidoTextfield.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Uno o más campos están vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!(partidoFinal.equals("UDI")) && !(partidoFinal.equals("PPD")) && !(partidoFinal.equals("PC"))) {
                JOptionPane.showMessageDialog(this, "Partido Político , No Válido", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    if (conexion_rmi_to_pp.iniciarRegistry()) {
                        esta_reg_enPP = conexion_rmi_to_pp.getServidor().valida_reg_PP(rutFinal);
                        if (esta_reg_enPP == 0) {
                            estaRegRE = conexion_rmi_to_pp.getServidor().PP_preg_estaRegRE(rutFinal, nombreFinal, comunaFinal);
                            if (estaRegRE == 1) {
                                //Registra en PP, en servPP
                                regPP_logrado = conexion_rmi_to_pp.getServidor().registra_user_existente_RE_en_PP(rutFinal, partidoFinal);
                                if (regPP_logrado == 1) {
                                    JOptionPane.showMessageDialog(this, "Registrado en Partido Político \"" + partidoFinal + "\" satisfactoriamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(this, "No se logro registrar su Partido Político: " + partidoFinal, "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                if (estaRegRE == -2) {
                                    JOptionPane.showMessageDialog(this, "Rut no es numérico o k", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    if (estaRegRE == -4) {
                                        JOptionPane.showMessageDialog(this, "Comuna inválida", "Error", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        if (estaRegRE == 0) {
                                            //Registra en RE en servRE y posteriormente ---> lo registra en servPP
                                            regRE_realizadoOK = conexion_rmi_to_pp.getServidor().registra_user_en_RE(rutFinal, nombreFinal, comunaFinal);
                                            if (regRE_realizadoOK == 1) {
                                                //Registra en PP, en servPP
                                                regPP_logrado_beta = conexion_rmi_to_pp.getServidor().registra_user_existente_RE_en_PP(rutFinal, partidoFinal);
                                                if (regPP_logrado_beta == 1) {
                                                    JOptionPane.showMessageDialog(this, "Registrado en Partido Político \"" + partidoFinal + "\" satisfactoriamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                                                } else {
                                                    JOptionPane.showMessageDialog(this, "No se logro registrar su Partido Político: " + partidoFinal, "Error", JOptionPane.ERROR_MESSAGE);
                                                }
                                            } else {
                                                if (regRE_realizadoOK == -1) {
                                                    JOptionPane.showMessageDialog(this, "Servidor de Registros Electorales está OFFLINE", "Error", JOptionPane.ERROR_MESSAGE);
                                                } else {
                                                    JOptionPane.showMessageDialog(this, "No se logro registrar su Partido Político: " + partidoFinal, "Error", JOptionPane.ERROR_MESSAGE);
                                                }
                                            }
                                        } else {
                                            if (estaRegRE == -1) {
                                                JOptionPane.showMessageDialog(this, "Servidor de Registros Electorales está OFFLINE", "Error", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                    }
                                }
                            }

                        } else {
                            if (esta_reg_enPP == -2) {
                                JOptionPane.showMessageDialog(this, "Rut no es numérico o k", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                if (esta_reg_enPP == -1) {
                                    JOptionPane.showMessageDialog(this, "Usuario ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Servidor de Partidos Políticos está OFFLINE", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (RemoteException ex) {
                    System.out.println(ex);
                }
            }
        }
    }//GEN-LAST:event_valida_submitButton1ActionPerformed

    private void jFrame3WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosing
        this.rutTextfield1.setText("");
        this.rutverifTextfield1.setText("");
        this.nombreTextfield1.setText("");
        this.comunaTextfield1.setText("");
        this.partidoTextfield.setText("");
    }//GEN-LAST:event_jFrame3WindowClosing

    private void inscribe_REPPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribe_REPPButtonActionPerformed
        jFrame3.pack();
        jFrame3.setVisible(true);
    }//GEN-LAST:event_inscribe_REPPButtonActionPerformed

    private void inscribe_PPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribe_PPButtonActionPerformed
        registro_PP_Frame.pack();
        registro_PP_Frame.setVisible(true);
    }//GEN-LAST:event_inscribe_PPButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String rutFinal = this.rutTextfield5.getText().concat(this.rutverifTextfield5.getText());
        String partidoFinal = this.partidoTextfield5.getText();
        String rut_cuerpo = this.rutTextfield5.getText();
        String rut_digito_verif = this.rutverifTextfield5.getText();
        int esta_reg_enPP;
        int esta_RegRE;
        int regPP_logrado;
        if ((rut_cuerpo.isEmpty()) || (rut_digito_verif.isEmpty()) || (partidoFinal.isEmpty())) {
            JOptionPane.showMessageDialog(this, "Uno o más campos están vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!(partidoFinal.equals("UDI")) && !(partidoFinal.equals("PPD")) && !(partidoFinal.equals("PC"))) {
                JOptionPane.showMessageDialog(this, "Partido Político , No Válido", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    if (conexion_rmi_to_pp.iniciarRegistry()) {
                        esta_reg_enPP = conexion_rmi_to_pp.getServidor().valida_reg_PP(rutFinal);
                        if (esta_reg_enPP == 0) {
                            esta_RegRE = conexion_rmi_to_pp.getServidor().llamar_a_valida_rut_RE(rutFinal);
                            switch (esta_RegRE) {
                                case -1:
                                    JOptionPane.showMessageDialog(this, "Servidor de Registros Electorales está OFFLINE", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                                case -2:
                                    JOptionPane.showMessageDialog(this, "Rut no es numérico o k", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                                case 0:
                                    JOptionPane.showMessageDialog(this, "Usted no se encuentra registrado en el Registro Electoral", "Solicitud Denegada", JOptionPane.ERROR_MESSAGE);
                                    break;
                                case 1:
                                    //Registra en PP, en servPP
                                    regPP_logrado = conexion_rmi_to_pp.getServidor().registra_user_existente_RE_en_PP(rutFinal, partidoFinal);
                                    if (regPP_logrado == 1) {
                                        JOptionPane.showMessageDialog(this, "Registrado en Partido Político \"" + partidoFinal + "\" satisfactoriamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(this, "No se logro registrar su Partido Político: " + partidoFinal, "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                    break;
                            }
                        } else {
                            if (esta_reg_enPP == -2) {
                                JOptionPane.showMessageDialog(this, "Rut no es numérico o k", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                if (esta_reg_enPP == -1) {
                                    JOptionPane.showMessageDialog(this, "Usuario ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Servidor de Partidos Políticos está OFFLINE", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (RemoteException ex) {
                    System.out.println(ex);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registro_PP_FrameWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_registro_PP_FrameWindowClosing
        this.rutTextfield5.setText("");
        this.rutverifTextfield5.setText("");
        this.partidoTextfield5.setText("");
    }//GEN-LAST:event_registro_PP_FrameWindowClosing

    private void desinscribirFrameWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_desinscribirFrameWindowClosing
        this.rutTextfield6.setText("");
        this.rutverifTextfield6.setText("");
    }//GEN-LAST:event_desinscribirFrameWindowClosing

    private void desinscribirButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desinscribirButton6ActionPerformed
        String rutCuerpo = this.rutTextfield6.getText();
        String rutVerif = this.rutverifTextfield6.getText();
        String rutFinal = rutCuerpo.concat("-").concat(rutVerif);
        int validaRut;
        int borradoExitoso;
        if ((rutCuerpo.isEmpty()) || (rutVerif.isEmpty())) {
            JOptionPane.showMessageDialog(this, "Uno o más campos están vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            validaRut = validar_rut_desinscribir(rutCuerpo, rutVerif);
            if (validaRut == -2) {
                JOptionPane.showMessageDialog(this, "Rut no es numérico o k", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (validaRut == 0) {
                try {
                    if (conexion_rmi_to_pp.iniciarRegistry()) {
                        borradoExitoso = conexion_rmi_to_pp.getServidor().borraRegistroPP(rutFinal);
                        switch (borradoExitoso) {
                            case 0:
                                JOptionPane.showMessageDialog(this, "Usuario no registrado en Partidos Políticos", "Error", JOptionPane.ERROR_MESSAGE);
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(this, "Se ha desinscrito satisfactoriamente del partido \"UDI\"", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(this, "Se ha desinscrito satisfactoriamente del partido \"PPD\"", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(this, "Se ha desinscrito satisfactoriamente del partido \"PC\"", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Servidor de Partidos Políticos está OFFLINE", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (RemoteException ex) {
                    System.out.println(ex);
                }
            }
        }
    }//GEN-LAST:event_desinscribirButton6ActionPerformed

    public int validar_rut_desinscribir(String rutCuerpo, String rutVerif) {
        int coderror = 0;//SI es 0 ==> Todo OK!
        int k = 107;
        int cero = 48;
        int uno = 49;
        int dos = 50;
        int tres = 51;
        int cuatro = 52;
        int cinco = 53;
        int seis = 54;
        int siete = 55;
        int ocho = 56;
        int nueve = 57;
        for (int i = 0; i < rutCuerpo.length(); i++) {
            if (!(rutCuerpo.charAt(i) == cero) && !(rutCuerpo.charAt(i) == uno) && !(rutCuerpo.charAt(i) == dos) && !(rutCuerpo.charAt(i) == tres) && !(rutCuerpo.charAt(i) == cuatro) && !(rutCuerpo.charAt(i) == cinco) && !(rutCuerpo.charAt(i) == seis) && !(rutCuerpo.charAt(i) == siete) && !(rutCuerpo.charAt(i) == ocho) && !(rutCuerpo.charAt(i) == nueve)) {
                coderror = -2;
                return coderror;
            }
        }
        if (!(rutVerif.equals("k")) && !(rutVerif.equals("0")) && !(rutVerif.equals("1")) && !(rutVerif.equals("2")) && !(rutVerif.equals("3")) && !(rutVerif.equals("4")) && !(rutVerif.equals("5")) && !(rutVerif.equals("6")) && !(rutVerif.equals("7")) && !(rutVerif.equals("8")) && !(rutVerif.equals("9"))) {
            coderror = -2;
            return coderror;
        }
        return coderror;
    }

    private void desinscribe_PPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desinscribe_PPButtonActionPerformed
        desinscribirFrame.pack();
        desinscribirFrame.setVisible(true);
    }//GEN-LAST:event_desinscribe_PPButtonActionPerformed

    private void cargaMasivaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaMasivaButtonActionPerformed
        int returnval;
        String linea = "";
        returnval = jFileChooser1.showOpenDialog(desinscribirFrame);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            DataInputStream dis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                dis = new DataInputStream(bis);
                while ((linea = dis.readLine()) != null) {
                    String[] splited = linea.split(",");
                    if (splited[0].equals("regRE")) {//Si es la opción (1)
                        String rut_file = splited[1];
                        String nombre_file = splited[2];
                        String comuna_file = splited[3];
                        String rutCuerpo = rut_file.substring(0, rut_file.length() - 2);
                        String rutVerifCod = rut_file.substring(rut_file.length() - 1);

                        String rutFinal = rutCuerpo.concat(rutVerifCod);
                        String nombreFinal = nombre_file;
                        String comunaFinal = comuna_file;
                        //######################################################
//                        System.out.println(rutFinal);
//                        System.out.println(nombreFinal);
//                        System.out.println(comunaFinal);
                        //######################################################

                        int registro_valido;
                        try {
                            if (conexion.iniciarRegistry()) {
                                registro_valido = conexion.getServidor().validaRE(rutFinal, nombreFinal, comunaFinal);
                                switch (registro_valido) {
                                    case -1:
                                        System.out.println("Rut ya se encuentra ingresado");
                                        break;
                                    case -2:
                                        System.out.println("Rut no es numérico o k");
                                        break;
                                    case -3:
                                        System.out.println("Nombre ya se encuentra ingresado");
                                        break;
                                    case -4:
                                        System.out.println("Comuna Inválida");
                                        break;
                                    case 0:
                                        int registroExitoso;
                                        registroExitoso = conexion.getServidor().registra_newuser_RE(rutFinal, nombreFinal, comunaFinal);
                                        if (registroExitoso == 1) {
                                            System.out.println("Registro de nuevo usuario realizado exitosamente");
                                        } else {
                                            System.out.println("Registro de nuevo usuario fallido");
                                        }
                                        break;
                                }
                            } else {
                                System.out.println("No se pudo Conectar");
                            }

                        } catch (RemoteException ex) {
                            System.out.println(ex);
                        }

                    } else if (splited[0].equals("regREPP")) {//Si es la opción (2)



                        int esta_reg_enPP;
                        int estaRegRE;
                        int regPP_logrado;
                        int regRE_realizadoOK;
                        int regPP_logrado_beta;

                        String rut_file = splited[1];
                        String nombre_file = splited[2];
                        String comuna_file = splited[3];
                        String partido_file = splited[4];
                        String rutCuerpo = rut_file.substring(0, rut_file.length() - 2);
                        String rutVerifCod = rut_file.substring(rut_file.length() - 1);

                        String rutFinal = rutCuerpo.concat(rutVerifCod);
                        String nombreFinal = nombre_file;
                        String comunaFinal = comuna_file;
                        String partidoFinal = partido_file;
                        //######################################################
//                        System.out.println(rutFinal);
//                        System.out.println(nombreFinal);
//                        System.out.println(comunaFinal);
//                        System.out.println(partidoFinal);
                        //######################################################
                        if (!(partidoFinal.equals("UDI")) && !(partidoFinal.equals("PPD")) && !(partidoFinal.equals("PC"))) {
                            System.out.println("Partido Político , No Válido");
                        } else {
                            try {
                                if (conexion_rmi_to_pp.iniciarRegistry()) {
                                    esta_reg_enPP = conexion_rmi_to_pp.getServidor().valida_reg_PP(rutFinal);
                                    if (esta_reg_enPP == 0) {
                                        estaRegRE = conexion_rmi_to_pp.getServidor().PP_preg_estaRegRE(rutFinal, nombreFinal, comunaFinal);
                                        if (estaRegRE == 1) {
                                            //Registra en PP, en servPP
                                            regPP_logrado = conexion_rmi_to_pp.getServidor().registra_user_existente_RE_en_PP(rutFinal, partidoFinal);
                                            if (regPP_logrado == 1) {
                                                System.out.println("Registrado en Partido Político \"" + partidoFinal + "\" satisfactoriamente");
                                            } else {
                                                System.out.println("No se logro registrar su Partido Político: " + partidoFinal);
                                            }
                                        } else {
                                            if (estaRegRE == -2) {
                                                System.out.println("Rut no es numérico o k");
                                            } else {
                                                if (estaRegRE == -4) {
                                                    System.out.println("Comuna inválida");
                                                } else {
                                                    if (estaRegRE == 0) {
                                                        //Registra en RE en servRE y posteriormente ---> lo registra en servPP
                                                        regRE_realizadoOK = conexion_rmi_to_pp.getServidor().registra_user_en_RE(rutFinal, nombreFinal, comunaFinal);
                                                        if (regRE_realizadoOK == 1) {
                                                            //Registra en PP, en servPP
                                                            regPP_logrado_beta = conexion_rmi_to_pp.getServidor().registra_user_existente_RE_en_PP(rutFinal, partidoFinal);
                                                            if (regPP_logrado_beta == 1) {
                                                                System.out.println("Registrado en Partido Político \"" + partidoFinal + "\" satisfactoriamente");
                                                            } else {
                                                                System.out.println("No se logro registrar su Partido Político: " + partidoFinal);
                                                            }
                                                        } else {
                                                            if (regRE_realizadoOK == -1) {
                                                                System.out.println("Servidor de Registros Electorales está OFFLINE");
                                                            } else {
                                                                System.out.println("No se logro registrar su Partido Político: " + partidoFinal);
                                                            }
                                                        }
                                                    } else {
                                                        if (estaRegRE == -1) {
                                                            System.out.println("Servidor de Registros Electorales está OFFLINE");
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                    } else {
                                        if (esta_reg_enPP == -2) {
                                            System.out.println("Rut no es numérico o k");
                                        } else {
                                            if (esta_reg_enPP == -1) {
                                                System.out.println("Usuario ya se encuentra registrado");
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("Servidor de Partidos Políticos está OFFLINE");
                                }

                            } catch (RemoteException ex) {
                                System.out.println(ex);
                            }
                        }



                    } else if (splited[0].equals("regPP")) {//Si es la opción (3)

                        String rut_file = splited[1];
                        String partido_file = splited[2];
                        String rutCuerpo = rut_file.substring(0, rut_file.length() - 2);
                        String rutVerifCod = rut_file.substring(rut_file.length() - 1);

                        String rutFinal = rutCuerpo.concat(rutVerifCod);
                        String partidoFinal = partido_file;
                        String rut_cuerpo = rutCuerpo;
                        String rut_digito_verif = rutVerifCod;
                        int esta_reg_enPP;
                        int esta_RegRE;
                        int regPP_logrado;
                        //######################################################
//                        System.out.println(rutFinal);
//                        System.out.println(partidoFinal);
                        //######################################################
                        if (!(partidoFinal.equals("UDI")) && !(partidoFinal.equals("PPD")) && !(partidoFinal.equals("PC"))) {
                            System.out.println("Partido Político , No Válido");
                        } else {
                            try {
                                if (conexion_rmi_to_pp.iniciarRegistry()) {
                                    esta_reg_enPP = conexion_rmi_to_pp.getServidor().valida_reg_PP(rutFinal);
                                    if (esta_reg_enPP == 0) {
                                        esta_RegRE = conexion_rmi_to_pp.getServidor().llamar_a_valida_rut_RE(rutFinal);
                                        switch (esta_RegRE) {
                                            case -1:
                                                System.out.println("Servidor de Registros Electorales está OFFLINE");
                                                break;
                                            case -2:
                                                System.out.println("Rut no es numérico o k");
                                                break;
                                            case 0:
                                                System.out.println("Usted no se encuentra registrado en el Registro Electoral");
                                                break;
                                            case 1:
                                                //Registra en PP, en servPP
                                                regPP_logrado = conexion_rmi_to_pp.getServidor().registra_user_existente_RE_en_PP(rutFinal, partidoFinal);
                                                if (regPP_logrado == 1) {
                                                    System.out.println("Registrado en Partido Político \"" + partidoFinal + "\" satisfactoriamente");
                                                } else {
                                                    System.out.println("No se logro registrar su Partido Político: " + partidoFinal);
                                                }
                                                break;
                                        }
                                    } else {
                                        if (esta_reg_enPP == -2) {
                                            System.out.println("Rut no es numérico o k");
                                        } else {
                                            if (esta_reg_enPP == -1) {
                                                System.out.println("Usuario ya se encuentra registrado");
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("Servidor de Partidos Políticos está OFFLINE");
                                }
                            } catch (RemoteException ex) {
                                System.out.println(ex);
                            }
                        }



                    } else if (splited[0].equals("desPP")) {//Si es la opción (4)
                        String rut_file = splited[1];
                        String rut_Cuerpo = rut_file.substring(0, rut_file.length() - 2);
                        String rutVerifCod = rut_file.substring(rut_file.length() - 1);


                        String rutCuerpo = rut_Cuerpo;
                        String rutVerif = rutVerifCod;
                        String rutFinal = rutCuerpo.concat("-").concat(rutVerif);
                        int validaRut;
                        int borradoExitoso;
                        //######################################################
//                        System.out.println(rutFinal);
                        //######################################################
                        validaRut = validar_rut_desinscribir(rutCuerpo, rutVerif);
                        if (validaRut == -2) {
                            System.out.println("Rut no es numérico o k");
                        } else if (validaRut == 0) {
                            try {
                                if (conexion_rmi_to_pp.iniciarRegistry()) {
                                    borradoExitoso = conexion_rmi_to_pp.getServidor().borraRegistroPP(rutFinal);
                                    switch (borradoExitoso) {
                                        case 0:
                                            System.out.println("Usuario no registrado en Partidos Políticos");
                                            break;
                                        case 1:
                                            System.out.println("Se ha desinscrito satisfactoriamente del partido \"UDI\"");
                                            break;
                                        case 2:
                                            System.out.println("Se ha desinscrito satisfactoriamente del partido \"PPD\"");
                                            break;
                                        case 3:
                                            System.out.println("Se ha desinscrito satisfactoriamente del partido \"PC\"");
                                            break;
                                    }
                                } else {
                                    System.out.println("Servidor de Partidos Políticos está OFFLINE");
                                }
                            } catch (RemoteException ex) {
                                System.out.println(ex);
                            }
                        }

                    }
                }
                fis.close();
                bis.close();
                dis.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_cargaMasivaButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargaMasivaButton;
    private javax.swing.JLabel comunaLabel;
    private javax.swing.JLabel comunaLabel1;
    private javax.swing.JTextField comunaTextfield;
    private javax.swing.JTextField comunaTextfield1;
    private javax.swing.JButton desinscribe_PPButton;
    private javax.swing.JButton desinscribirButton6;
    private javax.swing.JFrame desinscribirFrame;
    private javax.swing.JButton escribeFileButton;
    private javax.swing.JFrame escribeFileFrame;
    private javax.swing.JLabel guionLabel5;
    private javax.swing.JLabel guionLabel6;
    private javax.swing.JButton inscribe_PPButton;
    private javax.swing.JButton inscribe_REButton;
    private javax.swing.JButton inscribe_REPPButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreLabel1;
    private javax.swing.JTextField nombreTextfield;
    private javax.swing.JTextField nombreTextfield1;
    private javax.swing.JLabel partidoLabel;
    private javax.swing.JLabel partidoLabel5;
    private javax.swing.JTextField partidoTextfield;
    private javax.swing.JTextField partidoTextfield5;
    private javax.swing.JFrame registro_PP_Frame;
    private javax.swing.JLabel rutLabel;
    private javax.swing.JLabel rutLabel1;
    private javax.swing.JLabel rutLabel5;
    private javax.swing.JLabel rutLabel6;
    private javax.swing.JTextField rutTextfield;
    private javax.swing.JTextField rutTextfield1;
    private javax.swing.JTextField rutTextfield5;
    private javax.swing.JTextField rutTextfield6;
    private javax.swing.JTextField rutverifTextfield;
    private javax.swing.JTextField rutverifTextfield1;
    private javax.swing.JTextField rutverifTextfield5;
    private javax.swing.JTextField rutverifTextfield6;
    private javax.swing.JButton valida_submitButton;
    private javax.swing.JButton valida_submitButton1;
    // End of variables declaration//GEN-END:variables
}
