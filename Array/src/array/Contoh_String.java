package array;

/**
 *
 * @author AXZ
 */
public class Contoh_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      String aplikasi_1 = "Twitter";
      String aplikasi_2 = "Facebook";
      String aplikasi_3 = "Shopee";
      
      String Developer_1 = " : Biz Stone, Evan Willliams, dan Jack Dorsey ";
      String Developer_2 = ": Mark Elliot Zuckerberg ";
      String Developer_3 = "   : Chris Feng ";
      
      System.out.println(Developer_1.length()+Developer_2.length()+ Developer_3.length());
      System.out.println(aplikasi_1.concat(Developer_1));
      System.out.println(aplikasi_2.concat(Developer_2));
      System.out.println(aplikasi_3.concat(Developer_3));
      System.out.println(aplikasi_1.compareTo(aplikasi_3));
      
      for(int i=0; i < aplikasi_1.length(); i++)
      {
          char temp = aplikasi_1.charAt(i);
          System.out.print(temp + " | ");
      }
      System.out.println();
      
      String sub = "e";
      System.out.println(aplikasi_3.indexOf(sub));
      System.out.println(aplikasi_3.indexOf(sub, 1));
    }
    
}
