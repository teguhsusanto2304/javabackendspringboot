package com.teguh.penggajian.model;

import java.util.List;

public class PegawaiAtt {
    private int id;
    private String nama;
    private WaktuShift shift;
    private List<Attendance> att;



    public PegawaiAtt(int id, String nama,WaktuShift shift) {
        this.setId(id);
        this.setNama(nama);
        this.setShift(shift);
    }

    public void setShift(WaktuShift shift) {
        this.shift = shift;
    }

    public WaktuShift getShift() {
        return shift;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public List<Attendance> getAtt() {
        return att;
    }

    public void setAtt(List<Attendance> att) {
        this.att = att;
    }
}
