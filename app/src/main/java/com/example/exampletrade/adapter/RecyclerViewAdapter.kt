package com.example.exampletrade.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.example.Item
import com.example.exampletrade.R
import kotlinx.android.synthetic.main.row_layout.view.*

class RecyclerViewAdapter(private val tradeList: ArrayList<Item>, private val listener: Listener) : RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {

    private val colors: String = "#a67564"
    private val dbTotalWal: Double=0.0

    interface Listener {
        fun onItemClick(cryptoModel: Item)
    }

    class RowHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(tradeListModel: Item, dbTotalWal:Double, colors:String, position: Int, listener: Listener) {
            var db:Double=0.0
            var dbTotalWal: Double=0.0
            itemView.setOnClickListener {
                listener.onItemClick(tradeListModel)
            }
            itemView.setBackgroundColor(Color.parseColor(colors))
            itemView.symbolIdTxt.text = tradeListModel.Symbol
            itemView.Qty_T2Txt.text = tradeListModel.QtyT2.toString()
            itemView.LastPxTxt.text = tradeListModel.LastPx.toString()
            db = (tradeListModel.QtyT2?.toDouble() ?: 0.0) * tradeListModel.LastPx!!
            itemView.totalTxt.text = db.toString()
            dbTotalWal += db
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return RowHolder(view)
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.bind(tradeList[position], dbTotalWal, colors, position, listener)
    }

    override fun getItemCount(): Int {
        return tradeList.count()
    }
}