package implementaciones;

import interfaz.interfazServidor;
import servidorrmi.Log;
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
import java.util.Vector;
import servidorrmi.conexion_PP_to_RE;

public class interfazServidorImpl extends UnicastRemoteObject implements interfazServidor {

    private conexion_PP_to_RE conexion_pp_to_re = new conexion_PP_to_RE();
    Log log = new Log();
    String mensajelog;

    public interfazServidorImpl() throws RemoteException {
        super();
    }

    public int llama_a_re() {
        int realizado = 0;
        try {
            if (conexion_pp_to_re.iniciarRegistry()) {
                realizado = conexion_pp_to_re.getServidor().escribeFile("hola", "mundo", "ahora si al 6");
                return realizado;
            } else {
                return -1;
            }
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
        return realizado;
    }

    /*
     * Valida si un usuario está o no registrado en el Servidor de Partidos Políticos
     * Retorna(en caso de error): 
     *   0 = No está registrado en Partidos Políticos
     *  -1 = Rut ya se encuentra ingresado ==> Ya está registrado
     *  -2 = Rut no es numerico ó k
     */
    public int valida_reg_PP(String rutIngresado) {
        String linea = "";
        int coderror = 0;
        String rutMedio_k = rutIngresado.substring(0, rutIngresado.length() - 1);
        String digito_verif_k = rutIngresado.substring(rutIngresado.length() - 1);
        String rut_con_guion = rutMedio_k.concat("-").concat(digito_verif_k);
        //Se inician las validaciones pertinentes
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("servPP.txt"));
            while ((linea = br1.readLine()) != null) {
                String[] splited = linea.split(",");
                //Validaciones de Rut
                if (rut_con_guion.equals(splited[0])) {
                    coderror = -1;
                    mensajelog = log.getDate().concat(";Valida rut PP;FAIL;Rut ya se encuentra ingresado ==> Ya está registrado");
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
                    mensajelog = log.getDate().concat(";Valida rut PP;FAIL;Rut no es numerico o k");
                    log.makeLog(mensajelog);
                    return coderror;
                }
            }
            if (!(digito_verif_k.equals("k")) && !(digito_verif_k.equals("0")) && !(digito_verif_k.equals("1")) && !(digito_verif_k.equals("2")) && !(digito_verif_k.equals("3")) && !(digito_verif_k.equals("4")) && !(digito_verif_k.equals("5")) && !(digito_verif_k.equals("6")) && !(digito_verif_k.equals("7")) && !(digito_verif_k.equals("8")) && !(digito_verif_k.equals("9"))) {
                coderror = -2;
                mensajelog = log.getDate().concat(";Valida rut PP;FAIL;Rut no es numerico o k");
                log.makeLog(mensajelog);
                return coderror;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        //Estando aqui, coderror = 0;
        mensajelog = log.getDate().concat(";Valida Usuario registrado en PP;OK;User no registrado en Partidos Politicos");
        log.makeLog(mensajelog);
        return coderror;
    }

    /* Llama y consulta desde PP a RE, si el usuario está registrado
     * con anterioridad en RE
     *  1 => Está registrado
     *  0 => No está registrado
     * -2 = Rut no es numerico ó k
     * -4 = Comuna no es ni {Heterogeneidad;Adaptabilidad;Escalabilidad;Concurrencia;Transparencia}
     */
    public int PP_preg_estaRegRE(String rutFinal, String nombreFinal, String comunaFinal) {
        int estaRegRE = 0;
        int respuestaFinal = 0;
        try {
            if (conexion_pp_to_re.iniciarRegistry()) {
                estaRegRE = conexion_pp_to_re.getServidor().validaRE(rutFinal, nombreFinal, comunaFinal);
                switch (estaRegRE) {
                    case -1:
                        respuestaFinal = 1;
                        mensajelog = log.getDate().concat(";Valida desde servPP si usuario está registrado en servRE;OK;Usuario registrado en RE");
                        log.makeLog(mensajelog);
                        break;
                    case -3:
                        respuestaFinal = 1;
                        mensajelog = log.getDate().concat(";Valida desde servPP si usuario está registrado en servRE;OK;Usuario registrado en RE");
                        log.makeLog(mensajelog);
                        break;
                    case 0:
                        respuestaFinal = 0;
                        mensajelog = log.getDate().concat(";Valida desde servPP si usuario está registrado en servRE;FAIL;Usuario no está registrado en RE");
                        log.makeLog(mensajelog);
                        break;
                    case -2:
                        respuestaFinal = -2;
                        mensajelog = log.getDate().concat(";Valida desde servPP si usuario está registrado en servRE;FAIL;Rut no es numerico o k");
                        log.makeLog(mensajelog);
                        break;
                    case -4:
                        respuestaFinal = -4;
                        mensajelog = log.getDate().concat(";Valida desde servPP si usuario está registrado en servRE;FAIL;Comuna invalida");
                        log.makeLog(mensajelog);
                        break;
                }
            } else {
                return -1;
            }
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
        return respuestaFinal;
    }

    public int registra_user_existente_RE_en_PP(String rutIngresado, String partidoIngresado) {
        int registroExitoso;
        //Se registra el rut de usuario existente en RE, con su partido politico y fecha
        //Se obtiene la fecha en el formato dd-MM-yyyy
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String rutMedio = rutIngresado.substring(0, rutIngresado.length() - 1);
        String digito_verif = rutIngresado.substring(rutIngresado.length() - 1);
        String rutFinal = rutMedio.concat("-").concat(digito_verif);
        try {
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("servPP.txt", true));
            PrintWriter salida = new PrintWriter(bw1);
            String lineaRegistro = rutFinal.concat(",").concat(partidoIngresado).concat(",").concat(dateFormat.format(date));
            salida.print(lineaRegistro.concat("\n"));
            salida.close();
            registroExitoso = 1;
            mensajelog = log.getDate().concat(";Registrar usuario de RE en un Partido Político;OK;Registro Exitoso");
            log.makeLog(mensajelog);
            return registroExitoso;
        } catch (Exception ex) {
            System.out.println(ex);
            registroExitoso = 0;
            mensajelog = log.getDate().concat(";Registrar usuario de RE en un Partido Político;FAIL;Registro Fallido");
            log.makeLog(mensajelog);
            return registroExitoso;
        }
    }
    /*Método que llama a RE, para que en RE se registre un nuevo usuario
     */

    public int registra_user_en_RE(String rutFinal, String nombreFinal, String comunaFinal) {
        int registradoRE_exitosamente = 0;
        try {
            if (conexion_pp_to_re.iniciarRegistry()) {
                registradoRE_exitosamente = conexion_pp_to_re.getServidor().registra_newuser_RE(rutFinal, nombreFinal, comunaFinal);
                if (registradoRE_exitosamente == 1) {
                    mensajelog = log.getDate().concat(";Registrar usuario desde servPP en servRE;OK;Registro Exitoso");
                    log.makeLog(mensajelog);
                    return 1;
                } else {
                    mensajelog = log.getDate().concat(";Registrar usuario desde servPP en servRE;FAIL;Registro Fallido");
                    log.makeLog(mensajelog);
                    return 0;
                }
            } else {
                mensajelog = log.getDate().concat(";Registrar usuario desde servPP en servRE;FAIL;Fallo en la conexión de ServPP a servRE");
                log.makeLog(mensajelog);
                return -1;
            }
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
        return registradoRE_exitosamente;
    }

    /*
     * 0 => No esta registrado
     * 1 => Si esta registrado
     * -2 => Rut no es numerico ó k
     */
    public int llamar_a_valida_rut_RE(String rutIngresado) {
        int estaRegRE = 0;
        int respuestaFinal = 0;
        try {
            if (conexion_pp_to_re.iniciarRegistry()) {
                estaRegRE = conexion_pp_to_re.getServidor().valida_rut_RE(rutIngresado);
                switch (estaRegRE) {
                    case -2:
                        respuestaFinal = -2;
                        mensajelog = log.getDate().concat(";Llama servPP a servRE para validar rut;FAIL;Rut no es numérico o k");
                        log.makeLog(mensajelog);
                        break;
                    case -1:
                        respuestaFinal = 1;
                        mensajelog = log.getDate().concat(";Llama servPP a servRE para validar rut;OK;Si está registrado");
                        log.makeLog(mensajelog);
                        break;
                    case 0:
                        respuestaFinal = 0;
                        mensajelog = log.getDate().concat(";Llama servPP a servRE para validar rut;FAIL;No está registrado");
                        log.makeLog(mensajelog);
                        break;
                }
            } else {
                mensajelog = log.getDate().concat(";Llama servPP a servRE para validar rut;FAIL;Fallo en la conexión servPP a servRE");
                log.makeLog(mensajelog);
                return -1;
            }
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
        return respuestaFinal;
    }

    /*
     * 0 => No está registrado el usuario ==> No se realizan cambios
     * 1 => Se ha desinscrito satisfactoriamente del partido UDI
     * 2 => Se ha desinscrito satisfactoriamente del partido PPD
     * 3 => Se ha desinscrito satisfactoriamente del partido PC
     */
    public int borraRegistroPP(String rutIngresado) {
        String linea = "";
        Vector listado = new Vector();
        int estaRut = 0;
        int resultadoFinal = 0;
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("servPP.txt"));
            while ((linea = br1.readLine()) != null) {
                String[] splited = linea.split(",");
                if (!splited[0].equals(rutIngresado)) {
                    listado.add(linea);
                } else {
                    estaRut = 1;
                    if (splited[1].equals("UDI")) {
                        resultadoFinal = 1;
                        mensajelog = log.getDate().concat(";Desinscripción de PP;OK;Desinscrito de UDI");
                        log.makeLog(mensajelog);
                    } else if (splited[1].equals("PPD")) {
                        resultadoFinal = 2;
                        mensajelog = log.getDate().concat(";Desinscripción de PP;OK;Desinscrito de PPD");
                        log.makeLog(mensajelog);
                    } else if (splited[1].equals("PC")) {
                        resultadoFinal = 3;
                        mensajelog = log.getDate().concat(";Desinscripción de PP;OK;Desinscrito de PC");
                        log.makeLog(mensajelog);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        if (estaRut == 1) {
            try {
                BufferedWriter bw1 = new BufferedWriter(new FileWriter("servPP.txt"));
                PrintWriter salida = new PrintWriter(bw1);
                salida.print(listado.get(0));
                salida.print("\n");
                salida.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            try {
                BufferedWriter bw2 = new BufferedWriter(new FileWriter("servPP.txt", true));
                PrintWriter salida2 = new PrintWriter(bw2);
                for (int i = 1; i < listado.size(); i++) {
                    salida2.print(listado.get(i));
                    salida2.print("\n");
                }
                salida2.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return resultadoFinal;
    }

    public int escribeFile(String rut, String nombre, String comuna) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int validaRE(String rutIngresado, String nombreIngresado, String comunaIngresada) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int registra_newuser_RE(String rutIngresado, String nombreIngresado, String comunaIngresada) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int valida_rut_RE(String rutIngresado) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
