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
        // 就是获取脚本的文本内容
        return "package groovy\n" +
                "\n" +
                "import com.remcarpediem.groovyengine.HelloService\n" +
                "import org.springframework.stereotype.Component\n" +
                "\n" +
                "@Component\n" +
                "class HelloServiceImpl implements HelloService {\n" +
                "    String name\n" +
                "\n" +
                "    String hello() {\n" +
                "        return \"Hello $name. Welcome to Groovy in Spring\"\n" +
                "    }\n" +
                "}";
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public String suggestedClassName() {
        // 获取脚本的类名
        return "HelloServiceImpl";
    }
}
