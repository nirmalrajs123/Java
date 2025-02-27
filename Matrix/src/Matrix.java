import java.util.Scanner;
public class Matrix {
private static int[][] b;
private static int[][] a;

public static void main(String arg[]) {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the row of matrix 1");
  int r1=s.nextInt();
  System.out.println("Enter the row of matrix 1");
  int c1=s.nextInt();
  System.out.println("Enter the row of matrix 2");
  int r2=s.nextInt();
  System.out.println("Enter the row of matrix 2");
  int c2=s.nextInt();
  System.out.println("Enter the element of matrix 1");
  for(int i=0;r1>i;i++) {
	  for(int j=0;c1>j;j++) {		  
  int a[][]=new int [i][j];
	  } }
  System.out.println("Enter the element of matrix 2");
  for(int i=0;r2>i;i++) {
	  for(int j=0;c2>j;j++) {		  
  int b[][]=new int [i][j];
	  } }
  System.out.println("the multiplication of matrix ");
  int c[][]=new int[r1][c2];
  c[r1][c2]=0;
  for(int i=0;r1>i;i++) {
	  for(int j=0;c2>j;j++) {
		  for(int k=0;c1>k;k++){
	  
c[i][j]+=a[i][k]*b[k][j];
}}
}
  System.out.println("Enter the element of matrix 2");
  for(int i=0;r1>i;i++) {
	  for(int j=0;c2>j;j++) {		  
		  System.out.println("Enter"+c[i][j]);
	  } }}}
