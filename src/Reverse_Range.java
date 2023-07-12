import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        System.out.println(Arrays.toString(range_reverse(array, b, c)));

    }

    static int[] range_reverse(int[] array, int b, int c) {
        int temp=0;
        while(b<c){
            temp=array[b];
            array[b]=array[c];
            array[c]=temp;
            b++;
            c--;
        }
        return array;
    }
}
