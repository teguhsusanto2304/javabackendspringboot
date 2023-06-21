package com.teguh.penggajian.model;

import java.util.List;

public  class Response {

    private String status = "success";

    private Pegawai employee;

    private List<Gaji> komponengaji;


    public Response(Pegawai emp,List<Gaji> gaji) {
        this.setEmployee(emp);
        this.setKomponengaji(gaji);
    }

    // Constructor, getters and setters omitted

    public List<Gaji> getKomponengaji() {
        return komponengaji;
    }

    public void setKomponengaji(List<Gaji> komponengaji) {
        this.komponengaji = komponengaji;
    }



    public Pegawai getEmployee() {
        return employee;
    }

    public void setEmployee(Pegawai employee) {
        this.employee = employee;
    }
}
