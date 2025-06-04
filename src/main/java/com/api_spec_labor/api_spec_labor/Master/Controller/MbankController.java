package com.api_spec_labor.api_spec_labor.Master.Controller;

import com.api_spec_labor.api_spec_labor.Master.Model.Mbank;
import com.api_spec_labor.api_spec_labor.share.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/bank")
public class MbankController {
    @GetMapping("getall")
    public BaseResponse getall () {
        List<Mbank> mbanks = new ArrayList<>();
        mbanks.add(Mbank.builder().build());
        return new BaseResponse(mbanks);
    }
}
