// Name; samira mohamed ahmed
//Class; Cns231
//ID; C6230132

import java.util.Date;
import java.util.Scanner;

public class projectEVCplus {
    public static Scanner input = new Scanner(System.in);
    public  static Date currenDateAndTime = new Date();
    public  static int haraa = 2000;
    public  static double money;
    public  static int opp, phone;
    public  static int account_no = 256758;
    public  static int haraga_account = 5400;
    public  static int password = 1133;

    public static void main(String[] args) {
        String n = input.nextLine();
        if (n.equals("*770#")) {
            System.out.println("fadlan gali PIN-kaaga");
            int pass = input.nextInt();
            if (pass == password) {
                showMainMenu();
            } else {
                System.out.println("pinkaaga waa qalad");
            }
        }
    }

    //menu EVCplus
    public static void showMainMenu() {
        String[] menu = {
                "1.itus Haraagaga",
                "2.Kaarka hadalka",
                "3.Bixi bill",
                "4.U wareeji EVCplus",
                "5.Warbixin kooban",
                "6.Salam bank",
                "7.Maareynta",
                "8.Bill payment"
        };
        System.out.println("EVPLus");
        for (String item : menu) {
            System.out.println(item);
        }
        int option = input.nextInt();
        Options(option);
    }

    //all options menu
    public static void Options(int option) {
        switch (option) {
            case 1:
                System.out.println("haraagaga waa" + haraa + "$");
                break;
            case 2:
                kaarkaHadalka();
                break;
            case 3:
                bixiBill();
                break;
            case 4:
                uWareejiEVCplus();
                break;
            case 5:
                warbixinKooban();
                break;
            case 6:
                salaamBank();
                break;
            case 7:
                Maareynta();
                break;
            case 8:
                System.out.println("Bill payment not implemented yet.");
                break;
            default:
                System.out.println("fadlan doora numberka saxda ah");
        }
    }

