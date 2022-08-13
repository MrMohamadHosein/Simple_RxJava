
interface SendMessage {
    fun send()
}

data class SmsMessage(
    private val phoneNumber: String,
    private val content: String) :SendMessage {

    override fun send() {
        // send sms here
    }
}

data class EmailMessage(
    private val emailAddress: String,
    private val content: String) :SendMessage {

    override fun send() {
        // send email here
    }
}

fun main() {

    val sendMessage :SendMessage = SmsMessage(
        "09367508248" , "Hello I found U via Github")


    val sendMessageviaEmail :SendMessage = EmailMessage(
        "kmohamadhosein77@gmail.com" , "Hello I found U via Github")

    sendMessage.send()

    sendMessageviaEmail.send()

}

