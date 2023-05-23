public class Main {
    public static void main(String[] args){
CocheCombustible fit = new CocheCombustible("bajo","fit","honda",4,1500,"compacto");
CocheCombustible passo = new CocheCombustible("alto","passo","toyota",4,1000,"compacto");
CocheHibrido demio = new CocheHibrido(true,"yes","bajo","demio","mazda",4,1500,"compacto");
CocheCombustible swift = new CocheCombustible("medio","swift","Suzuki",4,1200,"compacto");
CocheCombustible genesis = new CocheCombustible("alto","Genesis","hyundai",2,2000,"coupe");
CocheCombustible captiva = new CocheCombustible("alto","captiva","Chevrolet",4,2500,"suv");
CocheElectrico models = new CocheElectrico(true,"bajo","null","model s","tesla",2,0,"coupe");

fit.guardarCoche(fit);
passo.guardarCoche(passo);
demio.guardarCoche(demio);
swift.guardarCoche(swift);
genesis.guardarCoche(genesis);
captiva.guardarCoche(captiva);
models.guardarCoche(models);

captiva.eliminarCoche(captiva);

fit.acelerar(100);

models.mostrarCoches();

    }
}