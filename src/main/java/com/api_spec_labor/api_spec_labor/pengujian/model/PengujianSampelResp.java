package com.api_spec_labor.api_spec_labor.pengujian.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PengujianSampelResp {
    private Long id_pengujian;
    private Long id_sampel;
    private String noSampel;
    private String namaParameterUji;
    private Integer jumlahSampel;
    private StatusAnalisisPengujian status;
    private String id_user;

    private List<PengujianSampelDetailResp> detailResps;
}
