package com.xyyima.plum.controller.api;

import com.xyyima.plum.controller.base.BaseApiController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController extends BaseApiController {
    @Value("${plum.version}")
    private String plumVersion;

    @RequestMapping("version")
    public String getVersion() {
        return plumVersion;
    }
}
