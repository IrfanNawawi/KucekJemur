package id.heycoding.kucekjemur.presentation.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.heycoding.kucekjemur.R
import id.heycoding.kucekjemur.data.remote.model.response.ServiceItem
import id.heycoding.kucekjemur.databinding.ItemCleaningBinding
import id.heycoding.kucekjemur.presentation.servicedetail.ServiceDetailActivity


/**
 * Created by Irfan Nawawi on 02/03/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
class HomeCleaningAdapter : RecyclerView.Adapter<HomeCleaningAdapter.CleaningViewHolder>() {
    private var listService = ArrayList<ServiceItem>()

    fun setServiceItem(serviceItem: List<ServiceItem>?) {
        if (serviceItem == null) return
        this.listService.clear()
        this.listService.addAll(serviceItem)
    }

    inner class CleaningViewHolder(private val binding: ItemCleaningBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(serviceItem: ServiceItem) {
            with(binding) {
                Glide.with(itemView.context).load(serviceItem.banner).apply(
                    RequestOptions.placeholderOf(
                        R.drawable.ic_loading
                    ).error(R.drawable.ic_error)
                ).into(imgCleaningBanner)
                tvCleaningCategory.text = serviceItem.name
                if (serviceItem.promo > 0) {
                    tvCleaningPromo.visibility = View.VISIBLE
                    tvCleaningPromo.text = "${serviceItem.promo}% OFF"
                } else {
                    tvCleaningPromo.visibility = View.GONE
                }
                itemView.setOnClickListener {
                    itemView.context.startActivity(
                        Intent(
                            itemView.context,
                            ServiceDetailActivity::class.java
                        )
                    )
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CleaningViewHolder {
        val itemCleaningBinding = ItemCleaningBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CleaningViewHolder(itemCleaningBinding)
    }

    override fun getItemCount(): Int = listService.size

    override fun onBindViewHolder(holder: CleaningViewHolder, position: Int) {
        val services = listService[position]
        holder.bind(services)
    }
}

interface HomeCleaningAdapterClickListener {
    fun onCleaningServiceDetail(serviceItem: ServiceItem)
}