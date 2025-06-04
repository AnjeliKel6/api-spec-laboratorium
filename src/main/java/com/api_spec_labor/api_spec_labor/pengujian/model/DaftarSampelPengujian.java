package com.api_spec_labor.api_spec_labor.pengujian.model;

import com.api_spec_labor.api_spec_labor.Master.Model.MParameterPengujian;

import java.time.LocalDate;
import java.util.List;

public class DaftarSampelPengujian {
    private Long id;

    // Daftar Sampel Yang Akan di Uji
    private String noSampel;
    private LocalDate tanggalPenerimaanSampel;
    private Long totalBiaya;
    private StatusPengujian status;
    private String namaPenguji;
    private List<MParameterPengujian> parameterPengujian;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoSampel() {
        return noSampel;
    }

    public void setNoSampel(String noSampel) {
        this.noSampel = noSampel;
    }

    public LocalDate getTanggalPenerimaanSampel() {
        return tanggalPenerimaanSampel;
    }

    public void setTanggalPenerimaanSampel(LocalDate tanggalPenerimaanSampel) {
        this.tanggalPenerimaanSampel = tanggalPenerimaanSampel;
    }

    public Long getTotalBiaya() {
        return totalBiaya;
    }

    public void setTotalBiaya(Long totalBiaya) {
        this.totalBiaya = totalBiaya;
    }

    public StatusPengujian getStatus() {
        return status;
    }

    public void setStatus(StatusPengujian status) {
        this.status = status;
    }

    public String getNamaPenguji() {
        return namaPenguji;
    }

    public void setNamaPenguji(String namaPenguji) {
        this.namaPenguji = namaPenguji;
    }

    public List<MParameterPengujian> getParameterPengujian() {
        return parameterPengujian;
    }

    public void setParameterPengujian(List<MParameterPengujian> parameterPengujian) {
        this.parameterPengujian = parameterPengujian;
    }
}
