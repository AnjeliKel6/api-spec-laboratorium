package com.api_spec_labor.api_spec_labor.Master.Controller;

import com.api_spec_labor.api_spec_labor.Master.Model.MRole;
import com.api_spec_labor.api_spec_labor.share.BaseResponse;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/role")

public class MRoleController {
    @GetMapping("getall")
    public BaseResponse getall() {
        List<MRole> mRoles = new ArrayList<>();
        mRoles.add(MRole.builder().build());
        return new BaseResponse (mRoles);
    }

}
