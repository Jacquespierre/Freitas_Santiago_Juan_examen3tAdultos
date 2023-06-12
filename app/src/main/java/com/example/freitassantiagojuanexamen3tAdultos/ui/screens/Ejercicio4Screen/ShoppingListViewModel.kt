package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio4Screen

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class ShoppingListViewModel : ViewModel() {
    private val _list = getFakeShoppingProducts().toMutableStateList()
    val list get() = _list  // (1)


    fun remove(item: ShoppingProduct) {
        _list.remove(item)
    }

    fun changeProductChecked(item: ShoppingProduct){
        //list.find {it.key=item.key}?.let {  }
        item.checked = !item.checked
    }

}