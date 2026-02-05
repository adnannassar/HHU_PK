package StreamsAPI.ExampleWithNoStreams.FE.Entity;

public class StudentNoteFrontend {
    private String name;
    private int note;

    public StudentNoteFrontend(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "StudentNote{" +
                "name='" + name + '\'' +
                ", note=" + note +
                '}';
    }
}
