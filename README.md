# Project RecycleView
Ini adalah proyek sederhana untuk belajar RecyclerView menggunakan Git & Android Studio

Apa itu API?
API adalah singkatan dari Application Programming Interface.
Sederhananya, API adalah perantara (jembatan) yang memungkinkan satu aplikasi berkomunikasi atau bertukar data dengan aplikasi lain.

## 👥 Tim 
1. Aditya Rasya Dafa Putra (01)
2. Amelia Nur Auni (02)
3. Brian Putra Muta'fif (07)
4. Hafidhah Nurina Amajida (16)

## 📱 Fitur
- RecyclerView
- GSON
- Retrofit
- Glide


## 🔧 Teknologi
- Kotlin
- Android Studio
- Git & Github

## 📁 Folder yang digunakan untuk menyimpan code
<img width="329" height="613" alt="Screenshot 2025-08-21 205949" src="https://github.com/user-attachments/assets/fc62c9b9-0ef7-4661-9e59-8c11f439848e" />
<img width="329" height="613" alt="Screenshot 2025-08-21 210156" src="https://github.com/user-attachments/assets/3bf5b53d-ecc1-4971-8957-42adeaa0a91c" />



## 💻 Code Penting
### 1. build.gradle.kts (module :app)
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/c7000ad1-2cd2-436e-90c2-a44b5693d907" />

#### Penjelasan:
##### 1. Menambahkan RacycleView yaitu komponen untuk menampilkan(List/grid)dengan performa tinggi.
##### 2. Menambahkan CardView untuk menampilkan konten dalam bentuk kartu dengan efek shadow dan rounded corner.
##### 3. Menambahkan Retrofit Library untuk komunikasi dengan API/HTTP(ambil data dari internet dengan mudah).
##### 4. Converter tambahkan untuk Retrofit supaya bisa otomatis mengubah JSON -> objek java/kotlin menggunakan Gson
##### 5. Menambahkan Glide library untuk load dan caching gambar dari internet atau lokal ke imageview dengan efisien.

### 2. activity_splash_screen.xml
<img width="613" height="329" alt="Screenshot 2025-08-21 211432" src="https://github.com/user-attachments/assets/d2a85f5e-4462-468a-96b1-c93ff691d1a9" />

#### Penjelasan:
##### Menggunakan ConstraintLayout agar posisi elemen fleksibel. Hanya ada 1 ImageView untuk menampilkan gambar buku sebagai logo splash screen. Gambar ditempatkan hampir di tengah, tapi agak ke atas.
##### 1. Root Layout
##### - ConstraintLayoutandroid:id="@+id/main".
##### - Lebar (match_parent) dan tinggi (match_parent) → memenuhi seluruh layar.
##### - Tools:context=".SplashScreen" → menghubungkan layout ini dengan kelas SplashScreen.

##### 2. ImageView
##### - @+id/imageView → memberi ID untuk dipanggil di kode Kotlin/Java.
##### - Layout_width="160dp" & layout_height="260dp" → ukuran gambar tetap.
##### - Src="@drawable/buku" → gambar yang ditampilkan berasal dari folder drawable dengan nama file buku.png/jpg.
##### - Constraint (atas, bawah, kiri, kanan) ke parent → gambar diposisikan di tengah layar.
##### - Bias → menentukan posisi relatif di sumbu horizontal (0 = kiri, 1 = kanan) dan vertikal (0 = atas, 1 = bawah).
##### - Horizontal_bias="0.498" ≈ tengah horizontal.
##### - Vertical_bias="0.306" → agak lebih ke atas, bukan tepat di tengah.

   
### 3. activity_main.xml
<img width="613" height="329" alt="Screenshot 2025-08-21 212014" src="https://github.com/user-attachments/assets/a0743777-2dd1-47c2-94cd-80ade6890b34" />

#### Penjelasan : 
##### Membuat halaman utama (Main Activity) yang berisi RecyclerView nantinya akan dipakai untuk menampilkan daftar data (misalnya daftar buku, produk, berita, dll.) dengan tampilan rapi, scrollable, dan efisien.
###### 1. LinearLayout (Root Layout)
######   - Match_parent → memenuhi layar penuh.
######   - Orientation="vertical" → susunan elemen di dalamnya secara vertikal (atas ke bawah).
######   - Padding="8dp" → memberi jarak ke dalam (supaya tidak mepet ke tepi layar).
######   - Background="#E3F2FD" → memberi warna biru muda sebagai latar belakang.
###### 2. RecyclerView
######   - ID: @+id/recyclerView → supaya bisa dipanggil di Kotlin/Java untuk menampilkan data.
######   - Menampilkan daftar (list/grid) dengan performa tinggi, bisa untuk data dari API, database, atau array.
######   - Lebar & tinggi match_parent → RecyclerView memenuhi sisa ruang layar.

