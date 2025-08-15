# Project RecycleView
Ini adalah proyek sederhana untuk belajar RecyclerView menggunakan Git & Android Studio

## 👥 Tim 
1. Aditya Rasya Dafa Putra (01)
2. Amelia Nur Auni (02)
3. Brian Putra Muta'fif (07)
4. Hafidhah Nurina Amajida (16)

## 📱 Fitur
- Splash Screen
- RecyclerView
- Intent
- ToastDialog Box

## 🔧 Teknologi
- Kotlin
- Android Studio
- Git & Github

## 📁 Folder yang digunakan untuk menyimpan code
<img width="227" height="554" alt="Screenshot 2025-08-14 094855" src="https://github.com/user-attachments/assets/43a6dc14-631f-4e8d-ab82-3827e4704ea0" />

## 💻 Code Penting
### 1. AndroidManifest.xml
<img width="554" height="350" alt="Screenshot 2025-08-14 094951" src="https://github.com/user-attachments/assets/e1c433e4-f323-4bb8-942b-de5c67ca8faa" />

#### Penjelasan :
##### Kode di atas adalah file `AndroidManifest.xml` yang berfungsi sebagai "peta" aplikasi Android. Di dalamnya ada pengaturan utama aplikasi seperti nama, ikon, tema, dan aktivitas (halaman) yang akan dijalankan. Bagian `<application>` berisi informasi aplikasi, misalnya `android:icon` untuk logo, `android:label` untuk nama aplikasi, dan `android:theme` untuk tema tampilan. Aktivitas pertama yaitu `.SplashScreen` diberi intent-filter dengan `MAIN` dan `LAUNCHER`, artinya halaman ini yang pertama kali muncul saat aplikasi dibuka. Selain itu ada dua aktivitas lain yaitu `.MainActivity` dan `.DetailActivity` yang bisa dipanggil setelah splash screen. Jadi, manifest ini memastikan aplikasi punya urutan tampilan yang jelas dan data dasar aplikasi tersimpan dengan baik.


### 2. Buku.kt
<img width="554" height="350" alt="Screenshot 2025-08-14 095037" src="https://github.com/user-attachments/assets/9a0856e8-e4da-407f-8f10-c1f80d4f6fa4" />

#### Penjelasan :
##### a. package com.smktunas.app4_recycleview --> Baris ini menunjukkan nama package atau "folder besar" tempat file ini disimpan. Package fungsinya biar kode lebih rapi dan tidak bentrok dengan project lain.
##### b. data class Buku( --> Baris ini bikin data class bernama Buku. Data class itu kayak "template" khusus untuk nyimpen data. Beda dengan class biasa, data class otomatis punya fitur tambahan kayak toString, equals, dan hashCode.
##### c. val judul: String, --> Ini adalah properti (isi data) pertama dari Buku, namanya judul. Tipe datanya String, jadi yang disimpan harus berupa teks. val artinya datanya nggak bisa diubah lagi setelah dibuat.
##### d. val penulis: String, --> Properti kedua, namanya penulis. Sama seperti judul, ini juga bertipe String dan pakai val, jadi nilainya tetap setelah objek dibuat.
##### e. val tahun: String --> Properti ketiga, namanya tahun. Juga String, jadi bisa nyimpen teks tahun, misalnya "2023". Kenapa String bukan Int? Biar lebih fleksibel, misalnya ada tahun dengan tambahan tulisan seperti "2023 (edisi revisi)".


### 3. BukuAdapter.kt
<img width="554" height="350" alt="Screenshot 2025-08-14 095058" src="https://github.com/user-attachments/assets/fb6a7793-0fa9-4c25-a92b-a3d04a1924f6" />
<img width="554" height="350" alt="Screenshot 2025-08-14 095112" src="https://github.com/user-attachments/assets/21749c0a-0a13-473e-bc94-85a4a44b3530" />
<img width="554" height="350" alt="Screenshot 2025-08-14 095125" src="https://github.com/user-attachments/assets/cacfc36b-b20c-43c9-93fe-cc0a76cef303" />

