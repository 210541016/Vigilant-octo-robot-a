
package uçak.bileti;
import java.util.Scanner;
public class UçakBileti {

    public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
       int yaş, km ,tip;
       double ücret;
       System.out.println("km değerini giriniz:");
       km=klavye.nextInt();
       System.out.println("Yaşanızı giriniz");
       yaş=klavye.nextInt();
       System.out.println("Yolculuk tipinizi giriniz:(1-tek gidiş,2-gidiş dönüş");
       tip=klavye.nextInt();
       if(km>0 && yaş>0 && (tip==1 || tip==2)){
           System.out.println("Değerleri doğru girdiniz");
       } else{
           System.out.println("Değerleri istenilen koşullarda giriniz");
       }
       if((yaş<=12 || yaş>=65) && tip==2){
           ücret=km*(0.7*0.105);
           System.out.println("Ödeyeceğiniz ücret:"+ücret);
       } else if((yaş<=12 || yaş>=65) && tip==1){
           ücret=km*(0.105*0.5);
            System.out.println("Ödeyeceğiniz ücret:"+ücret);
       }else if((12<=yaş || yaş>=24) &&  tip==2){
           ücret=km*(0.105*0.3);
           System.out.println("Ödeyeceğiniz ücret:"+ücret);
       } else if ((12<=yaş || yaş>=24) &&  tip==1){
           ücret=km*(0.105*0.1);
            System.out.println("Ödeyeceğiniz ücret:"+ücret);
       }else if (tip==2){
           ücret=km*(0.105*0.2);
            System.out.println("Ödeyeceğiniz ücret:"+ücret);
       } else{
           ücret=km*0.105;
           System.out.println("Ödeyeceğiniz ücret:"+ücret);
       }
    }
    
}
