package Polimorfismo.Employers.Entities;

public class Employee {
    protected String name;
    protected int hours;
    protected double valuePerHour;


    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public double payment(){
        return (double) this.hours * valuePerHour;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("- $ " + payment());
        return sb.toString();
    }
}