    public static void kaarkaHadalka() {
        //menu kaarkaHadalka
        String[] options = {
                "1.ku shuba Airtime",
                "2.ugu dhub airtime",
                "3.MIFI Packages",
                "4.ku shuba internet",
                "5.ugu shub qof kle (MMT)"
        };
        for (String item : options) {
            System.out.println(item);
        }
        int op = input.nextInt();
        switch (op) {
            case 1://ku shuba Airtime
                System.out.println("fadlan geli lacagta");
                money = input.nextDouble();
                System.out.println("ma hubtaa inaa $" + money + "ugu shubtid? ");
                System.out.println("1. Haa");
                System.out.println("2. Maya");
                opp = input.nextInt();
                if (opp == 1) {
                    if (money > haraa)
                        System.out.println("xisaabtaada kugu ma filna");
                    else {
                        System.out.println("EVC PLUS");
                        System.out.println("waxaad ku shubatay $$" + money + " \nTar:" + currenDateAndTime + ",\nharaagaagu waa " + ((haraa - money)) + "$");
                    }
                } else
                    System.out.println("mahadsanid");


                break;
            case 2: //ugu dhub airtime
                System.out.println("Fadlan geli numberka:");
                String number = input.next();
                System.out.println("Fadlan geli lacagta:");
                money = input.nextDouble();

                System.out.println("Ma hubtaa inaa $" + money + " ugu shubtid?");
                System.out.println("1. Haa");
                System.out.println("2. Maya");
                opp = input.nextInt();

                if (opp == 1) {
                    //  Hubinta numberka

                    if (!number.startsWith("061") || number.length() != 10 || !number.matches("\\d+")) {
                        System.out.println("Lambarka kaarka hadalka aad u direyso ma ahan mid sax ah, fadlan iska hubi.");
                        return;
                    }

                    //  hubinta lacagta
                    if (money > haraa) {
                        System.out.println("Xisaabtaada kugu ma filna.");
                        return;
                    }

                    // Haddii labadaas ay sax yihiin, lacagta u dir
                    haraa -= money;
                    System.out.println("[-EVC PLUS-]");
                    System.out.println("Waxaad ku shubatay $" + money +
                            "\nTar: " + currenDateAndTime +
                            "\nHaraagaagu waa $" + haraa);
                } else {
                    System.out.println("Mahadsanid.");
                }
                break;

            case 3://MIFI packages
                System.out.println("1. Ku shubo data-da MIFI");
                opp = input.nextInt();

                System.out.println("-- Internet Bundle Recharge --");
                System.out.println("1. Isbuucle (Weekly)");
                System.out.println("2. Bille (Mifi)");
                System.out.println("3. Maalinle (Daily)");
                opp = input.nextInt();

                int bundleChoice = 0;

                while (bundleChoice != 1 && bundleChoice != 2) {
                    System.out.println("Fadlan dooro bundle-ka:");
                    System.out.println("1. $5 = 10GB");
                    System.out.println("2. $10 = 25GB");
                    bundleChoice = input.nextInt();
                }

                if (bundleChoice == 1) {
                    money = 5;
                } else {
                    money = 10;
                }

                input.nextLine();

                boolean validUser = false;
                String mifiUser = "";
                String expectedUser = "miira123";

                while (!validUser) {
                    System.out.print("Fadlan Gali MIFI user: ");
                    mifiUser = input.nextLine();

                    if (!mifiUser.matches("[a-zA-Z0-9]+")) {
                        System.out.println("Invalid input format (dataType).");
                    } else if (!mifiUser.equals(expectedUser)) {
                        System.out.println("User-ka lama helin. Fadlan isku day mar kale.");
                    } else {
                        validUser = true;
                    }
                }

                if (validUser) {
                    if (haraa >= money) {
                        haraa -= money;
                        System.out.println("Waxaad ku shubatay $" + money + " \nTar: " + currenDateAndTime + ",\n haraagaagu waa $" + haraa);
                    } else {
                        System.out.println("Haraagaaga kuma filna inaad ku shubto $" + money);
                    }
                }
                break;


            case 4: //ku shuba internet
                System.out.println("fadl doora numberka ku shubeyso");
                System.out.println("1.Isbuucle(weekly");
                System.out.println("2.Bille (Mifi)");
                System.out.println("3.Maalinle (Daily)");
                System.out.println("4.TIME BASED PACKAGES");
                System.out.println("5.DATA");
                opp = input.nextInt();
                System.out.println("Fadlan Gali Numberka");
                phone = input.nextInt();
                System.out.println("fadlan gali lacgta");
                money = input.nextDouble();
                System.out.println("ma hubtaa inaad $" + money + "ugu shubtid" + phone + "?");
                System.out.println("1. haa");
                System.out.println("2. maya");
                opp = input.nextInt();
                if (opp == 1) {
                    if (phone >= 610000000 && phone <= 619999999) {
                        if (money > haraa)
                            System.out.println("xisaabtaada kugu ma filna");
                        else {
                            System.out.println("EVC PLUS \n waxaad ugu shubty $" + money + "\n lambarka "
                                    + phone + "Tar:" + "\n Haraagaaga waa $" + ((haraa - money)));
                        }

                    } else
                        System.out.println("lambarka aad galisi ma ahan mid jiro");


                    break;
                }


            case 5: //ugu shub qof kle (MMT)
                System.out.println("fadlan geli numberka");
                phone = input.nextInt();
                System.out.println("fadlan geli lacagta");
                money = input.nextInt();
                System.out.println("ma hubtaa inaad $" + money + "ugu shubtid " + phone + "?");
                System.out.println("1. Haa");
                System.out.println("2. Maya");
                opp = input.nextInt();
                if (opp == 1) {

                    if (money > haraa)
                        System.out.println("xisaabtaada kugu ma filna");
                    else {
                        System.out.println("EVC PLUS \n waxaad ugu shubty $" + money + "\n lambarka "
                                + phone + "Tar:" + currenDateAndTime + "\n Haraagaaga waa $" + ((haraa - money)));
                    }

                } else
                    System.out.println("mahadsanid");
                break;
            default:
                System.out.println("fadlan doora numberka saxda ah");

        }
    }

