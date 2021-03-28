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
            System.out.println(" Сотрудник ФИО: " + this.name + "; Должность: " + this.position + "; Email: " + this.email + "; Телефон: " + this.phone + "; Оклад: " + this.salary + "; Возраст: " + this.age);
        }

        public static void main(String[] args) {
            lesson5.hw.Person[] person = new lesson5.hw.Person[]{new lesson5.hw.Person("Иванов Иван Иванович", "директор", "ivanov@mail.ru", "8-495-555-55-55", 100000, 50), new lesson5.hw.Person("Петров Петр Петрович", "главный инженер", "petrov@mail.ru", "8-495-555-55-56", 75000, 45), new lesson5.hw.Person("Сергеев Сергей Сергеевич", "бухгалтер", "sergeev@mail.ru", "8-495-555-55-57", 75000, 39), new lesson5.hw.Person("Владимиров Владимир Владимирович", "инженер", "vladimir@mail.ru", "8-495-555-55-58", 50000, 40), new lesson5.hw.Person("Антонов Антон Антонович", "менеджер", "antonov@mail.ru", "8-495-555-55-59", 50000, 41)};

            for(int i = 0; i < 5; ++i) {
                if (person[i].age > 40) {
                    person[i].print();
                }
            }

        }
    }

