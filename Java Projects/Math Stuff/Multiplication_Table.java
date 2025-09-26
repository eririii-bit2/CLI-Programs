import java.util.Scanner;
class Multiplication_Table {
    static void leepogi() {
    				System.out.println("Multiplication Table");
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.equals("")){
            leepogi();}else 
      {System.out.print("Enter number: ");} 
            String x = sc.nextLine();
             int m = Integer.parseInt(x);
     if (x.equals("")){System.out.print("Error!!");} else{
         for (int i = 0; i <=10; i++){
    System.out.print(x+"x"+i+"="+ m*i+"\n");
   }
   System.out.print("End program? Yes or No\n");
   String n = sc.nextLine();
   if (n.equals("Yes")) if(n.equals("yes")){System.out.print("Thank you for your service "+name);
       
   }else {
   leepogi();
   }
     } }
				public static void main(String[]args){
								leepogi();
				} }
