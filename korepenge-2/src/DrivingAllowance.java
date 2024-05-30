import java.util.Scanner;

public class DrivingAllowance {

    private String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

    private double totalAllowance;

    private Scanner scanner;

    //Konstuktor
    public DrivingAllowance() {
        this.totalAllowance = 0.0;
        this.scanner = new Scanner(System.in);
    }

    public void registerDrives() {
        String inputMore = "";
        String driveInput; // Sting to hold our user input.
        int amountToPayout = 0;
        int monthInt;
        int driveAmount;
        while (!inputMore.equalsIgnoreCase("N")) {
            System.out.println("Angiv din kørsel med formatet [måned,antal]");
            driveInput = scanner.nextLine();
            //System.out.println("Registreret kørsel: " + driveInput);

            String[] inputValues = driveInput.split(",");

            if (inputValues.length == 2) {
                monthInt = Integer.parseInt(inputValues[0]); // Month
                driveAmount = Integer.parseInt(inputValues[1]); // times driving


                System.out.println("Måned: " + monthInt);
                System.out.println("Antal gange kørt: " + driveAmount);


                // Removeing 1 to make sure we get the correct index in the Array.
                System.out.println(months[monthInt - 1]);

                if (monthInt >= 6 && monthInt > 0) {
                    //User has selected a month that's higher og equal to 6.
                    amountToPayout += driveAmount * 80;
                } else {
                    amountToPayout += driveAmount * 60;
                }
            } else {
                System.out.println("Du har angivet kørsel i en forkert format [måned, antal]");
            }


            System.out.println("Forsæt registrering? Y/N");
            inputMore = scanner.nextLine();
        }
        System.out.println("Der udbetales: " + amountToPayout + " DKK til din konto.");
    }

}
