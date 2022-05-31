package JavaLevel1.HomeWorks_L1.HomeWork1;

public class HomeWork1 {
    public static void main(String[] args) {
        int a = summ(4,2,4,2);
        System.out.println(a);

        boolean check1 = getNumbers(8,5);
        System.out.println(check1);
        System.out.println(method(-9));
    }

    static int summ (int value_a, int value_b, int value_c, int value_d){
        int summ = value_a*(value_b+(value_c/value_d));
        return summ;
    }

    static boolean getNumbers (int value_1, int value_2){
        int num = value_1+value_2;
        boolean happy= false;
        if (num>=10 && num<=20){
            happy = true;
        } return happy;

    }
    static String method (int value_1){
        int num = value_1;
        String a = "max";
        String b = "min";
        if (value_1>=0){
            return a;
        }else{
            return b;
        }
    }

}
