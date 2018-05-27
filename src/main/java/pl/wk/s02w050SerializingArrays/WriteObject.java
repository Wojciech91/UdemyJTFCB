package pl.wk.s02w050SerializingArrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) {
        System.out.println("Writing objects...");


        Person2[] people = {new Person2(1, "Sue"), new Person2(99, "Mike"), new Person2(7, "Bob")};

        List<Person2> peopleList = new ArrayList<>(Arrays.asList(people));

        try (FileOutputStream fs = new FileOutputStream("test.ser")) {

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(people);

            os.writeObject(peopleList);

            os.writeInt(peopleList.size());

            for (Person2 person : peopleList) {
               os.writeObject(person);
            }

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
