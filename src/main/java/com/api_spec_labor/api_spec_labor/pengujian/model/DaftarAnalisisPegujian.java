package com.api_spec_labor.api_spec_labor.pengujian.model;

public class DaftarAnalisisPegujian {
    private Long id;
    private String noSampel;
    private String namaParameterUji;
    private Integer jumlahSampel;
    private StatusAnalisisPengujian status;

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

    public String getNamaParameterUji() {
        return namaParameterUji;
    }

    public void setNamaParameterUji(String namaParameterUji) {
        this.namaParameterUji = namaParameterUji;
    }

    public Integer getJumlahSampel() {
        return jumlahSampel;
    }

    public void setJumlahSampel(Integer jumlahSampel) {
        this.jumlahSampel = jumlahSampel;
    }

    public StatusAnalisisPengujian getStatus() {
        return status;
    }

    public void setStatus(StatusAnalisisPengujian status) {
        this.status = status;
    }
}