    public static void xaqiijin(String action, double amount) { //hubinta lacgta
        System.out.println("ma hubtaa inaad $" + amount + " " + action + "?");
        System.out.println("1. Haa\n2. Maya");
        int conf = input.nextInt();
        if (conf == 1) {
            if (amount > haraa)
                System.out.println("xisaabtaada kugu ma filna");
            else {
                haraa -= amount;
                System.out.println("EVC PLUS");
                System.out.println("waxaad " + action + " $" + amount + "\n Tar: " + currenDateAndTime + ",\n haraagaagu waa $" + haraa);
            }
        } else {
            System.out.println("mahadsanid");
        }
    }

    public static void mifiPackage() {
        String[] bundles = {"$5 = 10GB", "$10 = 25GB"};
        System.out.println("Fadlan dooro bundle-ka:");
        for (int i = 0; i < bundles.length; i++) {
            System.out.println((i + 1) + ". " + bundles[i]);
        }
        int choice = input.nextInt();
        money = (choice == 1) ? 5 : (choice == 2) ? 10 : 0;
        if (money == 0) {
            System.out.println("Doorasho khaldan.");
            return;
        }
        input.nextLine();
        System.out.print("Fadlan Gali MIFI user: ");
        String mifiUser = input.nextLine();
        if (!mifiUser.matches("[a-zA-Z0-9]+")) {
            System.out.println("Invalid input format (dataType).");
        } else if (!mifiUser.equals("miira123")) {
            System.out.println("User-ka lama helin. Fadlan isku day mar kale.");
        } else {
            if (haraa >= money) {
                haraa -= money;
                System.out.println("Waxaad ku shubatay $" + money + "\n Tar: " + currenDateAndTime + ",\n haraagaagu waa $" + haraa);
            } else {
                System.out.println("Haraagaaga kuma filna inaad ku shubto $" + money);
            }
        }
    }

    public static void bixiBill() {  //option 3 bixi bill
        System.out.println("Bixi Biil");
        System.out.println("1.Post pad");
        System.out.println("2.ku Iibso");
        opp = input.nextInt();
        if (opp == 1) {
            System.out.println("Post paid");
            System.out.println("1.ogow Biilka");
            System.out.println("2.Bixi Bill");
            System.out.println("3.Ka Bixi Bill");
            opp = input.nextInt();
            switch (opp) {

                case 1:
                    System.out.println("error ocurred ,please try agin");
                    break;

                case 2: // ku Iibso
                    System.out.println("fadlan geli lacagta");
                    money = input.nextInt();
                    System.out.println("Ma Hubtaa inaad bixisid bill lacagtiisu tahay:$" + money + "?");
                    System.out.println("1. Haa");
                    System.out.println("2. Maya");
                    opp = input.nextInt();
                    if (opp == 1) {
                        if (money > haraa)
                            System.out.println("haraaga xisaabtaada kugu ma filana");
                        else
                            System.out.println("waxaad bixisay bill \nlacagtiissu tahay $" + money + "\nTar:" + currenDateAndTime + "\nharaagaagu waa" + ((haraa - money)));
                    } else
                        System.out.println("mahadsanid");
                    break;
                // ka bixi biil

                case 3:
                    System.out.println("fadlan geli numberka");
                    phone = input.nextInt();
                    System.out.println("fadlan geli lacagta");
                    money = input.nextInt();
                    System.out.println("Ma Hubtaa inaad bixisid bill \n lacagtiisu tahay $" + money + "oo laga rabo tel No" + phone + " ");
                    System.out.println("1.Haa");
                    System.out.println("1.Maya");
                    opp = input.nextInt();
                    if (opp == 1) {
                        if (money > haraa)
                            System.out.println("haraaga xisaabtaada kugu ma filana");
                        else
                            System.out.println("waxaad bixisay bill lacagtiisu tahay $" + money + "oo laga rabay tel No" + phone + "\nTar:" + currenDateAndTime + "\n haraagaagu waa" + ((haraa - money)));
                    } else
                        System.out.println("mahadsanid!");
                    break;
                default:
                    System.out.println("fadlan doora numberka sax ah");

            }

        } else if (opp == 2) {
            System.out.println("Fadlan geli aqoonsiga ganacsigaada");
            int id = input.nextInt();
            String[] businesses = {"Telesom", "Somtel", "Zaad"};
            if (id >= 101 && id <= 103) {
                System.out.println("Fadlan geli lacagta:");
                double amount = input.nextDouble();
                //confirmTransaction("u dirtay " + businesses[id - 101], amount);

                System.out.println("Haraagaagu kuguma filna.");
            } else {
                System.out.println("Ganacsi ID-gaas lama aqoonsan.");
            }
        }
    }
// option 4 uWareejiEVCplus


