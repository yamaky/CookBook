package com.example.cookbook.ui.shop_cart

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cookbook.models.Ingredient

class ShopCartViewModel : ViewModel() {
    var ingredients: MutableLiveData<ArrayList<Ingredient>> = MutableLiveData()
    init{
        ingredients = MutableLiveData(ArrayList(
            listOf(
                Ingredient(name = "Luk"),
                Ingredient(name = "Morkov"),
                Ingredient(name = "Perec"),
                Ingredient())
        )
        )
    }
}
