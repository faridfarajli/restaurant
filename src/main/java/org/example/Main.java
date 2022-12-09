package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;




public class Main {
   static String  fileName;
    static int a;
    static int price;

    public static void main(String[] args) throws IOException {

        welcomeMessage();
    }



    public static void welcomeMessage() throws IOException {
        System.out.println("-------------------------------");
        System.out.println("Bizim Restorana Xoş Gəlmişsiniz");
        System.out.println("-------------------------------");
        System.out.println("\n1.Yemək/İçki Sipariş Verin \n2.Yer Rezerv Edin \n3.Rezerv Edilmiş Yeri Silin \n4.Sistemdən Çıxın");
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
        } catch (InputMismatchException exception) {
            exception.getMessage();
            System.err.println("Zəhmət olmasa Rəqəm girin");
            welcomeMessage();
        }

        switch (a) {
            case 1:
                oneMethod();
                break;
            case 2:
                twoMethod();
                break;
            case 3:
                threeMethod();
                break;
            case 4:
                System.exit(0);
            default:
        }

    }

    public static void oneMethod() {
        System.out.println("-----------------------Yeməklər-------------------------");
        System.out.println("\n0.İçkilər \n1.Kabab" + "\n2.Mərci Supu" + "\n3.Pizza " + "\n4.Balıq" + "\n5.Lahmacun" + "\n6.Dönər" + "\n7.Hamburger" + "\n8.Burger");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a == 1) {
            price += 6;
            //sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (b > 0) {
                price *= b;
                drink();

            }
        } else if (a == 2) {
            price += 3;
            //sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (b > 0) {
                price *= b;
                drink();

            }
        } else if (a == 3) {
            price += 5;
            sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (b > 0) {
                price *= b;
                drink();

            }
        } else if (a == 4) {
            price += 4;
            //sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (b > 0) {
                price *= b;
                drink();

            }
        } else if (a == 5) {
            price += 2;
            // sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (b > 0) {
                price *= b;
                drink();

            }
        } else if (a == 6) {
            price += 2;
            //  sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (b > 0) {
                price *= b;
                drink();

            }
        } else if (a == 7) {
            price += 1;
            //sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (b > 0) {
                price *= b;
                drink();

            }
        } else if (a == 8) {
            price += 5;
            sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (b > 0) {
                price *= b;
                drink();

            }

        }else if (a == 0) {
            drink();
        }
    }



    public static void drink(){
        System.out.println("-----------------------Ickiler---------------------------------------");
        System.out.println("\n0.Siparişi Bitir \n1.Kola" + "\n2.Fanta" + "\n3.Sprite " + "\n4.RedBull" + "\n5.Hell");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (a == 1) {
            price += 1;
            sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int f = sc.nextInt();
            if (c == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (c > 0) {
                price *= c;
                payWithCard();

            }
        }else if (a == 2) {
            price += 1;
            sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int f = sc.nextInt();
            if (c == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (c > 0) {
                price *= c;
                payWithCard();

            }
        }else if (a == 3) {
            price += 1;
            sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int f = sc.nextInt();
            if (c == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (c > 0) {
                price *= c;
                payWithCard();

            }
        }else if (a == 4) {
            price += 5;
            sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int f = sc.nextInt();
            if (c == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (c > 0) {
                price *= c;
                payWithCard();

            }
        }else if (a == 5) {
            price += 3;
            sc = new Scanner(System.in);
            System.out.println("Necə ədəd?");
            int f = sc.nextInt();
            if (c == 0) {
                System.out.println("Bu seçim düzgün deyil");
                oneMethod();
            } else if (c > 0) {
                price *= c;
                payWithCard();

            }

        }else if (a == 0) {
            payWithCard();
        }
    }




    public static void payWithCard () {
        System.out.println("Sizin toplam borcunuz"+" " +price+ " " + "manat edir");
        Scanner sc = new Scanner(System.in);
        System.out.println("Zəhmət olmasa kardınızın kodunu yazın");
        try {
            int k = sc.nextInt();
        }catch (InputMismatchException exception){
            exception.getMessage();
            System.err.println("Zəhmət olmasa Rəqəm girin");
            payWithCard();

        }

        System.out.println("Balansınızdan" +" " +price+ " " +"manat çıxıldı");
        System.out.println("Bizi secdiyiniz üçün təşşəkürlər");

    }


    public static void twoMethod () throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adınız");
        String a = sc.next();
        System.out.println("Nömrəniz");
        int number = sc.nextInt();
        System.out.println("Rezerv etmək istədiyiniz saat və tarix");
        int clock = sc.nextInt();
        User user = new User();
        user.setName(a);
        user.setNumber(number);
        user.setClock(clock);
        System.out.println("RiD yaratmaq  üçün 5 hərfli söz yazın");
        fileName = sc.next();
        FileRestoran.writeIntofile1(fileName, String.valueOf(user));
        System.err.println("Sizin məlumatlarınız: " + user);





    }
    public static void threeMethod () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rezervinizi ləğv etmək üçün  RİD-nizi daxil edin");
        String a = sc.next();
        File obj = new File(a);
        obj.delete();
        System.out.println("Rezerviniz uğurla ləğv edildi");

    }
}