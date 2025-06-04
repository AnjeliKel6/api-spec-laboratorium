package com.api_spec_labor.api_spec_labor.Master.Controller;

import com.api_spec_labor.api_spec_labor.Master.Model.MParameterPengujian;
import com.api_spec_labor.api_spec_labor.share.BaseResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/mparameter-uji")
@CrossOrigin
public class MparameterUjiController {
    @GetMapping("getall")
    public BaseResponse getall () {
        List<MParameterPengujian> parameterPengujians = new ArrayList<>();
        parameterPengujians.add(MParameterPengujian.builder().build());
     return new BaseResponse (parameterPengujians);
    }
}
