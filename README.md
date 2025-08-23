<img width="370" height="285" alt="image" src="https://github.com/user-attachments/assets/3bf570e8-52e8-459a-b0e5-720cb4e6a6a0" /># Project RecycleView
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

Penjelasan:
1. Menambahkan RacycleView yaitu komponen untuk menampilkan(List/grid)dengan performa tinggi.
2. Menambahkan CardView untuk menampilkan konten dalam bentuk kartu dengan efek shadow dan rounded corner.
3. Menambahkan Retrofit Library untuk komunikasi dengan API/HTTP(ambil data dari internet dengan mudah).
4. Converter tambahkan untuk Retrofit supaya bisa otomatis mengubah JSON -> objek java/kotlin menggunakan Gson
5. Menambahkan Glide library untuk load dan caching gambar dari internet atau lokal ke imageview dengan efisien.

### 2. activity_splash_screen.xml
<img width="613" height="329" alt="Screenshot 2025-08-21 211432" src="https://github.com/user-attachments/assets/d2a85f5e-4462-468a-96b1-c93ff691d1a9" />

Penjelasan:
Menggunakan ConstraintLayout agar posisi elemen fleksibel. Hanya ada 1 ImageView untuk menampilkan gambar buku sebagai logo splash screen. Gambar ditempatkan hampir di tengah, tapi agak ke atas.
1. Root Layout
   - ConstraintLayoutandroid:id="@+id/main".
   - Lebar (match_parent) dan tinggi (match_parent) → memenuhi seluruh layar.
   - Tools:context=".SplashScreen" → menghubungkan layout ini dengan kelas SplashScreen.

2. ImageView
   - @+id/imageView → memberi ID untuk dipanggil di kode Kotlin/Java.
   - Layout_width="160dp" & layout_height="260dp" → ukuran gambar tetap.
   - Src="@drawable/buku" → gambar yang ditampilkan berasal dari folder drawable dengan nama file buku.png/jpg.
   - Constraint (atas, bawah, kiri, kanan) ke parent → gambar diposisikan di tengah layar.
   - Bias → menentukan posisi relatif di sumbu horizontal (0 = kiri, 1 = kanan) dan vertikal (0 = atas, 1 = bawah).
   - Horizontal_bias="0.498" ≈ tengah horizontal.
   - Vertical_bias="0.306" → agak lebih ke atas, bukan tepat di tengah.

   
### 3. activity_main.xml
<img width="613" height="329" alt="Screenshot 2025-08-21 212014" src="https://github.com/user-attachments/assets/a0743777-2dd1-47c2-94cd-80ade6890b34" />

Penjelasan : 
Membuat halaman utama (Main Activity) yang berisi RecyclerView nantinya akan dipakai untuk menampilkan daftar data (misalnya daftar buku, produk, berita, dll.) dengan tampilan rapi, scrollable, dan efisien.
1. LinearLayout (Root Layout)
   - Match_parent → memenuhi layar penuh.
   - Orientation="vertical" → susunan elemen di dalamnya secara vertikal (atas ke bawah).
   - Padding="8dp" → memberi jarak ke dalam (supaya tidak mepet ke tepi layar).
   - Background="#E3F2FD" → memberi warna biru muda sebagai latar belakang.
2. RecyclerView
   - ID: @+id/recyclerView → supaya bisa dipanggil di Kotlin/Java untuk menampilkan data.
   - Menampilkan daftar (list/grid) dengan performa tinggi, bisa untuk data dari API, database, atau array.
   - Lebar & tinggi match_parent → RecyclerView memenuhi sisa ruang layar.

### 4. item_buku.xml
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/4dc833ae-9a24-4553-9e16-545812521d7c" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/7cab639b-b382-426b-8053-58b34aa3993d" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/283259a7-8a08-4bfc-b9ed-a790bc3ff618" />

Penjelasan : 
1. CardView (Root)
   <pre> &lt; androidx.cardview.widget.CardView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_margin="8dp"
    card_view:cardCornerRadius="8dp"
    card_view:cardElevation="4dp"/&gt;</pre>
   - CardView = wadah dengan gaya kartu.
   - CardCornerRadius="8dp" → sudut kartu dibuat membulat.
   - CardElevation="4dp" → memberi efek bayangan (shadow) agar terlihat mengambang.
   - Margin="8dp" → memberi jarak antar item.

