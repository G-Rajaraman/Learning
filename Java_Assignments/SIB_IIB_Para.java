package basicprogram;
public class SIB_IIB_Para{
SIB_IIB_Para(){System.out.println("Non Para Constructor");}
SIB_IIB_Para(boolean a, byte b){System.out.println("Para Constructor 1");}
SIB_IIB_Para(int a, double b){System.out.println("Para Constructor 2");}
static{System.out.println("SIB 1");}
static{System.out.println("SIB 2");}
{System.out.println("IIB 1");}
{System.out.println("IIB 2");}
public static void main(String[] args) {
new SIB_IIB_Para();
new SIB_IIB_Para(true,(byte)32);
new SIB_IIB_Para(3121,2.544443);
System.out.println("Main Method");}
}
