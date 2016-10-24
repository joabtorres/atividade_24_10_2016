package questao_4;

public class Caminhao {

    private String combustivel;
    private double velocidade;

    public Caminhao() {
        this.combustivel = "Gasolina";
        this.velocidade = 0;
    }

    public void setCombustivel(String valor) {
        if (valor.equalsIgnoreCase("gasolina")) {
            this.combustivel = "Gasolina";
        } else if (valor.equalsIgnoreCase("diese")) {
            this.combustivel = "Gasolina";
        } else if (valor.equalsIgnoreCase("gas")) {
            this.combustivel = "Gasolina";
        } else {
            System.out.println("Combustivel Invalido!");
        }

    }

    public String getCombustivel() {
        return this.combustivel;
    }

    public void setVelocidade(double valor) {
        if (valor >= 0 && valor <= 150) {
            this.velocidade = valor;
        } else {
            System.out.println("Velocidade Invalida, limite permitido 0 a 150");
        }
    }

    public double getVelocidade() {
        return this.velocidade;
    }
}
