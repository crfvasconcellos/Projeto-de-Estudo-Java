package ExerciciosDeFixacao.Funcionarios;

public class Funcionarios {

    private int id;
    private String name;
    private float salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public void increase(float percentage){

        this.salary = salary + (salary * percentage/ 100);


    }

    public Funcionarios(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + salary;
    }
}
