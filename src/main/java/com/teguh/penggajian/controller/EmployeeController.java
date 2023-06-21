package com.teguh.penggajian.controller;

import com.teguh.penggajian.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeController {


    @RestController


    public static class ProductController {

        @PostMapping("/hitungpajak")
        public ResponseEntity<Response> getPegawai() {
            /**Pegawai pegawai = new Pegawai(1,"Teguh Susanto",Gender.Lelaki,StatusPernikahan.Nikah,1,Negara.Indonesia);

            List<Gaji> gaji = new ArrayList<>();
            gaji.add(new Gaji(pegawai,NamaGaji.Gaji_Pokok,TypeGaji.Earning, 20000000L));
            gaji.add(new Gaji(pegawai,NamaGaji.Tunjangan_Transport,TypeGaji.Earning,5000000L));
            gaji.add(new Gaji(pegawai,NamaGaji.Tunjangan_Uang_Makan,TypeGaji.Earning,5000000L));
            gaji.add(new Gaji(pegawai,NamaGaji.Pajak,TypeGaji.Deduction,0L));
            gaji.add(new Gaji(pegawai,NamaGaji.BPJS_Ksehatan,TypeGaji.Deduction,500000L));
            pegawai.setKomponen_gaji(gaji); **/
            //return pegawai;
            return ResponseEntity.ok(new Response());
        }
        @GetMapping("/attendance")
        public List<PegawaiAtt> getAttendance() {
            List<PegawaiAtt> result = new ArrayList<>();
            PegawaiAtt pegawai = new PegawaiAtt(1,"Joko",WaktuShift.PAGI);
            List<Attendance> att = new ArrayList<>();
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-19 08:15:27.256")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-19 19:20:16.132")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-20 17:20:06.001")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-21 06:20:12.147")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-21 07:50:14.023")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-22 07:30:28.195")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-22 17:15:31.452")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-23 07:51:50.415")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-23 08:15:27.256")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-24 07:25:21.426")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-24 17:15:27.632")));
            pegawai.setAtt(att);
            result.add(pegawai);
             pegawai = new PegawaiAtt(2,"Gunawan",WaktuShift.MALAM);
            att = new ArrayList<>();
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-19 08:15:27.256")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-19 19:20:16.132")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-20 17:20:06.001")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-21 06:20:12.147")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-21 07:50:14.023")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-22 07:30:28.195")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-22 17:15:31.452")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-23 07:51:50.415")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-23 08:15:27.256")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-24 07:25:21.426")));
            att.add(new Attendance(pegawai,this.convertStringToTimestamp("2023-06-24 17:15:27.632")));
            pegawai.setAtt(att);
            result.add(pegawai);
            return result;
        }
        public ZonedDateTime convertStringToTimestamp(String waktu){
            try
            {
                LocalDateTime datetimeWithoutZone = LocalDateTime.parse(waktu,
                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
                ZonedDateTime utcZdt = datetimeWithoutZone.atZone(ZoneId.of("UTC"));
                //ZonedDateTime asiaJakartaZdt = utcZdt.withZoneSameInstant(ZoneId.of("Asia/Jakarta"));

                return  utcZdt;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return null;
        }
    }
}
