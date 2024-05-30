import java.util.List;
import java.util.Scanner;
public class TodoList {
    private List<Item> items;
    private FileIO fileIO = new FileIO();

    public TodoList(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
    // Viser listen
    public void displayList() {
        int index = 1;
        for (Item item : items) {
            String status = item.isDone() ? "Færdig " : "Ikke færdig";
            System.out.println(index + ": " + item.getDescription() + ", " + status);
            index++;
        }
    }

    //Marks our task as done:
    public void markItemAsDone(int index) {
        if (index > 0 && index <= items.size()) {
            Item item = items.get(index - 1); // Minus 1 to get the correct index number.
            if (item.isDone()) {
                items.remove(item);
                System.out.println("Opgave: " + index + " blev fjernet fra listen.");
            } else {
                item.markAsDone();
                System.out.println("Opgave: " + index + " er du nu sat til færdig.");
            }
        } else {
            System.out.println("Du indtastede et ugyldigt nummer");
        }
    }



    // Calling our method the saves the new data(items) to our path as argument.
    public void saveItemsToFile() {
        fileIO.saveToFile(items, "data/todo.csv");
    }



    // Method for creating our dialog that shows the diffrent user input options
    public void runDialog() {
        Scanner scanner = new Scanner(System.in);
        int option = 1; // initial værdi for at sikre loop starter

        while (option > 0) {
            displayList();
            System.out.println("Tast et tal for den opgave du vil markere som 'done'");
            System.out.println("Tast et tal som ikke findes i listen, hvis du vil tilføje en opgave");
            System.out.println("Tast 0 eller et negativt tal for at afslutte");
            System.out.print("Vælg en mulighed: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Tjekker efter input på næste linje.

            if (option > 0 && option <= items.size()) {
                markItemAsDone(option);
            } else if (option > items.size()) {
                System.out.print("Indtast beskrivelse af den nye opgave: ");
                String description = scanner.nextLine();
                addItem(new Item(description, false));
            } else if (option <= 0) {
                System.out.println("Afslutter programmet og gemmer ændringer.");
                saveItemsToFile();
                break;
            } else {
                System.out.println("Ugyldigt valg, prøv igen.");
            }
        }

        scanner.close();
    }



}
