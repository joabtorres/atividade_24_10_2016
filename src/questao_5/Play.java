package questao_5;
public class Play implements Jogo{

    @Override
    public void andar() {
        System.out.println("Andar");
    }

    @Override
    public void chutar() {
        System.out.println("Chutar");
    }

    @Override
    public void pular() {
        System.out.println("Pular");
    }
    
}
