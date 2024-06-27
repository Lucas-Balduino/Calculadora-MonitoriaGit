import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HashFuncs {
    public HashFuncs() {}

    public HashMap< String, BiFunction<Double, Double, Double> > inciarBaseMap() {
        HashMap<String, BiFunction<Double, Double, Double> > mapa = new HashMap<>();
    
        mapa.put("SOM", (op1, op2) -> op1+op2);
        mapa.put("DIV", (op1, op2) -> op1/op2);
        mapa.put("SUB", (op1, op2) -> op1-op2);
        mapa.put("MULT", (op1, op2) -> op1*op2);
        mapa.put("ELEV", (op1, op2) -> Math.pow(op1, op2));
        mapa.put("SQRT", (op1, op2) -> Math.pow(op1, 1/op2));

    return mapa;    
    }

    public HashMap< String, Function<Double[], Double> > iniciarComplexMap() {
        HashMap< String, Function<Double[], Double> > mapa = new HashMap<>();
    
        mapa.put("DET", (matriz) -> 1.0);
    
    return mapa;
    }

}

