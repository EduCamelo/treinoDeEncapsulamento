public class personagem implements encap{
    private boolean andando;
    private double vida;
    private double mp;

    public personagem(){
        this.andando = false;
        this.vida = 100;
        this.mp = 100;
    }

    public double getMp() {
        return mp;
    }
    public double getVida() {
        return vida;
    }
    public boolean getAndando(){
        return andando;
    }

    public void setAndando(boolean andando) {
        this.andando = andando;
    }
    public void setMp(double mp) {
        this.mp = mp;
    }
    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public void andar() {
        if(getAndando() == false){
            setAndando(true);
            System.out.println("Você começou a andar para trás");
        }
        else{
            System.out.println("Você já está andando.");
        }
    }
    @Override
    public void descansar() {
        if(getAndando() == true){
            setMp(100);
            setAndando(false);
        }
        else{
            System.out.println("Você já descansou.");
        }
    }
    @Override
    public void magia() {
     if(getAndando() == false){
        setMp(this.mp - 10);
     }
    }
    @Override
    public void pular() {
         System.out.println("Seu personagem pulou!");
    }
    @Override
    public void abrirStatus() {
        System.out.println("O seu personagem está andando? " + getAndando());
        System.out.println("Vida: "+ getVida());
        System.out.println("Mana: "+ getMp());
    }
    @Override
    public void fecharStatus() {
        System.out.println("Fechando Status...");
        
    }
}
