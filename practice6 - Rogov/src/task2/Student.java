package task2;

class Student implements Comparable<Student> {
    private Integer mark;
    private String name;

    public Student(Integer mark, String name) {
        this.mark = mark;
        this.name = name;
    }



    public int compareTo(Student o) {
        int result = this.mark.compareTo(o.mark);
        return result;
    }

    @Override
    public String toString() {
        return "mark=" + mark +
                ", name='" + name ;
    }
}
