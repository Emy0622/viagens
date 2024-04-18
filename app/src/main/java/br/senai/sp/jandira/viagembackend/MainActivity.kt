package br.senai.sp.jandira.viagembackend

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.viagembackend.repositorio.ViagemRepositorio
import br.senai.sp.jandira.viagembackend.ui.theme.ViagemBackendTheme
import br.senai.sp.jandira.viagembackend.utilitarios.encurtadorDeDatas

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViagemBackendTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val viagens = ViagemRepositorio().listarTodasAsViagens()
    LazyColumn {
        items(viagens) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp)

            ) {
                //bom sempre colocar a imagem dentro de um surface
                //pra arrumar o tamanho da imagem
                Surface(
                    modifier = Modifier.fillMaxWidth()//.height(170.dp)
                ) {
                    Image(
                        //tratamento para ter imagem nula (para parar de reclamar depois de duas !)
                        painter = if (it.imagem == null) painterResource(id = R.drawable.noimage) else it.imagem!!,
                        contentDescription = "",
                    )
                }
                Text(text = "${it.destino}, ${it.dataChegada.dayOfWeek}")
                Text(text = it.descricao)
                //pegar a data no formato bonitinho (chamando a funcao)
                Text(text = encurtadorDeDatas(it.dataChegada, it.dataPartida))

            }
        }
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        ViagemBackendTheme {
            Greeting("Android")
        }
    }
