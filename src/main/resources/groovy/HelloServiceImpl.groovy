package groovy

import com.remcarpediem.groovyengine.HelloService
import org.springframework.stereotype.Component

@Component
class HelloServiceImpl implements HelloService {
    String name

    String hello() {
        return "Hello $name. Welcome to Groovy in Spring"
    }
}