#### Penjelasan :
##### a. package com.smktunas.app4_recycleview --> Ini nama package tempat file disimpan. Anggap aja kayak folder project biar kode lebih rapi.
##### b. import android.content.Context
  #####  import android.content.Intent
  #####  import android.view.LayoutInflater
  #####  import android.view.View
  #####  import android.view.ViewGroup
  #####  import android.widget.Button
  #####  import android.widget.ImageButton
  #####  import android.widget.TextView
  #####  import android.widget.Toast
  #####  import androidx.appcompat.app.AlertDialog
  #####  import androidx.recyclerview.widget.RecyclerView
  #####  --> Baris-barisan ini import library yang dibutuhkan. Context untuk akses sistem Android.  Intent buat pindah halaman (activity). LayoutInflater buat ubah file XML jadi tampilan nyata. View dan ViewGroup buat elemen UI. TextView dan Button buat komponen teks & tombol. Toast buat pesan singkat muncul di layar. AlertDialog buat bikin pop up konfirmasi. RecyclerView buat nampilin list data yang bisa discroll.
##### c. class BukuAdapter(
  #####  private val context: Context,
  #####  private val bukuList: MutableList<Buku>
  #####  ) : RecyclerView.Adapter<BukuAdapter.BukuViewHolder>() {
  #####  --> Ini bikin class adapter namanya BukuAdapter. Adapter itu jembatan antara data dan tampilan RecyclerView. context dipakai buat akses Android, kayak bikin intent, toast, dialog. bukuList adalah list data buku yang mau ditampilkan. Adapter ini pakai BukuViewHolder buat nampung tampilan tiap item.
##### d. class BukuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
  #####  val tvJudul: TextView = view.findViewById(R.id.tvJudul)
  #####  val tvPenulis: TextView = view.findViewById(R.id.tvPenulis)
  #####  val tvTahun: TextView = view.findViewById(R.id.tvTahun)
  #####  val btnHapus: Button = view.findViewById(R.id.btnHapus)
  #####  }
  #####  --> Ini bikin ViewHolder. ViewHolder itu kayak wadah untuk menyimpan tampilan dari item_buku.xml, biar RecyclerView lebih hemat memori.
  #####  tvJudul, tvPenulis, tvTahun buat nampilin data buku. btnHapus buat tombol hapus buku.
##### e. override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuViewHolder {
  #####  val view = LayoutInflater.from(parent.context)
  #####      .inflate(R.layout.item_buku, parent, false)
  #####  return BukuViewHolder(view)
  #####  }
  #####  --> Method ini jalan kalau RecyclerView butuh bikin tampilan baru.
  #####  inflate(R.layout.item_buku) artinya bikin tampilan berdasarkan file item_buku.xml.
  #####  Hasilnya dibungkus ke BukuViewHolder.
##### f. override fun onBindViewHolder(holder: BukuViewHolder, position: Int) {
  #####  val buku = bukuList[position]
  #####  holder.tvJudul.text = buku.judul
  #####  holder.tvPenulis.text = buku.penulis
  #####  holder.tvTahun.text = buku.tahun
  #####  --> Method ini ngisi data ke tampilan.
  #####  bukuList[position] ambil data buku sesuai urutan.
  #####  Judul, penulis, dan tahun ditampilkan ke TextView.    
##### g. // Klik item → buka detail + Toast
  #####  holder.itemView.setOnClickListener {
  #####      Toast.makeText(
  #####         holder.itemView.context,
  #####           "Buku dipilih: ${buku.judul}",
  #####            Toast.LENGTH_SHORT
  #####      ).show()
  #####  --> Kalau item buku diklik: Muncul toast (pesan singkat) "Buku dipilih: [judul]".  
##### h. val intent = Intent(context, DetailActivity::class.java).apply {
  #####       putExtra("judul", buku.judul)
  #####       putExtra("penulis", buku.penulis)
  #####       putExtra("tahun", buku.tahun)
  #####       }
  #####       context.startActivity(intent)
  #####  }
  #####  --> Setelah itu bikin Intent untuk pindah ke DetailActivity.
  #####  Data buku (judul, penulis, tahun) dikirim ke halaman detail pakai putExtra.
  #####  startActivity dipanggil biar pindah halaman.   
