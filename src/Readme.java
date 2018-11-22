import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Readme {

    public static void main(String[] args) {

        String filensIndhold;
        filensIndhold = readme();

        System.out.println("README INDEHOLDER: \n" + filensIndhold);

    }

        public static String readme() {

            String readmeTxt = "";

            File readme = new File("README.md");

            if (readme.exists()) {
                System.out.println("Readme findes.");
            } else {
                System.out.println("readme findes ikke.");

                try {
                    PrintWriter filSkriver = new PrintWriter(readme);
                    filSkriver.print("# Readme fil");
                    filSkriver.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            };

            try {
                Scanner in = new Scanner(readme);

                while(in.hasNext()){
                    String newLine = in.nextLine();
                    System.out.println(newLine);

                    readmeTxt = readmeTxt + newLine + "\n";

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            return readmeTxt;
        }

    }

