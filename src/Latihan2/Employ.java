
package Latihan2;

public class Employ extends Person{
    private String noKaryawan;
    public Employ(String noKaryawan, String nama, int usia) {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    public void info(){
        System.out.println("No. karyawan : "+this.noKaryawan);
        super.info();
    }
}
