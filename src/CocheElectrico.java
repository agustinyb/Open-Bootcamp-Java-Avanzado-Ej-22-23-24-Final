public class CocheElectrico implements DataBase,Coche {

    private boolean carga;
    private String estadoDeCarga;
    private String consumo;
    private String modelo;
    private String marca;
    private int puertas;
    private int cc;
    private String tipo;

    public CocheElectrico(boolean carga, String estadoDeCarga, String consumo, String modelo, String marca, int puertas, int cc, String tipo) {
        this.carga = carga;
        this.estadoDeCarga = estadoDeCarga;
        this.consumo = consumo;
        this.modelo = modelo;
        this.marca = marca;
        this.puertas = puertas;
        this.cc = cc;
        this.tipo = tipo;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public String getEstadoDeCarga() {
        return estadoDeCarga;
    }

    public void setEstadoDeCarga(String estadoDeCarga) {
        this.estadoDeCarga = estadoDeCarga;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
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
                "modelo: " + getModelo() + '\'' +
                ", marca: " + getMarca() + '\'' +
                ", puertas: " + getPuertas() +
                ", cc: " + getCc() +
                ", tipo: " + getTipo() + '\'';
    }


    @Override
    public void guardarCoche(DataBase coche) {
        coches.add(coche);
        System.out.println("El Coche Electrico agregado es " + getModelo());
    }

    @Override
    public void eliminarCoche(DataBase coche) {
        coches.remove(coche);
        System.out.println("El coche eliminado es " + getModelo());
    }

    public void mostrarCoches(){
        for (DataBase coche : coches ){
            System.out.println(coche.toString());
        }

    }
    @Override
    public void frenar(int freno) {
        String frenada = (freno >= 5) ? "la frenada es suave" : "la frenada es fuerte";
        System.out.println(frenada);
    }

    @Override
    public void acelerar(int acelerador) {
 String velocidad = acelerador<=70 ? "Su velocidad esta bien ":"Usted va muy rapido";
        System.out.println(velocidad);
    }

    @Override
    public void luces(boolean luces) {
  String encendidas = luces== true ? "Las luces estan encendidas" : "Las luces estan apagadas";
        System.out.println(encendidas);
    }

    @Override
    public void sport(boolean modoSport) {
String activado = modoSport== true ? "El modo sport esta activado" : "El modo sport esta desactivado";
        System.out.println(activado);
    }
}
