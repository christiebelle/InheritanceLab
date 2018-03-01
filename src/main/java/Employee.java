public class Employee {

    private String name;
    private String NI_num;
    private int salary;

    public Employee(String name, String NI_num, int salary) {
        this.name = name;
        this.NI_num = NI_num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNI_num() {
        return NI_num;
    }

    public void setNI_num(String NI_num) {
        this.NI_num = NI_num;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void increaseSalary(){
        this.salary =(this.salary += 1000);
    }
}
