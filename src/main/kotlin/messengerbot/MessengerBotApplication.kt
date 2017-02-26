package messengerbot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MessengerBotApplication

fun main(args: Array<String>) {
    SpringApplication.run(MessengerBotApplication::class.java, *args)
}
