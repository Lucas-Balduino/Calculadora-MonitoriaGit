import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Digite o caminho do arquivo: ");
        LeitorTXT arquivo = new LeitorTXT(scan.nextLine()); // /home/garciavilanovapedro/rep/a
        ArrayList<String> tokens = new ArrayList<>();
        //
        HashFuncs hashfuncs = new HashFuncs();
        HashMap< String, BiFunction<Double, Double, Double> > mapSimples = hashfuncs.inciarBaseMap();
        HashMap< String, Function<Double[], Double> > mapComplex = hashfuncs.iniciarComplexMap();

        
        ArrayList<String> txt = arquivo.getTxt();
        txt.forEach((element) -> { 
            String[] element1 = element.trim().toUpperCase().split("[, ]");
            for (int i = 0; i < element1.length; i++) {
                if (!element1[i].equals("")) {
                    tokens.add(element1[i]);
                }
            }
        });

        System.out.println(tokens);


        scan.close();
    }
}