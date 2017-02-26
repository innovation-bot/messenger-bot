package messengerbot.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Sample {

    @RequestMapping("/sample")
    fun smpl() : String {
        return "hello world"
    }
}
