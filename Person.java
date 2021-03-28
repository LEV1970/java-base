package lesson5.hw;

    public class Person {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Person(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void print() {
            System.out.println(" Сотрудник ФИО: " + name + "; Должность: " + position + "; Email: " + email + ";" +
                    " Телефон: " + phone + "; Оклад: " + salary + "; Возраст: " + age);
        }

        public static void main(String[] args) {
            Person[] person = new Person[5];
            person[0] = new Person("Иванов Иван Иванович", "директор", "ivanov@mail.ru",
                    "8-495-555-55-55", 100000, 50);
            person[1] = new Person("Петров Петр Петрович", "главный инженер", "petrov@mail.ru",
                    "8-495-555-55-56", 75000, 45);
            person[2] = new Person("Сергеев Сергей Сергеевич", "бухгалтер", "sergeev@mail.ru",
                    "8-495-555-55-57", 75000, 39);
            person[3] = new Person("Владимиров Владимир Владимирович", "инженер", "vladimir@mail.ru",
                    "8-495-555-55-58", 50000, 40);
            person[4] = new Person("Антонов Антон Антонович", "менеджер", "antonov@mail.ru",
                    "8-495-555-55-59", 50000, 41);
            for (int i = 0; i < 5; i++) {
                if (person[i].age > 40)
                person[i].print();
            }
        }
    }
