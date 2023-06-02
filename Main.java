//Çağla Çağlayan 200315018
import java.io.*;


public class Main {

    public static String separator;

    public static void main(String[] args) throws IOException {

        FileInputStream fstream = new FileInputStream("src/dictionary.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        Btree v1 = new Btree();


        String strLine;
        while ((strLine = br.readLine()) != null) {
            // Print the content on the console - do what you want to do
            //System.out.println (strLine);

            v1.insertIteratively(new Word(strLine, true));
        }



        v1.printPreOrder(v1.getRoot());
    }
}
