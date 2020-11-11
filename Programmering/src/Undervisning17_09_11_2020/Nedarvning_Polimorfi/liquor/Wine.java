/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-11-2020
 */
package Undervisning17_09_11_2020.Nedarvning_Polimorfi.liquor;

import Undervisning17_09_11_2020.Nedarvning_Polimorfi.main.LiquorDescription;

//Wine extending behaviour from Liquior class implementing LiquorDescription interface
public class Wine extends Liquor implements LiquorDescription {

    String sort = "Red";
    String type = "Drinkable";
    int alcoholPercent = 12;
    int ageMin = 16;

    //Overrides method liquorDescription from LiquorDescription interface.
    @Override
    public void liquorDescription() {
        System.out.println("Wine sort: " + sort);
        System.out.println("Redwhine: " + type);
        System.out.println("Alcohol %: " + alcoholPercent);
        System.out.println("Minimum age: " + ageMin);
    }

}
