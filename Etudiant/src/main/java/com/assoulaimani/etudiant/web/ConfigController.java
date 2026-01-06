package com.assoulaimani.etudiant.web;



import com.assoulaimani.etudiant.config.GlobalConfig;
import com.assoulaimani.etudiant.config.TestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    GlobalConfig globalConfig;
    TestParam testParam;
    public ConfigController(GlobalConfig globalConfig, TestParam testParam) {
        this.globalConfig = globalConfig;
        this.testParam = testParam;
    }

    @GetMapping("/globalConfig")
    public GlobalConfig getGlobalConfig() {
        return globalConfig;
    }
    @GetMapping("/testParam")
    public TestParam getTestParam() {
        return testParam;
    }
}
