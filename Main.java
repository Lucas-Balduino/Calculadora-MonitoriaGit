import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Digite o caminho do arquivo:");
        LeitorTXT txt = new LeitorTXT(scan.nextLine());
        //
        HashFuncs hashfuncs = new HashFuncs();
        HashMap< String, BiFunction<Double, Double, Double> > mapSimples = hashfuncs.inciarBaseMap();
        HashMap< String, Function<Double[], Double> > mapComplex = hashfuncs.iniciarComplexMap();

        
        ArrayList<String> a = txt.getTxt();
        a.forEach((e) -> System.out.println(e));


        scan.close();
    }
}