    public static void uWareejiEVCplus() {
        System.out.println("Fadlan geli numberka:");
        String number = input.next(); // bedel int -> String si aan u hubin karno bilaawga iyo dhererka

        // Hubinta numberka 061 ino ka bilawdo
        if (!number.startsWith("061") || number.length() != 10) {
            System.out.println("Numberkan ma diiwaansana, si aad isku diiwan geliso garaac\n" +
                    " " + "*770# ama la xiriir" + "141/101" + "ama whatsapp" + "+252615000000");
            return;
        }

        System.out.println("Fadlan geli lacagta:");
        money = input.nextDouble();


        System.out.println("Ma Hubtaa inaad $" + money + " u wareejisay " + number + "?");
        System.out.println("1. Haa");
        System.out.println("2. Maya");
        opp = input.nextInt();

        if (opp == 1) {
            if (money > haraa) {
                System.out.println("Haraaga xisaabtaada kuguma filna.");
            } else {
                haraa -= money;
                System.out.println("[-EVC PLUS-] $" + money + " ayaad u wareejisay " + number +
                        "\nTar: " + currenDateAndTime +
                        "\nHaraagaagu waa $" + haraa);
            }
        } else {
            System.out.println("Mahadsanid!");
        }
    }

    // option 5 warbixin kooban
    public static void warbixinKooban() {
        System.out.println("1:Last Action");
        System.out.println("2:Wareejint udambeysay");
        System.out.println("3:Iibsashadii udambeysay");
        System.out.println("4:Last 3-Action");
        opp = input.nextInt();
        if (opp == 1) //Last Action

            System.out.println("$1 Ayaad u wareejisay 252618260535, Taariikh: 26/10/24 14:06:52");

        else if (opp == 2) { // Wareejintii u dambeysay
            System.out.println("Wareejintii u dambeysay");
            System.out.println("1. U dirtay");
            System.out.println("2. Ka heshay");
            opp = input.nextInt();

            switch (opp) {
                case 1:
                    System.out.println("Fadlan geli numberka:");
                    String number1 = input.next();
                    if (!number1.startsWith("061") || number1.length() != 10 || !number1.matches("\\d+")) {
                        System.out.println("Lambarka aad gelisay ma ahan mid jira.");
                        return;
                    }
                    System.out.println("Operation succeeded\nNo Transactions to display!");
                    break;

                case 2:
                    System.out.println("Fadlan geli numberka:");
                    String number2 = input.next();
                    if (!number2.startsWith("061") || number2.length() != 10 || !number2.matches("\\d+")) {
                        System.out.println("Lambarka aad gelisay ma ahan mid jira.");
                        return;
                    }
                    System.out.println("Operation succeeded\nNo Transactions to display!");
                    break;
            }

        } else if (opp == 3) {//Iibsashadii udambeysay
            System.out.println("fadlan geli aqoosiga ganacsigaada");
            int businessId = input.nextInt();

            System.out.println("operation succeeded\n" +
                    "No Transactions to display!");

        } else if (opp == 4) { //Last 3-Action
            System.out.println("Your mini statement has been sent as SMS to your registered mobile no");

        }
    }

