package com.api_spec_labor.api_spec_labor.pengujian.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PembayaranReq {

    private Long id;
    private int id_permintaan;
    private int id_pelanggan;
    private String metode_pembayaran;
    private String bank;
    private String no_ref;
    private int jumlah_tagihan;
    private String tanggal_bayar;
    private String user;

}
