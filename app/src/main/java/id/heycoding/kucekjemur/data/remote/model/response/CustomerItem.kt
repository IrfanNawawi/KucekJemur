package id.heycoding.kucekjemur.data.remote.model.response


/**
 * Created by Irfan Nawawi on 23/02/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
data class CustomerItem(
    val name: String,
    val typeServices: String,
    val inProduct: String,
    val outProduct: String,
    val expiredProcut: String,
    val status: Int,
    val bill: Int
)
