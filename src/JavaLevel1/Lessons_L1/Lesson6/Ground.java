package JavaLevel1.Lessons_L1.Lesson6;

public class Ground extends Machine{
    public Ground(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Ground{" +
                "name='" + name + '\'' +
                '}';
    }
}
