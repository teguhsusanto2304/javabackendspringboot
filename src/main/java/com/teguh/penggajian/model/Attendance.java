package com.teguh.penggajian.model;

import java.time.ZonedDateTime;

public class Attendance {
    private ZonedDateTime waktu;
    private AttendanceStatus att_status;

    public Attendance(PegawaiAtt peg,ZonedDateTime waktu) {
        super();
        this.setWaktu(waktu);
        this.setAtt_status(peg,AttendanceStatus.Tidak_Valid);

    }



    public AttendanceStatus getAtt_status() {
        return att_status;
    }

    public ZonedDateTime getWaktu() {
        return waktu;
    }

    public void setAtt_status(PegawaiAtt peg,AttendanceStatus att_status) {
        if(peg.getShift().equals(WaktuShift.PAGI)){
            if (this.waktu.getHour() > 5 && this.waktu.getHour() < 7) {
                this.att_status = AttendanceStatus.Masuk_Normal;
            } else if (this.waktu.getHour() == 7 && this.waktu.getMinute() < 30) {
                this.att_status = AttendanceStatus.Masuk_Normal;
            } else if ((this.waktu.getHour() == 7 || this.waktu.getHour() < 8) && this.waktu.getMinute() > 30) {
                this.att_status = AttendanceStatus.Masuk_Normal;
            } else if (this.waktu.getHour() > 7 && this.waktu.getHour() < 15) {
                this.att_status = AttendanceStatus.Masuk_Terlambat;
            } else if (this.waktu.getHour() < 17) {
                this.att_status = AttendanceStatus.Keluar_Cepat;
            } else if (this.waktu.getHour() == 17 && this.waktu.getMinute() < 30) {
                this.att_status = AttendanceStatus.Keluar_Normal;
            } else if ((this.waktu.getHour() == 17 && this.waktu.getMinute() > 30) || this.waktu.getHour() > 17) {
                this.att_status = AttendanceStatus.Keluar_Normal;
            } else {
                this.att_status = AttendanceStatus.Keluar_Cepat;
            }
        } else if(peg.getShift().equals(WaktuShift.MALAM)){
            if (this.waktu.getHour() > 3 && this.waktu.getHour() < 8) {
                this.att_status = AttendanceStatus.Keluar_Cepat;
            } else if (this.waktu.getHour() > 7 && this.waktu.getHour() < 17) {
                this.att_status = AttendanceStatus.Keluar_Normal;
            } else if (this.waktu.getHour() > 16  && this.waktu.getHour() < 17) {
                this.att_status = AttendanceStatus.Masuk_Normal;
            } else if (this.waktu.getHour() > 17 && this.waktu.getHour() < 20) {
                this.att_status = AttendanceStatus.Masuk_Terlambat;
            } else {
                this.att_status = AttendanceStatus.Keluar_Cepat;
            }
        }

    }

    public void setWaktu(ZonedDateTime waktu) {
        this.waktu = waktu;
    }
}
