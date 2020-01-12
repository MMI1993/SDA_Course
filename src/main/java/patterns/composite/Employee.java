package main.java.patterns.composite;

import java.util.List;

public class Employee {
    private String name;
    private String dep;
    private List<Employee> subordonates;

    public Employee(String name, String dep, List<Employee> subordonates) {
        this.name = name;
        this.dep = dep;
        this.subordonates = subordonates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public List<Employee> getSubordonates() {
        return subordonates;
    }

    public void setSubordonates(List<Employee> subordonates) {
        this.subordonates = subordonates;
    }
}
