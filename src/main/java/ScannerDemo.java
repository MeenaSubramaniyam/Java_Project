import java.util.Scanner;

class Scanners {

    public static void main (String[] args){
    int sum=0, count=0;
        Scanner sc = new Scanner(System.in);
       /* String str1 = sc.next();
        System.out.println("next string "+str1.charAt(3));
        String str2 = sc.nextLine();
        System.out.println("next line  "+str2);
        int num = sc.nextInt();
        System.out.println("next int "+num);
        float f = sc.nextFloat();
        System.out.println("next float"+f);*/

        while (sc.hasNextInt())
        {
            int num1 = sc.nextInt();
            sum += num1;
            count++;
        }
        System.out.println("sum "+sum);
        System.out.println("count "+count);

    }
}