### 4. item_buku.xml
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/4dc833ae-9a24-4553-9e16-545812521d7c" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/7cab639b-b382-426b-8053-58b34aa3993d" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/283259a7-8a08-4bfc-b9ed-a790bc3ff618" />

#### Penjelasan : 
##### 1. <androidx.cardview.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android" --> Ini bikin CardView dari AndroidX. CardView itu kayak kotak dengan sudut tumpul dan bayangan, biasanya dipakai buat nampilin data biar rapi.
##### 2. xmlns:card_view="http://schemas.android.com/apk/res-auto" --> Ini deklarasi namespace buat atribut khusus CardView, contohnya cardCornerRadius dan cardElevation.
##### 3. android:layout_width="match_parent"
##### 4. android:layout_height="wrap_content"
##### 5. layout_width="match_parent" → Lebarnya ngikutin lebar layar atau parent-nya.
##### 6. layout_height="wrap_content" → Tingginya ngikutin isi di dalamnya.
##### 7. android:layout_margin="8dp" --> Ngasih jarak ke luar CardView sebesar 8dp dari semua sisi.
##### 8. card_view:cardCornerRadius="8dp" --> Buat sudut CardView melengkung/tumpul sebesar 8dp.
##### 9. card_view:cardElevation="4dp"> --> Ngasih efek bayangan di bawah CardView setinggi 4dp, biar keliatan kayak timbul.
##### 10. <LinearLayout
#####     android:layout_width="match_parent"
#####     android:layout_height="match_parent"
#####     android:orientation="horizontal"
#####     android:padding="8dp">
#####     --> LinearLayout ini dipakai buat nyusun elemen di dalam CardView. orientation="horizontal" → isinya disusun ke samping kiri-kanan. padding="8dp" → jarak di dalam layout dari pinggir ke isi.
##### 11. <ImageView
#####     android:id="@+id/ivCover"
#####     android:layout_width="79dp"
#####     android:layout_height="97dp" />
#####     --> ImageView buat nampilin gambar cover buku. id="@+id/ivCover" → ID ini dipakai di Java/Kotlin buat akses gambar ini. Ukurannya 79dp x 97dp.
##### 12. <LinearLayout
#####     android:layout_width="305dp"
#####     android:layout_height="97dp"
#####     android:layout_weight="1"
#####     android:orientation="vertical"
#####     android:paddingStart="8dp">
#####     --> LinearLayout ini buat nampung teks buku (judul, penulis, tahun). orientation="vertical" → teks disusun dari atas ke bawah. paddingStart="8dp" → jarak dari kiri (setelah gambar) ke teks 8dp. layout_weight="1" → ngatur pembagian ruang biar fleksibel (walaupun di sini udah fix 305dp).
##### 13. <TextView
#####     android:id="@+id/tvJudul"
#####     android:layout_width="wrap_content"
#####     android:layout_height="wrap_content"
#####     android:text="Judul Buku"
#####     android:textSize="18sp"
#####     android:textStyle="bold" />
#####     --> TextView buat nampilin judul buku. Teksnya tebal (bold) dan ukurannya 18sp.
##### 14. <TextView
#####     android:id="@+id/tvPenulis"
#####     android:layout_width="wrap_content"
#####     android:layout_height="wrap_content"
#####     android:text="Penulis" />
#####     --> TextView ini buat nampilin nama penulis.
##### 15. <TextView
#####     android:id="@+id/tvTahun"
#####     android:layout_width="wrap_content"
#####     android:layout_height="wrap_content"
#####     android:text="Tahun Terbit" />
#####     --> TextView ini buat nampilin tahun terbit buku.
##### 16. </LinearLayout>
#####     </androidx.cardview.widget.CardView>
#####     --> Nutup tag LinearLayout dan CardView.

### 5. activity_detail.xml
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/61677746-a903-47ab-948b-4cf56fbce02c" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/a0a25fcb-1b76-431e-be5b-6d5efe96f9ea" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/6f9bd2b8-4199-4700-a1e2-b52556d5f8cc" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/e50066f8-0f5e-48e6-a7ad-0ea2911076a2" />

