package JavaLevel1.Lessons_L1.Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Machine machine = new Machine("Primary machine");
        System.out.println(machine);

        Machine[] machines = {
                new Ground("BMW"),
                new Water("USS"),
                new Air("TU")
        };
        for (int i = 0; i < machines.length; i++) {
            System.out.println(machines[i]);
            machines[i].go();
            machines[i].stop();
        }
    }
}
