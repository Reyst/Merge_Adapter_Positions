package gsihome.reyst.mergeadapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextViewVH(
    itemView: View,
    itemClickListener: (Int) -> Unit
) : RecyclerView.ViewHolder(itemView) {

    init {
        itemView.setOnClickListener {
            itemClickListener(absoluteAdapterPosition)
            Log.wtf("INSPECT", "adapterPosition: $adapterPosition")
            Log.wtf("INSPECT", "bindingAdapterPosition: $bindingAdapterPosition")
        }
    }

    private val textView: TextView by lazy { itemView.item_text }

    @SuppressLint("SetTextI18n")
    fun bind(id: Int, position: Int) {
        textView.text = "ID: $id, position: $position"
    }

}