    //option 6 salaambank
    public static void salaamBank() {
        System.out.println("Salaam Bank");
        System.out.println("1.Itus Haraagaaga");
        System.out.println("2.Lacag dhigasho");
        System.out.println("3.Lacag qaadasho");
        System.out.println("4.Ka Wareeji EVCPLUS");
        System.out.println("5.Ka Wareeji Account-kaga");
        System.out.println("6.Hubi wareejin account");
        System.out.println("7.Maareynta bankiga");
        System.out.println("8.Kala Bax");
        opp = input.nextInt();
        switch (opp) {
            case 1: //Itus Haraagaaga
                System.out.println("Fadlan pinkaaga pinkaaga account-bangiga");
                int pass = input.nextInt();
                if (pass == 333333) {

                    System.out.println("Haraaga account no:" + account_no + "waa $" + haraga_account);

                } else
                    System.out.println("pinka waa qalad");
                break;

            case 2: //Lacg dhigasho
                System.out.println("fadlan geli lacagta");
                money = input.nextDouble();
                System.out.println("Fadlan geli numberkaaga sirta ee bangiga");
                pass = input.nextInt();
                if (pass == 333333) {
                    System.out.println("Ma hubtaa inaad $" + money + "dhigitid Account-kaaga bangiga?");
                    System.out.println("1.Haa");
                    System.out.println("2.Maya");
                    opp = input.nextInt();
                    if (opp == 1)
                        System.out.println("waxaad account-kaga No:" + account_no + "dhigaty" + money + "\nHaraagaga waa" + ((haraga_account + money)));
                    else
                        System.out.println("mahadsanid");

                } else
                    System.out.println("numberka sirta waa qalad");
                break;
            case 3: //Lacg qaadasho
                System.out.println("fadlan geli lacagta");
                money = input.nextDouble();
                System.out.println("Fadlan geli numberkaaga sirta ee bangiga");
                pass = input.nextInt();
                if (pass == 999999) {
                    System.out.println("Ma hubtaaa inaad $" + money + "ka qaadatid Account-kaaga Bangiga?");
                    System.out.println("1. haa");
                    System.out.println("2. maya");
                    opp = input.nextInt();
                    if (opp == 1)
                        System.out.println("Waxaad account-kaga No:" + account_no + "\n ka qaadaty $" + money + "Haraagaaga waa\n" + ((haraga_account - money)));
                    else
                        System.out.println("mahadsanid");
                } else
                    System.out.println("numberka sirta waa qalad");
                break;




            case 4:
                System.out.println("Fadlan dooro xisaabta Bangiga");
                System.out.println("1.Darasalaam Bank");
                System.out.println("2.Bank Beeraha");
                System.out.println("3.SALAAM SOMALI BANK");
                System.out.println("4.Salaam Sch");
                opp = input.nextInt();
                break;
            case 5:
                System.out.println("Fadlan geli account ama mobile");
                opp = input.nextInt();
                break;
            case 6:
                System.out.println("fadlan gali OTP");
                password = input.nextInt();
                System.out.println("Fadlan Gali Account ama Mobile");
                String number = input.next();
                System.out.println("Ma hubtaa in aad aqbasho lacg dirian?");
                System.out.println("Haa");
                System.out.println("Maya");

                opp = input.nextInt();

                break;

            case 7:
                System.out.println("1.Bedal lambarka sirta bankiga");
                System.out.println("1.bedal luqadda");
                System.out.println("2.lacag xirasho");
                System.out.println("3.u celi lacag soo qaldanty");
                opp = input.nextInt();

                if (opp == 1) { // Bedal lambarka sirta ah
                    System.out.println("Fadlan geli pinkaaga cusub");
                    password = input.nextInt();
                    System.out.println("Hubi pinkaaga cusub");
                    int passwer = input.nextInt();
                    while (password != passwer) {
                        System.out.println("INPUT MISMATCH \n Hubi PIN-Kaaga cusub");
                        passwer = input.nextInt();
                    }
                    System.out.println("waxaad ku guuleysaty inaad badasho PIN-kaaga");
                } else if (opp == 2) { // bedal luqadda
                    System.out.println("Fadlan dooro luqada");
                    System.out.println("1.English");
                    System.out.println("2.Somali");
                    opp = input.nextInt();
                    if (opp == 1)
                        System.out.println("[-EVCPLUS-] you have successfully changed your language");
                    else if (opp == 2)
                        System.out.println("[-EVCPLUS-] waad ku guulaysatay in aad badasho luqadda");
                    else
                        System.out.println("fadlan dooro luuqada option");
                } else if (opp == 3) { // lacag soo qaldanty
                    System.out.println("Fadlan geli aqoonsiga lacag diridda");
                    phone = input.nextInt();


                    while (String.valueOf(phone).length() != 9) {
                        System.out.println("invalid input format(length)\n fad geli aqoosiga");
                        phone = input.nextInt();
                    }

                    System.out.println("Fadlan geli macluumaad");
                    opp = input.nextInt();
                    System.out.println("Ma hubtaa in aad celiso lacagta ?");
                    System.out.println("1.Haa");
                    System.out.println("2.Maya");
                    opp = input.nextInt();
                    if (opp == 1)
                        System.out.println("Waxaad ku guuleysty inaad celiso lacagtan");
                    else
                        System.out.println("Mahsanid");
                } else {
                    System.out.println("Mahsanid");
                }
        }
    }
    // OPTION 7 MAARYNTA

