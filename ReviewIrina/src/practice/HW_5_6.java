public class HW_5_6 {
    public static void main(String[] args) {
        int n;
        int age=18;
        int a = 2;
        int b = 5;
        int c = 14;
        int d = 67;
        int e = 0;
        int expectedResult;

        String line = "____________________________________________";
        String task = "                Task ";
        n=1;
        System.out.println(line);
        System.out.println(task+n);
        System.out.println("Результат выражения (2 = 2) И (7 = 7) равен: " + ((2==2)&& (7==7)));
        System.out.println(line);

        n=2;
        System.out.println(line);
        System.out.println(task+n);
        System.out.println("Результат выражения Не(15 < 3) равен: " + (!(15<3)));
        System.out.println(line);

        n=3;
        System.out.println(line);
        System.out.println(task+n);
        System.out.println("Результат выражения (\"Сосна\" = \"Дуб\") ИЛИ (\"Вишня\" = \"Клён\") равен: "
                + (("Сосна".equals("Дуб")) || ("Вишня".equals("Клён"))));
        System.out.println(line);

        n=4;
        System.out.println(line);
        System.out.println(task+n);
        System.out.println("Результат выражения Не(\"Сосна\" = \"Дуб\")" +  !("Сосна".equals("Дуб")));
        System.out.println(line);

        n=5;
        System.out.println(line);
        System.out.println(task+n);
        System.out.println("Результат выражения (Не(15 < 3)) И (10 > 20) равен: " + ((!(15<3)) && (10<20)));
        System.out.println(line);

        n=6;
        System.out.println(line);
        System.out.println(task+n);
        System.out.println("Результат выражения (\"Глаза даны, чтобы видеть\") И (\"Под третьим этажом находится " +
                "второй этаж\") равен: "
                + ("Глаза даны, чтобы видеть".equals("Под третьим этажом находится второй этаж\") равен: ")));
        System.out.println(line);

        n=7;
        System.out.println(line);
        System.out.println(task+n);
        System.out.println("Результат выражения (6/2 = 3) ИЛИ (7*5 = 20) равен: " + (((6/2)==3) || ((7*5)==20)));
        System.out.println(line);

        n=8;
        System.out.println(line);
        System.out.println(task+n);
        System.out.println("Результат выражения \"Водительские права можно получить, только когда исполнится " +
                "16 лет.\" " + "равен " + ((16 >= age)));
        System.out.println(line);

        n=9;
        System.out.println(line);
        System.out.println(task+n);
        System.out.println("!(Петя ин зе бас) && ((Читает книгу) || (не смотрит в окно))");
        System.out.println(line);

        n=10;
        System.out.println(line);
        System.out.println(task+n);
        System.out.println("(Если ты с другом - тру) && !(Если ты с другом - фалс)");
        System.out.println(line);
        System.out.println();
        n = 2;
        System.out.println("Part " + n);

        n=1;
        System.out.println(line);
        System.out.println(task+n);
        if (a%2 == 0){
            a=a*2;
        }
        expectedResult = 4;
        if (expectedResult==a){
            System.out.println("Pass");
        }
        if (b%2 == 0){
            b=b*2;
        }
        expectedResult = 5;
        if (expectedResult==b){
            System.out.println("Pass");
        }
        if (c%2 == 0){
            c=c*2;
        }
        expectedResult = 28;
        if (expectedResult==c) {
            System.out.println("Pass");
        }
        if (d%2 == 0){
            d=d*2;
        }
            expectedResult = 67;
            if (expectedResult==d) {
                System.out.println("Pass");
            }
        if (e%2 == 0){
            e=e*2;
        }
        expectedResult = 0;
        if (expectedResult==e){
            System.out.println("Pass");
        }
    }
}
