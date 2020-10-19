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
    public boolean engineOn = false;

    Car() {
        this.password = "password1234";
        this.engineOn = false;
    }

    public void turnEngineOn(CarKey key) {
        if (key.getPassword().equals(this.password)) {
            System.out.println("Car is on");
            engineOn = true;
        } else System.out.println("Car is off, wrong key");
    }
}
