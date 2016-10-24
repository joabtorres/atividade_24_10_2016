package questao_1;


public class Lampada {
    private boolean status;
    public void ligar(){
       this.status = true;
    }
    public void desligar(){
        this.status = false;
    }
    public void observar(){
       if(this.status){
           System.out.println("LIGADA!");
       }else{
           System.out.println("DESLIGADA!");
       }
    }
}
