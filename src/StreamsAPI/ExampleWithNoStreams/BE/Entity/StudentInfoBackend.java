package StreamsAPI.ExampleWithNoStreams.BE.Entity;

public class StudentInfoBackend {
    private String name;
    private int alter;
    private String email;
    private String adresse;

    public StudentInfoBackend(String name, int alter, String email, String adresse) {
        this.name = name;
        this.alter = alter;
        this.email = email;
        this.adresse = adresse;
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

    @Override
    public String toString() {
        return "StudentInfoBackend{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