##### i. // Klik tombol hapus → dialog konfirmasi
  #####  holder.btnHapus.setOnClickListener {
  #####     val context = holder.itemView.context
  #####     AlertDialog.Builder(context)
  #####         .setTitle("Konfirmasi Hapus")
  #####         .setMessage("Yakin ingin menghapus '${buku.judul}'?")
  #####  --> Kalau tombol hapus ditekan: Muncul pop up dialog konfirmasi, nanya "Yakin ingin menghapus buku ini?".    
##### j. .setPositiveButton("Ya") { _, _ ->
  #####       bukuList.removeAt(position)
  #####       notifyItemRemoved(position)
  #####       notifyItemRangeChanged(position, bukuList.size)
  #####       Toast.makeText(context, "Buku dihapus", Toast.LENGTH_SHORT).show()
  #####       }
  #####        .setNegativeButton("Batal", null)
  #####        .show()
  #####  }
  #####  --> Kalau pilih Ya: Data buku dihapus dari bukuList.
  #####  RecyclerView diperbarui pakai notifyItemRemoved dan notifyItemRangeChanged.
  #####  Muncul toast "Buku dihapus".
  #####  Kalau pilih Batal: dialog ditutup tanpa hapus data.
##### k. override fun getItemCount(): Int = bukuList.size }
#####    --> Method ini ngasih tahu RecyclerView ada berapa data yang harus ditampilkan. Jumlahnya sesuai ukuran bukuList.


### 4. DetailActivity.kt
<img width="554" height="350" alt="Screenshot 2025-08-14 095142" src="https://github.com/user-attachments/assets/5b9c1e36-c0c9-4902-be9f-db057c191fd7" />

#### Penjelasan :
##### a. package com.smktunas.app4_recycleview
#####    --> Ini nunjukin file ada di dalam package com.smktunas.app4_recycleview. Fungsinya biar project rapi dan setiap file punya "alamat" sendiri.
##### b. import android.os.Bundle
#####    import android.widget.Button
#####    import android.widget.TextView
#####    import androidx.appcompat.app.AppCompatActivity
#####    --> Baris ini buat import library yang dibutuhkan: Bundle → dipakai pas activity pertama kali dibuat. Button → komponen tombol. TextView → komponen teks. AppCompatActivity → class dasar biar file ini bisa jalan sebagai halaman (activity) Android.
##### c. class DetailActivity : AppCompatActivity() {
#####    --> Ini bikin class baru namanya DetailActivity. Class ini adalah sebuah halaman detail di aplikasi.
##### d. override fun onCreate(savedInstanceState: Bundle?) {
#####       super.onCreate(savedInstanceState)
#####       setContentView(R.layout.activity_detail)
#####    --> onCreate otomatis dijalankan saat halaman pertama kali dibuka. setContentView(R.layout.activity_detail) artinya tampilan halaman ini diambil dari layout XML activity_detail.xml.
##### e. val judul = intent.getStringExtra("judul")
#####    val penulis = intent.getStringExtra("penulis")
#####    val tahun = intent.getStringExtra("tahun")
#####    --> Di sini kita ngambil data yang dikirim dari halaman sebelumnya (pakai Intent). Data yang diambil ada judul, penulis, sama tahun.
##### f. findViewById<TextView>(R.id.tvJudul).text = judul
#####    findViewById<TextView>(R.id.tvPenulis).text = penulis
#####    findViewById<TextView>(R.id.tvTahun).text = tahun
#####    --> Data yang tadi diambil dimasukin ke tampilan: tvJudul → nampilin judul buku. tvPenulis → nampilin nama penulis. tvTahun → nampilin tahun buku.
##### g. val btnKembali = findViewById<Button>(R.id.btKembali)
#####         btnKembali.setOnClickListener {
#####         finish()
#####         }
#####    }
#####    --> Ambil tombol dengan id btKembali. Kalau tombol diklik → jalankan finish(). Fungsi finish() nutup halaman detail ini, terus otomatis balik lagi ke halaman sebelumnya (daftar buku).


