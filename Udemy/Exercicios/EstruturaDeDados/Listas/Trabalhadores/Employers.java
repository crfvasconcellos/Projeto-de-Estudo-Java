package EstruturaDeDados.Listas.Trabalhadores;

public class Employers {
    private String name;
    private int id;
    private double salary;

    public Employers(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;


    }

    @Override
    public String toString() {
        return  this.id+","+this.name+","+ String.format("%.2f",this.salary);
    }
}


