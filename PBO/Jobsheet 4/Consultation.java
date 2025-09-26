import java.time.LocalDate;
import java.util.ArrayList;

public class Consultation{
    private LocalDate tanggal;
    private Employee dokter;
    private Employee perawat;

    public LocalDate getTanggal(){
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal){
        this.tanggal = tanggal;
    }

    public Employee getDokter(){
        return dokter;
    }

    public void setDokter(Employee dokter){
        this.dokter = dokter;
    }

    public Employee getPerawat(){
        return perawat;
    }

    public void setPerawat(Employee perawat){
        this.perawat = perawat;
    }

    public String getInfo(){
        String info = " ";
        info += "\tTanggal : " + tanggal;
        info += ", Dokter : " + dokter.getInfo();
        info += ", Perawat : " + perawat.getInfo();
        info += "\n";

        return info;
    }


}