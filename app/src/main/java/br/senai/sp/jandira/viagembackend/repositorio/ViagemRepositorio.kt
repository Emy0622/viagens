package br.senai.sp.jandira.viagembackend.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.viagembackend.R
import br.senai.sp.jandira.viagembackend.modelo.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    //list oq tiver dentro do <> vai ser sobre oq é a lista
    //fun criar funcao
@Composable
    fun listarTodasAsViagens(): List<Viagem>{

        //criar objeto viagens //objeto nao esta nulo
        val londres = Viagem(
            id = 1,
            destino = "Londres",
            descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana.",
            dataChegada = LocalDate.of(2019,2,18),
            dataPartida = LocalDate.of(2019, 2, 21),
            //tomar cuidado com o R tem ques ser do br senai (O do comeco)
            imagem = painterResource(id = R.drawable.noimage)
        )

        val canada = Viagem(
            id = 2,
            destino = "Canadá",
            descricao = "O Canadá é um país norte-americano que se estende desde os EUA, no sul, até o Círculo Polar Ártico, no norte.",
            dataChegada = LocalDate.of(2025,2,28),
            dataPartida = LocalDate.of(2025, 6, 22),
            imagem = painterResource(id = R.drawable.canada)
        )

        val franca = Viagem(
            id = 3,
            destino = "França",
            descricao = "A França, na Europa Ocidental, tem cidades medievais, aldeias alpinas e praias mediterrâneas. Paris, sua capital, é famosa pelas casas de alta costura, museus de arte clássica, como o Louvre, e monumentos como a Torre Eiffel. ",
            dataChegada = LocalDate.of(2025,12,23),
            dataPartida = LocalDate.of(2026, 2, 28),
            imagem = painterResource(id = R.drawable.paris)
        )
        val osasco = Viagem(
            id = 4,
            destino = "Osasco",
            descricao = "Osasco é um município brasileiro localizado na Região Metropolitana de São Paulo, no estado de São Paulo, no Brasil. Nascido como um bairro da capital paulista no final do século XIX, tornou-se município emancipado após um plebiscito em 1962.",
            dataChegada = LocalDate.of(2024,4,19),
            dataPartida = LocalDate.of(2024, 4, 19),

        )
        val saoMiguel = Viagem(
            id = 5,
            destino = "São Miguel",
            descricao = "São Miguel Paulista (comumente chamado apenas de São Miguel) é um distrito da zona leste do município de São Paulo, no estado de São Paulo, no Brasil.",
            dataChegada = LocalDate.of(2024,4,20),
            dataPartida = LocalDate.of(2024, 6, 26),
            imagem = painterResource(id = R.drawable.namorada)
        )
        return listOf(londres,canada, franca, osasco, saoMiguel)
    }
}