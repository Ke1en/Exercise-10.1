public class Teacher extends Person{
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void performDuty() {
        System.out.println("Учитель " + getName() + " преподает предмет " + subject);
    }

    @Override
    void callPersonToDuty(Person person) {
        performDuty();
    }

    public void teach() {
        System.out.println("Учитель " + getName() + " объясняет новую тему по предмету " + subject);
    }
}
