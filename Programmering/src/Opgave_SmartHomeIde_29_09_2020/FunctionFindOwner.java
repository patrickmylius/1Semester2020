/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 29-09-2020
 */
package Opgave_SmartHomeIde_29_09_2020;
//Class that holds the programs function
public class FunctionFindOwner {
    //Method that takes String "remoteOwner"
    static Remotes findOwner(String remoteOwner) {
        Remotes owner1 = new Remotes("Patrick", "10 feet", 50);
        Remotes owner2 = new Remotes("Usamah", "30 feet", 25);
        Remotes owner3 = new Remotes("Daniella", "40 feet", 69);
        Remotes owner4 = new Remotes("Danijel", "20 feet", 99);
        Remotes owner5 = new Remotes("Mikkel", "5 feet", 41);

        //Sets new Object to "ownerFound"
        Remotes ownerFound;
        //Runs empty "remoteOwner" through switch selektions
        //Returns "remoteOwner" now holds an owner..
        switch (remoteOwner.toLowerCase()) {
            case "patrick":
                flashOrBlink(owner1);
                ownerFound = owner1;
                break;
            case "usamah":
               flashOrBlink(owner2);
                ownerFound = owner2;
                break;
            case "daniella":
                flashOrBlink(owner3);
                ownerFound = owner3;
                break;
            case "danijel":
                flashOrBlink(owner4);
                ownerFound = owner4;
                break;
            case "mikkel":
                flashOrBlink(owner5);
                ownerFound = owner5;
                break;
            default:
                return new Remotes("No owner has that name", " ", 0);
        }
        return ownerFound;
    }
    static void flashOrBlink(Remotes owner){
        if (owner.battery >= 50){
            owner.trackRemote();
        } else owner.blink();
    }
}
