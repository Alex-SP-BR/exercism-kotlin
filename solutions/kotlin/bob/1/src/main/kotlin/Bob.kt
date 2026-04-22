object Bob {
    fun hey(input: String): String {

        val texto = input.trim()

        if (texto == "") {
            return "Fine. Be that way!"
        }

        val isQuestion = texto.endsWith("?")
        val isShouting = texto == texto.uppercase() && texto.any { it.isLetter() }

        if (isShouting && isQuestion) {
            return "Calm down, I know what I'm doing!"
        }

        if (isShouting) {
            return "Whoa, chill out!"
        }

        if (isQuestion) {
            return "Sure."
        }

        return "Whatever."
    }
}