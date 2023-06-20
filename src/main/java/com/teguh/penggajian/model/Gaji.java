package com.teguh.penggajian.model;

import static java.lang.constant.ConstantDescs.NULL;

public class Gaji {
    private NamaGaji nama_gaji;
    private TypeGaji type_gaji;
    private Long amount;

    public Gaji(Pegawai peg,NamaGaji nama_gaji, TypeGaji type_gaji, Long amount) {
        super();
        this.setNama_gaji(nama_gaji);
        this.setType_gaji(type_gaji);
        this.setAmount(peg,amount);
        this.setPajak(peg);
    }



    public void setPajak(Pegawai peg) {
        Double tax_prosen = 0.0;
        if(peg.getNegara().equals(Negara.Indonesia)) {
            if (peg.getStatus_nikah().equals(StatusPernikahan.Nikah)) {
                if (peg.getAnak() > 0) {
                    tax_prosen = 75.0;
                } else {
                    tax_prosen = 50.0;
                }
            } else {
                tax_prosen = 25.0;
            }
        } else if(peg.getNegara().equals(Negara.Vietnam)){
            tax_prosen = 50.0;
        }
        //this.pajak = getGaji() * (tax_prosen/100);
    }



    public NamaGaji getNama_gaji() {
        return nama_gaji;
    }

    public void setNama_gaji(NamaGaji nama_gaji) {
        this.nama_gaji = nama_gaji;
    }


    public Long getAmount() {
        return amount;
    }

    public void setAmount(Pegawai peg,Long amount) {
        Long total = 0L;
        if(type_gaji.equals(TypeGaji.Earning)) {
            Long tax_total = peg.getPendapatan() + amount;
            peg.setPendapatan(tax_total);
        } else {
            if (nama_gaji.equals(NamaGaji.BPJS_Ksehatan)) {
                Long asuransi_total = (peg.getAsuransi()  + amount);
                peg.setAsuransi(asuransi_total);
            }
        }
        if (nama_gaji.equals(NamaGaji.Pajak)){
            if(peg.getNegara().equals(Negara.Indonesia)) {
                if (peg.getStatus_nikah().equals(StatusPernikahan.Lajang)) {
                    total = (long) (((peg.getPendapatan()*12) - (peg.getAsuransi()*12)) - 25000000L);
                } else {
                    if(peg.getAnak()>0){
                        total = (long) (((peg.getPendapatan()*12) - (peg.getAsuransi()*12)) -75000000);
                    } else {
                        total = (long) (((peg.getPendapatan()*12) - (peg.getAsuransi()*12)) - 50000000);
                    }
                }

                this.amount = (25000000+(2500000 +(total-50000000)))/12;

            } else {
                total = peg.getPendapatan();
            }
        } else {
            total = amount;
            this.amount = total;

        }
    }

    public TypeGaji getType_gaji() {
        return type_gaji;
    }

    public void setType_gaji(TypeGaji type_gaji) {
        this.type_gaji = type_gaji;
    }

}
