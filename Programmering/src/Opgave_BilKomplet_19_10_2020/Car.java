/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 19-10-2020
 */
package Opgave_BilKomplet_19_10_2020;

public class Car {
    //Declare car variables.
    private String password;
    private UserInterface ui;
    private UserInterface ui2;
    private int temperature;
    public boolean engineOn;
    public boolean carBreakOn;
    public boolean airconOn;
    public boolean gpsON;

    //Variables for car
    Car() {
        this.password = "password1234";
        this.engineOn = false;
        this.carBreakOn = true;
        this.airconOn = false;
        this.gpsON = false;
    }

    //Method that holds turnEngine on + carBreakOn.
    //Holding statement, if password is correct turns car + carbreaks off
    //else car egine off and break on.
    public void turnEngineOn(CarKey key) {
        if (key.getPassword().equals(this.password)) {
            System.out.println("Car is on");
            engineOn = true;
            carBreakOn = false;
            if (!carBreakOn) {
                System.out.println("Carbreak is off!");
            } else System.out.println("");


        } else {
            System.out.println("Car is off, wrong key");
            System.out.println("Carbreak is on!");

        }
    }

    //method for turning AirconOn
    public void turnAirconOn() {
        //calls user interface class,runs ui aircon method
        //sets user input to temperature
        temperature = UserInterface.uiAircon();
        // if statement checks temp
        if (this.temperature >= 20) {
            airconOn = true;
            System.out.println("Aircon is on");
        } else
            System.out.println("Aircon is off");

    }

    //GPS activate method
    //sets gpsON to true
    //contains outs
    //runs result of input with if statement, if match is found, sout string
    public void gpsActivate() {
        gpsON = true;
        String out1 = "zealand";
        String out2 = "køge";
        String out3 = "gym";
        String choiceOfDestination = UserInterface.uiDestination();

        if (choiceOfDestination.equalsIgnoreCase(out1)) {
            System.out.println("Destination to " + choiceOfDestination + " is 40 kilometers, lay back, arrival in 60 min.");

        } else if (choiceOfDestination.equalsIgnoreCase(out2)) {
            System.out.println("Destination to " + choiceOfDestination + " is 20 kilometers, lay back, arrival in 25 min.");
        } else if (choiceOfDestination.equalsIgnoreCase(out3)) {
            System.out.println("Destination to " + choiceOfDestination + " doesn't matter, you need to go there, lay back, arrival when arrived!");
        } else {
            System.out.println("Invalid input!");

        }
    }

    //Gps deactivate method
    //sets gpsON to false and souts string
    public void gpsDeactivate() {
        gpsON = false;
        System.out.println("GPS is off!");
    }

    // sets ui to this ui
    public void setUI(UserInterface ui) {
        this.ui = ui;
    }
}
