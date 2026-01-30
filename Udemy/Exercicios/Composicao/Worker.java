package Composicao;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private List<HourContract> contracts = new ArrayList<>();
    private  Department department;

    public Worker(String name, WorkerLevel level, double baseSalary, String Departmentename) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = new Department(Departmentename);
    }

    public void addContract(HourContract contract){
        contracts.add(contract);

    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month){

        double total =  0;

        for (HourContract c : contracts){

            int ano = c.getDate().getYear() + 1900;
            int mes = c.getDate().getMonth() + 1;

            if (ano == year && mes == month){

                total = total + c.totalValue();

            }

        }

        return total + this.baseSalary;
    }


    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}
