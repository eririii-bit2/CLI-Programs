import java.util.Scanner;
class SimpleCalculator2022{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.print("\t\tEnter your name: ");
      String name = sc.nextLine();
      System.out.print("------------------------------\n\t\t"+"x: ");
        int x=sc.nextInt();
      System.out.print("\t\ty: ");
        int y=sc.nextInt();
int add = x+y;
int sub = x-y;
int mul = x*y;
int div = x/y;
int mod = x%y;
Scanner sca = new Scanner(System.in);
System.out.print("\n\t\tA. addition"+"\n\t\tB. subtraction"
+"\n\t\tC. multiplication"+"\n\t\tD. division" +"\n\t\tE. modulus"+"\n\n\t\tChoose operator: ");
String ope = sca.nextLine();
if (ope.equalsIgnoreCase("A")) { System.out.println ("\n"+"\t\tThe result is "+add+"\n\t\tThank you "+name);
}else
if (ope.equalsIgnoreCase("B")) { System.out .println("\n" +"\t\tThe result is "+sub+"\n\t\tThank you "+name);
}else
if (ope.equalsIgnoreCase("C")) { System.out .println("\n" +"\t\tThe result is " +mul +"\n\t\tThank you "+name);
}else
if (ope.equalsIgnoreCase("D")) { System.out.println ("\n" +"\t\tThe result is "+div+"\n\t\tThank you "+name);
}else
if (ope.equalsIgnoreCase("E")) { System.out.println ("\n" +"\t\tThe result is "+mod+"---------------\n\t\tThank you "+name);
}else
{System.out.print("error");}}}