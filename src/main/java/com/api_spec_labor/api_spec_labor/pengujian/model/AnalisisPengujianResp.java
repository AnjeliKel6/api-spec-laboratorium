package com.api_spec_labor.api_spec_labor.pengujian.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnalisisPengujianResp {
    private Long id;
    private String noSampel;
    private String namaParameterUji;
    private Integer jumlahSampel;
    private String statusParameter;

}
