package gsihome.reyst.mergeadapter

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TestAdapter(
    private val id: Int,
    private val amount: Int
) : RecyclerView.Adapter<TextViewVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewVH {
        val itemView = parent.inflate(R.layout.item_view)
        return TextViewVH(itemView) { Log.wtf("INSPECT", "absoluteAdapterPosition: $it") }
    }

    override fun getItemCount(): Int = amount

    override fun onBindViewHolder(holder: TextViewVH, position: Int) {
        holder.bind(id, position)
    }
}