
package string.karşılaştırma;
import java.util.Scanner;
public class StringKarşılaştırma {

    public static void main(String[] args) {
      Scanner klavye=new Scanner(System.in);
      System.out.println("Bir şehir giriniz:");
      String sehir1=klavye.nextLine();
      System.out.println("İkinci bir şehir giriniz:");
      String sehir2=klavye.nextLine();
      if(sehir1.compareTo(sehir2)<0){
          System.out.println("Şehirlerin alfabetik sıralaması:"+sehir1+ ","+sehir2);
      } else if (sehir1.compareTo(sehir2)==0){
           System.out.println("Aynı şehri yazdınız:"+sehir1+ ","+sehir2);
      }else{
           System.out.println("Şehirlerin alfabetik sıralaması:"+sehir2+ ","+sehir1);
      }
    }
    
}
