package com.api_spec_labor.api_spec_labor.pengujian.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VerifikasiPengujianReq {
    private Long id_verifikasi;
    private Long id_sampel;
    private Long id_pengujian;
    private String status;
    private String keterangan;
}
