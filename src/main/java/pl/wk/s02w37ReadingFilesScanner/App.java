package pl.wk.s02w37ReadingFilesScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Users\\wojte\\Desktop\\example.txt";

        File textFile = new File(path);
        Scanner in = null;

        try {
            in = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int value = in.nextInt();
        System.out.println("Read value: " + value);

        in.nextLine();

        int count = 2;
        while (in.hasNextLine()) {
            String line = in.nextLine();

            System.out.println(count + ": " + line);
            count++;
        }

        in.close();


    }
}
