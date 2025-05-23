package com.api_spec_labor.api_spec_labor.pengujian.model;

import java.time.LocalDate;

public class pelanggan {
    private Long id;

    // Informasi Pelanggan
    private String namaPelanggan;
    private String npwpAtauKtp;
    private LocalDate tanggalPenerimaanSampel;
    private String kontakPelanggan;
    private String alamatPelanggan;
    private String teknikSampling;
    private String satuanAcuan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNpwpAtauKtp() {
        return npwpAtauKtp;
    }

    public void setNpwpAtauKtp(String npwpAtauKtp) {
        this.npwpAtauKtp = npwpAtauKtp;
    }

    public LocalDate getTanggalPenerimaanSampel() {
        return tanggalPenerimaanSampel;
    }

    public void setTanggalPenerimaanSampel(LocalDate tanggalPenerimaanSampel) {
        this.tanggalPenerimaanSampel = tanggalPenerimaanSampel;
    }

    public String getKontakPelanggan() {
        return kontakPelanggan;
    }

    public void setKontakPelanggan(String kontakPelanggan) {
        this.kontakPelanggan = kontakPelanggan;
    }

    public String getAlamatPelanggan() {
        return alamatPelanggan;
    }

    public void setAlamatPelanggan(String alamatPelanggan) {
        this.alamatPelanggan = alamatPelanggan;
    }

    public String getTeknikSampling() {
        return teknikSampling;
    }

    public void setTeknikSampling(String teknikSampling) {
        this.teknikSampling = teknikSampling;
    }

    public String getSatuanAcuan() {
        return satuanAcuan;
    }

    public void setSatuanAcuan(String satuanAcuan) {
        this.satuanAcuan = satuanAcuan;
    }
}
