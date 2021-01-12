class InnerClass {
    private static int studentNum;
    private Student[] stdList;
    private final int MAX_STD_NUM = 10;

    class Student {
        int id;
        String name;

        Student(String argStdName) {
            id = ++studentNum;
            name = argStdName;
        }
    }

    boolean addStudent(String argStdName) {
        if (studentNum == MAX_STD_NUM)
            return false;

        stdList[studentNum - 1] = new Student("Siyeon Park");
        return true;
    }
}
