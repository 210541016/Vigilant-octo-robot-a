package büyüğü.ve.indeksi.bulma;
import java.util.Scanner;
public class BüyüğüVeIndeksiBulma {
 public static void main(String[] args) {
   double dizi[]=new double[5];
   Scanner klavye=new Scanner(System.in);
     for(int i=0;i<dizi.length;i++){
         System.out.printf("dizi[%d]:",i);
         dizi[i]=klavye.nextDouble();
     }double büyük=dizi[0];
     int indeks=0;
     for(int i=0;i<dizi.length;i++){
         if(dizi[i]>büyük){
             büyük=dizi[i];
             indeks=i;
         }
     }  
     System.out.println("Dizideki en büyük değer:" +büyük);
     System.out.println("En büyük indeks:"+indeks);
    }
    
}
