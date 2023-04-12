import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemFilmBinding
import com.example.myapplication.models.Filmmodel

class FilmAdapter(private var listModel: MutableList<Filmmodel>,
private val OnitemClick : (detail : Filmmodel)->Unit) : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val binding = ItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FilmViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listModel.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val model = listModel[position]
        holder.bind(model)
    }

    inner class FilmViewHolder(private val binding: ItemFilmBinding) : RecyclerView.ViewHolder(binding.root) {
        init {

            itemView.setOnClickListener {
                OnitemClick(listModel[adapterPosition])
            }
        }

        fun bind(model: Filmmodel) {
            binding.apply {
                Glide.with(binding.imageItem).load(model.image).into(binding.imageItem)
                binding.txtFilmItem.text = model.name
            }
        }
    }
}