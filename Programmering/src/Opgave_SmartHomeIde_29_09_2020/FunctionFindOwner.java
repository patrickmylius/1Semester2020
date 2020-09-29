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
        //Returns "remoteOwner" now holds an owner.
        switch (remoteOwner.toLowerCase()) {
            case "patrick":
                if (owner1.battery >= 50) {
                    owner1.trackRemote();
                } else owner1.blink();
                ownerFound = owner1;
                break;
            case "usamah":
                if (owner2.battery >= 50) {
                    owner2.trackRemote();
                } else owner2.blink();
                ownerFound = owner2;
                break;
            case "daniella":
                if (owner3.battery >= 50) {
                    owner3.trackRemote();
                } else owner3.blink();
                ownerFound = owner3;
                break;
            case "danijel":
                if (owner4.battery >= 50) {
                    owner4.trackRemote();
                } else owner4.blink();
                ownerFound = owner4;
                break;
            case "mikkel":
                if (owner5.battery >= 50) {
                    owner5.trackRemote();
                } else owner5.blink();
                ownerFound = owner5;
                break;
            default:
                return new Remotes("No owner has that name", " ", 0);
        }
        return ownerFound;
    }
}
