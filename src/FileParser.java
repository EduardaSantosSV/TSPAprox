import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {
    private File file;
    private int[][] adjMatrix;

    public void generateAdjMatrix(){
        String[] linhaArray;
        List<int[]> linhas = new ArrayList<>();

        try (Scanner scanner = new Scanner(this.file)) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                linhaArray = linha.split("\\s+");

                int[] valores = new int[linhaArray.length];

                //adiciona cada linha da matriz de adjacência
                for(int i = 0; i < linhaArray.length; i++){
                    // adicionar cada número à matriz de adjacência
                    valores[i] = Integer.parseInt(linhaArray[i]);
                }
                linhas.add(valores);
            }
        } catch(FileNotFoundException e){
            System.out.println("Ocorreu um erro ao abrir o arquivo.");
            e.printStackTrace();
            return;
        }

        //transforma linhas parseadas em matriz de adjacencia
        this.adjMatrix = linhas.toArray(new int[0][]);
    }

    public void loadExample(int exemplo){
        switch(exemplo){
            case 1:
                this.file = new File("src/examples/tsp1_253.txt");
                break;
            case 2:
                this.file = new File("src/examples/tsp2_1248.txt");
                break;
            case 3:
                this.file = new File("src/examples/tsp3_1194.txt");
                break;
            case 4:
                this.file = new File("src/examples/tsp4_7013.txt");
                break;
            case 5:
                this.file = new File("src/examples/tsp5_27603.txt");
                break;
            default:
                System.out.println("Escolha um arquivo válido.");
        }
        this.generateAdjMatrix();
    }

    public int[][] getAdjMatrix(){
        return this.adjMatrix;
    }
}
