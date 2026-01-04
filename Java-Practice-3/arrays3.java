
class Student {
    int rollno;
    String name;
    int marks;
}

public class arrays3 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.marks = 97;
        s1.name = "x";

        Student s2 = new Student();
        s2.rollno = 2;
        s2.marks = 98;
        s2.name = "y";

        Student s3 = new Student();
        s3.rollno = 3;
        s3.marks = 99;
        s3.name = "z";

        // here we are not creating 3 student object
        // here we are creating a array which can hold student references
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].marks);
        }

    }

}