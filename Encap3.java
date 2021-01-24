import java.util.*;

class Encap3 {
    private int id;
    private String name;
    private int salary;

    Encap3(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public int GetId() {
        return id;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public void Setsalary(int salary) {
        this.salary = salary;
    }

    public int Getsalary() {
        return salary;
    }
}

class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id:");
        int i = sc.nextInt();

        System.out.println("Enter Name:");
        String j = sc.next();

        System.out.println("Enter Salary:");
        int k = sc.nextInt();

        Encap3 en = new Encap3(i, j, k);
        System.out.println("Id:\t" + en.GetId());
        System.out.println("Name:\t" + en.GetName());
        System.out.println("Salary:\t" + en.Getsalary());

    }
}