    public static void Maareynta() {
        System.out.println("Maareynta");
        System.out.println("1.Bedal lambarka sirta ah");
        System.out.println("2.bedal luqadda");
        System.out.println("3.wargelin mobile lumay");
        System.out.println("4.lacag xirasho");
        System.out.println("5.u celi lacag soo qaldanty");
        opp = input.nextInt();
        if (opp == 1) {//Bedal lambarka sirta ah

            System.out.println("Fadlan geli pinkaaga cusub");
            password = input.nextInt();
            System.out.println("Hubi pinkaaga cusub");
            int pass = input.nextInt();
            while (password != pass) {
                System.out.println("INPUT MISMATCH \n Hubi PIN-Kaaga cusub");
                pass = input.nextInt();
            }

            System.out.println("waxaad ku guuleysaty inaad badasho PIN-kaaga");

        }
        if (opp == 2) { //bedal luqadda
            System.out.println("Fadlan dooro luqada");
            System.out.println("1.English");
            System.out.println("2.Somali");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("[-EVCPLUS-] you have successfully changed your language");

            if (opp == 2)
                System.out.println("[-EVCPLUS-] waad ku guulaysatay in aad badasho luqadda");

        } else if (opp == 3) { //wargelin mobile lumay
            System.out.println("Fadlan geli mobileka lumay");
            phone = input.nextInt();
            System.out.println("fadlan geli  sirta numberka");
            int pas = input.nextInt();
            System.out.println("Ma hubtaa in aad u diiwaan geliso lumid number-kan" + phone + "?");
            System.out.println("1.Haa");
            System.out.println("2.Maya");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("Waxaad ku guuleysatay\n inaad diwaan geliso"
                        + phone + currenDateAndTime);
            else
                System.out.println("Mahadsanid");


        } else if (opp == 4) { //lacag xirasho
            System.out.println("Fadlan geli numberka lagu Qalday");
            phone = input.nextInt();
            System.out.println("Fadlan geli numberka loo rabay");
            phone = input.nextInt();
            System.out.println("Fadlan geli macluumaad");
            opp = input.nextInt();
            System.out.println("Ma hubtaa in aad xirto lacagtan?");
            System.out.println("1.Haa");
            System.out.println("2.Maya");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("Waxaad ku guuleysty inaad xirto lacagtan");
            else
                System.out.println("Mahsanid");

        } else if (opp == 5) { // lacag soo qaldanty
            System.out.println("Fadlan geli aqoonsiga lacag diridda");
            phone = input.nextInt();
            //for (int i=610000000;i<=619999999;i++)
            while (phone != phone) {
                System.out.println("invalid input format(length)\n fad geli aqoosiga");
                phone = input.nextInt();
            }

            System.out.println("Fadlan geli macluumaad");
            opp = input.nextInt();
            System.out.println("Ma hubtaa in aad celiso lacagta ?");
            System.out.println("1.Haa");
            System.out.println("2.Maya");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("Waxaad ku guuleysty inaad celiso lacagtan");
            else
                System.out.println("Mahsanid");

        }



    }
}

