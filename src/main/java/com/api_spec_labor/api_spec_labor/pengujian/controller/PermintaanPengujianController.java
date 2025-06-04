package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.PermintaanPengujianReq;
import com.api_spec_labor.api_spec_labor.pengujian.model.PermintaanPengujianResp;
import com.api_spec_labor.api_spec_labor.share.BaseResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/permintaan-pengujian")
public class PermintaanPengujianController {

    @GetMapping ("getbyId")
    public BaseResponse getbyId (@RequestParam int id){
        return new BaseResponse(PermintaanPengujianResp.builder().build());
    }

    @PostMapping
    public BaseResponse addPelanggan(@RequestBody PermintaanPengujianReq permintaanPengujianReqData) {
        return new BaseResponse(1);
    }

}
