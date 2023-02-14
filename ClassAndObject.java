/**
 * ClassAndObject
 */
public class ClassAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();


        person1.setNameAndAge("Роман", 20);
        person1.speak();

        Person person2 = new Person();

        person2.setNameAndAge("Вова", 30);
        person2.speak();
    }
}

class Person{
    String name;
    int age;


    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;

    }

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