#### Penjelasan : 
##### 1. <?xml version="1.0" encoding="utf-8"?> --> Ini baris standar di file XML Android. Isinya info kalau file ini pakai format XML dengan encoding UTF-8.
##### 2. <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" --> Ini bikin layout utama yang isinya tersusun secara linear (atas–bawah atau kiri–kanan).
##### 3. xmlns:app="http://schemas.android.com/apk/res-auto" --> Ini namespace tambahan (app:) yang biasanya dipakai buat atribut custom dari library atau AndroidX.
##### 4. android:layout_width="match_parent"
#####    android:layout_height="match_parent"
#####    match_parent → lebar dan tinggi layout ngikutin ukuran layar penuh.
##### 5. android:orientation="vertical" --> Ngatur isi layout biar tersusun dari atas ke bawah.
##### 6. android:padding="20dp" --> Ngasih jarak di dalam layout dari pinggir ke isi sebesar 20dp.
##### 7. android:gravity="center_horizontal" --> Ngatur semua isi biar posisinya rata tengah secara horizontal.
##### 8. android:background="#FAFAFA"> --> Ngasih warna latar belakang layout jadi abu-abu sangat terang (#FAFAFA).
##### 9. <ImageView
#####    android:id="@+id/ivCoverDetail"
#####    android:layout_width="368dp"
#####    android:layout_height="413dp"
#####    android:layout_margin="20dp" />
#####    --> ImageView buat nampilin gambar cover buku.
##### 10. id="@+id/ivCoverDetail" → biar bisa diakses di Java/Kotlin. Ukurannya 368dp x 413dp dan ada jarak 20dp dari semua sisi.
##### 11. <TextView
#####     android:id="@+id/tvJudulDetail"
#####     android:layout_width="wrap_content"
#####     android:layout_height="wrap_content"
#####     android:layout_marginBottom="10dp"
#####     android:text="Judul Buku"
#####     android:textColor="#000000"
#####     android:textSize="24sp"
#####     android:textStyle="bold" />
#####     --> TextView buat nampilin judul buku. Tulisannya warna hitam, ukuran 24sp, dan tebal. Ada jarak bawah 10dp biar nggak terlalu nempel ke elemen berikutnya.
##### 12. <TextView
#####     android:id="@+id/tvPenulisDetail"
#####     android:layout_width="wrap_content"
#####     android:layout_height="wrap_content"
#####     android:text="Penulis"
#####     android:textSize="18sp"
#####     android:textColor="#444444"
#####     android:layout_marginBottom="8dp" />
#####     --> Buat nampilin nama penulis. Ukuran teks 18sp, warna abu-abu tua (#444444). Ada jarak bawah 8dp.
##### 13. <TextView
#####     android:id="@+id/tvTahunDetail"
#####     android:layout_width="wrap_content"
#####     android:layout_height="wrap_content"
#####     android:text="Tahun Terbit"
#####     android:textSize="16sp"
#####     android:textColor="#666666"
#####     android:layout_marginBottom="20dp" />
#####     --> Nampilin tahun terbit buku. Ukuran teks 16sp, warna abu-abu sedang (#666666). Jarak bawahnya lumayan besar (20dp).
##### 14. <FrameLayout
#####     android:layout_width="match_parent"
#####     android:layout_height="match_parent">
#####     --> FrameLayout dipakai buat menumpuk elemen di atas satu sama lain. Di sini dipakai supaya tombol bisa diatur posisinya di bawah.
##### 15. <Button
#####     android:id="@+id/btKembali"
#####     android:layout_width="wrap_content"
#####     android:layout_height="wrap_content"
#####     android:backgroundTint="#2196F3"
#####     android:text="Kembali"
#####     android:textColor="#FFFFFF"
#####     android:layout_gravity="bottom|start"
#####     android:layout_margin="16dp"/>
#####     --> Button buat tombol kembali. Warna latar biru (#2196F3), teks putih (#FFFFFF). layout_gravity="bottom|start" → posisinya di pojok kiri bawah. Ada jarak dari tepi 16dp.
##### 16. </FrameLayout> --> Nutup FrameLayout.
##### 17. </LinearLayout> --> Nutup layout utama (LinearLayout).

