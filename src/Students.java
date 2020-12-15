public class Students implements Comparable<Students>{
    private String name;

    public Students(String name){ this.name = name; }

    public String getName() { return name; }

    @Override
    public String toString() { return this.name; }

    @Override
    public int compareTo(Students students) {
        return this.name.compareTo(students.getName());
    }
}
