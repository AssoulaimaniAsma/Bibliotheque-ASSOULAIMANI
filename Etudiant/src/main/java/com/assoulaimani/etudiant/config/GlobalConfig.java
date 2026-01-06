package com.assoulaimani.etudiant.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ConfigurationProperties(prefix = "global.params")
public class GlobalConfig {
    private int g1;
    private int g2;
}
