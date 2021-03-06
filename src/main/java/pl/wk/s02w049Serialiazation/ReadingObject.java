package pl.wk.s02w049Serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObject {
    public static void main(String[] args) {
        System.out.println("Reading object...");


        try (FileInputStream fi = new FileInputStream("people.bin")){

            ObjectInputStream os = new ObjectInputStream(fi);


            Person person1 = (Person) os.readObject();

            Person person2 = (Person) os.readObject();

            System.out.println(person1);
            System.out.println(person2);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
