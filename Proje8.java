
import java.util.Scanner;
public class Proje8 {

    public static void main(String[] args) {

        String userName, password, newPass, select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java")) {
            System.out.println("Giriş Başarılı!");
        } else if  (userName.equals("patika") && !(password.equals("java"))){
            System.out.println("Girdiğiniz Şifre Yanlıştır.");
            System.out.println("Yeni Şifre Belirlemek İçin E");
            System.out.println("Şifre Belirlemek İstemiyorsanız H");

            select = inp.nextLine();
            if(select.equals("E") || select.equals("e")) {
                System.out.print("Yeni Şifrenizi Giriniz:");
                newPass = inp.nextLine();
                if(newPass.equals("java")){
                    System.out.println("Şifre Oluşturulamadı, Lütfen Eski Şifrenizden Farklı Bir Şifre Giriniz.");
                }else {
                    System.out.println("Şifreniz Değiştirilmiştir.");
                }

            } else if (select.equals("H") || select.equals("h")){
                System.out.println("Şifrenizi Değiştirmek istemediniz!");


            }

        }

        else {
            System.out.println("Bilgilerinizi Kontrol Ediniz");

        }


    }

}
