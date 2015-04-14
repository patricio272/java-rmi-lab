package interfaz;
import java.rmi.*;

public interface interfazServidor extends Remote{
    public int validaRE(String rutIngresado, String nombreIngresado, String comunaIngresada) throws RemoteException;
    public int escribeFile(String rut, String nombre, String comuna) throws RemoteException;
    public int registra_newuser_RE(String rutIngresado, String nombreIngresado, String comunaIngresada) throws RemoteException;
    public int valida_rut_RE(String rutIngresado) throws RemoteException;
}
