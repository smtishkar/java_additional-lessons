/**
 * ClassAndObject
 */
public class ClassAndObject {
public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Рома";
    person1.age = 50;
    
    Person person2 = new Person();
    person2.name = "Вова";
    person2.age = 20;

    System.out.println( person1.name + ' ' + person1.age);
    System.out.println( person2.name + ' ' + person2.age);
}
    

}

class Person{
    String name;
    int age;

}