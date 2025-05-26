Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }