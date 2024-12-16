package io.minoro75.genshinhelper.presentation.voice_screen

import android.content.Intent
import android.graphics.ImageDecoder
import android.os.Build
import android.os.Bundle
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.MultiplePermissionsState
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.Genshin
import java.util.Locale
import java.util.jar.Manifest

@RequiresApi(Build.VERSION_CODES.P)
@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun VoiceScreen(modifier: Modifier = Modifier,
                onNavigateClick: (String) -> Unit) {

    var speechText by remember { mutableStateOf("Press the button and speak!") }
    var isListening by remember { mutableStateOf(false) }
    var isFoundMatch by remember { mutableStateOf(false) }
    var matchName:String? by remember { mutableStateOf(null) }

    val listRu = listOf("Альбедо", "Аль-Хайтам", "Аяка", "Аято", "Барбара", "Беннет", "Бэй Доу", "Венти", "Гань Юй", "Горо", "Джинн", "Дилюк", "Диона", "Дори", "Дэхья", "Е Лань", "Ёимия", "Итто", "Кадзуха", "Кавех", "Кэйа", "Кирара", "Кли", "Кокоми", "Коллеи", "Куки Синобу", "Кэ Цин", "Лайла", "Лиза", "Мика", "Мона", "Нахида", "Нилу", "Нин Гуан", "Ноэлль", "Путешественник (Анемо)", "Путешественник (Гео)", "Путешественник (Электро)", "Путешественник (Дендро)", "Райдэн", "Розария", "Рэйзор", "Сайно", "Сара", "Сахароза", "Саю", "Син Цю", "Синь Янь", "Странник", "Сян Лин", "Сяо", "Тарталья", "Тигнари", "Тома", "Фарузан", "Фишль", "Ху Тао", "Хэйдзо", "Ци Ци", "Чжун Ли", "Чун Юнь", "Шэнь Хэ", "Элой", "Эмбер", "Эола", "Юнь Цзинь", "Янь Фэй", "Яо Яо", "Яэ Мико", "Нёвиллет", "Ризли")
    val listEn = listOf("Albedo", "Alhaitham", "Amber", "Arataki Itto", "Barbara", "Beidou", "Bennett", "Candace", "Chongyun", "Collei", "Cyno", "Dehya", "Diluc", "Diona", "Dori", "Eula", "Faruzan", "Fischl", "Freminet", "Ganyu", "Gorou", "Hu Tao", "Jean", "Kaedehara Kazuha", "Kaeya", "Kamisato Ayaka", "Kamisato Ayato", "Kaveh", "Keqing", "Kirara", "Klee", "Kujou Sara", "Kuki Shinobu", "Layla", "Lisa", "Lumine", "Lynette", "Lyney", "Mika", "Mona", "Nahida", "Neuvillette", "Nilou", "Ningguang", "Noelle", "Qiqi", "Raiden Shogun", "Razor", "Rosaria", "Sangonomiya Kokomi", "Sayu", "Shenhe", "Shikanoin Heizou", "Sucrose", "Tartaglia", "Thoma", "Tighnari", "Traveler (Anemo)", "Traveler (Geo)", "Traveler (Electro)", "Traveler (Dendro)", "Venti", "Wanderer", "Xiangling", "Xiao", "Xingqiu", "Xinyan", "Yaoyao", "Yelan", "Yoimiya", "Yun Jin", "Zhongli")
    val listUa = listOf("Альбедо","Аль-Хайтам","Аратакі Ітто","Бай Чжу","Барбара","Бейдоу","Блукач","Беннетт","Венті","Га Мін","Ганью","Горо","Дехʼя","Джин","Джонлі","Дорі","Ділюк","Діона","Елой","Ембер","Еола","Йоімія","Каедехара Кадзуха","Камісато Аяка","Камісато Аято","Кавех","Кандаке","Кая","Кецін","Кірара","Клі","Коллей","Куджьо Сара","Кукі Шінобу","Лайла","Ліза","Лінетт","Ліні","Мандрівник Анемо","Мандрівник Гео","Мандрівник Гідро","Мандрівник Дендро","Мандрівник Електро","Міка","Мона","Навія","Нахіда","Невілет","Ноель","Нілу","Нінгуан","Райден Шьогун","Рейзор","Різлі","Розарія","Сайно","Сангономія Кокомі","Саю","Сянлін","Сянь Юнь","Сяо","Сінцю","Сіньянь","Тарталья","Тома","Тігнарі","Фарузан","Фішль","Фреміне","Фуріна","Ху Тао","Цукроза","Ці Ці","Чіорі","Чонʼюнь","Шарлотта","Шеврез","Шеньхе","Шиканоін Хейдзо","Юнь Дзінь","Яе Міко","Яньфей","Яо Яо","Єлань"
    )

    // Request permission
    val context = LocalContext.current
    val requestPermissionLauncher =
        rememberLauncherForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (!isGranted) {
                Toast.makeText(context.applicationContext, "Permission denied!", Toast.LENGTH_SHORT).show()
            }
        }

    val permissions = rememberMultiplePermissionsState(
        permissions = listOf(
            android.Manifest.permission.RECORD_AUDIO
        )
    )

    val speechRecognizer = remember { SpeechRecognizer.createSpeechRecognizer(context.applicationContext) }

    RequestNotificationsPermission(permissions)

    val speechIntent = remember {
        Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
            putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)

            when (Locale.getDefault().displayLanguage) {
                "русский" -> putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ru-RU")
                "українська" -> putExtra(RecognizerIntent.EXTRA_LANGUAGE, "uk-UK")
                else ->  putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US")
            }

        }
    }


    speechRecognizer.setRecognitionListener(object : RecognitionListener {
        override fun onReadyForSpeech(params: Bundle?) {
            speechText = "Listening..."
        }

        override fun onBeginningOfSpeech() {}
        override fun onRmsChanged(rmsdB: Float) {}
        override fun onBufferReceived(buffer: ByteArray?) {}
        override fun onEndOfSpeech() {
            isListening = false
        }

        override fun onError(error: Int) {
            speechText = "Error: $error"
            isListening = false
        }

        override fun onResults(results: Bundle?) {
            val matches = results?.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
            speechText = matches?.get(0) ?: "No speech recognized"

            when (Locale.getDefault().displayLanguage) {
                "русский" -> speechText.split(" ").forEach { inputWord ->
                    if (listRu.contains(inputWord)) {
                        isFoundMatch = true
                        matchName = inputWord
                    }}
                "українська" -> speechText.split(" ").forEach { inputWord ->
                    if (listUa.contains(inputWord)) {
                        isFoundMatch = true
                        matchName = inputWord
                    }}
                else ->  speechText.split(" ").forEach { inputWord ->
                    if (listEn.contains(inputWord)) {
                        isFoundMatch = true
                        matchName = inputWord
                    }}
            }

        }

        override fun onPartialResults(partialResults: Bundle?) {}
        override fun onEvent(eventType: Int, params: Bundle?) {}
    })



    LaunchedEffect(Unit) {
        requestPermissionLauncher.launch(android.Manifest.permission.RECORD_AUDIO)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .systemBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val imageLoader = ImageLoader.Builder(context)
            .components { add(ImageDecoderDecoder.Factory()) }.build()


        val painter = if (isListening) rememberAsyncImagePainter(R.drawable.anim1,imageLoader) else
            rememberAsyncImagePainter(R.drawable.anim2,imageLoader)


        Image(
            painter = painter,
            contentDescription = "3d animation",
            modifier = Modifier.size(250.dp)
        )

        Text(text = speechText, fontSize = 20.sp, modifier = Modifier.padding(16.dp),
            color = MaterialTheme.colorScheme.onPrimaryContainer)

        Button(
            onClick = {
                if (isListening) {
                    speechRecognizer.stopListening()
                    isListening = false
                } else {
                    speechRecognizer.startListening(speechIntent)
                    isListening = true
                }
            },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(if (isListening) "Stop Listening" else "Start Listening")
        }

        matchName?.let {
            Text( text = "Seems like you were looking for $it guide",
                modifier = Modifier.padding(horizontal = 16.dp).align(Alignment.CenterHorizontally),
                color = MaterialTheme.colorScheme.onPrimaryContainer, fontSize = 20.sp)

            Spacer(Modifier.height(8.dp))

            Button(onClick = {onNavigateClick.invoke(matchName!!)},) {
                Text( text = "Navigate",
                    modifier = Modifier.padding(horizontal = 16.dp),
                    color = MaterialTheme.colorScheme.onPrimaryContainer, fontSize = 20.sp)
            }

        }



    }
}

@OptIn(ExperimentalPermissionsApi::class)
@Composable
private fun RequestNotificationsPermission(permissionState: MultiplePermissionsState) {

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {

        SideEffect {
            permissionState.launchMultiplePermissionRequest()
        }
    }
}