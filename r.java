// public class r{
//     public static void main(String[] args){
//         int i,j,row=6;
//         for(i=0;i<row;i++){
//             for(j=row-i;j>1;j--){
//                 System.out.print(" ");
//             }
//             for(j=0;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// // public class r{
// //     public static void main(String[] args){
// //         int i,j,row=4;
// //         for(i=0;i<row;i++){
// //             for(j=0;j<=i;j++){
// //                 System.out.print("* ");
// //             }
// //             System.out.println();

// //         }
// //     }
// // }

// // public class r{
// //     public static void main(String[] args){
// //         int i,j,row=4;
// //         for(i=0;i<row;i++){
// //             for(j=2*(row-i);j>0;j--){
// //                 System.out.print(" ");
// //             }
// //             for(j=0;j<=i;j++){
// //                 System.out.print("* ");
// //             }
// //             System.out.println();
// //         }

// //     }
// // }



// import java.util.Scanner;  
// public class r
// {  
// public static void main(String args[])  
// {  
// int row, i, j, space = 1;  
// System.out.print("Enter the number of rows you want to print: ");  
// Scanner sc = new Scanner(System.in);  
// row = sc.nextInt();  
// space = row - 1;  
// for (j = 1; j<= row; j++)  
// {  
// for (i = 1; i<= space; i++)  
// {  
// System.out.print(" ");  
// }  
// space--;  
// for (i = 1; i <= 2 * j - 1; i++)  
// {  
// System.out.print("*");  
// }  
// System.out.println("");  
// }  
// space = 1;  
// for (j = 1; j<= row - 1; j++)  
// {  
// for (i = 1; i<= space; i++)  
// {  
// System.out.print(" ");  
// }  
// space++;  
// for (i = 1; i<= 2 * (row - j) - 1; i++)  
// {  
// System.out.print("*");  
// }  
// System.out.println("");  
// }  
// }  
// } 

public class r{
    public static void main(String[] args){
        double a=2.3,b=4,c=5.6;
        double root1,root2;

        double determinant = b*b-4*a*c;

        if(determinant > 0){
            root1 = (-b + Math.sqrt(determinant)) / (2*a);
            root2 = (-b - Math.sqrt(determinant)) /(2*a);
            System.out.format("root1 = %.2f and root2 = %.2f",root1,root2);
        }
        else if(determinant == 0){
            root1 = root2 = -b/(2*a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else{
            double real = -b/(2*a);
            double imaginary = Math.sqrt(-determinant)/(2*a);
            System.out.format("root1 = %.2f+%.2fi", real,imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real,imaginary);
        }
        
    }
}