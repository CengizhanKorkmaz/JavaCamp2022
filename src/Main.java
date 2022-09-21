public class Main {
    public static void main(String[] args) {
        // Variables
        int numberOne = 10;
        String message = "Selam benim numaram";
        System.out.println(message + " " + numberOne);

        // DataTypes
        int num1 = 10;
        byte num2 = 100;
        double num3 = 10.4;
        char character = 'C';
        boolean isTrue = true;

        //Conditionals
        if (isTrue == true) {
            System.out.println(num1);
        }
        if (num1 > num2) {
            System.out.println("Num1 sayısı num2 den büyüktür");
        } else if (num2 > num1) {
            System.out.println("Num2 sayısı num1 den büyüktür");
        } else {
            System.out.println("Num1 sayısı num2 sayısına eşittir");
        }
        int sayi1 = 43;
        int sayi2 = 12;
        int sayi3 = 13;
        int sonuc = sayi1;
        if (sayi1 < sayi2) {
            sonuc = sayi2;
        }
        if (sonuc < sayi3) {
            sonuc = sayi3;
        }
        System.out.println(sonuc);

        char grade = 'G';
        switch (grade) {
            case 'A':
                System.out.println("pekiyi");
                break;
            case 'B':
                System.out.println("iyi");
                break;
            case 'C':
                System.out.println("orta");
                break;
            case 'D':
                System.out.println("kaldı");
                break;
            default:
                System.out.println("Geçersiz not");
        }

        //Loops
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        int i = 1;
        int j = 1;

        while (j < 10) {
            System.out.println(j);
            j++;
        }
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        //Arrays
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Cengizhan";
        ogrenciler[1] = "Ali";
        ogrenciler[2] = "Veli";
        for (int x = 0; x < ogrenciler.length; x++) {
            System.out.println(ogrenciler[x]);
        }
        for (String o : ogrenciler) {
            System.out.println(o);
        }

        double[] myList = {1.1, 2.2, 3.3};
        double total = 0;
        double max = myList[0];
        for (double sayi : myList) {
            if (max < sayi)
                max = sayi;
            total += sayi;
        }
        System.out.println(total);
        System.out.println(max);

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "İstanbulll";
        sehirler[0][2] = "İstanbullll";
        sehirler[1][0] = "İstanbullllll";
        sehirler[1][1] = "İstanbullllllll";
        sehirler[1][2] = "İstanbullllllllll";
        sehirler[2][0] = "İstanbullllllllll";
        sehirler[2][1] = "İstanbulllllllllll";
        sehirler[2][2] = "İstanbulllllllllll";
        for (int a=0;a<sehirler.length;a++){
            for (int b=0; b< sehirler.length;b++){
                System.out.println(sehirler[a][b]);
            }
        }

        String message1="Bugün hava çok güzel.";
        System.out.println(message1);
        System.out.println("Uzunluk : "+ message1.length());
        System.out.println("2 : "+ message1.charAt(1));
        System.out.println(message1.concat(message));
        System.out.println(message1.startsWith("A"));
        System.out.println(message1.endsWith("z"));
        char [] karakterler= new char[2];
        message1.getChars(0,1,karakterler,0);
        System.out.println(karakterler);
        System.out.println(message.indexOf("n"));
        System.out.println(message1.replace(' ','-'));
        System.out.println(message1.substring(2));
        System.out.println(message1.substring(2,4));




    }
}