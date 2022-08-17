// import java.util.regex.Pattern;

//////////add two numbers
// public class simple {
//     public static void main(String[] args) {
//         int i = 10;
//         int j = 10;
//         int k = i+j;
//         System.out.println(k);
        
//     }
    
// }

//Widening
// public class simple{
//     public static void main(String[] args){
//         int i = 10;
//         float f = i;
//         System.out.println(i);
//         System.out.println(f);
//     }
// }

//typeCasting
// public class simple{
//     public static void main(String[] args){
//         float f = 10.5f;
//         int i = (int)f;
//         System.out.println(f);
//         System.out.println(i);
//     }
// }

// over flow
// public class simple{
//     public static void main(String[] args){
//         int i = 1000;
//         byte j = (byte)i;
//         System.out.println(j);
//     }
// }

// Adding Lower Type
// public class simple{
//     public static void main(String[] args){
//         byte a = 11;
//         byte b = 11;
//         byte c = (byte)(a+b);
//         System.out.println(c);

//     }
// }


///////////////////////////type casting/////////
//wedening
// BSCilfd
// // byte -> short -> char -> int -> long -> float -> double

// // public class simple{
// //     public static void main(String[] args){
// //         byte i = 100;
// //         int kk = i;
// //         long j = kk;
// //         float k = j;
// //         System.out.println(kk);
// //         System.out.println(j);
// //         System.out.println(k);
// //     }
// // }

// // Narrowing
// //DFlicsb
// // Double -> Float -> Long -> Int -> Char -> short -> byte
// // public class simple{
// //     public static void main(String[] args){
// //         double d = 10.09090909090909;
// //         long l = (long)d;
// //         int i = (int)l;
// //         byte b =(byte)i;
// //         System.out.println(d);
// //         System.out.println(l);
// //         System.out.println(i);
// //         System.out.println(b);

// //     }
// // }


// //java program to convert decimal to binary

// // import java.util.Scanner;

// // public class simple {
// //   public static void main(String args[]) {
// //     int num;
// //     Scanner sc = new Scanner(System.in);

// //     System.out.print("Enter any integer number: ");
// //     num = sc.nextInt();

// //     String str = Integer.toBinaryString(num);
// //     System.out.println("Binary number is : " + str);
// //   }
// // }


// // public class simple{      //left pratten
// //   public static void main(String[] args){
// //     int i,j,row=5;
// //     for(i=0;i<row;i++){
// //       for(j=0;j<=i;j++){
// //         System.out.print("* ");
// //       }
// //       System.out.println();
// //     }
// //   }
// // }


// public class simple{        //right
//   public static void main(String[] args){
//     int i,j,row=5;
//     for(i=0;i<row;i++){
//       for(j=2*(row-i);j>0;j--){
//         System.out.print(" ");
//       }
//       for(j=0;j<=i;j++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }


// public class simple{          //triangle
//   public static void main(String[] agrs){
//     int i,j,row=6;
//     for(i=0;i<row;i++){
//       for(j=row-i;j>1;j--){
//         System.out.print(" ");
//       }
//       for(j=0;j<=i;j++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }





// public class simple{                //down triangle
//   public static void main(String[] args){
//     int rows = 2;
//     for(int i=rows-1;i>=0;i--){
//       for(int j=0;j<=i;j++){
//         System.out.print("*"+"");
//       }
//       System.out.println("");

//     }
//   }
// }


// public class simple{          //mirrored
//   public static void main(String[] args){
//     int n = 5;
//     for(int i=0;i<=n;i++){
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int k=0;k<=i;k++){
//         System.out.print("*");
//       }
//       System.out.println("");
//     }
//   }
// }



// public class simple{             //revers
//   public static void main(String[] args){
//     int rows = 8;
//     for(int i=0;i<=rows-1;i++){
//       for(int j=0;j<=i;j++){
//         System.out.print(" ");
//       }
//       for(int k=0;k<=rows-1-i;k++){
//         System.out.print("*" + " ");
//       }
//       System.out.println("");
//     }
//   }
// }


// public class simple{      // basic oparetor
//   public static void main(String args[]){  
//   int x=10;  
//   System.out.println(x++);//10 (11)  
//   System.out.println(++x);//12  
//   System.out.println(x--);//12 (11)  
//   System.out.println(--x);//10  
//   }
// } 


// public class simple{        //left
//   public static void main(String[] args){
//     int row = 4;
//     for(int i=1;i<=row;i++){
//       for(int k = 3; k>=i; k--){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=i;j++){
//         System.out.print("*");
//       }
//       System.out.println("");
//     }
//   }
// }



// Java implementation of the above approach

// class simple
// {

// 	static void check(char ch)
// 	{
	
// 		if (ch >= 'A' && ch <= 'Z')
// 			System.out.println("\n" + ch +
// 					" is an UpperCase character");
// 		else
// 			System.out.println("\n" + ch +
// 					" is not an aplhabetic character" );
// 	}

// 	public static void main(String []args)
// 	{
// 		char ch;
// 		ch = 'A';
// 		check(ch);

	
// 	}
// }




// public class simple{
// 	public static void main(String[] args) {
// 		int n=7,f=0,s=1;

// 		for(int i=0;i<=n;++i){
// 			System.out.print(f+" ");
// 			int nextN = f+s;
// 			f=s;
// 			s=nextN;
// 		}

		
// 	}
// }





// public class simple{
// 	public static void main(String[] args){
// 		int i,fact=1;
// 		int number = 5;
// 		for(i=1;i<=number;i++){
// 			fact = fact * i;
// 		}
// 		System.out.print(fact);
// 	}
// }
