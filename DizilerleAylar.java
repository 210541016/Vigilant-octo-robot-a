package dizilerle.aylar;
import java.util.Scanner;
public class DizilerleAylar {
public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);
     String[] aylar={"OCAK","ŞUBAT","MART","NİSAN","MAYIS","HAZİRAN","TEMMUZ","AĞUSTOS","EYLÜL","EKİM","KASIM","ARALIK"};
        System.out.print("Bir ay no giriniz(1ile 12 arasında): " );
     int no=klavye.nextInt();
     if(no>=1 &&no<=12){
         System.out.println("AY:"+aylar[no-1]);
     }else{
         System.out.print("hatalı giriş tekrar deneyiniz:");
         
     }
  
    }
     }
    

