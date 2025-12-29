package Übnungen.Abstract.BVB;

public abstract class Mitglied {
    private String name;
    private String vorname;
    private char type;
    private int id;
    private static int counter;

    public Mitglied(String name, String vorname, char type) {
        this.name = name;
        this.vorname = vorname;
        this.type = type;
        counter++;
        this.id = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public abstract double berechneJahresgehalt();

    public abstract String getSonstiges();
}
