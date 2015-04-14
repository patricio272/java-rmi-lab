package servidorrmi;

import servidorrmi.Log;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import implementaciones.interfazServidorImpl;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class vistaServidor extends javax.swing.JFrame {
    //Se instancia la clase conexion para poder iniciar una,
    //o eventualmente detenerla

    private conexionRMI conexion = new conexionRMI();
    private conexion_PP_to_RE conexion_pp_to_re = new conexion_PP_to_RE();
    Log log = new Log();
    String mensajelog;

    public vistaServidor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opciones = new javax.swing.JPanel();
        ButtonIniciar = new javax.swing.JButton();
        ButtonDetener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servidor de Registro de Partidos Políticos");
        setResizable(false);

        opciones.setBackground(new java.awt.Color(0, 0, 0));

        ButtonIniciar.setText("Iniciar Server");
        ButtonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarServer(evt);
            }
        });

        ButtonDetener.setText("Detener Server");
        ButtonDetener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detenerServer(evt);
            }
        });

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonIniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(ButtonDetener, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                .addContainerGap())
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonDetener)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detenerServer(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detenerServer
        try {
            //Se verifica que el servidorRE está previamente iniciado
            //antes de abrir el puerto en servidorPP
            System.out.println("Cerrando puerto " + conexion.puerto);
            conexion.detener();
            this.ButtonIniciar.setText("Iniciar Server");
            this.ButtonIniciar.setEnabled(true);
            System.out.println("Puerto " + conexion.puerto + " cerrado");
            mensajelog = log.getDate().concat(";Cerrar puerto;OK;Puerto " + conexion.puerto + " cerrado satisfactoriamente");
            log.makeLog(mensajelog);
        } catch (RemoteException ex) {
            Logger.getLogger(vistaServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_detenerServer

    private void iniciarServer(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarServer
        Registry registro;
        try {
            //Se verifica que el servidorRE está previamente iniciado
            //antes de abrir el puerto en servidorPP
            if (conexion_pp_to_re.iniciarRegistry()) {
                System.out.println("Abriendo puerto " + conexion.puerto);
                registro = conexion.getRegistry();
                //Se instancia el objeto que implementa la interfaz del Servidor
                //Ahora hay que hacerlo remoto, para ello se registra en el Registry
                //con el método "rebind" que lo registra con un nombre para poder ser visto en ese espacio
                //en este caso se le dio el nombre "Implementacion".
                interfazServidorImpl objeto = new interfazServidorImpl();
                registro.rebind("Implementacion", objeto);
                System.out.println("Puerto " + conexion.puerto + " abierto satisfactoriamente");
                mensajelog = log.getDate().concat(";Abrir puerto;OK;Puerto " + conexion.puerto + " abierto satisfactoriamente");
                log.makeLog(mensajelog);
                this.ButtonIniciar.setText("ONLINE");
                this.ButtonIniciar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "El Servidor de Registros Electorales no se encuentra ONLINE", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(vistaServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iniciarServer
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDetener;
    private javax.swing.JButton ButtonIniciar;
    private javax.swing.JPanel opciones;
    // End of variables declaration//GEN-END:variables
}
