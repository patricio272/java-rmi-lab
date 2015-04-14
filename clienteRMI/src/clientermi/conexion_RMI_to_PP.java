package clientermi;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import interfaz.*;

public class conexion_RMI_to_PP {

    private static Registry registry;
    private static interfazServidor servidor;
    private static int port = 1088;
    private static String ip_servPP = "127.0.0.1";

    //PARA EL SERVIDOR DE PARTIDOS POLÍTICOS
    public boolean iniciarRegistry() throws RemoteException {
        try {
            //Se inicia RMIREGISTRY para el registro de objetos
            java.security.AllPermission a = new java.security.AllPermission();
            System.setProperty("java.security.policy", "rmi.policy");
            //startRegistry(direccion del registry,puerto de comunicación);
            startRegistry(ip_servPP, port);
            //Vamos al Registry y miramos el Objeto "Implementacion" para poder usarlo.
            servidor = (interfazServidor) registry.lookup("Implementacion");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void startRegistry(String host, int Puerto) throws RemoteException {
        try {
            registry = LocateRegistry.getRegistry(host, Puerto);
            registry.list();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public interfazServidor getServidor() {
        return servidor;
    }
}
