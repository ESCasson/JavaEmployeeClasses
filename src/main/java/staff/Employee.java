package staff;

public abstract class Employee {
    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name != null){
        this.name = name;}
    }

    public void raiseSalary(double payRaise){
        if(payRaise >0) {
            salary += payRaise;
        }
    }

    public double payBonus(){
        return salary/100;
    }
}
