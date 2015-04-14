package servidorrmi;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaz.*;

//clase que nos servirá para cominucarnos con SERVIDOR DE PARTIDOS POLÍTICOS
public class conexion_PP_to_RE {
    private static Registry registry;    
    private static interfazServidor servidor;
    private static int port = 1099;
    private static String ip_destino_RE = "127.0.0.1";

    public boolean iniciarRegistry() throws RemoteException{
        try{
            //Se inicia RMIREGISTRY para el registro de objetos
            java.security.AllPermission a = new java.security.AllPermission();
            System.setProperty("java.security.policy", "rmi.policy");
            //startRegistry(direccion del registry,puerto de comunicación);
            startRegistry(ip_destino_RE,port);
            //Vamos al Registry y miramos el Objeto "Implementacion" para poder usarlo.
            servidor = (interfazServidor)registry.lookup("Implementacion");
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    private static void startRegistry(String host, int Puerto) throws RemoteException{
        try{
            registry = LocateRegistry.getRegistry(host, Puerto);
            registry.list();
        }
        catch(RemoteException e){
            e.printStackTrace();
        }
    }

    
    public interfazServidor getServidor(){
        return servidor;
    }
}
