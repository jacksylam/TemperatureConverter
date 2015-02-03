/**
 * Created by Jack on 2/2/2015.
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    double ret = 0;
    String u = null;
    if(args.length != 2) {
      System.out.println("Invalid arguments. Usage <-C/-F> <temperature>");
      System.exit(1);
    }
    if(args[0].equals("-C")){
      double temp = Double.parseDouble(args[1]);
      ret = (temp * 9.0/5.0) + 32;
      u = "F";
    }
    else if(args[0].equals("-F")){
      double temp = Double.parseDouble(args[1]);
      ret = (temp - 32) * 5.0/9.0;
      u = "C";
    }
    else{
      System.out.println("Invalid arguments. Usage <-C/-F> <temperature>");
      System.exit(1);
    }
    System.out.println(ret+" "+u);
  }
}
