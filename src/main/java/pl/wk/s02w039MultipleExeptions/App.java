package pl.wk.s02w039MultipleExeptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) {
        Test test = new Test();

        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse commend file.");
        }

        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            test.input();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
