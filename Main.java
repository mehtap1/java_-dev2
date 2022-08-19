import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Emlak ilanı girmek için 1'e, Vasita için 2'ye, exit için 0'a basınız:");
        int ilanTuru = input.nextInt();

        if (ilanTuru == 1)
        {
            System.out.println("Emlak ilanı için giriş yapabilirsiniz:");
            Scanner input1 = new Scanner(System.in);
            System.out.println(" İlan basliği : ");
            String baslik = input1.nextLine();
            System.out.println(" ilan aciklamasi:");
            String aciklama = input1.nextLine();
            System.out.println(" oda sayisi:");
            int odasayi = input1.nextInt();
            System.out.println(" Alan:");
            int alan = input1.nextInt();
            System.out.println(" Kat:");
            int kat = input1.nextInt();

            Emlak emlakilan = new Emlak();
            emlakilan.setBaslik(baslik);
            emlakilan.setAciklama(aciklama);
            emlakilan.setAlan(alan);
            emlakilan.setOda(odasayi);
            emlakilan.setKat(kat);

            System.out.println(" İlan basliği :  " + emlakilan.getBaslik());
            System.out.println(" ilan aciklamasi  : " + emlakilan.getAciklama());
            System.out.println(" ilan oda sayisi " + odasayi + " ");
            System.out.println(" ilan alani  " + emlakilan.getAlan() + " alan: ");
        }

        if (ilanTuru == 2)
        {
            System.out.println("Vasita ilanı için giriş yapabilirsiniz:");
            Scanner input2 = new Scanner(System.in);
            System.out.println(" İlan basliği : ");
            String baslik = input2.nextLine();
            System.out.println(" ilan aciklamasi:");
            String aciklama = input2.nextLine();
            System.out.println(" Vites tipi:");
            String vites = input2.nextLine();
            System.out.println(" Rengi:");
            String renk = input2.nextLine();
            System.out.println(" Kaza:");
            String kaza = input2.nextLine();
            System.out.println(" Sahibinden mi?:");
            String sahibindenMi = input2.nextLine();


            Vasita vasitailan = new Vasita();
            vasitailan.setBaslik(baslik);
            vasitailan.setAciklama(aciklama);
            vasitailan.setRenk(renk);
            vasitailan.setVites(vites);
            vasitailan.setKaza(kaza);
            vasitailan.setsahibindenMi(sahibindenMi);

            System.out.println(" İlan basliği :  " + vasitailan.getBaslik());
            System.out.println(" ilan aciklamasi  : " + vasitailan.getAciklama());
            System.out.println(" Aracın rengi  : " + vasitailan.getRenk());
            System.out.println("Aracın vites tipi  : " + vasitailan.getVites());
            System.out.println(" Arac kazalı mı? : " + vasitailan.getKaza());
            System.out.println(" Sahibinden mi?  : " + vasitailan.getsahibindenMi());

        }
        else if(ilanTuru==3) {
            System.out.println(" Çıkış yapılıyor");
            System.exit(0);
        }
        while((ilanTuru==1 || ilanTuru==2));
        System.out.println("İlan oluşturmaya başlayabilirsiniz");
        System.exit(0);
    }
}
