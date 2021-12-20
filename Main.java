package pack6;
 import pack6.subpack1.CCircle;
 import pack6.subpack2.CRectangle;
 import pack6.subpack1.subsubpack.CStyle;
public class Main{
public static void main(String args[]){
 CCircle cir=new CCircle();
 CRectangle rect=new CRectangle();
 CStyle sty=new CStyle(1);
 cir.show();
 rect.show();
}
}

//C:\Documents and Settings\Administrator>cd c:\java
//C:\Java>cd Main
//C:\Java\Main>javac pack6\subpack1\CCircle.java
//C:\Java\Main>javac pack6\subpack2\CRectangle.java
//C:\Java\Main>javac pack6\subpack1\subsubpack\CStyle.java
//C:\Java\Main>javac pack6\Main.java
//C:\Java\Main>java pack6.Main
//style1
//show() method of class CCircle called
//show() method of class CRectangle called