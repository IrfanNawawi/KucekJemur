package id.heycoding.kucekjemur.presentation.home

import androidx.lifecycle.ViewModel
import id.heycoding.kucekjemur.data.remote.model.response.MenuItem
import id.heycoding.kucekjemur.data.remote.model.response.ServiceItem
import id.heycoding.kucekjemur.utils.DataDummy


/**
 * Created by Irfan Nawawi on 02/03/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
class HomeViewModel: ViewModel() {
    fun getService(): List<ServiceItem> = DataDummy.generateDummyService()
}