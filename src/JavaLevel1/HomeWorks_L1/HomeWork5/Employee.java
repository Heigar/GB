package JavaLevel1.HomeWorks_L1.HomeWork5;

public class Employee {
    private String name;
    private String post;
    private String mail;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String post, String mail, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void showInfo () {
        System.out.println(this.name + " " + this.post + " " + this.mail + " " + this.phone + " " + this.salary + " " + this.age);
    }
}
