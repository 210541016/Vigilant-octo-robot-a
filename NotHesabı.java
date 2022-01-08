
package not.hesabı;
import java.util.Scanner;
public class NotHesabı {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        double ortalama=0;
        int matNot=klavye.nextInt();
        if(0<=matNot && matNot<=100){
          
        }else{
            System.out.println("0 ile 100 arasında bir değer giriniz");
            matNot=klavye.nextInt();
        }System.out.println("Türkçe notunuzu giriniz:");
        int türNot=klavye.nextInt();
        if(0<=türNot && türNot<=100){
           
        }else{
            System.out.println("0 ile 100 arasında bir değer giriniz");
            türNot=klavye.nextInt();
        }System.out.println("Beden dersinin notunu giriniz:");
        int bedenNot=klavye.nextInt();
        if(0<=bedenNot && bedenNot<=100){
            
        }else{
            System.out.println("0 ile 100 arasında bir değer giriniz");
             bedenNot=klavye.nextInt();
        } ortalama=(bedenNot+matNot+türNot)/3;
        if(ortalama>=50){
            System.out.println("Sınıfı geçtiniz   ortalamanız:"+ortalama);
        }else{
            System.out.println("Sınıfı geçemediniz   ortalamanız:"+ortalama);
        }
    }
    
}
