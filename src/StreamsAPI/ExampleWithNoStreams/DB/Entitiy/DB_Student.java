package StreamsAPI.ExampleWithNoStreams.DB.Entitiy;

public class DB_Student {
    private int note;
    private String name;
    private int alter;
    private String email;
    private String adresse;

    public DB_Student(String name, int alter, String email, String adresse, int note) {
        this.name = name;
        this.alter = alter;
        this.email = email;
        this.adresse = adresse;
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
