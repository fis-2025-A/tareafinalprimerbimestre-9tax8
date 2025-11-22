package Ejercicio2;

import java.util.Arrays;
import java.util.Objects;

public class Course {

    private Module[] modules = new Module[20];
    private int moduleCount = 0;
    private String name;
    private int duration; 
    private double price;

    public Course(String name, int duration, double price) {
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    //some previously introduced code omitted here…
    // 'addModule' adds a parameter module to the array.
    public void addModule(Module new_module){ 
        if(moduleCount < modules.length){
            modules[moduleCount] = new_module;
            moduleCount++; 
        } else { 
            System.out.println("Cannot add more modules"); 
        }
    }

    public int getTotalCredits(){
        int total = 0;
        for (int i = 0; i < getModuleCount(); i++) {
            total += getModules()[i].getCreditPoints();
        }
        return total;
    }

    public Module[] getModules() {
        return modules;
    }

    public int getModuleCount() {
        return moduleCount;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", moduleCount=" + moduleCount +
                ", totalCredits=" + getTotalCredits() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return duration == course.duration &&
                Double.compare(course.price, price) == 0 &&
                moduleCount == course.moduleCount &&
                Objects.equals(name, course.name) &&
                Arrays.equals(modules, course.modules);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, duration, price, moduleCount);
        result = 31 * result + Arrays.hashCode(modules);
        return result;
    }
}