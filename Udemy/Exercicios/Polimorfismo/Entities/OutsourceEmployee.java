package Polimorfismo.Entities;

public class OutsourceEmployee extends Employee {

    protected double additionalCharge;


    public OutsourceEmployee(String name, int hours, double valuePerHour,double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;

    }

    @Override
    public double payment(){
        return (double) this.hours * valuePerHour + additionalCharge * 1.1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("- $ " + payment());
        return sb.toString();
    }


}
