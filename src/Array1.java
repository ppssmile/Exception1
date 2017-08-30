import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1 {
    String string[][];

    public Array1(int a, int b) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rd = new String();

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        string = new String[a][b];

        for (int i = 0; i < a; i++) {
            System.out.println("Level is #" + (i + 1));
            for (int j = 0; j < b; j++) {
                rd = reader.readLine();
                string[i][j] = rd;
            }
        }

        reader.close();
    }
}