package com.api_spec_labor.api_spec_labor.Master.Model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MRole {
    private Long id;

    // Role Pengguna
    private String namaRole;
    private String deskripsiRole;

}
