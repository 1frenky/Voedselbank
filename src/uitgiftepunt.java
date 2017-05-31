/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pavilion
 */
public class uitgiftepunt {
    private String uitgifteNaam;
    private String adres;
    private String plaats;
    private int aantalMensen;
    private int maxCapaciteit;

    public uitgiftepunt(String uitgifteNaam, String adres, String plaats, int aantalMensen, int maxCapaciteit) {
        this.uitgifteNaam = uitgifteNaam;
        this.adres = adres;
        this.plaats = plaats;
        this.aantalMensen = aantalMensen;
        this.maxCapaciteit = maxCapaciteit;
    }

    public String getUitgifteNaam() {
        return uitgifteNaam;
    }

    public void setUitgifteNaam(String uitgifteNaam) {
        this.uitgifteNaam = uitgifteNaam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public int getAantalMensen() {
        return aantalMensen;
    }

    public void setAantalMensen(int aantalMensen) {
        this.aantalMensen = aantalMensen;
    }

    public int getMaxCapaciteit() {
        return maxCapaciteit;
    }

    public void setMaxCapaciteit(int maxCapaciteit) {
        this.maxCapaciteit = maxCapaciteit;
    }
    
}
