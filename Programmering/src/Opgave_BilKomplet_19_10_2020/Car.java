/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 19-10-2020
 */
package Opgave_BilKomplet_19_10_2020;

public class Car {
    private String password;
    private UserInterface ui;
    private int temperature;
    public boolean engineOn;
    public boolean carBreakOn;
    public boolean airconOn;


    Car() {
        this.password = "password1234";
        this.engineOn = false;
        this.carBreakOn = true;
        this.airconOn = false;
    }

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
        temperature = UserInterface.UIAircon();
    // if statement checks temp
        if (this.temperature >= 20) {
            airconOn = true;
            System.out.println("Aircon is on");
        } else
            System.out.println("Aircon is off");

    }

    // sets ui to this ui
    public void setUI(UserInterface ui) {
        this.ui = ui;
    }
}
