package messengerbot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class MessengerBotApplication

fun main(args: Array<String>) {
    SpringApplication.run(MessengerBotApplication::class.java, *args)
}
