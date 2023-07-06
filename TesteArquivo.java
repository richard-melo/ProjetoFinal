import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteArquivo {

    public static void criarArquivo(String caminho) throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, true))) {
            escritor.newLine();
            escritor.write("Teste");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
