import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio40Screen.data.Clientes
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio40Screen.data.getClientesFalsos


enum class TipoDeDialogo { CONFIRMADO, ERROR }

class ClientesViewModel : ViewModel() {
    private var _usernameEnUso by mutableStateOf(false)
    val usernameEnUso: Boolean get() = _usernameEnUso
    fun falseUsernameEnUso() {
        _usernameEnUso = false
    }
    private var _emailEnUso by mutableStateOf(false)
    val emailEnUso: Boolean get() = _emailEnUso
    fun falseEmailEnUso() {
        _emailEnUso = false
    }



    private var _clientesList = getClientesFalsos().toMutableStateList() //mutableStateListOf<Client>()
    val clientesList get() = _clientesList.toList() //Se convierte en lista inmutable

    private var _dialogoString: TipoDeDialogo? by mutableStateOf(null)//clienteAlredyExists se define como tipo TipoDeDialogo
    val dialogoString: TipoDeDialogo? get() = _dialogoString //Variable observable desde fuera


    fun hideDialog() {
        _dialogoString = null
    }




    fun signIn(usernameString: String, emailString: String, passwordString: String) {
        _clientesList.find { it.email == emailString }?.let {
            _dialogoString = TipoDeDialogo.ERROR
            _emailEnUso = true
        }
        _clientesList.find { it.email == usernameString }?.let {
            _dialogoString = TipoDeDialogo.ERROR
            _usernameEnUso = true
        }
        if (!_emailEnUso && !_usernameEnUso) {
            _clientesList.add(Clientes(usernameString, emailString, passwordString))
            _dialogoString = TipoDeDialogo.CONFIRMADO
        }else {

        }

            ?: {
                _clientesList.add(//Añade a la lista de clientes
                    Clientes(
                        usernameString,
                        emailString,
                        passwordString
                    )
                )
                _dialogoString = TipoDeDialogo.CONFIRMADO

            }

    }
}