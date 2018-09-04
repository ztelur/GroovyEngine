package com.remcarpediem.groovyengine;

import org.springframework.core.io.ResourceLoader;
import org.springframework.scripting.ScriptSource;
import org.springframework.scripting.support.ScriptFactoryPostProcessor;

public class GroovyScriptFactoryPostProcess extends ScriptFactoryPostProcessor {
    @Override
    protected ScriptSource convertToScriptSource(String beanName, String scriptSourceLocator, ResourceLoader resourceLoader) {
        return super.convertToScriptSource(beanName, scriptSourceLocator, resourceLoader);
    }
}
