
package tek.ve.çift.toplamı;
import java.util.Scanner;
public class TekVeÇiftToplamı {

    public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);
      System.out.println("Bir tam sayi giriniz");
      int tamSayi=klavye.nextInt();
         
          int çiftToplam=0;
          int tekToplam=0;
          while(tamSayi!=0){ 
              int basamakDeğeri=tamSayi%10;
          if(basamakDeğeri%2==0){
              çiftToplam=çiftToplam+basamakDeğeri;
             
          }else{
              tekToplam=tekToplam+basamakDeğeri;
             
          }
          tamSayi=tamSayi/10;
     
    }
          if(çiftToplam>=tekToplam){
             System.out.println("sonuç:"+(çiftToplam-tekToplam));
          }else{
              System.out.println("sonuç:"+(tekToplam-çiftToplam));
          }
          
    }
    
}
