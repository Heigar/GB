package JavaLevel1.Lessons_L1.Lesson6;

public class Machine {
    public String name;

    public void go(){
        System.out.println("Machine is going on...");
    }

    public void stop(){
        System.out.println("Stop machine.");
    }

    public Machine(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                '}';
    }
}
