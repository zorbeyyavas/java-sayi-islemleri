import java.util.Scanner;

public class sayiislemleri {
    public static void main(String[] args) {
       //girilen sayılara göre seçilen işlemleri yapan program 
        Scanner oku=new Scanner(System.in);
                System.out.println(" 1.sayıyı giriniz ");
                int s1=oku.nextInt();
                System.out.println(" 2.sayıyı giriniz ");
                int s2=oku.nextInt();
        
                System.out.println("yapmak istediğiniz işlemi seçiniz");
                System.out.println("çarpma işlem için(1)"); 
                System.out.println("çıkartma işlemi için(2)");
                System.out.println("toplama işlemi için(3)");
                System.out.println("bölme işlemi için(4)");
                System.out.println(" girilen sayılarla tüm işlemleri görmek için(5) ");
        
                int islem=oku.nextInt();
                int sonuc;
                int sonuc1;
                int sonuc2;
                int sonuc3;
        
                if(islem==1)
                {
                    sonuc=s1*s2;
                    System.out.println( " çarpma işlemi sonucunu= " + sonuc );
                }
                else if(islem==2)
                {
                    sonuc=s1-s2;
                    System.out.println(" çıkartma işlemi sonucunuz= " + sonuc);
                }
                else if(islem==3)
                {
                    sonuc=s1+s2;
                    System.out.println(" toplama işlemi sonucunuz= " + sonuc);
                }
                else if(islem==4)
                {
                    sonuc=s1/s2;
                    System.out.println(" bölme işlemi sonucunuz= " + sonuc);
                }
                else if(islem==5)
                {
                    System.out.println(" verilen sayılarla ilgili tüm işlemler ");
                    System.out.print(" çarpma işlemi = "); 
                    System.out.println(sonuc=s1*s2);
                    System.out.print(" çıkartma işlemi = ");
                    System.out.println( sonuc=s1-s2 );
                    System.out.print(" toplama işlemi = ");
                    System.out.println(sonuc=s1+s2);
                    System.out.print(" bölme işlemi = ");
                    System.out.println(sonuc=s1/s2);
                }  
    }
    
}
