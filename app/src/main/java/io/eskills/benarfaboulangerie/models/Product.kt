package io.eskills.benarfaboulangerie.models

class Product {
    var img: Int? = null
    var name: String? = null
    var prix: String? = null


    constructor(
        img: Int?,
        name: String?,
        prix: String?
    ){
        this.img = img
        this.name = name
        this.prix = prix
    }
}