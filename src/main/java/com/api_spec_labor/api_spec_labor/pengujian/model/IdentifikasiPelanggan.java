package com.api_spec_labor.api_spec_labor.pengujian.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class IdentifikasiPelanggan {
    private Long id;

    // Informasi Pelanggan
    private String namaPelanggan;
    private String npwpAtauKtp;
    private LocalDate tanggalPenerimaanSampel;
    private String kontakPelanggan;
    private String alamatPelanggan;
    private String teknikSampling;
    private String satuanAcuan;


}
