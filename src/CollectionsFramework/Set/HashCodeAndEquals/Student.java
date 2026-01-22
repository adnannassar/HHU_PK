package CollectionsFramework.Set.HashCodeAndEquals;


import java.util.Objects;

class Student implements Comparable<Student> {
    String name;
    int age;
    int mtkr;
    int id;

    public Student(String name, int age, int mtkr, int id) {
        this.name = name;
        this.age = age;
        this.mtkr = mtkr;
        this.id = id;
    }

    @Override
    public String toString() {
        return "(" + id + ", " + name + ", " + age + ", " + mtkr + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, mtkr);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        } else {
            Student s = (Student) o;
            if (this.id == s.id && this.name.equals(s.name) && this.age == s.age && this.mtkr == s.mtkr) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }
}
