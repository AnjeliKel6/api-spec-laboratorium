package com.api_spec_labor.api_spec_labor.Master.Model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Mpelanggan {
    private String namaPelanggan;
    private String npwpAtauKtp;
    private LocalDate tanggalPenerimaanSampel;
    private String kontakPelanggan;
    private String alamatPelanggan;
    private String teknikSampling;
    private String satuanAcuan;
}
