package com.jachs.springbootannotation.conditional.ConditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

/***
 * 在application.properties或application.yml中也就是当系统变量不存在jachs.bean.enable才会加载当前bean如果不存在也会加载因为配置了matchIfMissing=true,不想配置false
 * @author zhanchaohan
 *
 */
@Configuration
@ConditionalOnProperty(value = "jachs.bean.enable",havingValue = "true",matchIfMissing = true)
public class PConditionConfig {

}
