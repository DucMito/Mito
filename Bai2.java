import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so: ");
        int number = Integer.parseInt(scanner.nextLine());
//      Tinh tong
        int sum = 0;
        for (int i = 0; i <= number; i++){
            sum+=i;
        }
        System.out.println("Tong tat ca cac so den n: " + sum);

//        Tinh tich
        /*int mul =1 ;
        for (int i = 2; i <= number ; i++){
            mul=mul*i;
        }
        System.out.println("Mul = " + mul);*/


//      Tinh tong so chan(while)
        /*int sumEvenNumber1 = 0;
        int i = 0;
        while(i <= number){
            if(i % 2 == 0){
                sumEvenNumber1 += i;
            }
            i++;
        }
        System.out.println("Tong so chan: " + sumEvenNumber1);*/

//       Tinh tong so chan(do-while)

        /*int sumEvenNumber2 = 0;
        int i = 0;
        do {
            if(i % 2 == 0) {
                sumEvenNumber2 += i;
            }
            i++;
        } while (i <= number);
        System.out.println("Tong so chan(do-while) : " + sumEvenNumber2);*/

    }

}
