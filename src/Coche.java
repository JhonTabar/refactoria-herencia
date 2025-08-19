public class Coche extends Vehiculo {
    private String numeroPuertas;
    private String aireAcondicionado;


    public Coche() {
    }


    public Coche(String numeroPuertas, String aireAcondicionado) {
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
    }

    public void reversa(){
        System.out.println("Reversando");
    }

    public void encenderAire(){
        System.out.println("Encendiendo aire");
    }

    public void apagarAire(){
        System.out.println("Apagando aire");
    }

    public String getNumeroPuertas() {
        return this.numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getAireAcondicionado() {
        return this.aireAcondicionado;
    }

    public void setAireAcondicionado(String aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

}
