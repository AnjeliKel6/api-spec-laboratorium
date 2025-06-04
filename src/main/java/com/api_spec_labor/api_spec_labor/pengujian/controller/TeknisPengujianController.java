package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.AnalisisPengujianResp;
import com.api_spec_labor.api_spec_labor.pengujian.model.PengujianSampelResp;
import com.api_spec_labor.api_spec_labor.pengujian.model.VerifikasiPengujianReq;
import com.api_spec_labor.api_spec_labor.share.BaseResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/teknis-pengujian")
@CrossOrigin
public class TeknisPengujianController {
    @GetMapping("gethasilujiparameterBysampel")
    public BaseResponse gethasilujiparameterBysampel(@RequestParam int id_sampel){
        return new BaseResponse(PengujianSampelResp.builder().build());
    }

    @PostMapping("addValidasi")
    public BaseResponse addValidasi (@RequestBody VerifikasiPengujianReq param){
        return new BaseResponse(1);
    }
}
