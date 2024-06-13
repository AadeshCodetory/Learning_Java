import java.util.*;

public class Pattern {
    public static void main(String[] args) {

        // //Question 1: Solid Rectangle:-

        // //this is nested loop concept because external loop contains another loop
        // //outer loop
        // for (int i=1; i<=4; i++){
        // //inner loop
        // for (int j=1;j<=5;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // Question 2: print the hollow pattern of Star(*) {ERROR FOND}

        // int n=4;
        // int m=5;
        // for (int i=1; i<=n; i++){
        // for (int j=1; j<=m; j++){
        // if (i==1 || j==1 || i==n ||j==m){
        // System.out.print("*");
        // }else {
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
        // }

        //  //Question 3: print Half Pyramid pattern of Star(*):-
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Question 4: print inverted Half Pyramid pattern of Star(*) :-
        //
        // int n = 4;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

        // Question no. 5 Inverted half pyramid:--
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j<= n-i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Question:6 Half Pyramid with number:--
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // Question:7- Print inverted half pyramid of number:--
        // int n=5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n-i+1; j++) {
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // Question:8 Floyd Triangle:-
        // int n=5;
        // int num=1;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(num+" ");
        // num++;
        // }
        // System.out.println();
        // }

        // Question:9 -Print 0-1 triangle:-
        // int n=5;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // int sum = i+j;
        // if (sum%2==0) {
        // System.out.print("1"+" ");
        // }else{
        // System.out.print("0"+" ");
        // }
        // }
        // System.out.println();
        // }

        // Question. 10: Butterfly Pattern:-
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();

        // // upper part
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // // spaces
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // // spaces
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // Question. 11: Solid Rhombus Pattern:-
        // int n=5;
        // for(int i=1; i<=n; i++){
        // for(int j=1;j<=n-i; j++){
        // System.out.print(" ");
        // }
        // for(int j=1; j<=n; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Question. 12:number pyramid Pattern:-
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }


        // Question. 13: Palindromic Pattern:-
        // Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1;j--){
        //         System.out.print(j);
             
        //     }
        //     for(int j=2; j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
    
        // }


        // Question. 14: Diamond Pattern:-

        // int n=4;
        // //upper half:
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
           
        //     System.out.println();
            
        // }
        //lower half
        // for(int i=n;i>=1;i--){
        //      //lower Pattern:
        //      for(int j=n-i;j>=1; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=2*i-1;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
       
    
    }
}
