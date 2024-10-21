public class Principal extends Person{
    private int yearsOfExperience;

    public Principal(String name, int age, int yearsOfExperience) {
        super(name, age);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    void performDuty() {
        System.out.println("Директор " + getName() + " управляет школой с опытом в " + yearsOfExperience + " лет");
    }

    @Override
    void callPersonToDuty(Person person) {
        performDuty();
    }

    public void manage() {
        System.out.println("Директор " + getName() + " проводит собрание с учителями");
    }
}
