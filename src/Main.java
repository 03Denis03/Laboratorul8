import java.io.*;
import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.net.StandardSocketOptions;


public class Main {
    public static void readf() throws IOException{
        String file ="C:\\Users\\DenisIonut\\IdeaProjects\\Laborator8\\fisier.txt";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        String currentLine1 = reader.readLine();
        reader.close();
        System.out.println(currentLine);
        System.out.println(currentLine1);
    }

    public static void main(String[] args) throws IOException {
        String numeFisier = "fisier.txt";

        try {
            File fisier = new File(numeFisier);

            if (!fisier.exists()) {
                fisier.createNewFile();
                System.out.println("Fișierul a fost creat!");
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(fisier));

            writer.write("Hello java files");
            writer.write("\n buna ziua");

            writer.close();
            System.out.println("Textul a fost scris în fișier!");

        } catch (IOException e) {
            System.out.println("A apărut o eroare: " + e.getMessage());
            e.printStackTrace();
        }
        readf();

    }
}
