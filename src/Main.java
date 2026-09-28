import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

void main() {
    File example = new File("src/examples/tsp1_253.txt");
    String[] linhaArray;
    List<int[]> linhas = new ArrayList<>();
    int row = 0;

    try (Scanner scanner = new Scanner(example)) {
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
    int[][] adjMatrix = linhas.toArray(new int[0][]);

    System.out.println("adjMatrix(3,4); Deve dar 4: " + adjMatrix[3][4]);
    System.out.println("adjMatrix(1,2); Deve dar 15:" + adjMatrix[1][2]);
    System.out.println("adjMatrix(3,3); Deve dar 0:" +adjMatrix[0][0]);
}
