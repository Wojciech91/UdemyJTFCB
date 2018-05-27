package pl.wk.s02w050SerializingArrays;

import pl.wk.s02w049Serialiazation.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;

public class ReadingObject {
    public static void main(String[] args) {
        System.out.println("Reading object...");


        try (FileInputStream fi = new FileInputStream("test.ser")){

            ObjectInputStream os = new ObjectInputStream(fi);

            Person2[] people = (Person2[]) os.readObject();
            List<Person2> peopleList = (List<Person2>) os.readObject();


            System.out.println(Arrays.toString(people));

            for (Person2 person : peopleList) {
                System.out.println(person);
            }

            int num = os.readInt();

            for (int i = 0; i < num; i++) {
                Person2 person = (Person2) os.readObject();
                System.out.println(person);
            }

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
