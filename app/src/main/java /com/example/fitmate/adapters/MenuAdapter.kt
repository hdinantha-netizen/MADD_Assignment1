package com.example.fitmate.adapters
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fitmate.databinding.ItemMenuCardBinding
import com.example.fitmate.models.MenuItem

class MenuAdapter(private val items: List<MenuItem>, private val onClick: (MenuItem) -> Unit)
    : RecyclerView.Adapter<MenuAdapter.VH>() {
    inner class VH(private val b: ItemMenuCardBinding) : RecyclerView.ViewHolder(b.root){
        fun bind(item: MenuItem){
            b.title.text = item.title
            b.subtitle.text = item.subtitle
            b.root.setOnClickListener{ onClick(item) }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val b = ItemMenuCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(b)
    }
    override fun getItemCount() = items.size
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])
}