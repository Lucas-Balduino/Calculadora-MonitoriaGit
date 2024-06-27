import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LeitorTXT {
private String caminho_arquivo;
private ArrayList<String> texto = new ArrayList<>();
    //
    public LeitorTXT(String caminho_arquivo) {
        this.caminho_arquivo = caminho_arquivo;
    }

    public ArrayList<String> getTxt() {
        
        try {
            Scanner scan = new Scanner(new File(caminho_arquivo));        
            while (scan.hasNextLine()) {
                texto.add(scan.nextLine());
            } 
            scan.close();
        } catch (FileNotFoundException e) {e.printStackTrace();}

        return texto;
    }

}
