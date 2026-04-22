fun reverse(input: String): String {
    var resultado = ""

    for(i in input.length - 1 downTo 0){

        resultado += input[i]
    }
    return resultado
}