### 6. BukuAdapter.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/562e34b3-1124-46c5-924a-8cd1c85e525a" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/96cb1e2d-515e-47d9-be15-7d615d793e62" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/dbc27208-f18b-4888-b3ab-d19e1b274f87" />

#### Penjelasan : BukuAdapter adalah kelas yang menghunungkan data list buku dengan tampilan item di RecycleView. setiap Buku akan ditampilkan di layout item_buku.xml
##### 1. package com.smktunas.app4_recycleview.adapter --> Menunjukkan lokasi file ini di dalam project. Jadi file ini ada di folder adapter dalam project app4_recycleview.
##### 2. import android.content.Context
#####    import android.content.Intent
#####    import android.view.LayoutInflater
#####    import android.view.View
#####    import android.view.ViewGroup
#####    import android.widget.Button
#####    import android.widget.ImageView
#####    import android.widget.TextView
#####    import android.widget.Toast
#####    import androidx.appcompat.app.AlertDialog
#####    import androidx.recyclerview.widget.RecyclerView
#####    import com.bumptech.glide.Glide
#####    import com.smktunas.app4_recycleview.DetailActivity
#####    import com.smktunas.app4_recycleview.R
#####    import com.smktunas.app4_recycleview.model.Buku
#####    --> Import ini kayak daftar barang yang mau dipakai di kode. Ada library Android (TextView, ImageView, Toast, dll), RecyclerView buat list, Glide buat load gambar dari URL, AlertDialog buat pop-up konfirmasi, DetailActivity sebagai halaman detail buku, R untuk akses layout dan resource, Buku sebagai model data buku.
##### 3. class BukuAdapter(
#####      private val listBuku: List<Buku>
#####    ) : RecyclerView.Adapter<BukuAdapter.BukuViewHolder>() {
#####    --> BukuAdapter adalah kelas adapter untuk RecyclerView. listBuku → daftar data buku yang mau ditampilkan. RecyclerView.Adapter<BukuAdapter.BukuViewHolder> artinya adapter ini bakal pakai ViewHolder yang namanya BukuViewHolder.
##### 4. class BukuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
#####    val tvJudul: TextView = view.findViewById(R.id.tvJudul)
#####    val tvPenulis: TextView = view.findViewById(R.id.tvPenulis)
#####    val ivCover: ImageView = itemView.findViewById(R.id.ivCover)
#####    val tvTahun: TextView = itemView.findViewById(R.id.tvTahun)
#####    //val btnHapus: Button = view.findViewById(R.id.btnHapus)
#####    }
#####    --> BukuViewHolder adalah wadah untuk menyimpan view dari setiap item buku. tvJudul → TextView untuk judul buku. tvPenulis → TextView untuk penulis buku. ivCover → ImageView untuk gambar cover buku. tvTahun → TextView untuk tahun terbit buku. btnHapus → tombol hapus (sementara di-comment).
##### 5. override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuViewHolder {
#####       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_buku, parent, false)
#####    rn BukuViewHolder(view)
#####    }
#####    --> Dipanggil saat RecyclerView butuh item baru. LayoutInflater → ngubah XML (item_buku.xml) jadi objek View. BukuViewHolder(view) → bungkus View itu ke dalam ViewHolder.
##### 6. override fun onBindViewHolder(holder: BukuViewHolder, position: Int) {
#####    val buku = listBuku[position]
#####    holder.tvJudul.text = buku.judul
#####    holder.tvPenulis.text = buku.penulis
#####    holder.tvTahun.text = buku.tahun
#####    Glide.with(holder.itemView.context)
#####    .load(buku.cover)
#####    .into(holder.ivCover)
#####    onBindViewHolder → dipanggil buat ngisi data ke tampilan sesuai posisi di list. buku = listBuku[position] → ambil buku sesuai urutan. tvJudul.text → isi teks judul buku. tvPenulis.text → isi teks penulis. tvTahun.text → isi tahun terbit. Glide → ambil gambar dari URL buku.cover terus masukin ke ivCover.
##### 7. // Klik item → buka detail + Toast
#####    holder.itemView.setOnClickListener {
#####    val context = holder.itemView.context
#####    AlertDialog.Builder(context)
#####       .setTitle("Pilih Buku?")
#####       .setMessage("Apakah kamu ingin membuka detail buku \"${buku.judul}\"?")
#####       .setPositiveButton("Ya"){ dialog, _ ->
#####           Toast.makeText(context, "Kamu Membuka: ${buku.judul}", Toast.LENGTH_SHORT).show()
#####           val intent = Intent(context, DetailActivity::class.java).apply {
#####               putExtra("judul", buku.judul)
#####               putExtra("penulis", buku.penulis)
#####               putExtra("tahun", buku.tahun)
#####               putExtra("cover", buku.cover)
#####           }
#####           context.startActivity(intent)
#####           dialog.dismiss()
#####       }
#####       .setNegativeButton("Batal") { dialog, _ ->
#####           dialog.dismiss()
#####       }
#####       .show()
#####    }
#####    --> Klik item → muncul pop-up konfirmasi. Kalau pilih "Ya": Tampil Toast "Kamu Membuka: [Judul]". Buat Intent ke DetailActivity sambil bawa data buku (judul, penulis, tahun, cover). Pindah halaman ke DetailActivity. Kalau pilih "Batal" → dialog ditutup tanpa aksi.
##### 8. override fun getItemCount(): Int = listBuku.size --> Ngasih tau berapa jumlah item di daftar buku, diambil dari listBuku.size.
##### 9. } --> Nutup kelas BukuAdapter.

