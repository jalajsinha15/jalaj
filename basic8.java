import java.util.Scanner;

class SubstringsOfAString

{

public static void main(String args[])

{

String str, sub;

int i, c, length;

Scanner sct = new Scanner(System.in);

System.out.println("Enter  string to print all it's substrings:");

str = sct.nextLine(); // User input

length = str.length();

System.out.println("Substrings of \""+str+"\" are :-");

for( c = 0 ; c < length ; c++ )// Calculating all the substring possible

{

for( i = 1 ; i<= length - c ; i++ )

{

sub = str.substring(c, c+i);

System.out.println(sub);

}

}

}

}

