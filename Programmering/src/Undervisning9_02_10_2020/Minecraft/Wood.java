/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 02-10-2020
 */
package Undervisning9_02_10_2020.Minecraft;

public class Wood {

    private String woodType;
    private String skin = "oakwood.png";
    private boolean canBreak = true;

    Wood() {
        System.out.println(Game.ObjectAdded("Wood"));
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        //Safety
        if (woodType.equals("Oak") || woodType.equals("Dark Oak") || woodType.equals("Birch")) {
            this.woodType = "Oak";
        } else {
            System.out.println("Gonna be Oak anyway");
            this.woodType = "Oak";
        }

    }
}
