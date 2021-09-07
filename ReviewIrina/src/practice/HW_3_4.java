import java.math.BigDecimal;

public class HW_3_4 {
    public static void main(String[] args) {
        Short s = Short.MAX_VALUE;
        System.out.println("Максимальное значение типа данных Short = "+s);
        Short ss = Short.MIN_VALUE;
        System.out.println("Минимальное значение типа данных Short = "+ss);
        byte b = Byte.MIN_VALUE;
        System.out.println("Минимальное значение типа данных byte = "+b);
        b = Byte.MAX_VALUE;
        System.out.println("Максимальное значение типа данных byte = "+b);
        Integer i1 = Integer.MAX_VALUE;
        int i = i1;
        System.out.println("Максимальное значение типа данных int = "+i);
        Integer ii = Integer.MIN_VALUE;
        System.out.println("Минимальное значение типа данных int = "+ii);
        Integer iI= i;
        System.out.println("Максимальное значение типа данных Integer = "+iI);
        i=ii;
        System.out.println("Минимальное значение типа данных int = "+i);
        System.out.println("____________________________________________");

        BigDecimal first,second, result ;
        first = new BigDecimal("10.099");
        second = new BigDecimal("20.0999");
        result = first.add(second);
        System.out.println(result);
        
        System.out.format("%.2f\n", Math. PI);
        for (char alphabet = 'А'; alphabet <= 'Я'; alphabet++) {
            System.out.print(alphabet+ " ");
        }
        System.out.println(" ");

        int numbers;
        for (numbers = 9; numbers >=0; numbers --){
            System.out.print(numbers + " ");
        }
        System.out.println(" ");
        System.out.println("____________________________________________");
        double exp = Math.exp(1);
        float e = (float)exp;
        System.out.format("%.3f\n",e);
        System.out.println(" ");
        System.out.println("____________________________________________");
        char c = 'a';
        System.out.println(c);
        System.out.println(" ");
        System.out.println("____________________________________________");
        char cc = 'а';
        System.out.println(cc);
        System.out.println(" ");
        System.out.println("____________________________________________");
    }
}
