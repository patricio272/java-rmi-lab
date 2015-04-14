package servidorrmi;

import java.text.SimpleDateFormat;
import java.util.*;

import java.io.*;

public class Log {

    public String getDate() {

        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String cadenaFecha = formato.format(fechaActual);
        return cadenaFecha;
    }

    public void makeLog(String mensaje) {

        File f;
        f = new File("LogPP.txt");
        //Escritura
        try {

            FileWriter w = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);

            if (f.exists()) {
                wr.append(mensaje + "\n");
            }

            wr.close();
            bw.close();
        } catch (IOException ex) {
        };
    }
}