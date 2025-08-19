public class Vehiculo {
    private String marca;
    private String modelo;
    private int year;
    

// constructor vacio
public Vehiculo() {
}

// constructor con atributos
    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    //metodos
    public void acelerar(){
        System.out.println("Acelerando");
    }

    public void frenar(){
        System.out.println("Frenando");
    }

//getters y setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
