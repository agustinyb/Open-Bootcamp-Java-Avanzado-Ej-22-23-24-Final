public class CocheCombustible extends Coche{
String consumo;

    public CocheCombustible(String modelo, String marca, int puertas, int cc, String tipo, String consumo) {
        super(modelo, marca, puertas, cc, tipo);
        this.consumo = consumo;
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