2. LinearLayout (Horizontal Container)
   <pre> &lt; LinearLayout
    android:orientation="horizontal"
    android:padding="8dp"&gt;</pre>
   - Mengatur isi kartu secara horizontal (kiri ke kanan).
   - Ada padding biar isi tidak mepet ke pinggir.

3. ImageView (Cover Buku)
   <pre> &lt;imageView
    android:id="@+id/ivCover"
    android:layout_width="79dp"
    android:layout_height="97dp" /&gt;
   </pre>
   - Menampilkan gambar sampul buku.
   - Ukuran tetap: 79x97 dp.
   - ID ivCover → supaya bisa diisi gambar melalui kode Kotlin/Java (misalnya pakai Glide).

4. LinearLayout (Vertical Container untuk Teks)
   <pre> &lt;LinearLayout
    android:orientation="vertical"
    android:paddingStart="8dp"&gt; </pre>
    
   - Berisi informasi teks buku (judul, penulis, tahun).
   - Disusun vertikal (atas ke bawah).
   - Ada padding kiri agar teks tidak terlalu dekat dengan gambar.
 
5. TextView (Judul, Penulis, Tahun)
- Judul Buku : Menampilkan judul buku dengan huruf besar dan tebal.
  <pre>
     &lt;TextView
    android:id="@+id/tvJudul"
    android:text="Judul_Buku"
    android:textSize="18sp"
    android:textStyle="bold" /&gt;
  </pre>

- Penulis : Menampilkan nama penulis.
  <pre> &lt;TextView
    android:id="@+id/tvPenulis"
    android:text="Penulis" /&gt;
  </pre>

- Tahun  terbit : Menmpilkan tahun terbit buku
   <pre> &lt;TextView 
       android:id="@+id/tvTahun"
       android:text="Tahun_Terbit" /&gt;
   </pre>
     
  
### 5. activity_detail.xml
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/61677746-a903-47ab-948b-4cf56fbce02c" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/a0a25fcb-1b76-431e-be5b-6d5efe96f9ea" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/6f9bd2b8-4199-4700-a1e2-b52556d5f8cc" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/e50066f8-0f5e-48e6-a7ad-0ea2911076a2" />

Penjelasan : 
1. Root Layout(Linear Layout)
   <pre>
      &lt;LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center_horizontal"
    android:background="#FAFAFA"&gt;
   </pre>

   - LinearLayout dengan orientasi → konten ditumpuk dari atas ke bawah.
   - Padding 20dp → memberi jarak isi dari tepi layar.
   - Gravity = center_horizontal → semua elemen disejajarkan ke tengah horizontal.
   - Background abu-abu muda (#FAFAFA) → supaya tampilan lebih clean.

2. ImageView (Sampul Buku)
   <pre>&lt;ImageView
    android:id="@+id/ivCoverDetail"
    android:layout_width="368dp"
    android:layout_height="413dp"
    android:layout_margin="20dp" /&gt;
</pre>

- Menampilkan Cover buku dalam ukuran besar
- Diletakan di atas sebagai fokus utama halaman detail.

3. textView(Judul Buku)
   <pre>&lt;TextView
    android:id="@+id/tvJudulDetail"
    android:text="Judul_Buku"
    android:textSize="24sp"
    android:textStyle="bold"
    android:textColor="#000000"
    android:layout_marginBottom="10dp"/&gt;
 </pre>

 - Menampilkan judul buku dengan teks besar, bold, dan warna hitam.
 - Diletakkan di bawah gambar.

4. TextView (Penulis)
   <pre> &lt;TextView
    android:id="@+id/tvPenulisDetail"
    android:text="Penulis"
    android:textSize="18sp"
    android:textColor="#444444"
    android:layout_marginBottom="8dp"/&gt;</pre>

 - Menampilkan nama penulis buku.
 - Teks lebih kecil dari judul, warnanya abu tua.

5. TextView(Tahun Terbit)
   <pre> &lt;TextView
    android:id="@+id/tvTahunDetail"
    android:text="Tahun Terbit"
    android:textSize="16sp"
    android:textColor="#666666"
    android:layout_marginBottom="20dp"/&gt;
   </pre>

   - Menampilkan tahun terbit buku.
   - Teks lebih kecil lagi, warnanya abu-abu.

6. FrameLayout + Button (Tombol Kembali)
   <pre> &lt;Button
    android:id="@+id/btnKembali"
    android:text="Kembali"
    android:backgroundTint="#2196F3"
    android:textColor="#FFFFFF"
    android:layout_gravity="bottom|start"
    android:layout_margin="16dp"/&gt;
</pre>

- Button "Kembali" untuk keluar dari halaman detail dan kembali ke daftar buku.
- Warna biru (#2196F3) dengan teks putih.
- Posisi di bagian bawah kiri layar karena pakai layout_gravity="bottom|start".

  
### 6. BukuAdapter.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/562e34b3-1124-46c5-924a-8cd1c85e525a" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/96cb1e2d-515e-47d9-be15-7d615d793e62" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/dbc27208-f18b-4888-b3ab-d19e1b274f87" />

Penjelasan : BukuAdapter adalah kelas yang menghunungkan data list buku dengan tampilan item di RecycleView. setiap Buku akan ditampilkan di layout item_buku.xml

1. BukuViewHolder
   <pre> class BukuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvJudul: TextView = view.findViewById(R.id.tvJudul)
    val tvPenulis: TextView = view.findViewById(R.id.tvPenulis)
    val ivCover: ImageView = itemView.findViewById(R.id.ivCover)
    val tvTahun: TextView = itemView.findViewById(R.id.tvTahun) } 
   </pre>

   - Bertugas menyimpan referensi view (judul, penulis, cover, tahun).
   - Supaya saat scrolling RecyclerView, tidak perlu memanggil findViewById terus-menerus.

2. onCreateViewHolder
   <pre>
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_buku, parent, false)
    return BukuViewHolder(view) } 
   </pre>

    - Membuat tampilan baru untuk setiap item dari file XML item_buku.
      
