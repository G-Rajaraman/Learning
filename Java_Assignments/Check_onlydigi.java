package string_practice;
public class Check_onlydigi extends Object 
{
public static void main(String[] args) {
String input= "String@123"; 
int digi=0;
for(int i=0;i<input.length();i++) {
	char c= input.charAt(i);
	if(Character.isDigit(c)) {
		digi++;
	}
	}
if(digi==input.length()) {System.out.println("The given string contains only digits");}
else {{System.out.println("The given string does't contain only digits");}}
}
}

