
public class ConversionTipoDato {
    
    //Casteo de datos numericos primitivos
    double num = 1.67;
    
    int numConvInt = (int) num;
    long numConvLong = (long) num;
    double numD = (double) numConvInt;
    
   //Casteo de String a tipo numerico
    String cantidad = "15";
    String precio = "150,27";
    
    int cantEntero = Integer.parseInt(cantidad);
    double precioDouble = Double.parseDouble(precio);
    
    //Casteo tipo numerico a String
    int edad = 29;
    double estatura = 1.54;
    
    String edadString = String.valueOf(edad);
    String estaturaString = String.valueOf(estatura);
}
