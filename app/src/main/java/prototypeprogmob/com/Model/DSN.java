package prototypeprogmob.com.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DSN {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nidn")
    @Expose
    private String nidn;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("alamat")
    @Expose
    private String alamat;
    @SerializedName("gelar")
    @Expose
    private String gelar;
    private int foto;
//    private int ImgDsn;

    public DSN(String nidn, String nama, String email, String alamat) {
//        , int ImgDsn
        this.nidn = nidn;
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.gelar = gelar;
        this.foto = foto;
//        this.ImgDsn = ImgDsn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNidn() {

        return nidn;
    }

    public void setNidn(String nidn) {

        this.nidn = nidn;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getAlamat() {

        return alamat;
    }

    public void setAlamat(String alamat) {

        this.alamat = alamat;
    }

    public void GetGelar(String gelar) {
        this.gelar = gelar;
    }

    public int GetFoto(int foto) {
        this.foto = foto;
    }

   /* public int getImgDsn(){
        return ImgDsn;
    }
    public void setImgDsn(int imageResource){
        this.ImgDsn = ImgDsn;
    }*/
}

