public class Main {
    public static void main(String[] args){
Coche fit = new CocheCombustible("Fit","Honda",4,1500,"Compacto","Alto");
Coche passo = new CocheCombustible("Passo","Toyota",4,1000,"Compacto","Alto");
Coche demio = new CocheHibrido("Demio","Mazda",4,1500,"Compacto",true,"15/l");
Coche swift = new CocheCombustible("Swift","Suzuki",4,1500,"Compacto","Medio");
Coche genesis = new CocheCombustible("Genesis","Hyundai",2,2000,"Deportivo","Alto");
Coche captiva = new CocheCombustible("Captiva","Chevrolet",4,2000,"SUV","Medio");
Coche models = new CocheElectrico("Model s","Tesla",4,0,"Electrico",true,"Alto");

fit.guardarCoche(fit);
passo.guardarCoche(passo);
demio.guardarCoche(demio);
swift.guardarCoche(swift);
genesis.guardarCoche(genesis);
captiva.guardarCoche(captiva);


Coche.mostrarCoches();

captiva.eliminarCoche(captiva);

Coche.mostrarCoches();

    }
}