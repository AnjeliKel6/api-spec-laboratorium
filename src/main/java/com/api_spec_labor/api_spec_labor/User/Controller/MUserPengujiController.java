package com.api_spec_labor.api_spec_labor.User.Controller;

import com.api_spec_labor.api_spec_labor.User.Model.MuserPenguji;
import com.api_spec_labor.api_spec_labor.share.BaseResponse;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/user-penguji")

public class MUserPengujiController {
    @GetMapping("getall")
    public BaseResponse getall() {
        List<MuserPenguji> muserPengujis = new ArrayList<>();
        muserPengujis.add(MuserPenguji.builder().build());
        return new BaseResponse (muserPengujis);
    }

}
