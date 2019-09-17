package com.wangjunji.springrcepies.sequce;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(includeFilters = {
        @ComponentScan.Filter(
                type= FilterType.REGEX,
                pattern = {"com.wangjunji.springrcepies.sequce.*Dao"
                ,"com.apress.springrecipes.sequence.*Service"})},
        excludeFilters = {
        @ComponentScan.Filter(
                type=FilterType.ANNOTATION,
                classes = {org.springframework.stereotype.Controller.class}
        )
        }
)
public class SequnceGeneratorConfiguration {
}
