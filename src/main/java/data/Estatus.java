package data;

import config.Config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Estatus {
    public static String enReparto = "";
    public static String entregado = "";
    public static String sinAsignar = "";
    public static String asignado = "";
    public static String oficina = "";
    private static Properties properties = new Properties();

    public static void loadEstatus(){
        try {
            FileReader fr = new FileReader(Config.PROPERTIES_PATH);
            properties.load(fr);
            enReparto = properties.getProperty("EN_REPARTO","En reparto");
            entregado = properties.getProperty("ENTREGADO","Entregado");
            sinAsignar = properties.getProperty("SIN_ASIGNAR","Sin asignar");
            asignado = properties.getProperty("ASIGNADO","Asignado al conductor");
            oficina = properties.getProperty("OFICINA","En oficina de origen");
        } catch (IOException e) {
            entregado = "Entregado";
            enReparto = "En reparto";
            sinAsignar = "Sin asignar";
            asignado = "Asignado";
            oficina = "En oficina de origen";
        }
    }
}
