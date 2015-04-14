package implementaciones;

import servidorrmi.Log;
import interfaz.interfazServidor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.rmi.*;
import java.rmi.server.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class interfazServidorImpl extends UnicastRemoteObject implements interfazServidor {

    Log log = new Log();
    String mensajelog;

    public interfazServidorImpl() throws RemoteException {
        super();
    }
    /*
     * Valida si un usuario está o no registrado en el Servidor de Registros Electorales
     * Retorna(en caso de error): 
     *   0 = No está registrado
     *  -1 = Rut ya se encuentra ingresado ==> Ya está registrado
     *  -2 = Rut no es numerico ó k
     *  -3 = Nombre ya se encuentra ingresado ==> Ya está registrado
     *  -4 = Comuna no es ni {Heterogeneidad;Adaptabilidad;Escalabilidad;Concurrencia;Transparencia}
     */

    public int validaRE(String rutIngresado, String nombreIngresado, String comunaIngresada) {
        String linea = "";
        int coderror = 0;
        String rutMedio_k = rutIngresado.substring(0, rutIngresado.length() - 1);
        String digito_verif_k = rutIngresado.substring(rutIngresado.length() - 1);
        String rut_con_guion = rutMedio_k.concat("-").concat(digito_verif_k);
        //Se inician las validaciones pertinentes
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("servRE.txt"));
            while ((linea = br1.readLine()) != null) {
                String[] splited = linea.split(",");
                //Validaciones de Rut
                if (rut_con_guion.equals(splited[0])) {
                    coderror = -1;
                    mensajelog = log.getDate().concat(";Valida Rut;FAIL;Rut ya esta registrado en RE");
                    log.makeLog(mensajelog);
                    return coderror;
                }
                //Validaciones de Nombre
                if (nombreIngresado.equals(splited[1])) {
                    coderror = -3;
                    mensajelog = log.getDate().concat(";Valida Nombre;FAIL;Nombre ya esta registrado en RE");
                    log.makeLog(mensajelog);
                    return coderror;
                }
            }
            //Validacion de valor no numérico o k en RUT
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
            for (int i = 0; i < rutMedio_k.length(); i++) {
                if (!(rutMedio_k.charAt(i) == cero) && !(rutMedio_k.charAt(i) == uno) && !(rutMedio_k.charAt(i) == dos) && !(rutMedio_k.charAt(i) == tres) && !(rutMedio_k.charAt(i) == cuatro) && !(rutMedio_k.charAt(i) == cinco) && !(rutMedio_k.charAt(i) == seis) && !(rutMedio_k.charAt(i) == siete) && !(rutMedio_k.charAt(i) == ocho) && !(rutMedio_k.charAt(i) == nueve)) {
                    coderror = -2;
                    mensajelog = log.getDate().concat(";Valida Rut;FAIL;Rut no es numerico o k");
                    log.makeLog(mensajelog);
                    return coderror;
                }
            }
            if (!(digito_verif_k.equals("k")) && !(digito_verif_k.equals("0")) && !(digito_verif_k.equals("1")) && !(digito_verif_k.equals("2")) && !(digito_verif_k.equals("3")) && !(digito_verif_k.equals("4")) && !(digito_verif_k.equals("5")) && !(digito_verif_k.equals("6")) && !(digito_verif_k.equals("7")) && !(digito_verif_k.equals("8")) && !(digito_verif_k.equals("9"))) {
                coderror = -2;
                mensajelog = log.getDate().concat(";Valida Rut;FAIL;Rut no es numerico o k");
                log.makeLog(mensajelog);
                return coderror;
            }
            //Validaciones de Comuna
            if (!(comunaIngresada.equals("Heterogeneidad"))
                    && !(comunaIngresada.equals("Adaptabilidad"))
                    && !(comunaIngresada.equals("Escalabilidad"))
                    && !(comunaIngresada.equals("Concurrencia"))
                    && !(comunaIngresada.equals("Transparencia"))) {
                coderror = -4;
                mensajelog = log.getDate().concat(";Valida Comuna;FAIL;Comuna Inválida");
                log.makeLog(mensajelog);
                return coderror;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        coderror = 0;
        mensajelog = log.getDate().concat(";Valida Usuario RE;OK;Usuario no esta registrado");
        log.makeLog(mensajelog);
        return coderror;
    }

    /*
     *   0 = No está registrado
     *  -1 = Rut ya se encuentra ingresado ==> Ya está registrado
     *  -2 = Rut no es numerico ó k
     */
    public int valida_rut_RE(String rutIngresado) {
        String linea = "";
        int coderror = 0;
        String rutMedio_k = rutIngresado.substring(0, rutIngresado.length() - 1);
        String digito_verif_k = rutIngresado.substring(rutIngresado.length() - 1);
        String rut_con_guion = rutMedio_k.concat("-").concat(digito_verif_k);
        //Se inician las validaciones pertinentes
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("servRE.txt"));
            while ((linea = br1.readLine()) != null) {
                String[] splited = linea.split(",");
                //Validaciones de Rut
                if (rut_con_guion.equals(splited[0])) {
                    coderror = -1;
                    mensajelog = log.getDate().concat(";Valida Rut;FAIL;Rut ya esta registrado en RE");
                    log.makeLog(mensajelog);
                    return coderror;
                }
            }
            //Validacion de valor no numérico o k en RUT
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
            for (int i = 0; i < rutMedio_k.length(); i++) {
                if (!(rutMedio_k.charAt(i) == cero) && !(rutMedio_k.charAt(i) == uno) && !(rutMedio_k.charAt(i) == dos) && !(rutMedio_k.charAt(i) == tres) && !(rutMedio_k.charAt(i) == cuatro) && !(rutMedio_k.charAt(i) == cinco) && !(rutMedio_k.charAt(i) == seis) && !(rutMedio_k.charAt(i) == siete) && !(rutMedio_k.charAt(i) == ocho) && !(rutMedio_k.charAt(i) == nueve)) {
                    coderror = -2;
                    mensajelog = log.getDate().concat(";Valida Rut;FAIL;Rut no es numerico o k");
                    log.makeLog(mensajelog);
                    return coderror;
                }
            }
            if (!(digito_verif_k.equals("k")) && !(digito_verif_k.equals("0")) && !(digito_verif_k.equals("1")) && !(digito_verif_k.equals("2")) && !(digito_verif_k.equals("3")) && !(digito_verif_k.equals("4")) && !(digito_verif_k.equals("5")) && !(digito_verif_k.equals("6")) && !(digito_verif_k.equals("7")) && !(digito_verif_k.equals("8")) && !(digito_verif_k.equals("9"))) {
                coderror = -2;
                mensajelog = log.getDate().concat(";Valida Rut;FAIL;Rut no es numerico o k");
                log.makeLog(mensajelog);
                return coderror;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        coderror = 0;
        mensajelog = log.getDate().concat(";Valida Rut;OK;Rut no está registrado");
        log.makeLog(mensajelog);
        return coderror;
    }

    public int registra_newuser_RE(String rutIngresado, String nombreIngresado, String comunaIngresada) {
        int registroExitoso;
        //Se registra al nuevo usuario
        //Se obtiene la fecha en el formato dd-MM-yyyy
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String digito_verif = rutIngresado.substring(rutIngresado.length() - 1);
        String rutMedio = rutIngresado.substring(0, rutIngresado.length() - 2);
        String rutFinal = rutMedio.concat("-").concat(digito_verif);
        try {
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("servRE.txt", true));
            PrintWriter salida = new PrintWriter(bw1);
            String lineaRegistro = rutFinal.concat(",").concat(nombreIngresado).concat(",").concat(comunaIngresada).concat(",").concat(dateFormat.format(date));
            salida.print(lineaRegistro.concat("\n"));
            salida.close();
            registroExitoso = 1;
            mensajelog = log.getDate().concat(";Registra New User en RE;OK;Usuario Registrado en RE satisfactoriamente");
            log.makeLog(mensajelog);
            return registroExitoso;
        } catch (Exception ex) {
            System.out.println(ex);
            registroExitoso = 0;
            mensajelog = log.getDate().concat(";Registra New User en RE;FAIL;Usuario NO pudo ser Registrado en RE satisfactoriamente");
            log.makeLog(mensajelog);
            return registroExitoso;
        }
    }

    public int escribeFile(String rut, String nombre, String comuna) {
        int realizado;
        try {
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("escribeFile.txt", true));
            PrintWriter salida = new PrintWriter(bw1);
            String lineaRegistro = rut.concat(",").concat(nombre).concat(",").concat(comuna);
            salida.print(lineaRegistro.concat("\n"));
            salida.close();
            realizado = 1;
        } catch (Exception ex) {
            System.out.println(ex);
            realizado = 0;
            return realizado;
        }
        return realizado;
    }

    public int PP_preg_estaRegRE() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
