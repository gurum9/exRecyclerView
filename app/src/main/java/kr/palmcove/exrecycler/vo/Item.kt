package kr.palmcove.exrecycler.vo

import java.io.Serializable

data class Item(
    var img: String, var title: String, var content: String,
    var location: String, var price: String, var like: String, var comment: String,
    var category: String, var views: String, var name: String, var isNegotiation: Boolean
) : Serializable