public class Main {
    public static void main(String[] args) {

       DrivingAllowance driving = new DrivingAllowance();

       try {
           driving.registerDrives();
       } catch (Exception e) {
           //If we ctach and Exception rerun the program for the user.
           System.out.println("Hovsa du har skrevet noget forkert. prøv igen");
           driving.registerDrives();
           System.out.println(e);
       }



    }
}