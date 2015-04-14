package interfaz;
import java.rmi.*;

public interface interfazServidor extends Remote{
    public int escribeFile(String rut, String nombre, String comuna) throws RemoteException;
    public int llama_a_re() throws RemoteException;
    public int valida_reg_PP(String rutIngresado) throws RemoteException;
    public int PP_preg_estaRegRE(String rutFinal, String nombreFinal, String comunaFinal) throws RemoteException;
    public int validaRE(String rutIngresado, String nombreIngresado, String comunaIngresada) throws RemoteException;
    public int registra_user_existente_RE_en_PP(String rutIngresado, String partidoIngresado) throws RemoteException;
    public int registra_user_en_RE(String rutFinal, String nombreFinal, String comunaFinal) throws RemoteException;
    public int registra_newuser_RE(String rutIngresado, String nombreIngresado, String comunaIngresada) throws RemoteException;
    public int valida_rut_RE(String rutIngresado) throws RemoteException;
    public int llamar_a_valida_rut_RE(String rutIngresado) throws RemoteException;
    public int borraRegistroPP(String rutIngresado) throws RemoteException;
}
