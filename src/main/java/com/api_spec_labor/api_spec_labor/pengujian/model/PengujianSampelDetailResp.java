package com.api_spec_labor.api_spec_labor.pengujian.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PengujianSampelDetailResp {
    private int id_pengujian_detail;
    private int id_pengujian;

    private String no_sampel_detail;
    private double simplo;
    private double duplo;
    private double rata_rata;
    private double rpd;
    private String status_keberterimaan;
}
