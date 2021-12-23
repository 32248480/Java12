//CSphere.java,此檔案置於hw12_9\pack9\sub1資料夾內
package pack9.sub1;//將CSphere類別納入pack9.sub1中
public class CSphere{
 final static double PI=3.14;
 private double radius;

public CSphere(double r){
 radius=r;
}
public void show(){
 double vol=4/3.0*PI*radius*radius*radius;

 System.out.print("radius="+radius);
 System.out.println(", volume="+vol);
}
}

//CTrapezoid.java,此檔案置於pack9\sub2資料夾內
package pack9.sub2; //將CTrapezoid類別納入pack9.sub2中
public class CTrapezoid{
 private int upper;
 private int base;
 private int height;

public CTrapezoid(int u,int b,int h){
 upper=u;
 base=b;
 height=h;
}
public void show(){
 double area=(upper+base)*height/2.0;
 System.out.print("upper="+upper);
 System.out.print(", base="+base);
 System.out.print(", height="+height);
 System.out.println(", area="+area);
}
}

//Main.java,此檔案置於pack9資料夾內
package pack9; //將app12_8類別納入package pack9當中
 import pack9.sub1.CSphere;//載入pack9.sub1裡的CSphere類別
 import pack9.sub2.CTrapezoid;//載入pack9.sub2裡的CTrapezoid類別

public class Main{
public static void main(String args[]){
 CSphere sp=new CSphere(2);
 CTrapezoid tra=new CTrapezoid(2,3,4);
 sp.show();
 tra.show();
}
}

//C:\Documents and Settings\Administrator>cd c:\java
//C:\Java>cd hw12_9
//C:\Java\hw12_9>javac pack9\sub1\CSphere.java
//C:\Java\hw12_9>javac pack9\sub2\CTrapezoid.java
//C:\Java\hw12_9>javac pack9\hw12_9.java
//C:\Java\hw12_9>java pack9.hw12_9
//radius=2.0, volume=33.49333333333333
//upper=2, base=3, height=4, area=10.0
