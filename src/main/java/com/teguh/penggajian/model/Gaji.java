package com.teguh.penggajian.model;

import java.math.BigDecimal;

import static java.lang.constant.ConstantDescs.NULL;

public class Gaji {
    private NamaGaji name;
    private TypeGaji type;
    private BigDecimal amount;

    public Gaji(NamaGaji name, TypeGaji type, BigDecimal amount) {
        super();
        this.setName(name);
        this.setType(type);
        this.setAmount(amount);
    }







    public NamaGaji getName() {
        return name;
    }

    public void setName(NamaGaji name) {
        this.name = name;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TypeGaji getType() {
        return type;
    }

    public void setType(TypeGaji type) {
        this.type = type;
    }

}
