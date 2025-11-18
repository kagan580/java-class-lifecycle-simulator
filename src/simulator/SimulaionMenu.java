package simulator;

import java.util.Scanner;

public class SimulaionMenu {

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n=== JAVA CLASS LIFECYCLE SIMULATOR ===");
            System.out.println("1 - Test: new AClass()");
            System.out.println("2 - Test: new BClass()");
            System.out.println("3 - Test: new CClass()");
            System.out.println("4 - String Method Tests");
            System.out.println("5 - equals / compareTo Tests");
            System.out.println("6 - Polymorphism Test");
            System.out.println("0 - Exit");
            System.out.print("Seçiminiz: ");

            int secim = readIntSafely();
            switch (secim) {
                case 1 -> {
                    testAClass();
                }
                case 2 -> {
                    testBClass();
                }
                case 3 -> {
                    testCClass();

                }
                case 4 -> {
                    testStringMethods();

                }
                case 5 -> {
                    testEqualsMethods();

                }
                case 6 -> {
                    testPolymorphism();

                }
                case 0 -> {
                    System.out.println("Çıkılıyor...");
                    return;
                }
                default -> {
                    System.out.println("Geçersiz seçim !");

                }
            }


        }


    }

    private int readIntSafely() {
        while (!scanner.hasNextInt()) {
            System.out.println("Lütfen sayı girin:");
            scanner.nextLine();
        }
        int val = scanner.nextInt();
        scanner.nextLine();
        return val;

    }

    private void testAClass() {
        ClassLogger.clear();
        System.out.println("\n--- Test: new AClass() ---");

        AClass a = new AClass();

        System.out.println("\n[LOG ÇIKTISI]");
        System.out.println(ClassLogger.getlogs());
        System.out.println("\nMenuye gitmek için ENTER'a basın...");
        scanner.nextLine();
    }

    private void testBClass() {
        ClassLogger.clear();
        System.out.println("\n--- Test: new BClass() ---");

        BClass b = new BClass();

        System.out.println("\n[LOG ÇIKTISI]");
        System.out.println(ClassLogger.getlogs());
        System.out.println("\nMenuye gitmek için ENTER'a basın...");
        scanner.nextLine();
    }

    private void testCClass() {
        ClassLogger.clear();
        System.out.println("\n--- Test: new CClass() ---");

        CClass c = new CClass();

        System.out.println("\n[LOG ÇIKTISI]");
        System.out.println(ClassLogger.getlogs());
        System.out.println("\nMenuye gitmek için ENTER'a basın...");
        scanner.nextLine();
    }

    private void testStringMethods() {
        System.out.println("\n--- String Method Tests ---");

        System.out.print("Bir metin girin: ");
        String input = scanner.nextLine();

        System.out.println("\n[Orijinal] : " + input);
        System.out.println("length()   : " + input.length());

        if (!input.isEmpty()) {
            System.out.println("charAt(0)  : " + input.charAt(0));
            System.out.println("Son karakter: " + input.charAt(input.length() - 1));
        }

        System.out.println("toUpperCase(): " + input.toUpperCase());
        System.out.println("toLowerCase(): " + input.toLowerCase());

        System.out.println("trim()        : '" + input.trim() + "'");

        System.out.println("contains(\"a\"): " + input.contains("a"));
        System.out.println("startsWith(\"Java\"): " + input.startsWith("Java"));
        System.out.println("endsWith(\".txt\"): " + input.endsWith(".txt"));

        System.out.println("indexOf('a')  : " + input.indexOf('a'));
        System.out.println("lastIndexOf('a'): " + input.lastIndexOf('a'));

        if (input.length() >= 3) {
            System.out.println("substring(1,3): " + input.substring(1, 3));
        } else {
            System.out.println("substring(1,3): (metin çok kısa)");
        }

        String replaced = input.replace(" ", "_");
        System.out.println("replace(' ', '_'): " + replaced);

        String[] parts = input.split(" ");
        System.out.println("split(\" \") (kelime sayısı): " + parts.length);

        System.out.println("\nMenuye gitmek için ENTER'a basın...");
        scanner.nextLine();
    }

    private void testEqualsMethods() {
        System.out.println("\n--- equals / equalsIgnoreCase / compareTo Tests ---");

        System.out.print("1. String'i girin: ");
        String s1 = scanner.nextLine();

        System.out.print("2. String'i girin: ");
        String s2 = scanner.nextLine();

        System.out.println("\n[Değerler]");
        System.out.println("s1: \"" + s1 + "\"");
        System.out.println("s2: \"" + s2 + "\"");

        System.out.println("\n== karşılaştırması (referans): " + (s1 == s2));
        System.out.println("equals()               : " + s1.equals(s2));
        System.out.println("equalsIgnoreCase()     : " + s1.equalsIgnoreCase(s2));
        System.out.println("compareTo()            : " + s1.compareTo(s2));
        System.out.println("compareToIgnoreCase()  : " + s1.compareToIgnoreCase(s2));

        System.out.println("\ncompareTo sonucu açıklaması:");
        System.out.println("0  → s1 ve s2 içerik olarak eşit");
        System.out.println("<0 → s1, s2'den alfabetik olarak önce");
        System.out.println(">0 → s1, s2'den alfabetik olarak sonra");
        System.out.println("\nMenuye gitmek için ENTER'a basın...");
        scanner.nextLine();
    }

    private void testPolymorphism() {
        System.out.println("\n--- Polymorphism Test (AClass / BClass / CClass) ---");

        AClass a = new AClass();
        AClass b = new BClass();
        AClass c = new CClass();

        System.out.println("\nÇalışma Sırası:");
        System.out.println("- new AClass()");
        System.out.println("- new BClass()  (AClass referansı ile)")
        ;
        System.out.println("- new CClass()  (AClass referansı ile)");

        System.out.println("\nNOT:");
        System.out.println("Referans tipi AClass olsa bile, gerçekte hangi sınıf nesnesi oluşturulduysa");
        System.out.println("o sınıfın instance blokları + constructor'ı çalışır.");

        System.out.println("\nTip Bilgisi:");
        System.out.println("a.getTypeName(): " + a.getTypeName());
        System.out.println("b.getTypeName(): " + b.getTypeName());
        System.out.println("c.getTypeName(): " + c.getTypeName());

        System.out.println("\nMenuye gitmek için ENTER'a basın...");
        scanner.nextLine();
    }

}
