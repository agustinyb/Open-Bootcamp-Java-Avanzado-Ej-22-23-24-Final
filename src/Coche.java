import java.util.ArrayList;

abstract class Coche {
private String modelo;
private String marca;
private int puertas;
private int cc;
private String tipo;
    public static ArrayList<Coche> coches = new ArrayList<Coche>();

    public Coche(String modelo, String marca, int puertas, int cc, String tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.puertas = puertas;
        this.cc = cc;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public  String toString() {
        return " El Coche es " +
                "modelo: " + modelo + '\'' +
                ", marca: " + marca + '\'' +
                ", puertas: " + puertas +
                ", cc: " + cc +
                ", tipo: " + tipo + '\'';
    }

    public void guardarCoche(Coche coche) {
        coches.add(coche);
        System.out.println("Estoy guardando el coche: " + getModelo());
    }

public void eliminarCoche(Coche coche){
     coches.remove(coche);
      System.out.println("El coche eliminado es " + getModelo());
    }

    public static void mostrarCoches(){
        for (Coche coche : coches ){
            System.out.println(coche.toString());
        }

    }







}
