package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.PembayaranReq;
import com.api_spec_labor.api_spec_labor.share.BaseResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pembayaran-pengujian")
public class PembayaranPengujianController {


    @PostMapping("pembayaran")
    public BaseResponse pembayaran (@RequestBody PembayaranReq param){
        return new BaseResponse(1);
    }
}
