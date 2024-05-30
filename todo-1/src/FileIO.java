import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {

    public ArrayList<Item> loadFile(String path) {
        ArrayList<Item> itemListe = new ArrayList<>();
        try {
            File todoListe = new File(path);
            Scanner reader = new Scanner(todoListe);

                // To make sure we dont get our "header/colums" in the csv file we skip it.
                if (reader.hasNextLine()) {
                    reader.nextLine();
                }
                while (reader.hasNextLine()) {

                    String data = reader.nextLine();

                    // Splits the results hold so we can handle it as 2 diffrent values.
                    String[] fundetData = data.split(",");

                    //System.out.println(fundetData[0]);
                    //System.out.println(fundetData[1]);

                    // Turns our String "true/false" into an datatype boolean
                    boolean s2 = Boolean.parseBoolean(fundetData[1]);


                    Item item = new Item(fundetData[0], s2);

                    itemListe.add(item); // Adding the new object to our list so we can return it.
                }

        } catch (FileNotFoundException e) {
            System.out.println("fejl da vi skulle hente data.");
            e.printStackTrace();
        }

        return itemListe;
    }

    public void saveToFile(List<Item> items, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("description,isDone\n");
            for (Item item : items) {
                writer.write(item.getDescription() + "," + item.isDone() + "\n");
            }
        } catch (IOException e) {
            System.out.println("fejl kunne ikke gemme");
            e.printStackTrace();
        }
    }
}
