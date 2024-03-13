package id.heycoding.kucekjemur.data.remote.model.response


/**
 * Created by Irfan Nawawi on 23/02/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
data class ProductItem(
    val name: String,
    val type: String,
    val priceWash: Int,
    val priceWashPremium: Int,
    val priceIron: Int,
    val priceDryClean: Int,
    val stock: Int,
)
