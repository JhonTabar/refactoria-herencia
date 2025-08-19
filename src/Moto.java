public class Moto extends Vehiculo {
    private String posaPies;
    private String tapas;


    public Moto(){   
    }
    
    public Moto(String posaPies, String tapas) {
        this.posaPies = posaPies;
        this.tapas = tapas;
    }

        public void picar(){
        System.out.println("Picando moto");
    }

        public void ponerDobleGato(){
        System.out.println("Levantando en el doble gato");
    }

    public String getPosaPies() {
        return this.posaPies;
    }

    public void setPosaPies(String posaPies) {
        this.posaPies = posaPies;
    }

    public String getTapas() {
        return this.tapas;
    }

    public void setTapas(String tapas) {
        this.tapas = tapas;
    }


}
