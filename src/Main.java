import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=  new BufferedReader(new InputStreamReader(System.in));
        int a = -1,b=-1;

        do{
            try {
                System.out.println("Enter to array size #1:");
                a = Integer.parseInt(reader.readLine());
                System.out.println("Enter to array size #2:");
                b = Integer.parseInt(reader.readLine());
            }catch (NumberFormatException e){
                System.out.println("Enter number please.");
            }
        }while((a<0)|(b<0));

        Array1 array1=new Array1(a,b);
        arrayInspection(array1);
    }

    public static void arrayInspection(Array1 string) {
        System.out.println("array.lenght()="+string.string.length);
        System.out.println("array[].lenght()="+string.string[1].length);

        if ((string.string.length != 4) | (string.string[1].length != 4)) throw new MyArraySizeException();

        int summ=0;

        for (int i = 0; i < string.string.length; i++) {
            for (int j = 0; j < string.string[1].length; j++) {
                try{
                    summ=summ+Integer.parseInt(string.string[i][j]);
                }catch (NumberFormatException e){
                    try{
                        throw new MyArrayDataException();
                    }catch (MyArrayDataException d){
                        System.out.println(d+": invalid data type: array["+i+"]["+j+"].");
                    }

                }
            }
        }

        System.out.println("Summa="+summ);
    }
}