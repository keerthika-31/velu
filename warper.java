class MyFirstJavaProg{

public static void main(String vars[]){


String x="123";
//int y=(int)x; error
int y=Integer.parseInt(x);
System.out.println(y);



int aa=1784;
//String bb=aa; error
Integer cc=aa;

String bb=cc.toString();
System.out.println(cc);
System.out.println("value of string bb  "+bb);

}
}
