package com.api_spec_labor.api_spec_labor.Master.Model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Mbank {
    private Long id;
    private String nama_bank;
    private String no_rekening;
}