### 5. MainActivity.kt
<img width="554" height="350" alt="Screenshot 2025-08-14 095201" src="https://github.com/user-attachments/assets/298d55d7-7131-4e48-b7ea-4f785d9e6b81" /> 
<img width="554" height="350" alt="Screenshot 2025-08-14 095232" src="https://github.com/user-attachments/assets/06ba9dd9-f9de-442c-bd29-3b3f5e1368d8" />

#### Penjelasan :
##### a. package com.smktunas.app4_recycleview
#####    --> Ini alamat file (package). Fungsinya biar project rapi dan file bisa dipanggil dengan mudah.
##### b. import android.os.Bundle
#####    import androidx.appcompat.app.AppCompatActivity
#####    import androidx.recyclerview.widget.LinearLayoutManager
#####    import androidx.recyclerview.widget.RecyclerView
#####    import com.smktunas.app4_recycleview.R
#####    --> Import library yang dibutuhin: Bundle → dipakai pas activity dibuat pertama kali. AppCompatActivity → biar class ini bisa jadi activity (halaman).RecyclerView → komponen buat nampilin daftar (list). LinearLayoutManager → ngatur posisi item list (misal vertikal ke bawah).
##### c. class MainActivity : AppCompatActivity() {
#####    Bikin class MainActivity. Ini adalah halaman utama aplikasi.
##### d. private lateinit var recyclerView: RecyclerView
#####    private lateinit var adapter: BukuAdapter
#####    private lateinit var bukuList: MutableList<Buku>
#####    --> Bikin variabel: recyclerView → tempat buat nampilin list buku. adapter → penghubung data buku dengan tampilan di RecyclerView. bukuList → data semua buku yang mau ditampilkan.
##### e. override fun onCreate(savedInstanceState: Bundle?) {
#####    super.onCreate(savedInstanceState)
#####    setContentView(R.layout.activity_main)
#####    --> onCreate jalan pas halaman pertama kali dibuka. setContentView(R.layout.activity_main) → tampilan halaman diambil dari file activity_main.xml.
##### f. recyclerView = findViewById(R.id.recyclerView)
#####    recyclerView.layoutManager = LinearLayoutManager(this)
#####    --> Cari RecyclerView di layout (id = recyclerView). Atur biar item tampil ke bawah (linear/vertikal) pakai LinearLayoutManager.
##### g. bukuList = mutableListOf(
#####    Buku("Laskar Pelangi", "Andrea Hirata", "2005"),
#####    Buku("Bumi Manusia", "Pramoedya Ananta Toer", "1980"),
#####    Buku("Negeri 5 Menara", "Ahmad Fuadi", "2009"),
#####    Buku("Perahu Kertas", "Dewi Lestari", "2009"),
#####    Buku("Cantik Itu Luka", "Eka Kurniawan", "2002")
#####    )
#####    --> Isi data buku ke dalam bukuList. Di sini ada 5 buku, masing-masing punya judul, penulis, sama tahun.
##### h. adapter = BukuAdapter(this, bukuList)
#####    recyclerView.adapter = adapter
#####    }
#####    --> Buat adapter (BukuAdapter) dengan data bukuList. Pasang adapter ke recyclerView biar data buku bisa tampil di layar.

### 6. SplashScreen.kt
<img width="554" height="350" alt="Screenshot 2025-08-14 095247" src="https://github.com/user-attachments/assets/0f994242-33fd-4085-96b1-e220f1fc7f60" />

