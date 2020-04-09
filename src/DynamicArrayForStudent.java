public class DynamicArrayForStudent {

    private Student[] students = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] temp = new Student[students.length + 10];
        for (int i = 0; i < students.length; i++) {
            temp[i] = students[i];
        }
        students = temp;
    }

    public Student getStudentByName(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                return students[i];
            }

        }
        return null;



    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(students[i] + " ");
        }
    }




}
