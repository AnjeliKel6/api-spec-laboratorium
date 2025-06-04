package com.api_spec_labor.api_spec_labor.User.Model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class MuserPenguji {
    private Long id;

    // User Sistem
    private String namaUser;
    private String roleUser;
    private List<String> parameterYangDipegang;


}