#### Penjelasan :
##### a. package com.smktunas.app4_recycleview
#####    --> Ini alamat package. Fungsinya biar project rapi, kayak folder khusus buat file ini.
##### b. import android.content.Intent
#####    import android.os.Bundle
#####    import android.os.Handler
#####    import android.os.Looper
#####    import androidx.activity.enableEdgeToEdge
#####    import androidx.appcompat.app.AppCompatActivity
#####    import androidx.core.view.ViewCompat
#####    import androidx.core.view.WindowInsetsCompat
#####    --> Ini bagian import, yaitu ngambil fitur/library yang dibutuhin: Intent → buat pindah halaman/activity. Bundle → nyimpen data pas activity dijalankan. Handler + Looper → ngatur delay (tunda waktu). enableEdgeToEdge → biar tampilan fullscreen sampe pinggir layar. AppCompatActivity → biar class ini bisa jadi activity (halaman). ViewCompat + WindowInsetsCompat → ngatur padding biar tampilan nggak ketutup status bar/navigation bar.
##### c. class SplashScreen : AppCompatActivity() {
#####    --> Bikin class SplashScreen. Ini halaman pembuka (logo/animasi) yang muncul pertama kali saat aplikasi dijalankan.
##### d. override fun onCreate(savedInstanceState: Bundle?) {
#####    super.onCreate(savedInstanceState)
#####    --> onCreate dipanggil pertama kali saat activity SplashScreen dibuka.
##### e. enableEdgeToEdge()
#####    setContentView(R.layout.activity_splash_screen)
#####    --> enableEdgeToEdge() → aktifin mode tampilan full sampai pinggir layar. setContentView(R.layout.activity_splash_screen) → tampilan halaman ini diambil dari file layout activity_splash_screen.xml.
##### f. ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
#####      val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
#####      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
#####      insets
#####      }
#####      --> Bagian ini ngatur biar tampilan menyesuaikan status bar & navigation bar. Misalnya kalau ada notch (poni hp), tampilan nggak ketiban tapi otomatis ngasih jarak (padding).
##### g. Handler(Looper.getMainLooper()).postDelayed({
#####      startActivity(Intent(this, MainActivity::class.java))
#####      finish() }, 3000)
#####    --> Ini inti dari splash screen: Handler(Looper.getMainLooper()) → buat ngejalanin kode di thread utama (UI). .postDelayed({ ... }, 3000) → jalankan perintah di dalam {...} setelah 3 detik (3000 milidetik). startActivity(Intent(this, MainActivity::class.java)) → pindah halaman ke MainActivity. finish() → nutup splash screen, biar nggak bisa balik lagi ke sini kalau tekan tombol back.
##### h. }
#####   }
#####    --> Tutup fungsi onCreate dan class SplashScreen.

### 7. Activity_detail.xml
<img width="554" height="350" alt="Screenshot 2025-08-14 095531" src="https://github.com/user-attachments/assets/cf3d8598-4a86-4948-8505-283ae4079b7b" />
<img width="554" height="350" alt="Screenshot 2025-08-14 095555" src="https://github.com/user-attachments/assets/484729e3-d17c-4d3a-b32d-99393185a092" />
<img width="554" height="350" alt="Screenshot 2025-08-14 095610" src="https://github.com/user-attachments/assets/47165ca0-7abb-4362-b617-7635e42bd906" />

#### Penjelasan :

### 8. Activity_main.xml
<img width="554" height="350" alt="Screenshot 2025-08-14 095919" src="https://github.com/user-attachments/assets/c1ada36e-4fcf-4a64-bfde-7edb93d0b5f8" />

#### Penjelasan :
##### a. <?xml version="1.0" encoding="utf-8"?>
#####    --> Ini baris standar di file XML Android. Artinya file ini pakai format XML dengan encoding utf-8.
##### b. <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
#####    android:layout_width="match_parent"
#####    android:layout_height="match_parent"
#####    android:orientation="vertical"
#####    android:padding="8dp">
#####    --> Ini adalah root layout atau wadah utama. LinearLayout → tipe layout yang nyusun komponen secara berurutan. Karena orientation="vertical", semua isi bakal ditaruh dari atas ke bawah. xmlns:android="..." → baris wajib, isinya alamat supaya atribut android: bisa dikenali. android:layout_width="match_parent" → lebar LinearLayout menyesuaikan layar (full). android:layout_height="match_parent" → tinggi LinearLayout juga full layar. android:orientation="vertical" → isi layout ditaruh berurutan dari atas ke bawah. android:padding="8dp" → ngasih jarak 8dp dari pinggir layar biar nggak terlalu mepet.
##### c. <androidx.recyclerview.widget.RecyclerView
#####    android:id="@+id/recyclerView"
#####    android:layout_width="match_parent"
#####    android:layout_height="match_parent" />
#####    --> Ini adalah RecyclerView (komponen buat nampilin daftar data). android:id="@+id/recyclerView" → kasih ID ke RecyclerView biar bisa dipanggil di kode Kotlin. android:layout_width="match_parent" → lebar RecyclerView full layar. android:layout_height="match_parent" → tinggi RecyclerView juga full layar, jadi dia isi semua ruang LinearLayout.
##### d. </LinearLayout>
#####    --> Nutup tag LinearLayout.