### 7. Buku.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/5459253d-722e-4150-9e00-bae99e980f8a" />

#### Penjelasan : 
##### 1. package com.smktunas.app4_recycleview.model --> Nunjukin lokasi file ini di project. File ini ada di folder model dalam project app4_recycleview. package ini juga berguna biar kode rapi dan nggak bentrok sama file lain.
##### 2. data class Buku(
#####    data class → tipe kelas khusus di Kotlin yang otomatis bikin fungsi seperti:
##### 3. toString() → buat ngeprint isi objek,
##### 4. equals() → buat cek kesamaan dua objek,
##### 5. hashCode() → buat hashing,
##### 6. copy() → buat bikin salinan objek.
##### 7. Buku → nama kelas yang mewakili 1 data buku.
##### 8. val id: Int,
#####    --> nilai ini nggak bisa diubah setelah diisi. id: Int → ID buku dalam bentuk angka integer.
##### 9. val judul: String,
#####    --> judul: String → judul buku, disimpan dalam bentuk teks.
##### 10. val penulis: String,
#####     --> penulis: String → nama penulis buku, bentuk teks.
##### 11. val tahun: String,
#####     --> tahun: String → tahun terbit buku, bentuk teks. (Kenapa teks, bukan Int? Karena tahun kadang ditulis lengkap seperti "2024" atau dengan format lain.)
##### 12. val cover: String
#####     --> cover: String → link atau path gambar cover buku, bentuk teks.
##### 13. )n--> Nutup definisi kelas Buku.


### 8. ApiService.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/5509e963-7f51-4cf0-8ed7-dddb64d51e3e" />

#### Penjelasan :
#### 1. package com.smktunas.app4_recycleview.utils --> Nunjukin lokasi file ini di project. File ini ada di folder utils di project app4_recycleview. Package ini dipakai biar kode rapi dan gampang dicari.
#### 2. import com.smktunas.app4_recycleview.model.Buku --> Import class Buku dari folder model. Dipakai supaya hasil data dari API bisa dimasukin ke dalam bentuk objek Buku.
#### 3. import retrofit2.Call --> Import Call dari Retrofit. Call ini adalah wadah untuk request HTTP dan menunggu respons dari server.
#### 4. import retrofit2.http.GET --> Import anotasi @GET dari Retrofit. Dipakai buat ngasih tau kalau request API ini pakai metode GET (ngambil data, bukan ngirim).
#### 5. interface ApiService {
####    --> Bikin interface (kontrak kode) bernama ApiService. Interface ini isinya daftar fungsi yang ngatur request API.
#### 6. @GET(".") --> Anotasi @GET → ngasih tau ini request GET. "." artinya minta data dari endpoint utama (base URL aja). Contohnya kalau base URL https://example.com/, berarti request akan ke https://example.com/.
#### 7. fun getBuku(): Call<List<Buku>>
####    --> fun getBuku() → nama fungsi buat ngambil semua data buku.
#### 8. Call<List<Buku>> → artinya hasil respons dari API akan berupa list (daftar) objek Buku.
#### 9. } --> Nutup interface ApiService.

### 9. RetrofitClient.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/7d462b3f-ea16-47e3-867e-daf1d248e027" />

