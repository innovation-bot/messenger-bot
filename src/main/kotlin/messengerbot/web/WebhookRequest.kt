package messengerbot.web

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class WebhookRequest(var entry: List<Entry>)

data class Entry(var id: String, var time: Long, var messaging: Messaging)

data class Messaging(var message: String)