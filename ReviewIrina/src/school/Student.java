package school;

public class Student {
    public static void main(String[] args) {
        String nameHeader = "name";
        String lastNameHeader = "lastName";
        String ageHeader = "age";
        String genderHeader = "gender";
        String gradeHeader = "grade";

        String name1 = "Вова";
        String lastName1 = "Cидоров";
        int age1 = 12;
        char gender1 = 'M';
        int grade1 = 6;

        String name2 = "Маша";
        String lastName2 = "Семенова";
        int age2 = 7;
        char gender2 = 'Ж';
        int grade2 = 1;
        System.out.println("_____________________________________________________________________");
        System.out.println(nameHeader + ": " + name1 + ", " + lastNameHeader + ": " + lastName1 + ", " + ageHeader + ": " + age1 + " лет," + " " + genderHeader + ": " + gender1 + ", " + gradeHeader + ": " + grade1 + " класс");
        System.out.println(nameHeader + ": " + name2 + ", " + lastNameHeader + ": " + lastName2 + ", " + ageHeader + ": " + age2 + " лет," + " " + genderHeader + ": " + gender2 + ", " + gradeHeader + ": " + grade2 + " класс");
        System.out.println("_____________________________________________________________________");
    }
}