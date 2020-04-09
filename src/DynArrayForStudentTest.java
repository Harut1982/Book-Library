import java.util.Scanner;

public class DynArrayForStudentTest {
    public static void main(String[] args) {
        DynamicArrayForStudent dynamicArrayForStudent=new DynamicArrayForStudent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ներմուծեք ուսանողների քանակը");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Ներմուծեք ուսանողի տվյալները");
            System.out.println("անուն:");
            String name = scanner.nextLine();
            System.out.println("ազգանուն:");
            String surname = scanner.nextLine();
            System.out.println("տարիք:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("հեռ.համար:");
            String phone = scanner.nextLine();
            Student student=new Student(name,surname,age,phone);
            dynamicArrayForStudent.add(student);
            dynamicArrayForStudent.print();
            System.out.println();

        }
        System.out.println("Մուտքագրել ուսանողի անուն ազգանուն");
        Student searchedStudent;
        searchedStudent = dynamicArrayForStudent.getStudentByName(scanner.nextLine());
        if (searchedStudent != null) {
            System.out.println("Համընկնում: " + searchedStudent);
        } else {
            System.out.println("հարցմանն համապատասխան ուսանող չի գտնվել:");
        }

    }
}
