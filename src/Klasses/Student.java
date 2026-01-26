package Klasses;

public class Student {
    // Eigenschaften
    private String name; // null
    private int alter; // 0
    private long matrikelnummer;
    private Adresse adresse;

    // constructor
    public Student(String name, int alter, long matrikelnummer, Adresse adresse) {
        this.name = name;
        this.alter = alter;
        this.matrikelnummer = matrikelnummer;
        this.adresse = adresse;
    }

    public Student(String name){
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public long getMatrikelnummer() {
        return matrikelnummer;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    // setter
    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methoden bzw. Aktionen
    public void sichVorstellen() {
        System.out.println("Hallo, ich bin " + name + ", ich bin "
                + alter + " Jahre alt. Meine Matrikelnummer lautet: " + matrikelnummer+
                ". Ich wohne in " + adresse.getAddressInfo()
        );
    }
}
