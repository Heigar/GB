package JavaLevel1.Lessons_L1.Lesson6;

public class Air extends Machine{
    public Air(String name) {
        super(name);
    }

    @Override
    public void stop(){
        System.out.println("Stop Air machine.");
    }

    @Override
    public String toString() {
        return "Air{" +
                "name='" + name + '\'' +
                '}';
    }
}
