package JavaLevel1.Lessons_L1.Lesson6;

public class Water extends Machine{
    public Water(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                '}';
    }
}
