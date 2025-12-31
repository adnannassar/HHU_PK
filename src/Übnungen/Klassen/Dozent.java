package Übnungen.Klassen;

public class Dozent {
    String name;
    String lehrgebiet;
    boolean dekan = false;
    char geschlecht;

    Dozent(String name, String lehrgebiet, char geschlecht) {
        this.name = name;
        this.lehrgebiet = lehrgebiet;
        this.geschlecht = geschlecht;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLehrgebiet(String lehrgebiet) {
        this.lehrgebiet = lehrgebiet;
    }

    void setDekan(boolean dekan) {
        this.dekan = dekan;
    }

    void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    String getName() {
        return name;
    }

    String getLehrgebiet() {
        return lehrgebiet;
    }

    boolean isDekan() {
        return dekan;
    }

    char getGeschlecht() {
        return geschlecht;
    }

    @Override
    public String toString() {
        String dekanStatus;
        if (isDekan()) {
            dekanStatus = "Ja";
        } else {
            dekanStatus = "Nein";
        }
        return "\nDozent: " + name + ", " + geschlecht + ", " + lehrgebiet + " , Is Dozent ein Dekan? " + dekanStatus;
    }
}