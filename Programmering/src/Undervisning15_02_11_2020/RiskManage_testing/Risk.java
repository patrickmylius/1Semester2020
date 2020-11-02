/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 02-11-2020
 */
package Undervisning15_02_11_2020.RiskManage_testing;

public class Risk {
    private String description;
    private String consequence;
    private double probabilityPercent;
    private Probability probabilityLevel;


    public String hello() {
        return "Hello";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConsequence() {
        return consequence;
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }

    public double getProbabilityPercent() {
        return probabilityPercent;
    }

    public void setProbabilityPercent(double probabilityPercent) {
        this.probabilityPercent = probabilityPercent;
    }

    public Probability getProbabilityLevel() {
        return probabilityLevel;
    }

    public void setProbabilityLevel(Probability probabilityLevel) {
        this.probabilityLevel = probabilityLevel;
    }
}
