package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio5Screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class ShoppingListViewModel : ViewModel() {
    private val _list =
        mutableStateListOf<ShoppingProduct>()//Lista vacia de shopping productos. No hace falta por se set
    val list get() = _list

    /* fun changeChecked(item: ShoppingProduct, nextValue: Boolean) {
         _list.find { it.key == item.key }?.let {
             it.checked = nextValue
         }
     }*/

    fun remove(item: ShoppingProduct) {
        _list.remove(item)
    }

    /*fun changeChecked(item: ShoppingProduct, newValue: Boolean) {
        item.checked = newValue
    }*/

    //Método para borra si algún item está marcado
    fun isAnyChecked(item: ShoppingProduct){item.checked = true}

    //Método que comprueba que si existe el nombre no se añade. Debería probar un set
    fun add(itemName: String) {
        _list.find { it.name == itemName } ?: add(ShoppingProduct(itemName))
    }

    fun add(item: ShoppingProduct) {
        _list.add(item)
    }


    fun removeChecked() {
        _list.removeIf { it.checked }
    }

    fun isAnyChecked()=_list.any{ it.checked }

    fun changeChecked(item: ShoppingProduct) {
        item.checked = !item.checked

    }

    //Versión alternativa
    //_list.filter{it.checked == false}
}
