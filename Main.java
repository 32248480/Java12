package pack6;
 import pack6.subpack1.CCircle;
 import pack6.subpack2.CRectangle;
 import pack6.subpack1.subsubpack.CStyle;
public class Main{
public static void main(String args[]){
 CCircle cir=new CCircle();
 CRectangle rect=new CRectangle();
 CStyle sty=new CStyle();
 ((Object) cir).show();
 ((Object) rect).show();
}
}

//ans=15