#### Penjelasan : 
##### 1. package com.smktunas.app4_recycleview.utils --> Nunjukin lokasi file ini di dalam project. File ini ada di folder utils di project app4_recycleview.
##### 2. import retrofit2.Retrofit
#####    import retrofit2.converter.gson.GsonConverterFactory
#####    Import Retrofit → library buat komunikasi ke server API.
#####    --> Import GsonConverterFactory → biar data JSON dari API bisa otomatis diubah jadi objek Kotlin.
##### 3. object RetrofitClient {
#####    --> Bikin object (singleton) bernama RetrofitClient. Singleton itu artinya cuma ada 1 instance di seluruh aplikasi, jadi hemat memori.
##### 4. private const val BASE_URL = "https://api.abdyllaan.cc/buku/"
#####    --> BASE_URL → alamat dasar (root) API. private → cuma bisa dipakai di file ini. const → nilainya tetap dan nggak bisa diubah.
##### 5. val instance: ApiService by lazy {
#####    --> instance → ini yang nanti dipakai buat akses API di seluruh aplikasi. by lazy → objek ini baru dibuat kalau pertama kali dipanggil, biar nggak boros memori.
##### 6. val retrofit = Retrofit.Builder()
#####      .baseUrl(BASE_URL)
#####      .addConverterFactory(GsonConverterFactory.create())
#####      .build()
#####    --> Retrofit.Builder() → mulai bikin objek Retrofit. .baseUrl(BASE_URL) → kasih tahu alamat dasar API. .addConverterFactory(GsonConverterFactory.create()) → pasang converter biar JSON dari API otomatis diubah jadi objek Kotlin. .build() → nyelesaikan pembuatan Retrofit.
##### 7. retrofit.create(ApiService::class.java) --> Bikin implementasi dari ApiService (interface yang kita bikin sebelumnya). Ini yang nanti dipakai buat memanggil fungsi API, seperti getBuku().
##### 8. } --> Nutup blok by lazy.
##### 9. } --> Nutup object RetrofitClient.

### 10. DetailActivity.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/06434c95-d229-463a-b77a-624e7c9a9a0f" />
<img width="613" height="329 alt="image" src="https://github.com/user-attachments/assets/cbbfefac-b86d-48be-804a-b365f33dd63f" />

#### Penjelasan :
##### 1. package com.smktunas.app4_recycleview --> Menunjukkan lokasi file di dalam project. File ini ada di package com.smktunas.app4_recycleview.
##### 2. import android.os.Bundle
#####    import android.widget.Button
#####    import android.widget.ImageView
#####    import android.widget.TextView
#####    import androidx.appcompat.app.AppCompatActivity
#####    import com.bumptech.glide.Glide
#####    --> Bundle → buat nerima dan nyimpen data sementara saat Activity dibuka. Button, ImageView, TextView → komponen UI yang ada di XML. AppCompatActivity → kelas dasar untuk Activity di Android. Glide → library buat load gambar dari URL ke ImageView.
##### 3. class DetailActivity : AppCompatActivity() {
#####    --> Bikin class DetailActivity yang merupakan Activity untuk nampilin detail buku. : AppCompatActivity() artinya class ini adalah turunan dari AppCompatActivity.
##### 4. override fun onCreate(savedInstanceState: Bundle?) {
#####    --> Fungsi onCreate() dipanggil pertama kali saat Activity ini dibuka. savedInstanceState bisa nyimpen data kalau Activity di-restart.
##### 5.super.onCreate(savedInstanceState) --> Manggil fungsi onCreate() dari class induknya (AppCompatActivity). Wajib dipanggil biar Activity bisa jalan normal.
##### 6. setContentView(R.layout.activity_detail) --> Ngatur layout Activity ini supaya pake file XML activity_detail.xml. Semua komponen UI yang dipanggil nanti ada di layout ini.
##### 7. window.statusBarColor = getColor(R.color.black) --> Ganti warna status bar HP jadi hitam (black).
##### 8. val tvJudul: TextView = findViewById(R.id.tvJudulDetail)
#####    val tvPenulis: TextView = findViewById(R.id.tvPenulisDetail)
#####    val tvTahun: TextView = findViewById(R.id.tvTahunDetail)
#####    val ivCover: ImageView = findViewById(R.id.ivCoverDetail)
#####    --> Ngelink variable Kotlin (tvJudul, tvPenulis, tvTahun, ivCover) dengan komponen yang ada di XML lewat findViewById(). Supaya kita bisa atur teks dan gambar dari Kotlin.
##### 9. tvJudul.text = intent.getStringExtra("judul")
#####    tvPenulis.text = intent.getStringExtra("penulis")
#####    tvTahun.text = intent.getStringExtra("tahun")
#####    --> Ngambil data yang dikirim dari Activity sebelumnya (BukuAdapter) lewat Intent. "judul", "penulis", "tahun" → key untuk ngambil datanya. Lalu, data itu ditaruh ke TextView.
##### 10. Glide.with(this)
#####       .load(intent.getStringExtra("cover"))
#####       .into(ivCover)
#####     --> Pake Glide buat load gambar dari URL yang dikirim lewat Intent. .with(this) → konteks Activity sekarang. .load(...) → URL gambar yang mau dimuat. .into(ivCover) → taruh gambar ke ImageView ivCover.
##### 11. val btnKembali = findViewById<Button>(R.id.btKembali) --> Ngelink variable btnKembali dengan tombol di layout (btKembali).
##### 12. btnKembali.setOnClickListener {
#####       finish()
#####     } 
#####     --> Kalau tombol kembali ditekan → Activity ini ditutup (finish()), lalu balik ke Activity sebelumnya.
##### 13.    }
#####     } 
#####     --> Nutup onCreate() dan class DetailActivity.

