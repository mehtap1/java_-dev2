public class Emlak
{
    int odasayi;
    int kat;
    int alan;
    String baslik;
    String aciklama;

    public int getAlan()
    {
        return alan;
    }

    public int setAlan(int alan)
    {
        return this.alan = alan;
    }

    public int getOda()
    {
        return odasayi;
    }

    public int setOda(int odasayisi)
    {
        return this.odasayi = odasayisi;
    }

    public int getKat()
    {
        return kat;
    }

    public int setKat(int katsayi)
    {
        return this.kat = katsayi;
    }

    public String getBaslik()
    {
        return baslik;
    }

    public String setBaslik(String baslik)
    {
        return this.baslik = baslik;
    }

    public String getAciklama()
    {
        return aciklama;
    }

    public String setAciklama(String aciklama)
    {
        return this.aciklama = aciklama;
    }

}
