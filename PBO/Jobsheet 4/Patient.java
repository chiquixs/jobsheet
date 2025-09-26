import java.util.ArrayList;
import java.time.LocalDate;

public class Patient{
    private String noRekamMedis;
    private String nama;
    private ArrayList<Consultation> riwayatConsultations;
    
    public Patient(String noRekamMedis, String nama){
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatConsultations = new ArrayList<Consultation>();
    }

    public String getNoRekamMedis(){
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis){
        this.noRekamMedis = noRekamMedis;  
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getInfo(){
        String info = " ";
        info += "No Rekam Medis     : " + this.noRekamMedis + "\n";
        info += "Nama               : " + this.nama + "\n";
        info += "\n";

        if (!riwayatConsultations.isEmpty()) {
            info += "Riwayat Konsultasi : \n";

            for(Consultation consultation : riwayatConsultations){
                info += consultation.getInfo();
            }

        } else {
            info += "\n";
        }
        
        return info;
    }

    public void tambahKonsultasi(LocalDate tanggal, Employee dokter, Employee perawat){
        Consultation consultation = new Consultation();
        consultation.setTanggal(tanggal);
        consultation.setDokter(dokter);
        consultation.setPerawat(perawat);
        riwayatConsultations.add(consultation);
    }
}