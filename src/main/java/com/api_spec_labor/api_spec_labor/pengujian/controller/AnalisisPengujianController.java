package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.AnalisisPengujianReq;
import com.api_spec_labor.api_spec_labor.pengujian.model.AnalisisPengujianResp;
import com.api_spec_labor.api_spec_labor.pengujian.model.PengujianSampelReq;
import com.api_spec_labor.api_spec_labor.pengujian.model.PengujianSampelResp;
import com.api_spec_labor.api_spec_labor.share.BaseResponse;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/daftar-analisis-pengujian")
@CrossOrigin

public class AnalisisPengujianController {
    private final Map<Long, AnalisisPengujianResp> dataAnalisis = new HashMap<>();
    private Long counter = 1L;

    // GET semua data
    @GetMapping("/")
    public BaseResponse getAllAnalisis() {
        List<AnalisisPengujianResp> daftarAnalisisPegujians = new ArrayList<>();
        daftarAnalisisPegujians.add(AnalisisPengujianResp.builder().build());
        return new BaseResponse (daftarAnalisisPegujians);
    }

    // GET by ID
    @GetMapping("/{id}")
    public BaseResponse getAnalisisById(@PathVariable Long id) {
        return new BaseResponse(AnalisisPengujianResp.builder().build());
    }

    @PostMapping("updatestatusParameter")
    public BaseResponse updatestatusParameter(@RequestBody AnalisisPengujianReq param){
        return new BaseResponse(1);
    }

    @PostMapping("addAnalisis")
    public BaseResponse addAnalisis(@RequestBody PengujianSampelReq param){
        return new BaseResponse(1);
    }

    @PostMapping("updatestatusSampel")
    public BaseResponse updatestatusSampel(@RequestBody AnalisisPengujianReq param){
        return new BaseResponse(1);
    }


}
