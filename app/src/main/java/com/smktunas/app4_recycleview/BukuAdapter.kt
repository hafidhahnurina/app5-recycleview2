package com.smktunas.app4_recycleview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView

class BukuAdapter(
    private val context: Context,
    private val bukuList: MutableList<Buku>
) : RecyclerView.Adapter<BukuAdapter.BukuViewHolder>() {

    class BukuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvJudul: TextView = view.findViewById(R.id.tvJudul)
        val tvPenulis: TextView = view.findViewById(R.id.tvPenulis)
        val tvTahun: TextView = view.findViewById(R.id.tvTahun)
        val btnHapus: Button = view.findViewById(R.id.btnHapus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_buku, parent, false)
        return BukuViewHolder(view)
    }

    override fun onBindViewHolder(holder: BukuViewHolder, position: Int) {
        val buku = bukuList[position]
        holder.tvJudul.text = buku.judul
        holder.tvPenulis.text = buku.penulis
        holder.tvTahun.text = buku.tahun

        // Klik item → buka detail + Toast
        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Buku dipilih: ${buku.judul}",
                Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("judul", buku.judul)
                putExtra("penulis", buku.penulis)
                putExtra("tahun", buku.tahun)
            }
            context.startActivity(intent)
        }

        // Klik tombol hapus → dialog konfirmasi
        holder.btnHapus.setOnClickListener {
            val context = holder.itemView.context
            AlertDialog.Builder(context)
                .setTitle("Konfirmasi Hapus")
                .setMessage("Yakin ingin menghapus '${buku.judul}'?")
                .setPositiveButton("Ya") { _, _ ->
                    bukuList.removeAt(position)
                    notifyItemRemoved(position)
                    notifyItemRangeChanged(position, bukuList.size)
                    Toast.makeText(context, "Buku dihapus", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Batal", null)
                .show()
        }
    }

    override fun getItemCount(): Int = bukuList.size
}
