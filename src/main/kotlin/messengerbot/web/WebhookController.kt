package messengerbot.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by yusukeiwanaga on 2017/02/26.
 */

@RestController("/webhook")
class WebhookController() {

    @GetMapping
    fun getWebhook(
            @RequestParam("hub.model") model: String,
            @RequestParam("hub.verify_token") verifyToken: String,
            @RequestParam("hub.challenge") challenge: String
    ): String {
       return challenge
    }

    @PostMapping
    fun postWebhook() {

    }

}
