package questao_3;

public class TestaTV {

    public static void main(String[] args) {
       TV tv1 =new TV();
       TV tv2 = new TV(true);
       
        System.out.println("TV1 :"+tv1.isLigado());
        System.out.println("TV1 :"+tv1.getCanal());
        System.out.println("TV1 :"+tv1.getVolume());
        System.out.println("");
        System.out.println("TV2 :"+tv2.isLigado());
        System.out.println("TV2 :"+tv2.getCanal());
        System.out.println("TV2 :"+tv2.getVolume());
    }
}
