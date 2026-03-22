package com.config.configdemo.controller;

import com.config.configdemo.BuildInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RefreshScope
public class BuildInfoController {
    @Value("${build.id:default}")
    private String buildId;
    @Value("${build.version:default}")
    private String buildVersion;
    @Value("${build.name:default}")
    private String buildName;
//    private final BuildInfo buildInfo;
//    @GetMapping("/build/info")
//    public String getBuildInfo()
//    {
//        return "Build ID: "+ buildInfo.getId() +", version: "+ buildInfo.getVersion()+", Name: "+ buildInfo.getName();
//    }
        @GetMapping("/build/info")
        public String getBuildInfo()
        {
            System.out.print("Build ID: "+ buildId +", version: "+ buildVersion+", Name: "+ buildName);
            return "Build ID: "+ buildId +", version: "+ buildVersion+", Name: "+ buildName;
        }
}