### 11. MainActivity.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/c32695cd-ed0f-4d8a-b5b9-08e9ec2b7d5f" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/b032c713-e548-4f78-bafa-6cbdde479ae0" />

#### Penjelasan : 
##### 1. package com.smktunas.app4_recycleview --> Menandakan file ini ada di package com.smktunas.app4_recycleview di dalam project.
##### 2. import android.os.Bundle
#####    import android.widget.Toast
#####    import androidx.appcompat.app.AppCompatActivity
#####    import androidx.recyclerview.widget.LinearLayoutManager
#####    import androidx.recyclerview.widget.RecyclerView
#####    import com.smktunas.app4_recycleview.adapter.BukuAdapter
#####    import com.smktunas.app4_recycleview.model.Buku
#####    import com.smktunas.app4_recycleview.utils.RetrofitClient
#####    import retrofit2.Call
#####    import retrofit2.Callback
#####    import retrofit2.Response
#####    --> Bundle → nyimpen data saat Activity dibuat/di-restart. Toast → buat nampilin pesan kecil di layar. AppCompatActivity → kelas dasar Activity. LinearLayoutManager → ngatur susunan item RecyclerView jadi vertikal/horizontal. RecyclerView → komponen list yang bisa menampung banyak data. BukuAdapter → adapter buat nampilin data buku di RecyclerView. Buku → model data buku (judul, penulis, dll). RetrofitClient → koneksi API untuk ambil data. Call, Callback, Response → komponen dari Retrofit untuk proses request & respon API.
##### 3. class MainActivity : AppCompatActivity() {
#####    --> Bikin class MainActivity yang merupakan Activity utama, turunan dari AppCompatActivity.
##### 4. private lateinit var recyclerView: RecyclerView --> Deklarasi variabel recyclerView untuk nampung daftar buku. lateinit artinya variabelnya akan diinisialisasi nanti, bukan sekarang.
##### 5. override fun onCreate(savedInstanceState: Bundle?) {
#####    --> Fungsi onCreate() dipanggil saat Activity ini pertama kali dibuka.
##### 6. super.onCreate(savedInstanceState) --> Manggil onCreate() dari AppCompatActivity biar Activity berjalan normal.
##### 7. setContentView(R.layout.activity_main) --> Ngatur layout Activity ini pakai file activity_main.xml.
##### 8. window.statusBarColor = getColor(R.color.black) --> Mengubah warna status bar HP jadi hitam.
##### 9. recyclerView = findViewById(R.id.recyclerView) --> Ngambil komponen RecyclerView dari XML dan nyimpennya ke variabel recyclerView.
##### 10. recyclerView.layoutManager = LinearLayoutManager(this) --> Ngatur susunan item di RecyclerView jadi vertikal pakai LinearLayoutManager.
##### 11. RetrofitClient.instance.getBuku().enqueue(object : Callback<List<Buku>> {
#####       override fun onResponse(call: Call<List<Buku>>, response: Response<List<Buku>>) {
#####           if (response.isSuccessful) {
#####              recyclerView.adapter = BukuAdapter(response.body() ?: emptyList())
#####           }
#####       }
#####       override fun onFailure(call: Call<List<Buku>>, t: Throwable) {
#####          TODO("Not yet implemented")
#####          Toast.makeText(this@MainActivity, "Gagal: ${t.message}", Toast.LENGTH_LONG).show()
#####       }
#####     })
#####     --> Manggil API lewat RetrofitClient.instance.getBuku(). .enqueue(...) → jalankan request API secara asynchronous (tidak mengganggu UI). Baris 27 → onResponse dijalankan kalau API berhasil dibaca. Baris 28 → if (response.isSuccessful) cek apakah respons dari API sukses (status 200). Baris 29 → kalau sukses, pasang adapter BukuAdapter ke RecyclerView dengan data dari response.body(). ?: emptyList() artinya kalau datanya kosong/null, kasih list kosong biar tidak error. Baris 32 → onFailure dijalankan kalau API gagal diakses (misal koneksi jelek). Baris 33 → Toast.makeText(...) munculin pesan error di layar.
##### 12.   }
#####     }
#####     --> Menutup fungsi onCreate() dan class MainActivity.
     
