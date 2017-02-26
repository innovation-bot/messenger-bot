package messengerbot.web

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class WebhookRequest(val entry: List<Entry>)

data class Entry(val id: String, val time: Long, val messaging: List<Messaging>)

data class Messaging(val message: String)