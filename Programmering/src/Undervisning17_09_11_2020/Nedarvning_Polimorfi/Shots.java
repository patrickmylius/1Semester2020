/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-11-2020
 */
package Undervisning17_09_11_2020.Nedarvning_Polimorfi;

//Class shots, extending behavior from Liquor class implementing LiquorDescription interface
public class Shots extends Liquor implements LiquorDescription {

    String sort = "Blue Owls";
    String type = "Drinkable";
    int alcoholPercent = 40;
    int ageMin = 18;

    //Overrides method liquorDescription from LiquorDescription interface.
    @Override
    public void liquorDescription() {
        System.out.println("Liquor type: " + sort);
        System.out.println("Shots: " + type);
        System.out.println("Alcohol %: " + alcoholPercent);
        System.out.println("Minimum age: " + ageMin);
    }

}
