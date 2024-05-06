package config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    public static String PROPERTIES_PATH = "src/main/java/config/properties.properties";

    public static String logPath(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_PATH));
            return properties.getProperty("LOG_PATH","src/main/java/config/properties.properties");
        } catch (IOException e) {
            return "src/main/java/config/properties.properties";
        }
    }
    public static String dataUserPath(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_PATH));
            return properties.getProperty("DATA_USER_PATH", "src/main/java/data/userData");
        } catch (IOException e) {
            return "src/main/java/data/userData";
        }
    }
    public static String dataDriverPath(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_PATH));
            return properties.getProperty("DATA_DRIVER_PATH","src/main/java/data/driverData");
        } catch (IOException e) {
            return "src/main/java/data/driverData";
        }
    }
    public static String dataAdminPath(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_PATH));
            return properties.getProperty("DATA_ADMIN_PATH","src/main/java/data/adminData");
        } catch (IOException e) {
            return "src/main/java/data/adminData";
        }
    }
    public static String shipmentNoRegisterUserPath(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_PATH));
            return properties.getProperty("DATA_NO_REGISTER_USER_PATH","src/main/java/data/noRegisterUserShipmentData");
        } catch (IOException e) {
            return "src/main/java/data/noRegisterUserShipmentData";
        }
    }
    public static String shipmentToAssing(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_PATH));
            return properties.getProperty("DATA_SHIPMEN_TO_ASSIGN_PATH","src/main/java/data/shipmentToAssignData");
        } catch (IOException e) {
            return "src/main/java/data/shipmentToAssignData";
        }
    }
//    public static String securityCopyPath(){
//        Properties properties = new Properties();
//        try {
//            properties.load(new FileReader(PROPERTIES_PATH));
//            return properties.getProperty("SEGURITY_COPY_PATH");
//        } catch (IOException e) {
//            return null;
//        }
//    }
    public static String excelPath(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_PATH));
            return properties.getProperty("EXCEL_PATH","src/main/java/excel/shipment.xlsx");
        } catch (IOException e) {
            return "src/main/java/excel/shipment.xlsx";
        }
    }
    public static String pdfPath(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_PATH));
            return properties.getProperty("PDF_PATH","src/main/java/correos/resumen.pdf");
        } catch (IOException e) {
            return "src/main/java/correos/resumen.pdf";
        }
    }

    public static boolean guestMode(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_PATH));
            if (properties.getProperty("GUEST_MODE").equalsIgnoreCase("true")) return true;
        } catch (IOException e) {
            return false;
        }
        return false;
    }
    public static String printPropertiesInfo(){
        String resultado = "",linea = "";
        try {
            FileReader fr = new FileReader(PROPERTIES_PATH);
            BufferedReader br =  new BufferedReader(fr);

            while (linea != null){
                linea = br.readLine();
                if (linea != null) resultado += linea + "\n";
            }
            br.close();
        } catch (IOException e) {
            return "";
        }
        return resultado;
    }
}
