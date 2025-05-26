package com.api_spec_labor.api_spec_labor.UjiProfisiensi.model;

import java.time.LocalDate;

public class VerifikasiUjiProfisiensi {
    private Long id;
    private String namaPenerima;
    private LocalDate tanggalPenerimaan;
    private StatusVerifikasi status;
    private String keterangan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaPenerima() {
        return namaPenerima;
    }

    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    public LocalDate getTanggalPenerimaan() {
        return tanggalPenerimaan;
    }

    public void setTanggalPenerimaan(LocalDate tanggalPenerimaan) {
        this.tanggalPenerimaan = tanggalPenerimaan;
    }

    public StatusVerifikasi getStatus() {
        return status;
    }

    public void setStatus(StatusVerifikasi status) {
        this.status = status;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
