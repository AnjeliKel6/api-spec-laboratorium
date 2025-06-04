package com.api_spec_labor.api_spec_labor.pengujian.model;

import lombok.Data;

import java.util.List;

@Data
public class IdentifikasiSampel {
    private Long id;

    //identifikasi sampel
    private String noSampel;
    private String komoditiSampel;
    private String kondisiSampel;
    private Double volumeSampel;
    private String wadahSampel;
    private String jenisPengujian;
    private String statusSampel;

}
