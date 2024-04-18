package br.senai.sp.jandira.viagembackend.utilitarios

import androidx.compose.ui.text.toLowerCase
import java.time.LocalDate

//tratar as datas quando chegar
fun encurtadorDeDatas(dataChegada: LocalDate, dataPartida: LocalDate): String {

    //pegar o dia so da chegada
    var diaChegada = dataChegada.dayOfMonth
    //pegar só o mes
    var mesChegada = dataChegada.month.toString()
    //pegar so as tres primeiras letras
    var mesChegadaAbreviada = mesChegada.substring(0..2).toLowerCase()


    //pegar o dia so da chegada
    var diaPartida = dataPartida.dayOfMonth
    //pegar só o mes
    var mesPartida = dataPartida.month.toString()
    //pegar so as tres primeiras letras
    //tolower deixa normal (sem ser em capslook)
    var mesPartidaAbreviada = mesPartida.substring(0..2).toLowerCase()

    //retornar o que eu quero do jeito bonitinho

    return "$diaChegada $mesChegadaAbreviada - $diaPartida $mesPartidaAbreviada"

}