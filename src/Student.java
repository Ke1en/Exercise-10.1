public class Student extends Person{
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    void performDuty() {
        System.out.println("Студент " + getName() + " учится в классе " + grade);
    }

    @Override
    void callPersonToDuty(Person person) {
        performDuty();
    }

    public void study() {
        System.out.println("Студент " + getName() + " делает домашнее задание");
    }


}
