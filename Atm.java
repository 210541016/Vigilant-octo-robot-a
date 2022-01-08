
package atm;
import java.util.Scanner;
public class Atm {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
     System.out.println("Kartınızı takınız");
     System.out.println("Şifrenizi giriniz:");
     int şifre=klavye.nextInt();
     int bakiye =1000;
      boolean şifredogrumu=999<şifre && şifre<10000;
      if(şifredogrumu){
          System.out.println("işleminizi seçiniz");
          System.out.println("1.para çekme");
          System.out.println("2.para yatırma");
          System.out.println("3.bakiye sorgulama");
          System.out.println("4.kart iade");
      }
      
      else{
         System.out.println("hatalı şifre tekrar deneyiniz");
           şifre=klavye.nextInt();
           System.out.println("1.para çekme");
          System.out.println("2.para yatırma");
          System.out.println("3.bakiye sorgulama");
          System.out.println("4.kart iade");
           
      }
      int işlem=klavye.nextInt();
      switch (işlem){
          case 1:
          System.out.println("Bakiyeniz "+bakiye+" tl'dir");
          System.out.println("Çekmek istediğiniz tutarı giriniz:");
          int tutar=klavye.nextInt();
          if(tutar>bakiye){
              System.out.println("Yetersiz bakiye tekrar deneyiniz");
               tutar=klavye.nextInt();
               
          }else{
              bakiye=bakiye-tutar;
              System.out.println("Yeni bakiyeniz:"+bakiye);
              
          } break;
          case 2:
              System.out.println("Yatırmak istediğiniz tutarı giriniz:");
               tutar=klavye.nextInt();
               bakiye=bakiye+tutar;
               System.out.println("Yeni bakiyeniz:"+bakiye);
               break;
                       case 3:
                           System.out.println(" Bakiyeniz: " +bakiye);
                           break;
                       case 4:
                           System.out.println("Kartınızı almayı unutmayınız");
                       default:
                           System.out.println("Hatalı işlem seçilmiştir .Daha sonra tekrar deneyiniz");
      }               
    }
    
}
