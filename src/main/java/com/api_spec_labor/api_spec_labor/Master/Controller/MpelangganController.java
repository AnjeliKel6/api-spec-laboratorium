package com.api_spec_labor.api_spec_labor.Master.Controller;

import com.api_spec_labor.api_spec_labor.Master.Model.Mpelanggan;
import com.api_spec_labor.api_spec_labor.share.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/mpelanggan")
public class MpelangganController {
    @GetMapping("getall")
    public BaseResponse getall() {
        List<Mpelanggan> mpelanggans = new ArrayList<>();
        mpelanggans.add(Mpelanggan.builder().build());
        return new BaseResponse (mpelanggans);
    }
}
