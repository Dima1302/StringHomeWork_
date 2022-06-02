public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String[] b = fullName.split(" ");
        for (int i = 0; i < b.length; i++) {
            if (b[i].contains("ё")) {
                b[i] = b[i].replace("ё", "е");
            }
            if (i == b.length - 1) {
                System.out.print(b[i]);
            } else {
                System.out.print(b[i] + " ");
            }
        }
    }
}
