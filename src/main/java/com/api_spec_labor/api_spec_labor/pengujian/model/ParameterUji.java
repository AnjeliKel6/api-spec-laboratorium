package com.api_spec_labor.api_spec_labor.pengujian.model;



public class ParameterUji {
    private Long id;

    // Informasi Parameter Uji Pelanggan
    private String namaParameter;
    private String kategoriParameter; //fisika, kimia, mikrobiologi
    private Integer hargaParameter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaParameter() {
        return namaParameter;
    }

    public void setNamaParameter(String namaParameter) {
        this.namaParameter = namaParameter;
    }

    public String getKategoriParameter() {
        return kategoriParameter;
    }

    public void setKategoriParameter(String kategoriParameter) {
        this.kategoriParameter = kategoriParameter;
    }

    public Integer getHargaParameter() {
        return hargaParameter;
    }

    public void setHargaParameter(Integer hargaParameter) {
        this.hargaParameter = hargaParameter;
    }
}
