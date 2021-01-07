package kelas;

public class Kelas {
    
    public double kecepatan,massa,kinetik;

    public double getKecepatan() {
        return 0;
    }

    public void setKecepatan(double v) {
        this.kecepatan = v;
    }

    public double getMassa() {
        return 0;
    }

    public void setMassa(double m) {
        this.massa = m;
    }

    public double getKinetik()
    {
        return Kinetik(kecepatan , massa);
    }

    public double Kinetik(double m, double v) {
       return Math.sqrt(v) * m * 1 / 2;
    }  
}
