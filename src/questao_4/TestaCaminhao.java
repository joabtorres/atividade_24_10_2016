package questao_4;

public class TestaCaminhao {

    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao();
        System.out.println(caminhao1.getCombustivel());
        System.out.println(caminhao1.getVelocidade());
        
        caminhao1.setVelocidade(156);
    }
}
