/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 19-10-2020
 */
package Opgave_BilKomplet_19_10_2020;

public class CarKey {
    //Declares String password
    private String password;
    //Constructer CarKey holding setter of "password"
    CarKey(String key) {
        this.password = key;
    }
    //Getter for  "password"
    public String getPassword() {
        return password;
    }
}
