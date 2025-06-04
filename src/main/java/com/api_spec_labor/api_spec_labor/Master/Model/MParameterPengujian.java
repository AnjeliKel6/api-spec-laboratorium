package com.api_spec_labor.api_spec_labor.Master.Model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MParameterPengujian {
    private Long id_mparameter;

    // Informasi Parameter Uji Pelanggan
    private String namaParameter;
    private String kategoriParameter; //fisika, kimia, mikrobiologi
    private Integer hargaParameter;


}