### 9. Activity_splash_screen.xml
<img width="554" height="350" alt="Screenshot 2025-08-14 095947" src="https://github.com/user-attachments/assets/7280c738-f78b-4b1b-9b85-53cd8d753dad" />

#### Penjelasan :
##### a. <?xml version="1.0" encoding="utf-8"?>
#####    --> Ini standar awal file XML Android. Artinya file ini ditulis pakai format XML dengan encoding utf-8.
##### b. <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
#####    xmlns:app="http://schemas.android.com/apk/res-auto"
#####    xmlns:tools="http://schemas.android.com/tools"
#####    android:id="@+id/main"
#####    android:layout_width="match_parent"
#####    android:layout_height="match_parent"
#####    tools:context=".SplashScreen">
#####    --> Ini adalah root layout atau wadah utama. ConstraintLayout → tipe layout yang fleksibel, bisa atur posisi komponen bebas dengan constraint (pengikat ke parent atau komponen lain). xmlns:android / xmlns:app / xmlns:tools → ini deklarasi namespace biar atribut android:, app:, dan tools: bisa dipakai. android:id="@+id/main" → ID dari layout ini, biar bisa dipanggil di kode Kotlin. android:layout_width="match_parent" → lebar layout full layar. android:layout_height="match_parent" → tinggi layout juga full layar. tools:context=".SplashScreen" → info buat Android Studio, nunjukin layout ini dipakai di SplashScreen.kt.
##### c. <ImageView
#####    android:id="@+id/imageView"
#####    android:layout_width="160dp"
#####    android:layout_height="205dp"
#####    app:layout_constraintBottom_toBottomOf="parent"
#####    app:layout_constraintEnd_toEndOf="parent"
#####    app:layout_constraintHorizontal_bias="0.498"
#####    app:layout_constraintStart_toStartOf="parent"
#####    app:layout_constraintTop_toTopOf="parent"
#####    app:layout_constraintVertical_bias="0.306"
#####    app:srcCompat="@drawable/buku" />
#####    --> Ini adalah komponen gambar (ImageView).  android:id="@+id/imageView" → ID-nya imageView, bisa dipanggil dari kode Kotlin. android:layout_width="160dp" → lebar gambar ditetapkan 160dp. android:layout_height="205dp" → tinggi gambar 205dp. app:layout_constraint... → ini aturan posisi karena pakai ConstraintLayout: Bottom_toBottomOf="parent" → bawah gambar diikat ke bawah layout utama. End_toEndOf="parent" → kanan gambar diikat ke kanan layout utama. Start_toStartOf="parent" → kiri gambar diikat ke kiri layout utama. Top_toTopOf="parent" → atas gambar diikat ke atas layout utama. Horizontal_bias="0.498" → posisi horizontal agak ke tengah (hampir 0.5 = pas tengah). Vertical_bias="0.306" → posisi vertical agak di atas (0.5 = tengah, ini 0.306 jadi lebih naik). app:srcCompat="@drawable/buku" → sumber gambar diambil dari file drawable bernama buku.png/jpg.
##### d. </androidx.constraintlayout.widget.ConstraintLayout>
#####    --> Nutup tag ConstraintLayout.

### 10. Item_buku.xml
<img width="554" height="350" alt="Screenshot 2025-08-14 100020" src="https://github.com/user-attachments/assets/17838a1d-3b4b-4c96-9392-05ee4d380a6f" />
<img width="554" height="350" alt="Screenshot 2025-08-14 100045" src="https://github.com/user-attachments/assets/1c44a4fe-e45f-45f5-aa48-c897c04fc174" />
<img width="554" height="350" alt="Screenshot 2025-08-14 100111" src="https://github.com/user-attachments/assets/9c1c8890-92bb-407d-a343-d38d74f3da8c" />

#### Penjelasan :




















