package com.api_spec_labor.api_spec_labor.pengujian.model;

import com.api_spec_labor.api_spec_labor.Master.Model.MParameterPengujian;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PermintaanPengujianResp {
    //identifikasi Pelanggan
    private IdentifikasiPelanggan identifikasiPelanggan;
    private IdentifikasiSampel identifikasiSampel;

    private List<MParameterPengujian> parameterPengujians;
}
