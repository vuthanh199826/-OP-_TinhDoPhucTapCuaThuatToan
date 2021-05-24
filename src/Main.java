import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi vao day");
        String str = sc.nextLine();
        int[] arr =new int[255];                           //1
        for (int i = 0; i < str.length(); i++) {           //2
            int ascii = str.charAt(i);                     //3
            arr[ascii] += 1;                               //4
        }
        int max =0;                                        //5
        char character = (char) 255;                       //6
        for (int i = 0; i < 255; i++) {                    //7
            if(arr[i]>max){                                //8
                max = arr[i];                              //9
                character = (char) i;                      //10
            }
        }
        System.out.println(character + " lap " + max + " lan ");
    }
}
/*
1 - O(1)
2 - O((n).1) = O(n) n là độ dài chuỗi
3 - O(1)
4 - O(1)
5 - O(1)
6 - O(1)
7 - 0((255).1) = O(255)
8 - O(1)
9 - O(1)
10 - O(1)
n <= 255 time7 = O(255)
n > 255 time2 = O(n)
*/