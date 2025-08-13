package com.smktunas.app4_recycleview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BukuAdapter(private val context: Context, private val bukuList: List<Buku>) :
    RecyclerView.Adapter<BukuAdapter.BukuViewHolder>() {

    class BukuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvJudul: TextView = view.findViewById(R.id.tvJudul)
        val tvPenulis: TextView = view.findViewById(R.id.tvPenulis)
        val tvTahun: TextView = view.findViewById(R.id.tvTahun)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_buku, parent, false)
        return BukuViewHolder(view)
    }

    override fun onBindViewHolder(holder: BukuViewHolder, position: Int) {
        val buku = bukuList[position]
        holder.tvJudul.text = buku.judul
        holder.tvPenulis.text = buku.penulis
        holder.tvTahun.text = buku.tahun

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("judul", buku.judul)
            intent.putExtra("penulis", buku.penulis)
            intent.putExtra("tahun", buku.tahun)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return bukuList.size
    }
}
