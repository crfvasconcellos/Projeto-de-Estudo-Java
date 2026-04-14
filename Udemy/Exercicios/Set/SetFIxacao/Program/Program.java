package Set.SetFIxacao.Program;

import Set.SetFIxacao.Entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Student> a = new HashSet<>();
        Set<Student> b = new HashSet<>();
        Set<Student> c = new HashSet<>();
        Set<Student> total = new HashSet<>();

        System.out.println("How many students for course A? ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            int studentkey = sc.nextInt();
            Student student = new Student(studentkey);
            a.add(student);
            total.add(student);
        }

        System.out.println("How many students for course B? ");
        qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            int studentkey = sc.nextInt();
            Student student = new Student(studentkey);
            b.add(student);
            total.add(student);
        }

        System.out.println("How many students for course C? ");
        qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            int studentkey = sc.nextInt();
            Student student = new Student(studentkey);
            c.add(student);
            total.add(student);
        }

        System.out.printf("Total-- \nA: %d \nB: %d \nC: %d \nTotal: %d",a.size(),b.size(),c.size(),total.size());




    }
}
