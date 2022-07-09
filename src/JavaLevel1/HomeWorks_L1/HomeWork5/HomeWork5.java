package JavaLevel1.HomeWorks_L1.HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5]; // Вначале объявляем массив объектов
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                "892311234", 30000, 30);
        employeeArray[1] = new Employee("Stepanov Stepan", "Manager", "Stepanov@mailbox.com",
                "892312345", 30000, 20);
        employeeArray[2] = new Employee("Borisov Boris", "Engineer", "Borisov@mailbox.com",
                "892326598", 30000, 19);
        employeeArray[3] = new Employee("Egorov Egor", "Manager", "Egorov@mailbox.com",
                "892852369", 30000, 41);
        employeeArray[4] = new Employee("Stasov Stas", "Engineer", "Stasov@mailbox.com",
                "899847456", 30000, 32);


        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].showInfo();
            }
        }

        System.out.println("________________________");

        for (int i = 0; i < employeeArray.length; i++) {
            employeeArray[i].showInfo();
        }


    }


}
