package com.teguh.penggajian.model;

import java.util.List;

public class Pegawai {
    private int id;
    private String nama;
    private Gender gender;
    private StatusPernikahan status_nikah;
    private int anak;
    private Negara negara;
    private Long pendapatan=0L;
    private Long asuransi=0L;
    private List<Gaji> komponen_gaji;



    public Pegawai(int id,String nama,Gender gender,StatusPernikahan status_nikah,int anak,Negara negara) {
        this.setId(id);
        this.setNama(nama);
        this.setGender(gender);
        this.setStatus_nikah(status_nikah);
        this.setNegara(negara);
        this.setAnak(anak);
    }

    public StatusPernikahan getStatus_nikah() {
        return status_nikah;
    }

    public void setStatus_nikah(StatusPernikahan status_nikah) {
        this.status_nikah = status_nikah;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAnak(int anak) {
        this.anak = anak;
    }

    public int getAnak() {
        return anak;
    }

    public Negara getNegara() {
        return negara;
    }

    public void setNegara(Negara negara) {
        this.negara = negara;
    }

    public void setKomponen_gaji(List<Gaji> komponen_gaji) {
        this.komponen_gaji = komponen_gaji;
    }

    public Long getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(Long pendapatan) {
        this.pendapatan = pendapatan;
    }

    public Long getAsuransi() {
        return asuransi;
    }

    public void setAsuransi(Long asuransi) {
        this.asuransi = asuransi;
    }

    public List<Gaji> getKomponen_gaji() {
        return komponen_gaji;
    }
}