3. onBindviewHolder
   <pre>
   override fun onBindViewHolder(holder: BukuViewHolder, position: Int) {
    val buku = listBuku[position]
    holder.tvJudul.text = buku.judul
    holder.tvPenulis.text = buku.penulis
    holder.tvTahun.text = buku.tahun

    Glide.with(holder.itemView.context)
        .load(buku.cover)
        .into(holder.ivCover) }
   </pre>

   - Mengisi data ke dalam view: Judul, penulis, tahun buku → TextView
   - Cover buku → ImageView (menggunakan Glide untuk load gambar dari URL)

4. Klik Item → Tampilkan AlertDialog
   <pre> holder.itemView.setOnClickListener {
    val context = holder.itemView.context
    AlertDialog.Builder(context)
        .setTitle("Pilih Buku")
        .setMessage("Apakah kamu ingin membuka detail buku \"${buku.judul}\"?")
        .setPositiveButton("Ya") { dialog, _ ->
            Toast.makeText(context, "Kamu Membuka: ${buku.judul}", Toast.LENGTH_SHORT).show()
            
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("judul", buku.judul)
                putExtra("penulis", buku.penulis)
                putExtra("tahun", buku.tahun)
                putExtra("cover", buku.cover)
            }
            context.startActivity(intent)
            dialog.dismiss()
        }
        .setNegativeButton("Batal") { dialog, _ -> dialog.dismiss() }
        .show() }
</pre>

Kalo user klik salah satu item:
1) Muncul Alert Dialog (konfirmasi)
2) kalau pilih "Ya", maka :
   - Muncul Toast (notifikasi singkat).
   - Pindah ke DetailActivity sambil mengirim data buku (judul, penulis, tahun, cover).
3) Kalau pilih "Batal", dialog ditutup.


### 7. Buku.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/5459253d-722e-4150-9e00-bae99e980f8a" />

Penjelasan : 
- Ini adalah data class yang merepresentasikan model data buku, Dengan data class ini, lebih mudah untuk menampung data buku dari API atau database, lalu ditampilkan ke RecyclerView.
- Jadi setiap objek buku punya:
  * id → ID unik untuk buku.
  * judul → Judul buku.
  * penulis → Nama penulis buku.
  * tahun → Tahun terbit buku.
  * cover → URL atau path gambar cover buku.

### 8. ApiService.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/5509e963-7f51-4cf0-8ed7-dddb64d51e3e" />

