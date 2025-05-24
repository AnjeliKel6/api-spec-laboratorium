package com.api_spec_labor.api_spec_labor.pengujian.model;



public class Role {
    private Long id;

    // Role Pengguna
    private String namaRole;
    private String deskripsiRole;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaRole() {
        return namaRole;
    }

    public void setNamaRole(String namaRole) {
        this.namaRole = namaRole;
    }

    public String getDeskripsiRole() {
        return deskripsiRole;
    }

    public void setDeskripsiRole(String deskripsiRole) {
        this.deskripsiRole = deskripsiRole;
    }
}
