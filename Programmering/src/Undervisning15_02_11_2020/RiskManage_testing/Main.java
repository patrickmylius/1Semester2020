/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 02-11-2020
 */
package Undervisning15_02_11_2020.RiskManage_testing;

public class Main {
    public static void main(String[] args) {
        Risk risk = new Risk();
        risk.setDescription("Something horrible");
        System.out.println(risk.getDescription() + " is gonna happen with " + risk.getProbabilityPercent() + " chance. ");
    }
}
