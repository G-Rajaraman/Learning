package basicprogram;
public class SIB_IIB 
{static{System.out.println("Hi I am SIB 1");}
static{System.out.println("Hi I am SIB");}
static{System.out.println("Hi I am SIB 2");}
static{System.out.println("Hi I am SIB 3");}
SIB_IIB(){System.out.println("Constructor");}
{System.out.println("IIB 1");}
{System.out.println("IIB 2");}
static void print(){System.out.println("print static method");}
SIB_IIB(int a,int b){System.out.println("print static method");}
void print_nonStatic(){System.out.println("print non-static method");}
public static void main(String[] args) //main method
{System.out.println("Hi I am main Method");	new SIB_IIB();new SIB_IIB();
print();
SIB_IIB.print();
SIB_IIB S1=new SIB_IIB();
S1.print_nonStatic();}}
