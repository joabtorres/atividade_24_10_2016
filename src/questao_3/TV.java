package questao_3;

public class TV {

    private boolean ligado;
    private int canal;
    private int volume;

    public TV() {
    }

    public TV(boolean status) {
        if (status) {
            this.ligado = true;
            this.canal = 22;
            this.volume = 25;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
