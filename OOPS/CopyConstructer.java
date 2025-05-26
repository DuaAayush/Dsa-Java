public class CopyConstructer {
    public static void main(String[] args) {
        int[] marks = new int[]{10, 20, 30};
        Student s1 = new Student("aayush", 20, marks);
        Student s2 = new Student(s1);

        // To verify:
        System.out.println("Original: " + s1.name + ", " + s1.age + ", " + s1.marks[0]);
        System.out.println("Copy: " + s2.name + ", " + s2.age + ", " + s2.marks[0]);
    }
}

class Student {
    int age;
    String name;
    int marks[];

    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }
    ////// Shallow Copy
    /// 
    Student(Student s, boolean deepCopy) {
        this.name = s.name;
        this.age = s.age;
        this.marks = s.marks;
    }

    ///// deeeeeppp copyyyyyy
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}

