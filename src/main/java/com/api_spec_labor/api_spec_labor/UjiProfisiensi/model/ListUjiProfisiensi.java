package com.api_spec_labor.api_spec_labor.UjiProfisiensi.model;

import java.security.PrivateKey;
import java.time.LocalDate;

public class ListUjiProfisiensi {
    private Long id;
    private String kodeLab;
    private LocalDate tanggalUji;
    private StatusKonfirmasi status;

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

    public LocalDate getTanggalUji() {
        return tanggalUji;
    }

    public void setTanggalUji(LocalDate tanggalUji) {
        this.tanggalUji = tanggalUji;
    }

    public StatusKonfirmasi getStatus() {
        return status;
    }

    public void setStatus(StatusKonfirmasi status) {
        this.status = status;
    }
}
