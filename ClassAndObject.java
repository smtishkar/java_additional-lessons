/**
 * ClassAndObject
 */
public class ClassAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-3);
        person1.speak();
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
    }
}

class Person{
    private String name;
    private int age;

    public void setName (String userName){
        if (userName.isEmpty()){
            System.out.println("введено не правильное имя");
        } else {
            name = userName;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge (int userAge){
        if (userAge <0){
            System.out.println("не тот возраст");
        } else {
            age = userAge;
        }
        
    }

    public int getAge(){
        return age;
    }




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