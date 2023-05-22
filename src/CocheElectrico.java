public class CocheElectrico extends Coche{

    private boolean carga;
    private String estadoDeCarga;

    public CocheElectrico(String modelo, String marca, int puertas, int cc, String tipo, boolean carga, String estadoDeCarga) {
        super(modelo, marca, puertas, cc, tipo);
        this.carga = carga;
        this.estadoDeCarga = estadoDeCarga;
    }

    @Override
    public  String toString() {
        return " El Coche es " +
                "modelo: " + getModelo() + '\'' +
                ", marca: " + getMarca() + '\'' +
                ", puertas: " + getPuertas() +
                ", cc: " + getCc() +
                ", tipo: " + getTipo() + '\'';
    }
@Override
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
