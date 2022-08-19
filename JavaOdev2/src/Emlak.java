public class Emlak extends İlan
{
    int odasayi;
    int kat;
    int alan;

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


}
