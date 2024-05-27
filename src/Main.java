
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //hatları tanımladığımız kısım
        hatlar Hatlar = new hatlar();
        Hatlar.setMeramYakaHatti("1 - Meram Yaka Dörtokka Hattı");
        Hatlar.setmeramYeniYolHatti("2 - Meram Yeniyol Anasultan Hattı");
        Hatlar.setselcukHatti("3 - Selçuk Üniversitesi Hattı");
        Hatlar.setAdanaCevreYoluHatti("4 - Adana Çevre Yolu Hattı");
        Hatlar.setDereYeniYolHatti("5 - Dere Yeniyol Hattı");
        Hatlar.setKovanagziHatti("6 - Kovanağzı Hattı");
        Hatlar.setKoycegizHatti("7 - Köyceğiz Hattı");
        Hatlar.setCatalhuyukHatti("8 - Çatalhüyük Hattı");

//hatlar ile ilgili bilgilerin bulunduğu kısım

        hatBilgileri info = new hatBilgileri();
        info.setMeramYaka("Meram Yaka Dörtokka Hattı, Meram Son Durak Durağı'ndan başlayıp Alaaddin 1 Turnike Durağı'nda bitmektedir. Bu hat toplam 10 duraktan oluşmaktadır. Bu hatta ait duraklar aşağıda listelenmiştir...");
        info.setMeramYeniYol("Meram Yeniyol Anasultan Hattı, Meram Son Durak Durağı'ndan başlayıp Alaaddin 1 Turnike Durağı'nda bitmektedir. Toplam 8 duraktan oluşmaktadır. Bu hatta ait duraklar aşağıda listelenmiştir...");
        info.setSelcuk("Selçuk Üniversitesi Hattı,Zafer Durağı'ndan başlayıp  Kampüs Giriş Durağı'nda bitmektedir.Bu Hat Toplam 13 duraktan oluşmaktadır. Bu hatta ait duraklar aşağıda listelenmiştir...");
        info.setAdanaCevreYolu("Adana Çevreyolu Hattı,Alakava Son Durak'tan başlayıp Otogar Kavşağı Durağı'nda bitmektedir.Bu hat toplam 15 duraktan oluşmaktadır. Bu hatta ait duraklar aşağıda listelenmiştir...");
        info.setDereYeniYol("Dere YeniYol Hattı,Çatıkkaş Durağı'ndan başlayıp Yolboyu Durağı'nda bitmektedir.Bu hat toplam 9 duraktan oluşmaktadır. Bu hatta ait duraklar aşağıda listelenmiştir...");
        info.setKovanagzi("Kovanağzı Hattı,Aşık Durağı'ndan başlayıp Şehir Hastanesi İstiklal Çıkışı Durağı'nda bitmektedir.Bu hat toplam 12 duraktan oluşmaktadır. Bu hatta ait duraklar aşağıda listelenmiştir...");
        info.setKoycegiz("Köyceğiz Hattı, Köyceğiz Kampüs Durağı'ndan başlayıp Millet Durağı'nda bitmektedir.Bu hat toplam 8 duraktan oluşmaktadır. Bu hatta ait duraklar aşağıda listelenmiştir...");
        info.setCatalhuyuk("ÇatalHöyük Hattı, Kalkınma Durağı'ndan başlayıp Kültürpark Turnike 2 Durağı'nda bitmektedir.Bu hat toplam 9 duraktan oluşmaktadır. Bu hatta ait duraklar aşağıda listelenmiştir...");
//durakların tanımlanması
//1
        durakMYD myd = new durakMYD();
        myd.setMeramSonDurak("1 - Meram Son Durak");
        myd.setCilek("2 - Çilek Durağı");
        myd.setCinaralti("3 - Çınaraltı Durağı");
        myd.setYakaCami("4 - Yaka Camii Durağı");
        myd.setKantarci("5 - Kantarcı Durağı");
        myd.setKonevi("6 - Konevi Kültür Merkezi Durağı");
        myd.setAzamet("7 - Azamet Durağı");
        myd.setSevilay("8 - Sevilay Durağı");
        myd.setIhsaniye("9 - İhsaniye Durağı");
        myd.setAlaaddin1("10 - Alaaddin Turnike 1");
//2
        durakMYA mya = new durakMYA();
        mya.setMeramSonDurak("1 - Meram Son Durak");
        mya.setKazanbendi("2 - Kazanbendi Durağı");
        mya.setMeramDevletHastanesi("3 - Meram Devlet Hastanesi Durağı");
        mya.setEvliya("4 - Evliya Çelebi Parkı Durağı");
        mya.setDamla("5 - Damla Durağı");
        mya.setMeramYeniyol("6 - Meram Yeniyol Durağı");
        mya.setMustafaKemal("7 - Mareşal Mustafa Kemal Paşa Ortaokulu Durağı");
        mya.setAlaaddin1("8 - Alaaddin Turnike 1");
//3
        durakSU su = new durakSU();
        su.setZafer("1 - Zafer Durağı");
        su.setBelediye("2 - Belediye Durağı");
        su.setNalcaci("3 - Nalçacı Durağı");
        su.setKule("4 - Kulesite AVM Durağı");
        su.setEskiSanayi("5 - Eski Sanayi Durağı");
        su.setBinkonutlar("6 - Binkonutlar Durağı");
        su.setJaponParki("7 - Kyoto Japon Parkı Durağı");
        su.setYazir("8 - Yazır Durağı");
        su.setPiri("9 - Piri Reis Durağı");
        su.setFirat("10 - Fırat Durağı");
        su.setBosna("11 - Bosna-Hersek Durağı");
        su.setKayalar("12 - Kayalar Camii Durağı");
        su.setKampus("13 - Selçuk Üniversitesi Kampüs Girişi");
//4
        durakACY acy = new durakACY();
        acy.setAlakava("1 - Alakava Durağı");
        acy.setTelafer("2 - Telafer İlkokulu Durağı");
        acy.setLeylek("3 - Leylek Durağı");
        acy.setAcar("4 - Acar Durağı");
        acy.setCilenti("5 - Çilenti Durağı");
        acy.setEgirdag("6 - Eğirdağ Durağı");
        acy.setGuraga("7 - Gürağa Durağı");
        acy.setDoganay("8 - Doğanay Durağı");
        acy.setCevreYolu("9 - Çevre Yolu Durağı");
        acy.setKaratayHal("10 - Karatay Halı Durağı");
        acy.setAdanaCevreYolu("11 - Adana Çevre Yolu Durağı");
        acy.setLaleciler("12 - Laleciler Durağı");
        acy.setModesa("13 - Modesa Durağı");
        acy.setGursahin("14 - Gürşahin Durağı");
        acy.setOtogar("15 - Otogar Kavşağı Durağı");
//5
        durakDY dy = new durakDY();
        dy.setCatikkas("1 - Çatıkkaş Durağı");
        dy.setDere("2 - Dere Durağı");
        dy.setFidanlik("3 - Fidanlık Durağı");
        dy.setBuyukpinar("4 - Büyükpınar Durağı");
        dy.setAnahtar("5 - Anahtar Durağı");
        dy.setZafer("6 - Zafer Durağı");
        dy.setKisla2("7 - Kışlaönü 2 Durağı");
        dy.setAkgol("8 - Akgöl Durağı");
        dy.setYolboyu("9 - Yolboyu Durağı");
//6
        durakKVN kvn = new durakKVN();
        kvn.setAsik("1 - Aşık Durağı");
        kvn.setCimendere("2 - Çimendere Durağı");
        kvn.setDemir("3 - Demirköy Durağı");
        kvn.setErmisli("4 - Ermişli Durağı");
        kvn.setSerhat("5 - Serhat Durağı");
        kvn.setKayali("6 - Kayalıpark Durağı");
        kvn.setRumi("7 - Rumi Durağı");
        kvn.setMevlana("8 - Mevlana Durağı");
        kvn.setAstar("9 - Astar Durağı");
        kvn.setKaratayUni("10 - Karatay Üniversitesi Durağı");
        kvn.setKaside("11 - Kaside Durağı");
        kvn.setSehirHastanesiIstiklal("12 - Şehir Hastanesi İstiklal Çıkışı Durağı");
//7
        durakKYC kyc = new durakKYC();
        kyc.setKoycegizKampus("1 - Köyceğiz Kampüs Durağı");
        kyc.setSerami("2 - Serami Durağı");
        kyc.setGelinyaka("3 - Gelinyaka Durağı");
        kyc.setBuyukpinar("4 - Büyükpınar Durağı");
        kyc.setMeramDevletHastanesi("5 - Meram Devlet Hastanesi Durağı");
        kyc.setMeramYeniyol("6 - Meram Yeniyol Durağı");
        kyc.setKoski("7 - Koski Durağı");
        kyc.setMillet("8 - Millet Durağı");
//8
        durakCTH cth = new durakCTH();
        cth.setKalkinma("1 - Kalkınma Durağı");
        cth.setBoruktolu("2 - Boruktolu Çıkışı Durağı");
        cth.setSensoy("3 - Şensoy Durağı");
        cth.setUzunoba("4 - Uzunoba Durağı");
        cth.setYucetas("5 - Yücetaş Durağı");
        cth.setYildiz("6 - Yıldız Durağı");
        cth.setPiri("7 - Piri Esat Durağı");
        cth.setRumi("8 - Rumi Durağı");
        cth.setKulturparkTurnike("9 - Kültürpark Turnike 2");

