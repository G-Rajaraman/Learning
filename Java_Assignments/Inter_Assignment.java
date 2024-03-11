package abstraction;
interface pclass1{
abstract void add(int a);}
interface pclass2{void sub();}
interface pclass3{void div();}
interface pclass4{double mult();}
interface pclass5{void add();}
public class Inter_Assignment implements pclass1,pclass2,pclass3,pclass4,pclass5 {
public void add(int a) {System.out.println("add from pclass1");}
public void div() {System.out.println("div from pclass3");}
public void sub() {System.out.println("sub from pclass2");}
public void add() {System.out.println("add from pclass5");}
public static void main(String[] args) {Inter_Assignment I= new Inter_Assignment();
I.add(10);I.sub();I.div();I.add();I.mult();
}
public double mult() {System.out.println("mult from pclass4");return 10.21;}
}
