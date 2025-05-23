package com.api_spec_labor.api_spec_labor.pengujian.model;

public class IdentifikasiSampel {
    private Long id;

    //identifikasi sampel
    private String noSampel;
    private String komoditiSampel;
    private String kondisiSampel;
    private Double volumeSampel;
    private String wadahSampel;
    private String jenisPengujian;

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

    public String getKomoditiSampel() {
        return komoditiSampel;
    }

    public void setKomoditiSampel(String komoditiSampel) {
        this.komoditiSampel = komoditiSampel;
    }

    public String getKondisiSampel() {
        return kondisiSampel;
    }

    public void setKondisiSampel(String kondisiSampel) {
        this.kondisiSampel = kondisiSampel;
    }

    public Double getVolumeSampel() {
        return volumeSampel;
    }

    public void setVolumeSampel(Double volumeSampel) {
        this.volumeSampel = volumeSampel;
    }

    public String getWadahSampel() {
        return wadahSampel;
    }

    public void setWadahSampel(String wadahSampel) {
        this.wadahSampel = wadahSampel;
    }

    public String getJenisPengujian() {
        return jenisPengujian;
    }

    public void setJenisPengujian(String jenisPengujian) {
        this.jenisPengujian = jenisPengujian;
    }
}