Penjelasan :
- Ini adalah interface Retrofit yang digunakan untuk komunikasi dengan API (server), dipakai untuk melakukan request ke server, dan hasilnya berupa List objek Buku yang nanti akan ditampilkan di RecyclerView menggunakan BukuAdapter.
- @GET(".") → berarti mengambil data dengan metode HTTP GET dari endpoint root ("." → nanti akan digabung dengan BASE_URL yang sudah didefinisikan di RetrofitClient).
- fun getBuku(): Call<List<Buku>> → memanggil API untuk mendapatkan daftar buku (List<Buku>) dalam bentuk asynchronous request.

### 9. RetrofitClient.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/7d462b3f-ea16-47e3-867e-daf1d248e027" />

Penjelasan : 
- RetrofitClient adalah singleton (object tunggal) yang dipakai untuk membuat koneksi ke API server dan mengambil     daftar buku dari server.
- BASE_URL → alamat API (endpoint untuk data buku).
- Retrofit.Builder():
  * .baseUrl(BASE_URL) → mengatur alamat dasar API.
  * .addConverterFactory(GsonConverterFactory.create()) → agar data JSON dari API bisa otomatis dikonversi menjadi       objek Kotlin (Buku).
- retrofit.create(ApiService::class.java) → menghasilkan implementasi dari ApiService (interface API tadi).

### 10. DetailActivity.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/06434c95-d229-463a-b77a-624e7c9a9a0f" />
<img width="613" height="329 alt="image" src="https://github.com/user-attachments/assets/cbbfefac-b86d-48be-804a-b365f33dd63f" />

Penjelasan :
- DetailActivity adalah halaman untuk menampilkan detail dari buku yang dipilih user di RecyclerView.
- setContentView(R.layout.activity_detail) → menampilkan layout detail.
- intent.getStringExtra(...) → mengambil data yang dikirim dari BukuAdapter (judul, penulis, tahun, cover).
- Glide.with(this).load(...).into(ivCover) → menampilkan gambar cover buku.
- btnKembali.setOnClickListener { finish() } → tombol kembali menutup DetailActivity dan kembali ke halaman daftar    buku.

### 11. MainActivity.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/c32695cd-ed0f-4d8a-b5b9-08e9ec2b7d5f" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/b032c713-e548-4f78-bafa-6cbdde479ae0" />

Penjelasan : 
- Menampilkan layout utama (activity_main.xml)
   * setContentView(R.layout.activity_main) → menentukan tampilan activity utama.
- Menyiapkan RecyclerView
   * recyclerView = findViewById(R.id.recyclerView) → menghubungkan RecyclerView dari layout.
   * recyclerView.layoutManager = LinearLayoutManager(this) → menampilkan item dalam bentuk list vertikal.
- Memanggil API lewat Retrofit
   * RetrofitClient.instance.getBuku() → memanggil API untuk mengambil daftar buku dari server.
- Menghandle response dari API
   * onResponse: Jika berhasil (isSuccessful == true), data buku dari server (response.body()) dipasang ke               RecyclerView lewat BukuAdapter.
   * onFailure: Jika gagal (misalnya tidak ada internet/server error), tampil Toast error dengan pesan kegagalan.
     
### 12. SplashScreen.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/d8fa869e-cf52-4e04-9dff-9f6d3f239804" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/3485d54b-7dd8-47b5-82e2-4fae11ace636" />

Penjelasan : 
- Menampilkan halaman splash screen
  * setContentView(R.layout.activity_splash_screen) → menampilkan layout splash screen (biasanya logo/branding          aplikasi).
- Mengatur status bar & sistem UI
  * enableEdgeToEdge() + ViewCompat.setOnApplyWindowInsetsListener → agar tampilan splash screen full screen dan        menyesuaikan padding dengan status/navigation bar.
- Menunda perpindahan halaman selama 3 detik Handler(Looper.getMainLooper()).postDelayed({ ... }, 3000) → setelah 
  3000 ms (3 detik), jalankan kode di dalamnya:startActivity(Intent(this, MainActivity::class.java)) → pindah ke      halaman utama (MainActivity).
  * startActivity(Intent(this, MainActivity::class.java)) → pindah ke halaman utama (MainActivity).
  * finish() → menutup SplashScreen, supaya tidak bisa kembali ke splash screen dengan tombol back.
  * finish() → menutup SplashScreen, supaya tidak bisa kembali ke splash screen dengan tombol back.

## 📸 Screenshot



































































