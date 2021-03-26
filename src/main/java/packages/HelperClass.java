package packages;

import java.util.Objects;

public class HelperClass implements Comparable<HelperClass> {
    private final String name;
    private final int counter;

    public HelperClass(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(HelperClass o) {
        return Integer.compare(o.counter, counter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelperClass that = (HelperClass) o;
        return counter == that.counter && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, counter);
    }
}
