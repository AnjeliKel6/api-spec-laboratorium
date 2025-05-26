package com.api_spec_labor.api_spec_labor.UjiProfisiensi.model;

import java.time.LocalDate;
import java.util.List;

public class UjiProfisiensi {
    private Long id;
    private String kodeLab;
    private String metodeUji;
    private LocalDate tanggalUji;
    private String namaPenyelenggara;
    private List<ParameterUji> parameterUjiList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodeLab() {
        return kodeLab;
    }

    public void setKodeLab(String kodeLab) {
        this.kodeLab = kodeLab;
    }

    public String getMetodeUji() {
        return metodeUji;
    }

    public void setMetodeUji(String metodeUji) {
        this.metodeUji = metodeUji;
    }

    public LocalDate getTanggalUji() {
        return tanggalUji;
    }

    public void setTanggalUji(LocalDate tanggalUji) {
        this.tanggalUji = tanggalUji;
    }

    public String getNamaPenyelenggara() {
        return namaPenyelenggara;
    }

    public void setNamaPenyelenggara(String namaPenyelenggara) {
        this.namaPenyelenggara = namaPenyelenggara;
    }

    public List<ParameterUji> getParameterUjiList() {
        return parameterUjiList;
    }

    public void setParameterUjiList(List<ParameterUji> parameterUjiList) {
        this.parameterUjiList = parameterUjiList;
    }
}
