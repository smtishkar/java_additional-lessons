/**
 * ClassAndObject
 */
public class ClassAndObject {
public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Рома";
    person1.age = 50;
    // person1.speak();
    // person1.sayHello();
    

    Person person2 = new Person();
    person2.name = "Вова";
    person2.age = 20;
    // person2.speak();
    // person2.sayHello();
    int year1 = person1.calculationYearsToRetirement();
    int year2 = person2.calculationYearsToRetirement();
    

    System.out.println("Первому человека до пенсии " + year1);
    System.out.println("Второму человека до пенсии " + year2);

    // System.out.println( person1.name + ' ' + person1.age);
    // System.out.println( person2.name + ' ' + person2.age);
}
    

}

class Person{
    String name;
    int age;

    int calculationYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    void sayHello(){
        System.out.println("Привет!");
    }



}