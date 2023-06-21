package com.teguh.penggajian.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FormulaPajak {
    public int statusPernikahanPTKP(StatusPernikahan status_pernikahan){
        int result = 0;
        if(status_pernikahan.equals(StatusPernikahan.Lajang)){
            result = 25000000;
        } else if(status_pernikahan.equals(StatusPernikahan.NikahNonAnak)){
            result = 50000000;
        }else if(status_pernikahan.equals(StatusPernikahan.NikahPlusAnak)){
            result = 75000000;
        }
        return result;
    }
    public BigDecimal getPPH(Pegawai pegawai,BigDecimal basic_salary,BigDecimal transport,BigDecimal meal,BigDecimal insurance){
        BigDecimal ptkp = new BigDecimal(this.statusPernikahanPTKP(pegawai.getMarital_status()));
        BigDecimal netto = basic_salary.add(transport.add(meal)).subtract(insurance).multiply(BigDecimal.valueOf(12)).subtract(ptkp);
        BigDecimal layer1= BigDecimal.valueOf(50000000).multiply(BigDecimal.valueOf(0.05));
        BigDecimal layer2 = netto.subtract(BigDecimal.valueOf(50000000)).multiply(BigDecimal.valueOf(0.10));
         BigDecimal result = layer1.add(layer2).divide(BigDecimal.valueOf(12), 0, RoundingMode.HALF_EVEN);

        return result;
    }

}
