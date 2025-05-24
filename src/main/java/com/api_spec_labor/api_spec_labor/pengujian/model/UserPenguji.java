package com.api_spec_labor.api_spec_labor.pengujian.model;

import java.util.List;

public class UserPenguji {
    private Long id;

    // User Sistem
    private String namaPenguji;
    private String rolePengguna;
    private List<String> parameterYangDipegang;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaPenguji() {
        return namaPenguji;
    }

    public void setNamaPenguji(String namaPenguji) {
        this.namaPenguji = namaPenguji;
    }

    public String getRolePengguna() {
        return rolePengguna;
    }

    public void setRolePengguna(String rolePengguna) {
        this.rolePengguna = rolePengguna;
    }

    public List<String> getParameterYangDipegang() {
        return parameterYangDipegang;
    }

    public void setParameterYangDipegang(List<String> parameterYangDipegang) {
        this.parameterYangDipegang = parameterYangDipegang;
    }
}
