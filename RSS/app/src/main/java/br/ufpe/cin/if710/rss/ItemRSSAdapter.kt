package br.ufpe.cin.if710.rss

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.itemlista.view.*

class ItemRSSAdapter(private val items: List<ItemRSS>, private val c : Context)
    : RecyclerView.Adapter<ItemRSSAdapter.ViewHolder>(){

    override fun getItemCount() : Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(c).inflate(R.layout.itemlista, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val i = items.get(position)
        holder?.title?.text = i.title
        holder?.pubDate?.text = i.pubDate
    }

    class ViewHolder(item: View): RecyclerView.ViewHolder(item), View.OnClickListener{
        val title = item.item_titulo
        val pubDate = item.item_data

        init {
            item.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}
