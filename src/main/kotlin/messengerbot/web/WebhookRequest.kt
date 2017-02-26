package messengerbot.web

import com.fasterxml.jackson.annotation.JsonProperty

data class WebhookRequest(@JsonProperty("object") val obj: String, val entry: List<Entry>)

data class Entry(val id: String, val time: Long, val messaging: Messaging)

data class Messaging(val message: String)