import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileIO file = new FileIO();
        //Loads our data from our arugment path into the List that holds our objetcs.
       List<Item> items =  file.loadFile("data/todo.csv");

       //Creating our new instance of TodoList with holds our List items.
       TodoList todoList = new TodoList(items);


       //Running our method to show our dialog.
        todoList.runDialog();
    }
}