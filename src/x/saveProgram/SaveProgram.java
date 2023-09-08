package x.saveProgram;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.function.Consumer;

public class SaveProgram {
    public static void EvaluateReversePolishNotation(){
        String[] x = {"2","1","+","3","*"};
        String[] y = {"4","13","5","/","+"};

        Stack<Integer> num = new Stack<Integer>();

        for(String i: y){
            if(Character.isDigit(i.charAt(0))){
                num.push(Integer.valueOf(i));
            }else{
                Integer n1 = num.pop();
                Integer n2 = num.pop();

                if(n2>n1) {
                    n1 = n1+n2;
                    n2 = n1-n2;
                    n1 = n1-n2;
                }
                switch (i) {
                    case "+" -> num.push(n1 + n2);
                    case "-" -> num.push(n1 - n2);
                    case "*" -> num.push(n1 * n2);
                    case "/" -> num.push(n1 / n2);
                }
            }
        }
        System.out.println(num.pop());
    }
    public static int[] AddUnique(int[] l1 , int[]l2){
        SortedSet<Integer> s = new TreeSet<Integer>();
        Consumer<int[]> x = (r -> {
            Arrays.stream(r).forEach(number -> s.add(number));
        });
        x.accept(l1);
        x.accept(l2);

        return s.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void ButterFlyPatttern(){
        int n = 7;
        if(n%2 ==0) n=n+1;
        int mid = n/2;
        for (int i = 1; i <= n; i++) {
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            for(int j=0;j<(n*2)-(i*2);j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            for(int j=0;j<(n*2)-(i*2);j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void RotateArrayInJava(){
        int arr[] ={1,2,3,4,5,6,7};
              //[5,6,7,1,2,3,4]
        int k=3;
        for(int i=0;i<k;i++){
            for(int j=arr.length-1;j>0;j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            System.out.println();
        }
    }
    public static void SecondLargestElement(){
        int arr[] = {12, 35, 1, 10, 34, 1};
        Arrays.sort(arr);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!= arr[arr.length-1]){
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
