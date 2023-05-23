import java.util.ArrayList;

public interface DataBase {

    public static ArrayList<DataBase> coches = new ArrayList<DataBase>();
    public void guardarCoche(DataBase coche);

    public void eliminarCoche(DataBase coche);

    public  void mostrarCoches();








}
