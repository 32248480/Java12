//CStyle.java,此檔案置於 pack6\subpack1\subsubpack 資料夾內
package pack6.subpack1.subsubpack;

public class CStyle {
 public int style;
 
public CStyle(int n) {
 style=n;
 System.out.println("style"+style);
 }
}

//CCircle.java, 此檔案置於 pack6\subpack1 資料夾內
package pack6.subpack1;
public class CCircle{
public void show(){
 System.out.println("show() method of class CCircle called");
}
}

//CRectangle.java, 此檔案置於 pack6\subpack2 資料夾內
package pack6.subpack2;
public class CRectangle{
public void show(){
 System.out.println("show() method of class CRectangle called");
}
}

//Main.java, 此檔案置於 pack6 資料夾內
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
