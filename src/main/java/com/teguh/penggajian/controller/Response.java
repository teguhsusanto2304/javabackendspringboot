package com.teguh.penggajian.controller;

import com.teguh.penggajian.model.*;

import java.util.ArrayList;
import java.util.List;

public class Response {

    private String status = "success";

    private Pegawai employee;

    private Gaji componentgaji;

    private int statusCode = 200;

    // Constructor, getters and setters omitted

    public List<Gaji> getComponentgaji() {
        Pegawai pegawai = new Pegawai(1,"Teguh Susanto", Gender.Lelaki, StatusPernikahan.Nikah,1, Negara.Indonesia);

        List<Gaji> gaji = new ArrayList<>();
        gaji.add(new Gaji(pegawai,NamaGaji.Gaji_Pokok,TypeGaji.Earning, 20000000L));
        gaji.add(new Gaji(pegawai,NamaGaji.Tunjangan_Transport,TypeGaji.Earning,5000000L));
        gaji.add(new Gaji(pegawai,NamaGaji.Tunjangan_Uang_Makan,TypeGaji.Earning,5000000L));
        gaji.add(new Gaji(pegawai,NamaGaji.Pajak,TypeGaji.Deduction,0L));
        gaji.add(new Gaji(pegawai,NamaGaji.BPJS_Ksehatan,TypeGaji.Deduction,500000L));
        pegawai.setKomponen_gaji(gaji);

        return gaji;
    }

    public void setComponentgaji(Gaji componentgaji) {
        this.componentgaji = componentgaji;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pegawai getEmployee() {
        Pegawai employee = new Pegawai(1,"Teguh Susanto", Gender.Lelaki, StatusPernikahan.Nikah,1, Negara.Indonesia);
        return employee;
    }

    public void setEmployee(Pegawai employee) {
        this.employee = employee;
    }
}
