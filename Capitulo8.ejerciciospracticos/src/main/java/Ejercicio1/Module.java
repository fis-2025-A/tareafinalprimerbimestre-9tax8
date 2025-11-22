package Ejercicio1;

import java.util.Objects;
public class Module {
    private String name;
    private int creditPoints;

    public Module(String name, int creditPoints) {
        this.name = name;
        this.creditPoints = creditPoints;
    }

    public String getName() {
        return name;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", creditPoints=" + creditPoints +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Module module = (Module) o;
        return creditPoints == module.creditPoints &&
                Objects.equals(name, module.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creditPoints);
    }
}
