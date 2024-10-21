/*

Задача: Моделирование школьной системы
Создайте приложение для управления школьной системой, где есть разные роли: ученики, учителя и директор. Каждый тип человека должен обладать своими уникальными обязанностями и возможностями, но у всех людей должны быть общие характеристики.
Условия задачи:
        1. Абстрактный класс Person:
Поля:
name (имя)
age (возраст)
Методы:
Абстрактный метод performDuty(): каждый тип человека выполняет свою обязанность.
        2. Классы-наследники:
Класс Student (наследуется от Person):
Поле: grade (класс, в котором учится)
Переопределение метода performDuty(): выводит сообщение "Студент {name} учится в классе {grade}".
Метод study(): выводит "Студент {name} делает домашнее задание".
Класс Teacher (наследуется от Person):
Поле: subject (предмет, который преподает)
Переопределение метода performDuty(): выводит сообщение "Учитель {name} преподает предмет {subject}".
Метод teach(): выводит "Учитель {name} объясняет новую тему по предмету {subject}".
Класс Principal (наследуется от Person):
Поле: yearsOfExperience (количество лет опыта)
Переопределение метода performDuty(): выводит сообщение "Директор {name} управляет школой с опытом в {yearsOfExperience} лет".
Метод manage(): выводит "Директор {name} проводит собрание с учителями".
        3. Инкапсуляция:
Сделайте все поля приватными и создайте для них getters и setters, чтобы контролировать доступ к данным.
4. Полиморфизм:
Создайте метод callPersonToDuty(Person person), который принимает объект типа Person и вызывает у него метод performDuty(). Благодаря полиморфизму этот
метод будет корректно работать как для учеников, так и для учителей и директора.
Дополнительные условия:
Для каждого типа человека добавьте собственные методы, которые будут уникальны для их роли (например, учитель объясняет урок, ученик учит уроки, директор
управляет школой).
В main() создайте список людей, которые будут состоять из объектов Student, Teacher, и Principal. Примените к каждому человеку метод callPersonToDuty().
*/

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Дмитрий",25,"7A");
        student.performDuty();
        student.study();

        System.out.println();

        Teacher teacher = new Teacher("Алексей", 38, "Мат. анализ");
        teacher.performDuty();
        teacher.teach();

        System.out.println();

        Principal principal = new Principal("Анатолий", 51, 9);
        principal.performDuty();
        principal.manage();

        System.out.println();
        System.out.println();

        Person person = new Student("Дмитрий",25,"7A");
        person.callPersonToDuty(person);

        Person person1 = new Teacher("Алексей", 38, "Мат. анализ");
        person1.callPersonToDuty(person1);

        Person person2 = new Principal("Анатолий", 51, 9);
        person2.callPersonToDuty(person2);

    }
}