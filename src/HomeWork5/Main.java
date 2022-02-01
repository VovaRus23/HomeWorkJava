package HomeWork5;

public class Main {

    public static void main(String[] args) {

        Employee randomEmployee = new Employee("Vasily Pupkin", "Lazy Head", "absent", 89997776655L, 1, 100);

        Employee[] arrayEmployee = new Employee[5];
        arrayEmployee[0] = new Employee("Ivan Kruglov", "Director", "ivan27@mail.ru", 89096530286L, 350000, 43);
        arrayEmployee[1] = new Employee("Sergey Moroz", "Manager", "srg163@yandex.ru", 84957883162L, 70000, 35);
        arrayEmployee[2] = new Employee("Alina Vinogradova", "Marketing specialist", "vino37@gmail.ru", 84957776655L, 85000, 32);
        arrayEmployee[3] = new Employee("Vladimir Rogov", "Security specialist", "silavnas97@mail.ru", 84959596556L, 60000, 38);
        arrayEmployee[4] = new Employee("Svetlana Pyatova", "Cleaning specialist", "flowers68@yandex.ru", 89396366810L, 25000, 55);

        for(int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getShowAge() > 40) {
                arrayEmployee[i].getShowInfo();
            }
        }

    }

}
