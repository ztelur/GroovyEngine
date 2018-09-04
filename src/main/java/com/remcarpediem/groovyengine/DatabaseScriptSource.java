package com.remcarpediem.groovyengine;

import org.springframework.scripting.ScriptSource;

import java.io.IOException;
import java.sql.Timestamp;

public class DatabaseScriptSource implements ScriptSource {

    private final Object lastModifiedMonitor = new Object();
    private String scriptName;
    private Timestamp lastKnownUpdate;


    @Override
    public String getScriptAsString() throws IOException {
        return null;
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public String suggestedClassName() {
        return null;
    }
}
