package id.heycoding.kucekjemur.utils

import id.heycoding.kucekjemur.R
import id.heycoding.kucekjemur.data.remote.model.response.MenuItem
import id.heycoding.kucekjemur.data.remote.model.response.ServiceItem


/**
 * Created by Irfan Nawawi on 28/02/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
object DataDummy {
    fun generateDummyMenu(): ArrayList<MenuItem> {
        val menuItem = ArrayList<MenuItem>()

        menuItem.add(
            MenuItem(
                "Ac Repair",
                R.drawable.ic_airconditioner,
                R.drawable.bg_category_1,
            )
        )
        menuItem.add(
            MenuItem(
                "Beauty",
                R.drawable.ic_beauty,
                R.drawable.bg_category_2,
            )
        )
        menuItem.add(
            MenuItem(
                "Appliance",
                R.drawable.ic_appliance,
                R.drawable.bg_category_3,
            )
        )
        menuItem.add(
            MenuItem(
                "Painting",
                R.drawable.ic_airconditioner,
                R.drawable.bg_category_4,
            )
        )
        menuItem.add(
            MenuItem(
                "Ac Repair",
                R.drawable.ic_airconditioner,
                R.drawable.bg_category_5,
            )
        )
        menuItem.add(
            MenuItem(
                "Beauty",
                R.drawable.ic_beauty,
                R.drawable.bg_category_6,
            )
        )
        menuItem.add(
            MenuItem(
                "Appliance",
                R.drawable.ic_appliance,
                R.drawable.bg_category_7,
            )
        )
        menuItem.add(
            MenuItem(
                "Painting",
                R.drawable.ic_airconditioner,
                R.drawable.bg_category_8,
            )
        )
        menuItem.add(
            MenuItem(
                "Painting",
                R.drawable.ic_airconditioner,
                R.drawable.bg_category_9,
            )
        )
        return menuItem
    }

    fun generateDummyService(): ArrayList<ServiceItem> {
        val serviceItem = ArrayList<ServiceItem>()

        serviceItem.add(
            ServiceItem(
                "Home Cleaning",
                "Home",
                0,
                R.drawable.img_wash,
            )
        )
        serviceItem.add(
            ServiceItem(
                "Carpet Cleaning",
                "Carpet",
                10,
                R.drawable.img_cleaning,
            )
        )
        serviceItem.add(
            ServiceItem(
                "Bedroom Cleaning",
                "Bedroom",
                0,
                R.drawable.img_cleaning,
            )
        )
        serviceItem.add(
            ServiceItem(
                "Bathroom Cleaning",
                "Bathroom",
                12,
                R.drawable.img_wash,
            )
        )
        return serviceItem
    }
}