//yaptığımız projenin çalışmaya başladığı aşama

        System.out.println("Mevcut otobüs hatlarımız aşağıdadır: ");

        System.out.println(Hatlar.getMeramYakaHatti());
        System.out.println(Hatlar.getmeramYeniYolHatti());
        System.out.println(Hatlar.getselcukHatti());
        System.out.println(Hatlar.getadanaCevreYoluHatti());
        System.out.println(Hatlar.getdereYeniYolHatti());
        System.out.println(Hatlar.getkovanagziHatti());
        System.out.println(Hatlar.getKoycegizHatti());
        System.out.println(Hatlar.getCatalhuyukHatti());

        System.out.println("Lütfen kullanmak istediğiniz hattı seçiniz: ");

        Scanner scanner = new Scanner(System.in);
        int Cevap;
        Cevap = scanner.nextInt();

        if (Cevap == 1) {
            System.out.println("1 - Meram Yaka Dörtokka Hattı'nı seçtiniz...");
            System.out.println("--------------------------");
            System.out.println(info.getMeramYaka());
            System.out.println(myd.getMeramSonDurak());
            System.out.println(myd.getCilek());
            System.out.println(myd.getCinaralti());
            System.out.println(myd.getYakaCami());
            System.out.println(myd.getKantarci());
            System.out.println(myd.getKonevi());
            System.out.println(myd.getAzamet());
            System.out.println(myd.getSevilay());
            System.out.println(myd.getIhsaniye());
            System.out.println(myd.getAlaaddin1());
            System.out.println("Lütfen bineceğiniz durağı seçiniz: ");

            Scanner scanner1 = new Scanner(System.in);
            int cevap1 = scanner1.nextInt();
            if (cevap1 == 1) {
                System.out.println("1 -Meram Son Durak'ı seçtiniz...");
            }
            if (cevap1 == 2) {
                System.out.println("2 -Çilek Durağı'nı seçtiniz...");
            }
            if (cevap1 == 3) {
                System.out.println("3 -Çınaraltı Durağı'nı seçtiniz...");
            }
            if (cevap1 == 4) {
                System.out.println("4 -Yaka Camii Durağı'nı seçtiniz...");
            }
            if (cevap1 == 5) {
                System.out.println("5 -Kantarcı Durağı'nı seçtiniz...");
            }
            if (cevap1 == 6) {
                System.out.println("6 -Konevi kültür merkezi Durağı'nı seçtiniz...");
            }
            if (cevap1 == 7) {
                System.out.println("7 -Azamet  Durağı'nı seçtiniz...");
            }
            if (cevap1 == 8) {
                System.out.println("8 -Sevilay Durağı'nı seçtiniz...");
            }
            if (cevap1 == 9) {
                System.out.println("9 -İhsaniye Durağı'nı seçtiniz...");
            }
            if (cevap1 == 10) {
                System.out.println("10 -Alaaddin 1 Turnike Durağı'nı seçtiniz...");
            }if (cevap1 > 10){
                System.out.println("Lütfen Geçerli Bir BİNİŞ DURAĞI Seçiniz");
            System.exit(1);}

            System.out.println("--------------------------");
            System.out.println("Lütfen ineceğiniz durağı seçiniz...");
            System.out.println(myd.getMeramSonDurak());
            System.out.println(myd.getCilek());
            System.out.println(myd.getCinaralti());
            System.out.println(myd.getYakaCami());
            System.out.println(myd.getKantarci());
            System.out.println(myd.getKonevi());
            System.out.println(myd.getAzamet());
            System.out.println(myd.getSevilay());
            System.out.println(myd.getIhsaniye());
            System.out.println(myd.getAlaaddin1());

            Scanner scanner11 = new Scanner(System.in);
            int cevap11 = scanner11.nextInt();

            if (cevap11 == 1) {
                System.out.println("1 -Meram Son Durak'ı seçtiniz...");
                if (cevap1 == 1) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }

                if (cevap1 == 2) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çilek Durağından bindiniz");
                    System.out.println("Meram Son Durakta ineceksiniz");


                }
                if (cevap1 == 3) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çınaraltı Durağından bindiniz");
                    System.out.println(" Meram Son Durakta  ineceksiniz");

                }
                if (cevap1 == 4) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Yaka Camii Durağından bindiniz");
                    System.out.println("Meram Son Durakta ineceksiniz");

                }
                if (cevap1 == 5) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("KantarcıDurağından bindiniz");
                    System.out.println("Meram Son Durakta ineceksiniz");

                }
                if (cevap1 == 6) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Konevi Kültür Merkezi Durağından bindiniz");
                    System.out.println("Meram Son Durakta ineceksiniz");

                }
                if (cevap1 == 7) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Azamet Durağından bindiniz");
                    System.out.println("Meram Son Durakta ineceksiniz");

                }
                if (cevap1 == 8) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Sevilay Durağından bindiniz");
                    System.out.println("Meram Son Durakta ineceksiniz");

                }
                if (cevap1 == 9) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("İhsaniye Durağından bindiniz");
                    System.out.println("Meram Son Durakta ineceksiniz");

                }
                if (cevap1 == 10) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 turnike Durağından bindiniz");
                    System.out.println("Meram Son Durakta ineceksiniz");

                }


            }
            if (cevap11 == 2) {
                System.out.println("2 -Çilek Durağı'nı seçtiniz...");

                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durakta bindiniz");
                    System.out.println("Çilek Durağında ineceksiniz");


                }
                if (cevap1 == 2) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap1 == 3) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çınaraltı Durağından bindiniz");
                    System.out.println("Çilek Durağında ineceksiniz");


                }
                if (cevap1 == 4) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Yaka Camii Durağından bindiniz");
                    System.out.println("Çilek Durağında ineceksiniz");


                }
                if (cevap1 == 5) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Kantarcı Durağından bindiniz");
                    System.out.println("Çilek Durağında ineceksiniz");


                }
                if (cevap1 == 6) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Konevi Kültür Merkezi Durağından bindiniz");
                    System.out.println("Çilek Durağında ineceksiniz");


                }
                if (cevap1 == 7) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Azamet Durağından bindiniz");
                    System.out.println("Çilek Durağında ineceksiniz");


                }
                if (cevap1 == 8) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Sevilay Durağından bindiniz");
                    System.out.println("Çilek Durağında ineceksiniz");


                }
                if (cevap1 == 9) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Ihsaniye Durağından bindiniz");
                    System.out.println("Çilek Durağında ineceksiniz");


                }
                if (cevap1 == 10) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 turnike Durağından bindiniz");
                    System.out.println("Çilek Durağında ineceksiniz");


                }


            }
            if (cevap11 == 3) {
                System.out.println("3 -Çınaraltı Durağı'nı seçtiniz...");

                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Meram son durak Durağından bindiniz");
                    System.out.println("Çınaraltı Durağında ineceksiniz");


                }
                if (cevap1 == 2) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çilek Durağından bindiniz");
                    System.out.println("Çınaraltı Durağında ineceksiniz");


                }
                if (cevap1 == 3) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap1 == 4) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Yaka Camii Durağından bindiniz");
                    System.out.println("Çınaraltı Durağında ineceksiniz");


                }
                if (cevap1 == 5) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Kantarcı Durağından bindiniz");
                    System.out.println("Çınaraltı Durağında ineceksiniz");


                }
                if (cevap1 == 6) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Konevi Kültür Merkezi Durağından bindiniz");
                    System.out.println("Çınaraltı Durağında ineceksiniz");


                }
                if (cevap1 == 7) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Azamaet Durağından bindiniz");
                    System.out.println("Çınaraltı Durağında ineceksiniz");


                }
                if (cevap1 == 8) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Sevilay Durağından bindiniz");
                    System.out.println("Çınaraltı Durağında ineceksiniz");


                }
                if (cevap1 == 9) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("İhsaniye Durağından bindiniz");
                    System.out.println("Çınaraltı Durağında ineceksiniz");


                }
                if (cevap1 == 10) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 turnike Durağından bindiniz");
                    System.out.println("Çınaraltı Durağında ineceksiniz");


                }


            }
            if (cevap11 == 4) {
                System.out.println("4 -Yaka Camii Durağı'nı seçtiniz...");

                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Meram son durak Durağından bindiniz");
                    System.out.println("Yaka Camii Durağında ineceksiniz");


                }
                if (cevap1 == 2) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çilek Durağından bindiniz");
                    System.out.println("Yaka Camii Durağında ineceksiniz");


                }
                if (cevap1 == 3) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çınaraltı Durağından bindiniz");
                    System.out.println("Yaka Camii Durağında ineceksiniz");


                }
                if (cevap1 == 4) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");

                }
                if (cevap1 == 5) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Kantarcı Durağından bindiniz");
                    System.out.println("Yaka Camii Durağında ineceksiniz");


                }
                if (cevap1 == 6) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Konevi kültür merkezi Durağından bindiniz");
                    System.out.println("Yaka Camii Durağında ineceksiniz");


                }
                if (cevap1 == 7) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Azamet Durağından bindiniz");
                    System.out.println("Yaka Camii Durağında ineceksiniz");


                }
                if (cevap1 == 8) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Sevilay Durağından bindiniz");
                    System.out.println("Yaka Camii Durağında ineceksiniz");


                }
                if (cevap1 == 9) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("İhsaniye Durağından bindiniz");
                    System.out.println("Yaka Camii Durağında ineceksiniz");


                }
                if (cevap1 == 10) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 turnike Durağından bindiniz");
                    System.out.println("Yaka Camii Durağında ineceksiniz");


                }
            }
            if (cevap11 == 5) {
                System.out.println("5 -Kantarcı Durağı'nı seçtiniz...");

                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Kantarcı Durağında ineceksiniz");


                }
                if (cevap1 == 2) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çilek Durağından bindiniz");
                    System.out.println("Kantarcı Durağında ineceksiniz");


                }
                if (cevap1 == 3) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çınaraltı Durağından bindiniz");
                    System.out.println("Kantarcı Durağında ineceksiniz");


                }
                if (cevap1 == 4) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Yaka Camii Durağından bindiniz");
                    System.out.println("Kantarcı Durağında ineceksiniz");


                }
                if (cevap1 == 5) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap1 == 6) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Konevi kültür merkezi Durağından bindiniz");
                    System.out.println("Kantarcı Durağında ineceksiniz");


                }
                if (cevap1 == 7) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Azamet Durağından bindiniz");
                    System.out.println("Kantarcı Durağında ineceksiniz");


                }
                if (cevap1 == 8) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Sevilay Durağından bindiniz");
                    System.out.println("Kantarcı Durağında ineceksiniz");


                }
                if (cevap1 == 9) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Ihsaniye Durağından bindiniz");
                    System.out.println("Kantarcı Durağında ineceksiniz");


                }
                if (cevap1 == 10) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 turnike Durağından bindiniz");
                    System.out.println("Kantarcı Durağında ineceksiniz");


                }
            }
            if (cevap11 == 6) {
                System.out.println("6 -Konevi kültür merkezi Durağı'nı seçtiniz...");

                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Konevi Kültür Merkezi Durağında ineceksiniz");


                }
                if (cevap1 == 2) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çilek Durağından bindiniz");
                    System.out.println("Konevi Kültür Merkezi Durağında ineceksiniz");


                }
                if (cevap1 == 3) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çınaraltı Durağından bindiniz");
                    System.out.println("Konevi Kültür Merkezi Durağında ineceksiniz");


                }
                if (cevap1 == 4) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Yaka Camii Durağından bindiniz");
                    System.out.println("Konevi Kültür Merkezi Durağında ineceksiniz");


                }
                if (cevap1 == 5) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Kantarcı Durağından bindiniz");
                    System.out.println("Konevi Kültür Merkezi Durağında ineceksiniz");


                }
                if (cevap1 == 6) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap1 == 7) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Azamet Durağından bindiniz");
                    System.out.println("Konevi Kültür Merkezi Durağında ineceksiniz");


                }
                if (cevap1 == 8) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Sevilay Durağından bindiniz");
                    System.out.println("Konevi Kültür Merkezi Durağında ineceksiniz");


                }
                if (cevap1 == 9) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("İhsaniye Durağından bindiniz");
                    System.out.println("Konevi Kültür Merkezi Durağında ineceksiniz");


                }
                if (cevap1 == 10) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 turnike Durağından bindiniz");
                    System.out.println("Konevi Kültür Merkezi Durağında ineceksiniz");


                }
            }
            if (cevap11 == 7) {
                System.out.println("7 -Azamet  Durağı'nı seçtiniz...");

                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Azamet Durağında ineceksiniz");


                }
                if (cevap1 == 2) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çilek Durağından bindiniz");
                    System.out.println("Azamet Durağında ineceksiniz");


                }
                if (cevap1 == 3) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çınaraltı Durağından bindiniz");
                    System.out.println("Azamet Durağında ineceksiniz");


                }
                if (cevap1 == 4) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Yaka Camii Durağından bindiniz");
                    System.out.println("Azamet Durağında ineceksiniz");


                }
                if (cevap1 == 5) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Kantarcı Durağından bindiniz");
                    System.out.println("Azamet Durağında ineceksiniz");


                }
                if (cevap1 == 6) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Konevi Kültür Merkezi Durağından bindiniz");
                    System.out.println("Azamet Durağında ineceksiniz");


                }
                if (cevap1 == 7) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Sevilay Durağından bindiniz");
                    System.out.println("Azamet Durağında ineceksiniz");


                }
                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("İhsaniye Durağından bindiniz");
                    System.out.println("Azamet Durağında ineceksiniz");


                }
                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 turnike Durağından bindiniz");
                    System.out.println("Azamet Durağında ineceksiniz");


                }

            }
            if (cevap11 == 8) {
                System.out.println("8 -Sevilay Durağı'nı seçtiniz...");

                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Sevilay Durağında ineceksiniz");


                }
                if (cevap1 == 2) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çilek Durağından bindiniz");
                    System.out.println("Sevilay Durağında ineceksiniz");


                }
                if (cevap1 == 3) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çınaraltı Durağından bindiniz");
                    System.out.println("Sevilay Durağında ineceksiniz");


                }
                if (cevap1 == 4) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Yaka Camii Durağından bindiniz");
                    System.out.println("Sevilay Durağında ineceksiniz");


                }
                if (cevap1 == 5) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Kantarcı Durağından bindiniz");
                    System.out.println("Sevilay Durağında ineceksiniz");


                }
                if (cevap1 == 6) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Konevi Kültür Merkezi Durağından bindiniz");
                    System.out.println("Sevilay Durağında ineceksiniz");


                }
                if (cevap1 == 7) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Azamet Durağından bindiniz");
                    System.out.println("Sevilay Durağında ineceksiniz");


                }
                if (cevap1 == 8) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap1 == 9) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Ihsaniye Durağından bindiniz");
                    System.out.println("Sevilay Durağında ineceksiniz");


                }
                if (cevap1 == 10) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 turnike Durağından bindiniz");
                    System.out.println("Sevilay Durağında ineceksiniz");


                }
            }
            if (cevap11 == 9) {
                System.out.println("9 -İhsaniye Durağı'nı seçtiniz...");

                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("İhsaniye Durağında ineceksiniz");


                }
                if (cevap1 == 2) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çilek Durağından bindiniz");
                    System.out.println("İhsaniye Durağında ineceksiniz");


                }
                if (cevap1 == 3) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çınaraltı Durağından bindiniz");
                    System.out.println("İhsaniye Durağında ineceksiniz");


                }
                if (cevap1 == 4) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Yaka Camii Durağından bindiniz");
                    System.out.println("İhsaniye Durağında ineceksiniz");


                }
                if (cevap1 == 5) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Kantarcı Durağından bindiniz");
                    System.out.println("İhsaniye Durağında ineceksiniz");


                }
                if (cevap1 == 6) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Konevi Kültür Merkezi Durağından bindiniz");
                    System.out.println("İhsaniye Durağında ineceksiniz");


                }
                if (cevap1 == 7) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Azamet Durağından bindiniz");
                    System.out.println("İhsaniye Durağında ineceksiniz");


                }
                if (cevap1 == 8) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Sevilay Durağından bindiniz");
                    System.out.println("İhsaniye Durağında ineceksiniz");


                }
                if (cevap1 == 9) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap1 == 10) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Aladddin 1 Turnike Durağından bindiniz");
                    System.out.println("İhsaniye Durağında ineceksiniz");


                }
            }
            if (cevap11 == 10) {
                System.out.println("10 -Alaaddin 1 Turnike Durağı'nı seçtiniz...");

                if (cevap1 == 1) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Alaadddin 1 turnike Durağında ineceksiniz");


                }
                if (cevap1 == 2) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çilek Durağından bindiniz");
                    System.out.println("Alaadddin 1 turnike Durağında ineceksiniz");


                }
                if (cevap1 == 3) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Çınaraltı Durağından bindiniz");
                    System.out.println("Alaadddin 1 turnike Durağında ineceksiniz");


                }
                if (cevap1 == 4) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Yaka Camii Durağından bindiniz");
                    System.out.println("Alaadddin 1 turnike Durağında ineceksiniz");


                }
                if (cevap1 == 5) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Kantarcı Durağından bindiniz");
                    System.out.println("Alaadddin 1 turnike Durağında ineceksiniz");


                }
                if (cevap1 == 6) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Konevi Kültür Merkezi Durağından bindiniz");
                    System.out.println("Alaadddin 1 turnike Durağında ineceksiniz");


                }
                if (cevap1 == 7) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Azamet Durağından bindiniz");
                    System.out.println("Alaadddin 1 turnike Durağında ineceksiniz");


                }
                if (cevap1 == 8) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("Sevilay Durağından bindiniz");
                    System.out.println("Alaadddin 1 turnike Durağında ineceksiniz");


                }
                if (cevap1 == 9) {
                    System.out.println("Meram Yaka Dörtokka Hatttınzı Seçtiniz");
                    System.out.println("İhsaniye Durağından bindiniz");
                    System.out.println("Alaadddin 1 turnike Durağında ineceksiniz");


                }
                if (cevap1 == 10) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
            }if (cevap11 > 9) {
                System.out.println("Lütfen Geçerli Bir İNİŞ DURAĞI Seçiniz");
                System.exit(2);}


        }
        if (Cevap == 2) {
            System.out.println("2 - Meram Yeniyol Anasultan Hattı'nı seçtiniz...");
            System.out.println("--------------------------");
            System.out.println(info.getMeramYeniYol());
            System.out.println(mya.getMeramSonDurak());
            System.out.println(mya.getKazanbendi());
            System.out.println(mya.getMeramDevletHastanesi());
            System.out.println(mya.getEvliya());
            System.out.println(mya.getDamla());
            System.out.println(mya.getMeramYeniyol());
            System.out.println(mya.getMustafaKemal());
            System.out.println(mya.getAlaaddin1());
            System.out.println("Lütfen bineceğiniz durağı seçiniz: ");


            Scanner scanner2 = new Scanner(System.in);
            int cevap2 = scanner2.nextInt();
            if (cevap2 == 1) {
                System.out.println("1 -Meram Son Durak'ı seçtiniz...");

            }
            if (cevap2 == 2) {
                System.out.println("2 -Kazanbendi Durağı'nı seçtiniz...");
            }
            if (cevap2 == 3) {
                System.out.println("3 -Meram Devlet Hastanesi Durağı'nı seçtiniz...");
            }
            if (cevap2 == 4) {
                System.out.println("4 -Evliya Çelebi Parkı Durağı'nı seçtiniz...");
            }
            if (cevap2 == 5) {
                System.out.println("5 -Damla Durağı'nı seçtiniz...");
            }
            if (cevap2 == 6) {
                System.out.println("6 -Meram Yeniyol Durağı'nı seçtiniz...");
            }
            if (cevap2 == 7) {
                System.out.println("7 -Maraşel Mustafa Kemal Paşa Ortaokulu Durağı'nı seçtiniz...");
            }
            if (cevap2 == 8) {
                System.out.println("8 -Alaaddin 1 Turnike  Durağı'nı seçtiniz...");
            }if (cevap2 > 8){
                System.out.println("Lütfen Geçerli Bir BİNİŞ DURAĞI Seçiniz");
                System.exit(1);}

            System.out.println("--------------------------");
            System.out.println("Lütfen ineceğiniz durağı seçiniz...");
            System.out.println(mya.getMeramSonDurak());
            System.out.println(mya.getKazanbendi());
            System.out.println(mya.getMeramDevletHastanesi());
            System.out.println(mya.getEvliya());
            System.out.println(mya.getDamla());
            System.out.println(mya.getMeramYeniyol());
            System.out.println(mya.getMustafaKemal());
            System.out.println(mya.getAlaaddin1());

            Scanner scanner22 = new Scanner(System.in);
            int cevap22 = scanner22.nextInt();

            if (cevap22 == 1) {
                System.out.println("1 -Meram Son Durak'ı seçtiniz...");

                if (cevap2 == 1) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap2 == 2) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Kazanbendi Durağından bindiniz");
                    System.out.println("Meram Son Durak  Durağında ineceksiniz");


                }
                if (cevap2 == 3) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağından bindiniz");
                    System.out.println("Meram Son Durak  Durağında ineceksiniz");


                }
                if (cevap2 == 4) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Evliya Çelebi Parkı Durağından bindiniz");
                    System.out.println("Meram Son Durak  Durağında ineceksiniz");


                }
                if (cevap2 == 5) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Damla Durağından bindiniz");
                    System.out.println("Meram Son Durak  Durağında ineceksiniz");


                }
                if (cevap2 == 6) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Yeniyol Durağından bindiniz");
                    System.out.println("Meram Son Durak  Durağında ineceksiniz");


                }
                if (cevap2 == 7) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağından bindiniz");
                    System.out.println("Meram Son Durak  Durağında ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 turnike Durağından bindiniz");
                    System.out.println("Meram Son Durak  Durağında ineceksiniz");


                }
            }
            if (cevap22 == 2) {
                System.out.println("2 -Kazanbendi Durağı'nı seçtiniz...");
                if (cevap2 == 1) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Kazanbendi Durağında ineceksiniz");


                }
                if (cevap2 == 2) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap2 == 3) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağından bindiniz");
                    System.out.println("Kazanbendi Durağında ineceksiniz");


                }
                if (cevap2 == 4) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Evliya Çelebi Durağından bindiniz");
                    System.out.println("Kazanbendi Durağında ineceksiniz");


                }
                if (cevap2 == 5) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Damla Durağından bindiniz");
                    System.out.println("Kazanbendi Durağında ineceksiniz");


                }
                if (cevap2 == 6) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Yeniyol Durağından bindiniz");
                    System.out.println("Kazanbendi Durağında ineceksiniz");


                }
                if (cevap2 == 7) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağından bindiniz");
                    System.out.println("Kazanbendi Durağında ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 Turnike Durağından bindiniz");
                    System.out.println("Kazanbendi Durağında ineceksiniz");


                }
            }
            if (cevap22 == 3) {
                System.out.println("3 -Meram Devlet Hastanesi Durağı'nı seçtiniz...");
                if (cevap2 == 1) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağında ineceksiniz");


                }
                if (cevap2 == 2) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Kazanbendi Durağından bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağında ineceksiniz");


                }
                if (cevap2 == 3) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap2 == 4) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Evliya Çelebi Durağından bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağında ineceksiniz");


                }
                if (cevap2 == 5) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Damla Durağından bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağında ineceksiniz");


                }
                if (cevap2 == 6) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Yeniyol Durağından bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağında ineceksiniz");


                }
                if (cevap2 == 7) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağından bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağında ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 Turnike Durağından bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağında ineceksiniz");


                }
            }
            if (cevap22 == 4) {
                System.out.println("4 -Evliya Çelebi Parkı Durağı'nı seçtiniz...");
                if (cevap2 == 1) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Evliya Çelebi Parkı Durağı'nda ineceksiniz");


                }
                if (cevap2 == 2) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Kazanbendi Durağından bindiniz");
                    System.out.println("Evliya Çelebi Parkı Durağı'nda ineceksiniz");


                }
                if (cevap2 == 3) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağından bindiniz");
                    System.out.println("Evliya Çelebi Parkı Durağı'nda ineceksiniz");


                }
                if (cevap2 == 4) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap2 == 5) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Damla Durağından bindiniz");
                    System.out.println("Evliya Çelebi Parkı Durağı'nda ineceksiniz");


                }
                if (cevap2 == 6) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Yeniyol Durağından bindiniz");
                    System.out.println("Evliya Çelebi Parkı Durağı'nda ineceksiniz");


                }
                if (cevap2 == 7) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağından bindiniz");
                    System.out.println("Evliya Çelebi Parkı Durağı'nda ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 Turnike Durağından bindiniz");
                    System.out.println("Evliya Çelebi Parkı Durağı'nda ineceksiniz");


                }
            }
            if (cevap22 == 5) {
                System.out.println("5 -Damla Durağı'nı seçtiniz...");
                if (cevap2 == 1) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Damla Durağı'nda ineceksiniz");


                }
                if (cevap2 == 2) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Kazanbendi Durağından bindiniz");
                    System.out.println("Damla Durağı'nda ineceksiniz");


                }
                if (cevap2 == 3) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağından bindiniz");
                    System.out.println("Damla Durağı'nda ineceksiniz");


                }
                if (cevap2 == 4) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Evliya Çelebi Parkı Durağından bindiniz");
                    System.out.println("Damla Durağı'nda ineceksiniz");


                }
                if (cevap2 == 5) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap2 == 6) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Yeniyol Durağından bindiniz");
                    System.out.println("Damla Durağı'nda ineceksiniz");


                }
                if (cevap2 == 7) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağından bindiniz");
                    System.out.println("Damla Durağı'nda ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 Turnike Durağından bindiniz");
                    System.out.println("Damla Durağı'nda ineceksiniz");


                }
            }
            if (cevap22 == 6) {
                System.out.println("6 -Meram Yeniyol Durağı'nı seçtiniz...");
                if (cevap2 == 1) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap2 == 2) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Kazanbendi Durağından bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap2 == 3) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağından bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap2 == 4) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Evliya Çelebi Parkı Durağından bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap2 == 5) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Damla Durağından bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap2 == 6) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap2 == 7) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağından bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 Turnike Durağından bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
            }
            if (cevap22 == 7) {
                System.out.println("7 -Maraşel Mustafa Kemal Paşa Ortaokulu Durağı'nı seçtiniz...");
                if (cevap2 == 1) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağı'nda ineceksiniz");


                }
                if (cevap2 == 2) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Kazanbendi Durağından bindiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağı'nda ineceksiniz");


                }
                if (cevap2 == 3) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağından bindiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağı'nda ineceksiniz");


                }
                if (cevap2 == 4) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Evliya Çelebi Durağından bindiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağı'nda ineceksiniz");


                }
                if (cevap2 == 5) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Damla Durağından bindiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağı'nda ineceksiniz");


                }
                if (cevap2 == 6) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Yeniyol Durağından bindiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağı'nda ineceksiniz");


                }
                if (cevap2 == 7) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Alaaddin 1 Turnike Durağından bindiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağı'nda ineceksiniz");


                }
            }
            if (cevap22 == 8) {
                System.out.println("8 -Alaaddin 1 Turnike  Durağı'nı seçtiniz...");
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Son Durak Durağından bindiniz");
                    System.out.println("Alaaddin 1 Turnike  Durağı'nda ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Kazanbendi Durağından bindiniz");
                    System.out.println("Alaaddin 1 Turnike  Durağı'nda ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağından bindiniz");
                    System.out.println("Alaaddin 1 Turnike  Durağı'nda ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Evliya Çelebi Durağından bindiniz");
                    System.out.println("Alaaddin 1 Turnike  Durağı'nda ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Damla Durağından bindiniz");
                    System.out.println("Alaaddin 1 Turnike  Durağı'nda ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Meram Yeniyol Durağından bindiniz");
                    System.out.println("Alaaddin 1 Turnike  Durağı'nda ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("Meram Yeniyol Anasultan Hatttınzı Seçtiniz");
                    System.out.println("Maraşel Mustafa Kemal Paşa Ortaokulu Durağından bindiniz");
                    System.out.println("Alaaddin 1 Turnike  Durağı'nda ineceksiniz");


                }
                if (cevap2 == 8) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
            }if (cevap22 > 9) {
                System.out.println("Lütfen Geçerli Bir İNİŞ DURAĞI Seçiniz");
                System.exit(2);}


        }
        if (Cevap == 3) {
            System.out.println("3 - Selçuk Üniversitesi Hattı'nı seçtiniz...");
            System.out.println("--------------------------");
            System.out.println(info.getSelcuk());
            System.out.println(su.getZafer());
            System.out.println(su.getBelediye());
            System.out.println(su.getNalcaci());
            System.out.println(su.getKule());
            System.out.println(su.getEskiSanayi());
            System.out.println(su.getBinkonutlar());
            System.out.println(su.getJaponParki());
            System.out.println(su.getYazir());
            System.out.println(su.getPiri());
            System.out.println(su.getFirat());
            System.out.println(su.getBosna());
            System.out.println(su.getKayalar());
            System.out.println(su.getKampus());
            System.out.println("Lütfen bineceğiniz durağı seçiniz: ");


            Scanner scanner3 = new Scanner(System.in);
            int cevap3 = scanner3.nextInt();
            if (cevap3 == 1) {
                System.out.println("1 -Zafer Durağı'nı seçtiniz...");

            }
            if (cevap3 == 2) {
                System.out.println("2 -Belediye Durağı'nı seçtiniz...");
            }
            if (cevap3 == 3) {
                System.out.println("3 -Nalçacı Durağı'nı seçtiniz...");
            }
            if (cevap3 == 4) {
                System.out.println("4 -Kule  Durağı'nı seçtiniz...");
            }
            if (cevap3 == 5) {
                System.out.println("5 -Eski Sanayi  Durağı'nı seçtiniz...");
            }
            if (cevap3 == 6) {
                System.out.println("6 -Binkonutlar  Durağı'nı seçtiniz...");
            }
            if (cevap3 == 7) {
                System.out.println("7 -Japon Parkı  Durağı'nı seçtiniz...");
            }
            if (cevap3 == 8) {
                System.out.println("8 -Yazır Durağı'nı seçtiniz...");
            }
            if (cevap3 == 9) {
                System.out.println("9 -Piri Reis Durağı'nı seçtiniz...");
            }
            if (cevap3 == 10) {
                System.out.println("10 -Fırat Caddesi Durağı'nı seçtiniz...");
            }
            if (cevap3 == 11) {
                System.out.println("11 -Bosna Hersek Durağı'nı seçtiniz...");
            }
            if (cevap3 == 12) {
                System.out.println("12 -Kayalar Cami Durağı'nı seçtiniz...");
            }
            if (cevap3 == 13) {
                System.out.println("13 -Kampüs Giriş Durağı'nı seçtiniz...");
            }if (cevap3 > 13){
                System.out.println("Lütfen Geçerli Bir BİNİŞ DURAĞI Seçiniz");
                System.exit(1);}

            System.out.println("--------------------------");
            System.out.println("Lütfen ineceğiniz durağı seçiniz...");

            System.out.println(su.getZafer());
            System.out.println(su.getBelediye());
            System.out.println(su.getNalcaci());
            System.out.println(su.getKule());
            System.out.println(su.getEskiSanayi());
            System.out.println(su.getBinkonutlar());
            System.out.println(su.getJaponParki());
            System.out.println(su.getYazir());
            System.out.println(su.getPiri());
            System.out.println(su.getFirat());
            System.out.println(su.getBosna());
            System.out.println(su.getKayalar());
            System.out.println(su.getKampus());

            Scanner scanner33 = new Scanner(System.in);
            int cevap33 = scanner33.nextInt();

            if (cevap33 == 1) {
                System.out.println("1 -Zafer Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
            }
            if (cevap33 == 2) {
                System.out.println("2 -Belediye Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Belediye Durağı'nda ineceksiniz");


                }
            }
            if (cevap33 == 3) {
                System.out.println("3 -Nalçacı Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Nalçacı Durağı'nda ineceksiniz");


                }


            }
            if (cevap33 == 4) {
                System.out.println("4 -Kule  Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Cami Durağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs GirişDurağından bindiniz");
                    System.out.println("Kule Durağı'nda ineceksiniz");


                }
            }
            if (cevap33 == 5) {
                System.out.println("5 -Eski Sanayi  Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("ZaferDurağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Eski Sanayi Durağı'nda ineceksiniz");


                }
            }
            if (cevap33 == 6) {
                System.out.println("6 -Binkonutlar  Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Binkonutlar  Durağı'nda ineceksiniz");


                }
            }
            if (cevap33 == 7) {
                System.out.println("7 -Japon Parkı  Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Japon Parkı  Durağı'nda ineceksiniz");


                }
            }
            if (cevap33 == 8) {
                System.out.println("8 -Yazır Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Yazır Durağı'nda ineceksiniz");


                }
            }
            if (cevap33 == 9) {
                System.out.println("9 -Piri Reis Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Piri Reis Durağı'nda ineceksiniz");


                }


            }
            if (cevap33 == 10) {
                System.out.println("10 -Fırat Caddesi Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Fırat Caddesi Durağı'nda ineceksiniz");


                }
            }
            if (cevap33 == 11) {
                System.out.println("11 -Bosna Hersek Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Bosna Hersek Durağı'nda ineceksiniz");


                }
            }
            if (cevap33 == 12) {
                System.out.println("12 -Kayalar Cami Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap3 == 13) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kampüs Giriş Durağından bindiniz");
                    System.out.println("Kayalar Cami Durağı'nda ineceksiniz");


                }
            }
            if (cevap33 == 13) {
                System.out.println("13 -Kampüs Giriş Durağı'nı seçtiniz...");

                if (cevap3 == 1) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Zafer Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 2) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Belediye Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 3) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Nalçacı Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 4) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kule Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 5) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Eski Sanayi Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 6) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Binkonutlar Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 7) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Japon Parkı Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 8) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Yazır Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 9) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Piri Reis Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 10) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Fırat Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 11) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Bosna Hersek Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 12) {
                    System.out.println("Selçuk Üniversitesi Hatttınzı Seçtiniz");
                    System.out.println("Kayalar Camii Durağından bindiniz");
                    System.out.println("Kampüs Giriş Durağı'nda ineceksiniz");


                }
                if (cevap3 == 13) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
            }if (cevap33 > 9) {
                System.out.println("Lütfen Geçerli Bir İNİŞ DURAĞI Seçiniz");
                System.exit(2);}

        }
        if (Cevap == 4) {
            System.out.println("4 - Adana Çevre Yolu Hattı'nı seçtiniz...");
            System.out.println("--------------------------");
            System.out.println(info.getAdanaCevreYolu());
            System.out.println(acy.getAlakava());
            System.out.println(acy.getTelafer());
            System.out.println(acy.getLeylek());
            System.out.println(acy.getAcar());
            System.out.println(acy.getCilenti());
            System.out.println(acy.getEgirdag());
            System.out.println(acy.getGuraga());
            System.out.println(acy.getDoganay());
            System.out.println(acy.getCevreYolu());
            System.out.println(acy.getKaratayHal());
            System.out.println(acy.getAdanaCevreYolu());
            System.out.println(acy.getLaleciler());
            System.out.println(acy.getModesa());
            System.out.println(acy.getGursahin());
            System.out.println(acy.getOtogar());
            System.out.println("Lütfen bineceğiniz durağı seçiniz: ");


            Scanner scanner4 = new Scanner(System.in);
            int cevap4 = scanner4.nextInt();
            if (cevap4 == 1) {
                System.out.println("1 -Alakava Son Durak'ı seçtiniz...");
            }
            if (cevap4 == 2) {
                System.out.println("2 -Telafer İlkokulu Durağı'nı seçtiniz...");
            }
            if (cevap4 == 3) {
                System.out.println("3 -Leylek  Durağı'nı seçtiniz...");
            }
            if (cevap4 == 4) {
                System.out.println("4 -Acar  Durağı'nı seçtiniz...");
            }
            if (cevap4 == 5) {
                System.out.println("5 -Çilenti  Durağı'nı seçtiniz...");
            }
            if (cevap4 == 6) {
                System.out.println("6 -Eğirdağ  Durağı'nı seçtiniz...");
            }
            if (cevap4 == 7) {
                System.out.println("7 -Gürağa  Durağı'nı seçtiniz...");
            }
            if (cevap4 == 8) {
                System.out.println("8 -Doğanay Durağı'nı seçtiniz...");
            }
            if (cevap4 == 9) {
                System.out.println("9 -Çevre Yolu Durağı'nı seçtiniz...");
            }
            if (cevap4 == 10) {
                System.out.println("10 -Karatay Hali Durağı'nı seçtiniz...");
            }
            if (cevap4 == 11) {
                System.out.println("11 -Adana Çevre Yolu Durağı'nı seçtiniz...");
            }
            if (cevap4 == 12) {
                System.out.println("12 -Laleciler Durağı'nı seçtiniz...");
            }
            if (cevap4 == 13) {
                System.out.println("13 -Modesa Durağı'nı seçtiniz...");
            }
            if (cevap4 == 14) {
                System.out.println("14 -Gürşahin Durağı'nı seçtiniz...");
            }
            if (cevap4 == 15) {
                System.out.println("15 -Otogar Kavşağı Durağı'nı seçtiniz...");
            }if (cevap4 > 15){
                System.out.println("Lütfen Geçerli Bir BİNİŞ DURAĞI Seçiniz");
                System.exit(1);}

            System.out.println("--------------------------");
            System.out.println("Lütfen ineceğiniz durağı seçiniz...");

            System.out.println(acy.getAlakava());
            System.out.println(acy.getTelafer());
            System.out.println(acy.getLeylek());
            System.out.println(acy.getAcar());
            System.out.println(acy.getCilenti());
            System.out.println(acy.getEgirdag());
            System.out.println(acy.getGuraga());
            System.out.println(acy.getDoganay());
            System.out.println(acy.getCevreYolu());
            System.out.println(acy.getKaratayHal());
            System.out.println(acy.getAdanaCevreYolu());
            System.out.println(acy.getLaleciler());
            System.out.println(acy.getModesa());
            System.out.println(acy.getGursahin());
            System.out.println(acy.getOtogar());

            Scanner scanner44 = new Scanner(System.in);
            int cevap44 = scanner44.nextInt();

            if (cevap44 == 1) {
                System.out.println("1 -Alakava Son Durak'ı seçtiniz...");
                if (cevap4 == 1) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Alakava Son Durak Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 2) {
                System.out.println("2 -Telafer İlkokulu Durağı'nı seçtiniz...");
                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Telafer İlkokulu Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 3) {
                System.out.println("3 -Leylek Durağı'nı seçtiniz...");
                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Leylek Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 4) {
                System.out.println("4 -Acar Durağı'nı seçtiniz...");
                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Acar Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 5) {
                System.out.println("5 -Çilenti Durağı'nı seçtiniz...");
                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Çilenti Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 6) {
                System.out.println("6 -Eğirdağ Durağı'nı seçtiniz...");

                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Eğirdağ Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 7) {
                System.out.println("7 -Gürağa Durağı'nı seçtiniz...");

                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Gürağa Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 8) {
                System.out.println("8 -Doğanay Durağı'nı seçtiniz...");

                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Doğanay Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 9) {
                System.out.println("9 -Çevre Yolu Durağı'nı seçtiniz...");

                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Çevre Yolu Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 10) {
                System.out.println("10 -Karatay Hali Durağı'nı seçtiniz...");

                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Karatay Hali'nda ineceksiniz");


                }
            }
            if (cevap44 == 11) {
                System.out.println("11 -Adana Çevre Yolu Durağı'nı seçtiniz...");

                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Adana Çevre Yolu Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 12) {
                System.out.println("12 -Laleciler Durağı'nı seçtiniz...");

                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Laleciler Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 13) {
                System.out.println("13 -Modesa Durağı'nı seçtiniz...");
                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Modesa Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 14) {
                System.out.println("14 -Gürşahin Durağı'nı seçtiniz...");
                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap4 == 15) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Otogar Kavşağı Durağı'ndan bindiniz");
                    System.out.println("Gürşahin Durağı'nda ineceksiniz");


                }
            }
            if (cevap44 == 15) {
                System.out.println("15 -Otogar Kavşağı Durağı'nı seçtiniz...");
                if (cevap4 == 1) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Alakava Son Durak Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 2) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Telafer İlkokulu Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 3) {
                    System.out.println("Adana Çevre Yolu Hattızı Seçtiniz");
                    System.out.println("Leylek'Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 4) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Acar Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 5) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çilenti Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 6) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Eğirdağ Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 7) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürağa Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 8) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Doğanay Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 9) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 10) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Karatay Hali Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 11) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Adana Çevre Yolu Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 12) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Laleciler Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 13) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Modesa Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 14) {
                    System.out.println("Adana Çevre Yolu Hattını Seçtiniz");
                    System.out.println("Gürşahin Durağı'ndan bindiniz");
                    System.out.println("Otogar Kavşağı Durağı'nda ineceksiniz");


                }
                if (cevap4 == 15) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
            }if (cevap44 > 9) {
                System.out.println("Lütfen Geçerli Bir İNİŞ DURAĞI Seçiniz");
                System.exit(2);}


        }
        if (Cevap == 5) {
            System.out.println("5 - Dere Yeniyol Hattı'nı seçtiniz...");
            System.out.println("--------------------------");
            System.out.println(info.getDereYeniYol());
            System.out.println(dy.getCatikkas());
            System.out.println(dy.getDere());
            System.out.println(dy.getFidanlik());
            System.out.println(dy.getBuyukpinar());
            System.out.println(dy.getAnahtar());
            System.out.println(dy.getZafer());
            System.out.println(dy.getKisla2());
            System.out.println(dy.getAkgol());
            System.out.println(dy.getYolboyu());
            System.out.println("Lütfen bineceğiniz durağı seçiniz: ");


            Scanner scanner5 = new Scanner(System.in);
            int cevap5 = scanner5.nextInt();
            if (cevap5 == 1) {
                System.out.println("1 -Çatıkkaş Durağı'nı seçtiniz...");
            }
            if (cevap5 == 2) {
                System.out.println("2 -Dere Durağı'nı seçtiniz...");
            }
            if (cevap5 == 3) {
                System.out.println("3 -Fidanlık  Durağı'nı seçtiniz...");
            }
            if (cevap5 == 4) {
                System.out.println("4 -Büyükpınar  Durağı'nı seçtiniz...");
            }
            if (cevap5 == 5) {
                System.out.println("5 -Anahtar  Durağı'nı seçtiniz...");
            }
            if (cevap5 == 6) {
                System.out.println("6 -Zafer  Durağı'nı seçtiniz...");
            }
            if (cevap5 == 7) {
                System.out.println("7 -Kışlaönü 2  Durağı'nı seçtiniz...");
            }
            if (cevap5 == 8) {
                System.out.println("8 -Akgöl Durağı'nı seçtiniz...");
            }
            if (cevap5 == 9) {
                System.out.println("9 -Yolboyu Durağı'nı seçtiniz...");
            }if (cevap5 > 9){
                System.out.println("Lütfen Geçerli Bir BİNİŞ DURAĞI Seçiniz");
                System.exit(1);}

            System.out.println("--------------------------");
            System.out.println("Lütfen ineceğiniz durağı seçiniz...");

            System.out.println(dy.getCatikkas());
            System.out.println(dy.getDere());
            System.out.println(dy.getFidanlik());
            System.out.println(dy.getBuyukpinar());
            System.out.println(dy.getAnahtar());
            System.out.println(dy.getZafer());
            System.out.println(dy.getKisla2());
            System.out.println(dy.getAkgol());
            System.out.println(dy.getYolboyu());

            Scanner scanner55 = new Scanner(System.in);
            int cevap55 = scanner55.nextInt();

            if (cevap55 == 1) {
                System.out.println("1 -Çatıkkaş Durağı'nı seçtiniz...");
                if (cevap5 == 1) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap5 == 2) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Dere Durağı'ndan bindiniz");
                    System.out.println("Çatıkkaş Durağı'nda ineceksiniz");


                }
                if (cevap5 == 3) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Fidanlık Durağı'ndan bindiniz");
                    System.out.println("Çatıkkaş Durağı'nda ineceksiniz");


                }
                if (cevap5 == 4) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Çatıkkaş Durağı'nda ineceksiniz");


                }
                if (cevap5 == 5) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Anahtar Durağı'ndan bindiniz");
                    System.out.println("Çatıkkaş Durağı'nda ineceksiniz");


                }
                if (cevap5 == 6) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Zafer Durağı'ndan bindiniz");
                    System.out.println("Çatıkkaş Durağı'nda ineceksiniz");


                }
                if (cevap5 == 7) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Kışlaönü 2 Durağı'ndan bindiniz");
                    System.out.println("Çatıkkaş Durağı'nda ineceksiniz");


                }
                if (cevap5 == 8) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Akgöl Durağı'ndan bindiniz");
                    System.out.println("Çatıkkaş Durağı'nda ineceksiniz");


                }
                if (cevap5 == 9) {
                    System.out.println("Dere YeniyolHattını Seçtiniz");
                    System.out.println("Yolboyu Durağı'ndan bindiniz");
                    System.out.println("Çatıkkaş Durağı'nda ineceksiniz");


                }
            }
            if (cevap55 == 2) {
                System.out.println("2 -Dere Durağı'nı seçtiniz...");
                if (cevap5 == 1) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Çatıkkaş Durağı'ndan bindiniz");
                    System.out.println("Dere Durağı'nda ineceksiniz");


                }
                if (cevap5 == 2) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap5 == 3) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Fidanlık Durağı'ndan bindiniz");
                    System.out.println("Dere Durağı'nda ineceksiniz");


                }
                if (cevap5 == 4) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Dere Durağı'nda ineceksiniz");


                }
                if (cevap5 == 5) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Anahtar Durağı'ndan bindiniz");
                    System.out.println("Dere Durağı'nda ineceksiniz");


                }
                if (cevap5 == 6) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Zafer Durağı'ndan bindiniz");
                    System.out.println("Dere Durağı'nda ineceksiniz");


                }
                if (cevap5 == 7) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Kışlaönü 2 Durağı'ndan bindiniz");
                    System.out.println("Dere Durağı'nda ineceksiniz");


                }
                if (cevap5 == 8) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Akgöl Durağı'ndan bindiniz");
                    System.out.println("Dere Durağı'nda ineceksiniz");


                }
                if (cevap5 == 9) {
                    System.out.println("Dere YeniyolHattını Seçtiniz");
                    System.out.println("Yolboyu Durağı'ndan bindiniz");
                    System.out.println("Dere Durağı'nda ineceksiniz");


                }
            }
            if (cevap55 == 3) {
                System.out.println("3 -Fidanlık Durağı'nı seçtiniz...");
                if (cevap5 == 1) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Çatıkkaş Durağı'ndan bindiniz");
                    System.out.println("Fidanlık Durağı'nda ineceksiniz");


                }
                if (cevap5 == 2) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Dere Durağı'ndan bindiniz");
                    System.out.println("Fidanlık Durağı'nda ineceksiniz");


                }
                if (cevap5 == 3) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap5 == 4) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Fidanlık Durağı'nda ineceksiniz");


                }
                if (cevap5 == 5) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Anahtar Durağı'ndan bindiniz");
                    System.out.println("Fidanlık Durağı'nda ineceksiniz");


                }
                if (cevap5 == 6) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Zafer Durağı'ndan bindiniz");
                    System.out.println("Fidanlık Durağı'nda ineceksiniz");


                }
                if (cevap5 == 7) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Kışlaönü 2 Durağı'ndan bindiniz");
                    System.out.println("Fidanlık Durağı'nda ineceksiniz");


                }
                if (cevap5 == 8) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Akgöl Durağı'ndan bindiniz");
                    System.out.println("Fidanlık Durağı'nda ineceksiniz");


                }
                if (cevap5 == 9) {
                    System.out.println("Dere YeniyolHattını Seçtiniz");
                    System.out.println("Yolboyu Durağı'ndan bindiniz");
                    System.out.println("Fidanlık Durağı'nda ineceksiniz");


                }
            }
            if (cevap55 == 4) {
                System.out.println("4 -Büyükpınar Durağı'nı seçtiniz...");
                if (cevap5 == 1) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Çatıkkaş Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 2) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Dere Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 3) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Fidanlık Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 4) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap5 == 5) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Anahtar Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 6) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Zafer Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 7) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Kışlaönü 2 Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 8) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Akgöl Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 9) {
                    System.out.println("Dere YeniyolHattını Seçtiniz");
                    System.out.println("Yolboyu Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
            }
            if (cevap55 == 5) {
                System.out.println("5 -Anahtar Durağı'nı seçtiniz...");
                if (cevap5 == 1) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Çatıkkaş Durağı'ndan bindiniz");
                    System.out.println("Anahtar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 2) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Dere Durağı'ndan bindiniz");
                    System.out.println("Anahtar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 3) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Fidanlık Durağı'ndan bindiniz");
                    System.out.println("Anahtar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 4) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Anahtar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 5) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap5 == 6) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Zafer Durağı'ndan bindiniz");
                    System.out.println("Anahtar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 7) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Kışlaönü 2 Durağı'ndan bindiniz");
                    System.out.println("Anahtar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 8) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Akgöl Durağı'ndan bindiniz");
                    System.out.println("Anahtar Durağı'nda ineceksiniz");


                }
                if (cevap5 == 9) {
                    System.out.println("Dere YeniyolHattını Seçtiniz");
                    System.out.println("Yolboyu Durağı'ndan bindiniz");
                    System.out.println("Anahtar Durağı'nda ineceksiniz");


                }
            }
            if (cevap55 == 6) {
                System.out.println("6 -Zafer Durağı'nı seçtiniz...");
                if (cevap5 == 1) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Çatıkkaş Durağı'ndan bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap5 == 2) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Dere Durağı'ndan bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap5 == 3) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Fidanlık Durağı'ndan bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap5 == 4) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap5 == 5) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Anahtar Durağı'ndan bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap5 == 6) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap5 == 7) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Kışlaönü 2 Durağı'ndan bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap5 == 8) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Akgöl Durağı'ndan bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
                if (cevap5 == 9) {
                    System.out.println("Dere YeniyolHattını Seçtiniz");
                    System.out.println("Yolboyu Durağı'ndan bindiniz");
                    System.out.println("Zafer Durağı'nda ineceksiniz");


                }
            }
            if (cevap55 == 7) {
                System.out.println("7 -Kışlaönü 2 Durağı'nı seçtiniz...");
                if (cevap5 == 1) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Çatıkkaş Durağı'ndan bindiniz");
                    System.out.println("Kışlaönü 2 Durağı'nda ineceksiniz");


                }
                if (cevap5 == 2) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Dere Durağı'ndan bindiniz");
                    System.out.println("Kışlaönü 2 Durağı'nda ineceksiniz");


                }
                if (cevap5 == 3) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Fidanlık Durağı'ndan bindiniz");
                    System.out.println("Kışlaönü 2 Durağı'nda ineceksiniz");


                }
                if (cevap5 == 4) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Kışlaönü 2 Durağı'nda ineceksiniz");


                }
                if (cevap5 == 5) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Anahtar Durağı'ndan bindiniz");
                    System.out.println("Kışlaönü 2 Durağı'nda ineceksiniz");


                }
                if (cevap5 == 6) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Zafer Durağı'ndan bindiniz");
                    System.out.println("Kışlaönü 2 Durağı'nda ineceksiniz");


                }
                if (cevap5 == 7) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap5 == 8) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Akgöl Durağı'ndan bindiniz");
                    System.out.println("Kışlaönü 2 Durağı'nda ineceksiniz");


                }
                if (cevap5 == 9) {
                    System.out.println("Dere YeniyolHattını Seçtiniz");
                    System.out.println("Yolboyu Durağı'ndan bindiniz");
                    System.out.println("Kışlaönü 2 Durağı'nda ineceksiniz");


                }
            }
            if (cevap55 == 8) {
                System.out.println("8 -Akgöl Durağı'nı seçtiniz...");
                if (cevap5 == 1) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Çatıkkaş Durağı'ndan bindiniz");
                    System.out.println("Akgöl Durağı'nda ineceksiniz");


                }
                if (cevap5 == 2) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Dere Durağı'ndan bindiniz");
                    System.out.println("Akgöl Durağı'nda ineceksiniz");


                }
                if (cevap5 == 3) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Fidanlık Durağı'ndan bindiniz");
                    System.out.println("Akgöl Durağı'nda ineceksiniz");


                }
                if (cevap5 == 4) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Akgöl Durağı'nda ineceksiniz");


                }
                if (cevap5 == 5) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Anahtar Durağı'ndan bindiniz");
                    System.out.println("Akgöl Durağı'nda ineceksiniz");


                }
                if (cevap5 == 6) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Zafer Durağı'ndan bindiniz");
                    System.out.println("Akgöl Durağı'nda ineceksiniz");


                }
                if (cevap5 == 7) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Kışlaönü 2 Durağı'ndan bindiniz");
                    System.out.println("Akgöl Durağı'nda ineceksiniz");


                }
                if (cevap5 == 8) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap5 == 9) {
                    System.out.println("Dere YeniyolHattını Seçtiniz");
                    System.out.println("Yolboyu Durağı'ndan bindiniz");
                    System.out.println("Akgöl Durağı'nda ineceksiniz");


                }
            }
            if (cevap55 == 9) {
                System.out.println("9 -Yolboyu Durağı'nı seçtiniz...");
                if (cevap5 == 1) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Çatıkkaş Durağı'ndan bindiniz");
                    System.out.println("Yolboyu Durağı'nda ineceksiniz");


                }
                if (cevap5 == 2) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Dere Durağı'ndan bindiniz");
                    System.out.println("Yolboyu Durağı'nda ineceksiniz");


                }
                if (cevap5 == 3) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Fidanlık Durağı'ndan bindiniz");
                    System.out.println("Yolboyu Durağı'nda ineceksiniz");


                }
                if (cevap5 == 4) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Yolboyu Durağı'nda ineceksiniz");


                }
                if (cevap5 == 5) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Anahtar Durağı'ndan bindiniz");
                    System.out.println("Yolboyu Durağı'nda ineceksiniz");


                }
                if (cevap5 == 6) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Zafer Durağı'ndan bindiniz");
                    System.out.println("Yolboyu Durağı'nda ineceksiniz");


                }
                if (cevap5 == 7) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Kışlaönü 2 Durağı'ndan bindiniz");
                    System.out.println("Yolboyu Durağı'nda ineceksiniz");


                }
                if (cevap5 == 8) {
                    System.out.println("Dere Yeniyol Hattını Seçtiniz");
                    System.out.println("Akgöl Durağı'ndan bindiniz");
                    System.out.println("Yolboyu Durağı'nda ineceksiniz");


                }
                if (cevap5 == 9) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
            }if (cevap55 > 9) {
                System.out.println("Lütfen Geçerli Bir İNİŞ DURAĞI Seçiniz");
                System.exit(2);}


        }
        if (Cevap == 6) {
            System.out.println("6 - Kovanağzı Hattı'nı seçtiniz...");
            System.out.println("--------------------------");
            System.out.println(info.getKovanagzi());
            System.out.println(kvn.getAsik());
            System.out.println(kvn.getCimendere());
            System.out.println(kvn.getDemir());
            System.out.println(kvn.getErmisli());
            System.out.println(kvn.getSerhat());
            System.out.println(kvn.getKayali());
            System.out.println(kvn.getRumi());
            System.out.println(kvn.getMevlana());
            System.out.println(kvn.getAstar());
            System.out.println(kvn.getKaratayUni());
            System.out.println(kvn.getKaside());
            System.out.println(kvn.getSehirHastanesiIstiklal());
            System.out.println("Lütfen bineceğiniz durağı seçiniz: ");


            Scanner scanner6 = new Scanner(System.in);
            int cevap6 = scanner6.nextInt();
            if (cevap6 == 1) {
                System.out.println("1 -Aşık Durağı'nı seçtiniz...");
            }
            if (cevap6 == 2) {
                System.out.println("2 -Çimendere Durağı'nı seçtiniz...");
            }
            if (cevap6 == 3) {
                System.out.println("3 -Demirköy  Durağı'nı seçtiniz...");
            }
            if (cevap6 == 4) {
                System.out.println("4 -Ermişli  Durağı'nı seçtiniz...");
            }
            if (cevap6 == 5) {
                System.out.println("5 -Serhat  Durağı'nı seçtiniz...");
            }
            if (cevap6 == 6) {
                System.out.println("6 -Kayalıpark Durağı'nı seçtiniz...");
            }
            if (cevap6 == 7) {
                System.out.println("7 -Rumi  Durağı'nı seçtiniz...");
            }
            if (cevap6 == 8) {
                System.out.println("8 -Mevlana Durağı'nı seçtiniz...");
            }
            if (cevap6 == 9) {
                System.out.println("9 -Astar Durağı'nı seçtiniz...");
            }
            if (cevap6 == 10) {
                System.out.println("10 -Karatay Üniversitesi Durağı'nı seçtiniz...");
            }
            if (cevap6 == 11) {
                System.out.println("11 -Kaside Durağı'nı seçtiniz...");
            }
            if (cevap6 == 12) {
                System.out.println("12 -Şehir Hastanesi İstiklal Çıkışı Durağı'nı seçtiniz...");
            }if (cevap6 > 12){
                System.out.println("Lütfen Geçerli Bir BİNİŞ DURAĞISeçiniz");
                System.exit(1);}

            System.out.println("--------------------------");
            System.out.println("Lütfen ineceğiniz durağı seçiniz...");

            System.out.println(kvn.getAsik());
            System.out.println(kvn.getCimendere());
            System.out.println(kvn.getDemir());
            System.out.println(kvn.getErmisli());
            System.out.println(kvn.getSerhat());
            System.out.println(kvn.getKayali());
            System.out.println(kvn.getRumi());
            System.out.println(kvn.getMevlana());
            System.out.println(kvn.getAstar());
            System.out.println(kvn.getKaratayUni());
            System.out.println(kvn.getKaside());
            System.out.println(kvn.getSehirHastanesiIstiklal());

            Scanner scanner66 = new Scanner(System.in);
            int cevap66 = scanner66.nextInt();

            if (cevap66 == 1) {
                System.out.println("1 -Aşık Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Aşık Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 2) {
                System.out.println("2 -Çimendere Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Çimendere Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 3) {
                System.out.println("3 - Demirköy Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Demirköy Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 4) {
                System.out.println("4 - Ermişli Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Ermişli Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 5) {
                System.out.println("5 - Serhat Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Serhat Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 6) {
                System.out.println("6 - Kayalıpark Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Kayalıpark Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 7) {
                System.out.println("7 - Rumi Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 8) {
                System.out.println("8 - Mevlana Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Mevlana Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 9) {
                System.out.println("9 - Astar Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Astar Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 10) {
                System.out.println("10 - Karatay Üniversitesi Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Karatay Üniversitesi Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 11) {
                System.out.println("11 - Kaside Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap6 == 12) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Kaside Durağı'nda ineceksiniz");


                }
            }
            if (cevap66 == 12) {
                System.out.println("12 - Şehir Hastanesi İstiklal Çıkışı Durağı'nı seçtiniz...");
                if (cevap6 == 1) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Aşık Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 2) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Çimendere Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 3) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Demirköy Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 4) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Ermişli Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 5) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Serhat Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 6) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kayalıpark Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 7) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 8) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Mevlana Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 9) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Astar Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 10) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Karatay Üniversitesi Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 11) {
                    System.out.println("Kovanağzı Hattını Seçtiniz");
                    System.out.println("Kaside Durağı'ndan bindiniz");
                    System.out.println("Şehir Hastanesi İstiklal Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap6 == 12) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
            }if (cevap66 > 12) {
                System.out.println("Lütfen Geçerli Bir İNİŞ DURAĞI Seçiniz");
                System.exit(2);}


        }
        if (Cevap == 7) {
            System.out.println("7 - Köyceğiz Hattı'nı seçtiniz...");
            System.out.println("--------------------------");
            System.out.println(info.getKoycegiz());
            System.out.println(kyc.getKoycegizKampus());
            System.out.println(kyc.getSerami());
            System.out.println(kyc.getGelinyaka());
            System.out.println(kyc.getBuyukpinar());
            System.out.println(kyc.getMeramDevletHastanesi());
            System.out.println(kyc.getMeramYeniyol());
            System.out.println(kyc.getKoski());
            System.out.println(kyc.getMillet());
            System.out.println("Lütfen bineceğiniz durağı seçiniz: ");


            Scanner scanner7 = new Scanner(System.in);
            int cevap7 = scanner7.nextInt();
            if (cevap7 == 1) {
                System.out.println("1 -Köyceğiz Kampüs Durağı'nı seçtiniz...");

            }
            if (cevap7 == 2) {
                System.out.println("2 -Serami Durağı'nı seçtiniz...");
            }
            if (cevap7 == 3) {
                System.out.println("3 -Gelinyaka  Durağı'nı seçtiniz...");
            }
            if (cevap7 == 4) {
                System.out.println("4 -Büyükpınar  Durağı'nı seçtiniz...");
            }
            if (cevap7 == 5) {
                System.out.println("5 -Meram Devlet Hastanesi  Durağı'nı seçtiniz...");
            }
            if (cevap7 == 6) {
                System.out.println("6 -Meram Yeniyol  Durağı'nı seçtiniz...");
            }
            if (cevap7 == 7) {
                System.out.println("7 -Koski  Durağı'nı seçtiniz...");
            }
            if (cevap7 == 8) {
                System.out.println("8 -Millet Durağı'nı seçtiniz...");
            }if (cevap7 > 8){
                System.out.println("Lütfen Geçerli Bir BİNİŞ DURAĞI Seçiniz");
                System.exit(1);}

            System.out.println("--------------------------");
            System.out.println("Lütfen inec,eğiniz durağı seçiniz...");

            System.out.println(kyc.getKoycegizKampus());
            System.out.println(kyc.getSerami());
            System.out.println(kyc.getGelinyaka());
            System.out.println(kyc.getBuyukpinar());
            System.out.println(kyc.getMeramDevletHastanesi());
            System.out.println(kyc.getMeramYeniyol());
            System.out.println(kyc.getKoski());
            System.out.println(kyc.getMillet());

            Scanner scanner77 = new Scanner(System.in);
            int cevap77 = scanner77.nextInt();

            if (cevap77 == 1) {
                System.out.println("1 -Köyceğiz Kampüs Durağı'nı seçtiniz...");

                if (cevap7 == 1) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");

                }
                if (cevap7 == 2) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Serami Durağı'ndan bindiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'nda ineceksiniz");


                }
                if (cevap7 == 3) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Gelinyaka Durağı'ndan bindiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'nda ineceksiniz");


                }
                if (cevap7 == 4) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'nda ineceksiniz");


                }
                if (cevap7 == 5) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'ndan bindiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'nda ineceksiniz");


                }
                if (cevap7 == 6) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Yeniyol Durağı'ndan bindiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'nda ineceksiniz");


                }
                if (cevap7 == 7) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Koski Durağı'ndan bindiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'nda ineceksiniz");


                }
                if (cevap7 == 8) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Millet Durağı'ndan bindiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'nda ineceksiniz");


                }
            }
            if (cevap77 == 2) {
                System.out.println("2 -Serami Durağı'nı seçtiniz...");

                if (cevap7 == 1) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'ndan bindiniz");
                    System.out.println("Serami Durağı'nda ineceksiniz");


                }
                if (cevap7 == 2) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");

                }
                if (cevap7 == 3) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Gelinyaka Durağı'ndan bindiniz");
                    System.out.println("Serami Durağı'nda ineceksiniz");


                }
                if (cevap7 == 4) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Serami Durağı'nda ineceksiniz");


                }
                if (cevap7 == 5) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'ndan bindiniz");
                    System.out.println("Serami Durağı'nda ineceksiniz");


                }
                if (cevap7 == 6) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Yeniyol Durağı'ndan bindiniz");
                    System.out.println("Serami Durağı'nda ineceksiniz");


                }
                if (cevap7 == 7) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Koski Durağı'ndan bindiniz");
                    System.out.println("Serami Durağı'nda ineceksiniz");


                }
                if (cevap7 == 8) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Millet Durağı'ndan bindiniz");
                    System.out.println("Serami Durağı'nda ineceksiniz");


                }
            }
            if (cevap77 == 3) {
                System.out.println("3 -Gelinyaka  Durağı'nı seçtiniz...");

                if (cevap7 == 1) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'ndan bindiniz");
                    System.out.println("Gelinyaka Durağı'nda ineceksiniz");


                }
                if (cevap7 == 2) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Serami Durağı'ndan bindiniz");
                    System.out.println("Gelinyaka Durağı'nda ineceksiniz");


                }
                if (cevap7 == 3) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");

                }
                if (cevap7 == 4) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Gelinyaka Durağı'nda ineceksiniz");


                }
                if (cevap7 == 5) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'ndan bindiniz");
                    System.out.println("Gelinyaka Durağı'nda ineceksiniz");


                }
                if (cevap7 == 6) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Yeniyol Durağı'ndan bindiniz");
                    System.out.println("Gelinyaka Durağı'nda ineceksiniz");


                }
                if (cevap7 == 7) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Koski Durağı'ndan bindiniz");
                    System.out.println("Gelinyaka Durağı'nda ineceksiniz");


                }
                if (cevap7 == 8) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Millet Durağı'ndan bindiniz");
                    System.out.println("Gelinyaka Durağı'nda ineceksiniz");


                }
            }
            if (cevap77 == 4) {
                System.out.println("Büyükpınar  Durağı'nı seçtiniz...");

                if (cevap7 == 1) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap7 == 2) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Serami Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap7 == 3) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Gelinyaka Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap7 == 4) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");

                }
                if (cevap7 == 5) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap7 == 6) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Yeniyol Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap7 == 7) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Koski Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
                if (cevap7 == 8) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Millet Durağı'ndan bindiniz");
                    System.out.println("Büyükpınar Durağı'nda ineceksiniz");


                }
            }
            if (cevap77 == 5) {
                System.out.println("5 -Meram Devlet Hastanesi  Durağı'nı seçtiniz...");

                if (cevap7 == 1) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'ndan bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'nda ineceksiniz");


                }
                if (cevap7 == 2) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Serami Durağı'ndan bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'nda ineceksiniz");


                }
                if (cevap7 == 3) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Gelinyaka Durağı'ndan bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'nda ineceksiniz");


                }
                if (cevap7 == 4) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'nda ineceksiniz");


                }
                if (cevap7 == 5) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap7 == 6) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Yeniyol Durağı'ndan bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'nda ineceksiniz");


                }
                if (cevap7 == 7) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Koski Durağı'ndan bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'nda ineceksiniz");


                }
                if (cevap7 == 8) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Millet Durağı'ndan bindiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'nda ineceksiniz");


                }
            }
            if (cevap77 == 6) {
                System.out.println("Meram Yeniyol  Durağı'nı seçtiniz...");

                if (cevap7 == 1) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'ndan bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap7 == 2) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Serami Durağı'ndan bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap7 == 3) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Gelinyaka Durağı'ndan bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap7 == 4) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap7 == 5) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'ndan bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap7 == 6) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap7 == 7) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Koski Durağı'ndan bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
                if (cevap7 == 8) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Millet Durağı'ndan bindiniz");
                    System.out.println("Meram Yeniyol Durağı'nda ineceksiniz");


                }
            }
            if (cevap77 == 7) {
                System.out.println("7 -Koski  Durağı'nı seçtiniz...");

                if (cevap7 == 1) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'ndan bindiniz");
                    System.out.println("Koski Durağı'nda ineceksiniz");


                }
                if (cevap7 == 2) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Serami Durağı'ndan bindiniz");
                    System.out.println("Koski Durağı'nda ineceksiniz");


                }
                if (cevap7 == 3) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Gelinyaka Durağı'ndan bindiniz");
                    System.out.println("Koski Durağı'nda ineceksiniz");


                }
                if (cevap7 == 4) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Koski Durağı'nda ineceksiniz");


                }
                if (cevap7 == 5) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'ndan bindiniz");
                    System.out.println("Koski Durağı'nda ineceksiniz");


                }
                if (cevap7 == 6) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Yeniyol Durağı'ndan bindiniz");
                    System.out.println("Koski Durağı'nda ineceksiniz");


                }
                if (cevap7 == 7) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap7 == 8) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Millet Durağı'ndan bindiniz");
                    System.out.println("Koski Durağı'nda ineceksiniz");


                }
            }
            if (cevap77 == 8) {
                System.out.println("8 -Millet Durağı'nı seçtiniz...");

                if (cevap7 == 1) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Köyceğiz Kampüs Durağı'ndan bindiniz");
                    System.out.println("Millet Durağı'nda ineceksiniz");


                }
                if (cevap7 == 2) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Serami Durağı'ndan bindiniz");
                    System.out.println("Millet Durağı'nda ineceksiniz");


                }
                if (cevap7 == 3) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Gelinyaka Durağı'ndan bindiniz");
                    System.out.println("Millet Durağı'nda ineceksiniz");


                }
                if (cevap7 == 4) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Büyükpınar Durağı'ndan bindiniz");
                    System.out.println("Millet Durağı'nda ineceksiniz");


                }
                if (cevap7 == 5) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Devlet Hastanesi Durağı'ndan bindiniz");
                    System.out.println("Millet Durağı'nda ineceksiniz");


                }
                if (cevap7 == 6) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Meram Yeniyol Durağı'ndan bindiniz");
                    System.out.println("Millet Durağı'nda ineceksiniz");


                }
                if (cevap7 == 7) {
                    System.out.println("Köyceğiz Hattını Seçtiniz");
                    System.out.println("Koski Durağı'ndan bindiniz");
                    System.out.println("Millet Durağı'nda ineceksiniz");


                }
                if (cevap7 == 8){
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");
                }


            }if (cevap77 > 8) {
                System.out.println("Lütfen Geçerli Bir İNİŞ DURAĞI Seçiniz");
                System.exit(2);}



        }
        if (Cevap == 8) {
            System.out.println("8 - Çatalhüyük Hattı'nı seçtiniz...");
            System.out.println("--------------------------");
            System.out.println(info.getCatalhuyuk());
            System.out.println(cth.getKalkinma());
            System.out.println(cth.getBoruktolu());
            System.out.println(cth.getSensoy());
            System.out.println(cth.getUzunoba());
            System.out.println(cth.getYucetas());
            System.out.println(cth.getYildiz());
            System.out.println(cth.getPiri());
            System.out.println(cth.getRumi());
            System.out.println(cth.getKulturparkTurnike());
            System.out.println("Lütfen bineceğiniz durağı seçiniz: ");


            Scanner scanner8 = new Scanner(System.in);
            int cevap8 = scanner8.nextInt();
            if (cevap8 == 1) {
                System.out.println("1 -Kalkınma Durağı'nı seçtiniz...");
            }
            if (cevap8 == 2) {
                System.out.println("2 -Boruktolu Çıkışı Durağı'nı seçtiniz...");
            }
            if (cevap8 == 3) {
                System.out.println("3 -Şensoy  Durağı'nı seçtiniz...");
            }
            if (cevap8 == 4) {
                System.out.println("4 -Uzunoba  Durağı'nı seçtiniz...");
            }
            if (cevap8 == 5) {
                System.out.println("5 -Yücetaş  Durağı'nı seçtiniz...");
            }
            if (cevap8 == 6) {
                System.out.println("6 -Yıldız  Durağı'nı seçtiniz...");
            }
            if (cevap8 == 7) {
                System.out.println("7 -Piri esat  Durağı'nı seçtiniz...");
            }
            if (cevap8 == 8) {
                System.out.println("8 -Rumi Durağı'nı seçtiniz...");
            }
            if (cevap8 == 9) {
                System.out.println("9 -Kültürpark Turnike 2 Durağı'nı seçtiniz...");
            }if (cevap8 > 9){
                System.out.println("Lütfen Geçerli Bir BİNİŞ DURAĞI Seçiniz");
                System.exit(1);}

            System.out.println("--------------------------");
            System.out.println("Lütfen ineceğiniz durağı seçiniz...");

            System.out.println(cth.getKalkinma());
            System.out.println(cth.getBoruktolu());
            System.out.println(cth.getSensoy());
            System.out.println(cth.getUzunoba());
            System.out.println(cth.getYucetas());
            System.out.println(cth.getYildiz());
            System.out.println(cth.getPiri());
            System.out.println(cth.getRumi());
            System.out.println(cth.getKulturparkTurnike());

            Scanner scanner88 = new Scanner(System.in);
            int cevap88 = scanner88.nextInt();

            if (cevap88 == 1) {
                System.out.println("1 -Kalkınma Durağı'nı seçtiniz...");

                if (cevap8 == 1) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap8 == 2) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Kalkınma Durağı'nda ineceksiniz");


                }
                if (cevap8 == 3) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Şensoy Durağı'ndan bindiniz");
                    System.out.println("Kalkınma Durağı'nda ineceksiniz");


                }
                if (cevap8 == 4) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Uzunoba Durağı'ndan bindiniz");
                    System.out.println("Kalkınma Durağı'nda ineceksiniz");


                }
                if (cevap8 == 5) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yücetaş Durağı'ndan bindiniz");
                    System.out.println("Kalkınma Durağı'nda ineceksiniz");


                }
                if (cevap8 == 6) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yıldız Durağı'ndan bindiniz");
                    System.out.println("Kalkınma Durağı'nda ineceksiniz");


                }
                if (cevap8 == 7) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Piri Esat Durağı'ndan bindiniz");
                    System.out.println("Kalkınma Durağı'nda ineceksiniz");


                }
                if (cevap8 == 8) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Kalkınma Durağı'nda ineceksiniz");


                }
                if (cevap8 == 9) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'ndan bindiniz");
                    System.out.println("Kalkınma Durağı'nda ineceksiniz");


                }
            }
            if (cevap88 == 2) {
                System.out.println("2 -Boruktolu Çıkışı Durağı'nı seçtiniz...");

                if (cevap8 == 1) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kalkınma Durağı'ndan bindiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap8 == 2) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap8 == 3) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Şensoy Durağı'ndan bindiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap8 == 4) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Uzunoba Durağı'ndan bindiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap8 == 5) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yücetaş Durağı'ndan bindiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap8 == 6) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yıldız Durağı'ndan bindiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap8 == 7) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Piri Esat Durağı'ndan bindiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap8 == 8) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'nda ineceksiniz");


                }
                if (cevap8 == 9) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'ndan bindiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'nda ineceksiniz");


                }
            }
            if (cevap88 == 3) {
                System.out.println("3 -Şensoy  Durağı'nı seçtiniz...");

                if (cevap8 == 1) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kalkınma Durağı'ndan bindiniz");
                    System.out.println("Şensoy Durağı'nda ineceksiniz");


                }
                if (cevap8 == 2) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Şensoy Durağı'nda ineceksiniz");


                }
                if (cevap8 == 3) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap8 == 4) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Uzunoba Durağı'ndan bindiniz");
                    System.out.println("Şensoy Durağı'nda ineceksiniz");


                }
                if (cevap8 == 5) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yücetaş Durağı'ndan bindiniz");
                    System.out.println("Şensoy Durağı'nda ineceksiniz");


                }
                if (cevap8 == 6) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yıldız Durağı'ndan bindiniz");
                    System.out.println("Şensoy Durağı'nda ineceksiniz");


                }
                if (cevap8 == 7) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Piri Esat Durağı'ndan bindiniz");
                    System.out.println("Şensoy Durağı'nda ineceksiniz");


                }
                if (cevap8 == 8) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Şensoy Durağı'nda ineceksiniz");


                }
                if (cevap8 == 9) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'ndan bindiniz");
                    System.out.println("Şensoy Durağı'nda ineceksiniz");


                }
            }
            if (cevap88 == 4) {
                System.out.println("4 -Uzunoba  Durağı'nı seçtiniz...");

                if (cevap8 == 1) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kalkınma Durağı'ndan bindiniz");
                    System.out.println("Uzunoba Durağı'nda ineceksiniz");


                }
                if (cevap8 == 2) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Uzunoba Durağı'nda ineceksiniz");


                }
                if (cevap8 == 3) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Şensoy Durağı'ndan bindiniz");
                    System.out.println("Uzunoba Durağı'nda ineceksiniz");


                }
                if (cevap8 == 4) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap8 == 5) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yücetaş Durağı'ndan bindiniz");
                    System.out.println("Uzunoba Durağı'nda ineceksiniz");


                }
                if (cevap8 == 6) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yıldız Durağı'ndan bindiniz");
                    System.out.println("Uzunoba Durağı'nda ineceksiniz");


                }
                if (cevap8 == 7) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Piri Esat Durağı'ndan bindiniz");
                    System.out.println("Uzunoba Durağı'nda ineceksiniz");


                }
                if (cevap8 == 8) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Uzunoba Durağı'nda ineceksiniz");


                }
                if (cevap8 == 9) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'ndan bindiniz");
                    System.out.println("Uzunoba Durağı'nda ineceksiniz");


                }
            }
            if (cevap88 == 5) {
                System.out.println("5 -Yücetaş  Durağı'nı seçtiniz...");

                if (cevap8 == 1) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kalkınma Durağı'ndan bindiniz");
                    System.out.println("Yücetaş Durağı'nda ineceksiniz");


                }
                if (cevap8 == 2) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Yücetaş Durağı'nda ineceksiniz");


                }
                if (cevap8 == 3) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Şensoy Durağı'ndan bindiniz");
                    System.out.println("Yücetaş Durağı'nda ineceksiniz");


                }
                if (cevap8 == 4) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Uzunoba Durağı'ndan bindiniz");
                    System.out.println("Yücetaş Durağı'nda ineceksiniz");


                }
                if (cevap8 == 5) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");


                }
                if (cevap8 == 6) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yıldız Durağı'ndan bindiniz");
                    System.out.println("Yücetaş Durağı'nda ineceksiniz");


                }
                if (cevap8 == 7) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Piri Esat Durağı'ndan bindiniz");
                    System.out.println("Yücetaş Durağı'nda ineceksiniz");


                }
                if (cevap8 == 8) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Yücetaş Durağı'nda ineceksiniz");


                }
                if (cevap8 == 9) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'ndan bindiniz");
                    System.out.println("Yücetaş Durağı'nda ineceksiniz");


                }
            }
            if (cevap88 == 6) {
                System.out.println("6 -Yıldız  Durağı'nı seçtiniz...");

                if (cevap8 == 1) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kalkınma Durağı'ndan bindiniz");
                    System.out.println("Yıldız Durağı'nda ineceksiniz");


                }
                if (cevap8 == 2) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Yıldız Durağı'nda ineceksiniz");


                }
                if (cevap8 == 3) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Şensoy Durağı'ndan bindiniz");
                    System.out.println("Yıldız Durağı'nda ineceksiniz");


                }
                if (cevap8 == 4) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Uzunoba Durağı'ndan bindiniz");
                    System.out.println("Yıldız Durağı'nda ineceksiniz");


                }
                if (cevap8 == 5) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yücetaş Durağı'ndan bindiniz");
                    System.out.println("Yıldız Durağı'nda ineceksiniz");


                }
                if (cevap8 == 6) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");

                }
                if (cevap8 == 7) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Piri Esat Durağı'ndan bindiniz");
                    System.out.println("Yıldız Durağı'nda ineceksiniz");


                }
                if (cevap8 == 8) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Yıldız Durağı'nda ineceksiniz");


                }
                if (cevap8 == 9) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'ndan bindiniz");
                    System.out.println("Yıldız Durağı'nda ineceksiniz");


                }
            }
            if (cevap88 == 7) {
                System.out.println("7 -Piri esat  Durağı'nı seçtiniz...");

                if (cevap8 == 1) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kalkınma Durağı'ndan bindiniz");
                    System.out.println("Piri esat Durağı'nda ineceksiniz");


                }
                if (cevap8 == 2) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Piri esat Durağı'nda ineceksiniz");


                }
                if (cevap8 == 3) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Şensoy Durağı'ndan bindiniz");
                    System.out.println("Piri esat Durağı'nda ineceksiniz");


                }
                if (cevap8 == 4) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Uzunoba Durağı'ndan bindiniz");
                    System.out.println("Piri esat Durağı'nda ineceksiniz");


                }
                if (cevap8 == 5) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yücetaş Durağı'ndan bindiniz");
                    System.out.println("Piri esat Durağı'nda ineceksiniz");


                }
                if (cevap8 == 6) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yıldız Durağı'ndan bindiniz");
                    System.out.println("Piri esat Durağı'nda ineceksiniz");


                }
                if (cevap8 == 7) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");

                }
                if (cevap8 == 8) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Piri esat Durağı'nda ineceksiniz");


                }
                if (cevap8 == 9) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'ndan bindiniz");
                    System.out.println("Piri esat Durağı'nda ineceksiniz");


                }
            }
            if (cevap88 == 8) {
                System.out.println("8 -Rumi Durağı'nı seçtiniz...");

                if (cevap8 == 1) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kalkınma Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap8 == 2) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap8 == 3) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Şensoy Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap8 == 4) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Uzunoba Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap8 == 5) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yücetaş Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap8 == 6) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yıldız Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap8 == 7) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Piri Esat Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
                if (cevap8 == 8) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");

                }
                if (cevap8 == 9) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'ndan bindiniz");
                    System.out.println("Rumi Durağı'nda ineceksiniz");


                }
            }

            if (cevap88 == 9) {
                System.out.println("9 -Kültürpark Turnike 2 Durağı'nı seçtiniz...");

                if (cevap8 == 1) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Kalkınma Durağı'ndan bindiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'nda ineceksiniz");


                }
                if (cevap8 == 2) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Boruktolu Çıkışı Durağı'ndan bindiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'nda ineceksiniz");


                }
                if (cevap8 == 3) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Şensoy Durağı'ndan bindiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'nda ineceksiniz");


                }
                if (cevap8 == 4) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Uzunoba Durağı'ndan bindiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'nda ineceksiniz");


                }
                if (cevap8 == 5) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yücetaş Durağı'ndan bindiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'nda ineceksiniz");


                }
                if (cevap8 == 6) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Yıldız Durağı'ndan bindiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'nda ineceksiniz");


                }
                if (cevap8 == 7) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Piri Esat Durağı'ndan bindiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'nda ineceksiniz");


                }
                if (cevap8 == 8) {
                    System.out.println("Çatalhüyük Hattını Seçtiniz");
                    System.out.println("Rumi Durağı'ndan bindiniz");
                    System.out.println("Kültürpark Turnike 2 Durağı'nda ineceksiniz");


                }
                if (cevap8 == 9) {
                    System.out.println("***AYNI DURAKTAN BİNİP AYNI DURAKTAN İNMEYE ÇALIŞTINIZ LÜTFEN PROGRAMI TEKRARDAN BAŞLATINIZ***");

                }
            }if (cevap88 > 9) {
                System.out.println("Lütfen Geçerli Bir İNİŞ DURAĞI Seçiniz");
            System.exit(2);}


        }

        if (Cevap>8){System.out.println("***Lütfen Geçerli Bir HAT Seçiniz***");}

        System.out.println("----------------------------------------");
        System.out.println("Konya Büyükşehir Belediyesi'ni tercih ettiğiniz için teşekkürler...");

    }

}

