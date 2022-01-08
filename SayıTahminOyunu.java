
package sayı.tahmin.oyunu;
import java.util.Scanner;
public class SayıTahminOyunu {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int sayi=(int)(Math.random()*101);
        System.out.print("Tutulan sayıyı tahmin ediniz:");
        int tahmin=klavye.nextInt();
        int sayaç=1;
        while(tahmin!=sayi){
            sayaç++;
        if(tahmin<sayi){
                System.out.print("Tahmininiz küçüktür.Tekrar deneyiniz:");
                 tahmin=klavye.nextInt();
            }else{
                 System.out.print("Tahmininiz büyüktür.Tekrar deneyiniz:");
                tahmin=klavye.nextInt();
            }
        }
        if(tahmin==sayi){
               System.out.println("Doğru tahmin .TEBRİKLER " +sayaç+ " .TAHMİNDE BULDUNUZ");}
    }
    
}
