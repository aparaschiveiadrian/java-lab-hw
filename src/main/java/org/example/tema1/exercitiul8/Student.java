package org.example.tema1.exercitiul8;

import java.util.Objects;

public final class Student implements Comparable<Student> {
    private final String nume;
    private final int varsta;
    private final double medie;

    public Student(String nume, int varsta, double medie) {
        this.nume = nume;
        this.varsta = varsta;
        this.medie = medie;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public double getMedie() {
        return medie;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.medie, other.medie);
    }

    @Override
    public boolean equals(Object o){
        if(o == null)
            return false;
        if(this == o){
            return true;
        }
        if(!(o instanceof Student student))
            return false;
        return varsta == student.varsta &&
                Double.compare(student.medie, medie) == 0 &&
                Objects.equals(nume, student.nume);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nume,varsta,medie);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", medie=" + medie +
                '}';
    }
}
