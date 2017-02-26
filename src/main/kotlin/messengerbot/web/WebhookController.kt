package messengerbot.web

import jdk.nashorn.internal.runtime.logging.Logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController("/webhook")
class WebhookController() {
    val VALIDATION_TOKEN: String = "hogehoge"

    @GetMapping
    fun getWebhook(
            @RequestParam("hub.mode") mode: String,
            @RequestParam("hub.verify_token") verifyToken: String,
            @RequestParam("hub.challenge") challenge: String
    ): String {
        if (mode.equals("subscribe") && verifyToken.equals(VALIDATION_TOKEN)) {
            return challenge
        } else {
            return challenge
        }

    }

    @PostMapping
    fun postWebhook(@RequestParam request: WebhookRequest) {
        println(request.toString())
    }
}
