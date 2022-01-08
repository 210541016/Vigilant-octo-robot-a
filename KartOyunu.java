
package kart.oyunu;

public class KartOyunu {

    public static void main(String[] args) {
         int[] deste=new int[52];
       String[] gruplar={"MAÇA","KUPA","KARO","SİNEK"};
       String[] siralar={"As","2","3","4","5","6","7","8","9","10","Joker","Kiz","Papaz"};
       for(int i=0;i<deste.length;i++){
           deste[i]=i;
       }
       for(int i=0;i<deste.length;i++){
           int index=(int)(Math.random()*deste.length);
           int temp=deste[i];
           deste[i]=deste[index];
           deste[index]=temp;
       }
       for(int i=0;i<5;i++){
           String grup=gruplar[deste[i]/13];
           String sira=siralar[deste[i]%13];
           System.out.println("Kart numarısı: " +deste[i]+"="+sira+"-"+grup);
       }
    }
    
}