### 12. SplashScreen.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/d8fa869e-cf52-4e04-9dff-9f6d3f239804" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/3485d54b-7dd8-47b5-82e2-4fae11ace636" />

#### Penjelasan : 
##### 1. package com.smktunas.app4_recycleview --> Menandakan file ini ada di package com.smktunas.app4_recycleview dalam project.
##### 2. import android.content.Intent
#####    import android.os.Bundle
#####    import android.os.Handler
#####    import android.os.Looper
#####    import androidx.activity.enableEdgeToEdge
#####    import androidx.appcompat.app.AppCompatActivity
#####    import androidx.core.view.ViewCompat
#####    import androidx.core.view.WindowInsetsCompat
#####    --> Intent → buat pindah dari satu Activity ke Activity lain. Bundle → nyimpen data sementara waktu Activity dibuat. Handler → buat ngejalanin kode dengan delay/waktu tunggu. Looper.getMainLooper() → nyuruh kode jalan di thread utama (UI thread). enableEdgeToEdge() → bikin layout bisa tampil penuh sampai pinggir layar (termasuk di area status bar). AppCompatActivity → class dasar Activity modern. ViewCompat & WindowInsetsCompat → buat atur padding biar layout nggak ketutup status bar/navigation bar.
##### 3. class SplashScreen : AppCompatActivity() {
#####    --> Bikin class SplashScreen yang merupakan Activity turunan dari AppCompatActivity.
##### 4. override fun onCreate(savedInstanceState: Bundle?) {
#####    --> Fungsi onCreate() dijalankan saat Activity pertama kali dibuat.
##### 5. super.onCreate(savedInstanceState) --> Manggil onCreate() dari AppCompatActivity biar Activity ini berjalan normal.
##### 6. enableEdgeToEdge() --> Bikin layout Activity ini tampil penuh sampai pinggir layar (edge-to-edge mode).
##### 7. setContentView(R.layout.activity_splash_screen) --> Ngatur tampilan Activity ini pakai layout activity_splash_screen.xml.
##### 8. ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
#####       val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
#####       v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
#####       insets
#####    }
#####    --> Ngatur padding otomatis biar isi layout nggak ketabrak sama status bar atau navigation bar. findViewById(R.id.main) → ambil view utama dari layout. getInsets(...) → ambil ukuran area status bar & navigation bar. setPadding(...) → kasih jarak di atas/bawah/kiri/kanan sesuai ukuran bar.
##### 9. Handler(Looper.getMainLooper()).postDelayed({
#####       startActivity(Intent(this, MainActivity::class.java))
#####       finish() }, 3000)
#####    --> Handler(...) → nyuruh kode dijalankan setelah waktu tertentu. Looper.getMainLooper() → memastikan kode ini jalan di thread utama (UI). postDelayed({...}, 3000) → jalanin kode di dalam {...} setelah 3 detik (3000 milidetik). startActivity(Intent(this, MainActivity::class.java)) → pindah dari SplashScreen ke MainActivity. finish() → nutup SplashScreen biar nggak bisa balik lagi pakai tombol back.
##### 10.   }
#####     }
#####     --> Menutup fungsi onCreate() dan class SplashScreen.

## 📸 Screenshot







































































