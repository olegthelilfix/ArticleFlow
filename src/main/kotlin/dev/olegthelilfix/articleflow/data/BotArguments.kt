package dev.olegthelilfix.articleflow.data

import com.beust.jcommander.Parameter
import org.telegram.telegrambots.meta.api.objects.Update

class BotArguments(val update: Update) {
    @Parameter
    lateinit var command: String

    @Parameter(names = ["-b", "--by"], description = "search by that field", order = 0)
    lateinit var valueToSearch: String

    @Parameter(names = ["-a", "--and"], variableArity = true, description = "AND")
    var and: List<String> = mutableListOf()

    @Parameter(names = ["-o", "--or"], variableArity = true, description = "OR")
    var or: List<String> = mutableListOf()

    @Parameter(names = ["-n", "--andnot"], variableArity = true, description = "AND_NOT")
    var andNot: List<String> = mutableListOf()

    @Parameter(names = ["-m", "--max"], description = "max result for request")
    @SuppressWarnings("MagicNumber")
    var maxResult = 10
}
