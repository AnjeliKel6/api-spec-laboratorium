package com.api_spec_labor.api_spec_labor.UjiProfisiensi.model;

public class ParameterUjiProfisiensi {
    private Long id;
    private String parameterUji;
    private String satuan;
    private Double pengulangan1;
    private Double pengulangan2;
    private Double ketidakpastian;
    private String metode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParameterUji() {
        return parameterUji;
    }

    public void setParameterUji(String parameterUji) {
        this.parameterUji = parameterUji;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public Double getPengulangan1() {
        return pengulangan1;
    }

    public void setPengulangan1(Double pengulangan1) {
        this.pengulangan1 = pengulangan1;
    }

    public Double getPengulangan2() {
        return pengulangan2;
    }

    public void setPengulangan2(Double pengulangan2) {
        this.pengulangan2 = pengulangan2;
    }

    public Double getKetidakpastian() {
        return ketidakpastian;
    }

    public void setKetidakpastian(Double ketidakpastian) {
        this.ketidakpastian = ketidakpastian;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }
}
