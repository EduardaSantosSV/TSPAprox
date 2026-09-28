import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

void main() {
    FileParser fileParser = new FileParser();

    fileParser.loadExample(1);
    int adjMatrix[][] = fileParser.getAdjMatrix();

    System.out.println("adjMatrix(3, 4):" + adjMatrix[3][4]);
    System.out.println("adjMatrix(1, 2):" + adjMatrix[1][2]);
    System.out.println("adjMatrix(3, 4):" + adjMatrix[3][3]);
}
