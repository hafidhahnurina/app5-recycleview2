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

3. zimageView
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
   - CardView = wadah dengan gaya kartu.
   - CardCornerRadius="8dp" → sudut kartu dibuat membulat.
   - CardElevation="4dp" → memberi efek bayangan (shadow) agar terlihat mengambang.
   - Margin="8dp" → memberi jarak antar item.
     
2. LinearLayout (Horizontal Container)
   - Mengatur isi kartu secara horizontal (kiri ke kanan).
   - Ada padding biar isi tidak mepet ke pinggir.

3. ImageView (Cover Buku)
   - Menampilkan gambar sampul buku.
   - Ukuran tetap: 79x97 dp.
   - ID ivCover → supaya bisa diisi gambar melalui kode Kotlin/Java (misalnya pakai Glide).

4. LinearLayout (Vertical Container untuk Teks)
   - Berisi informasi teks buku (judul, penulis, tahun).
   - Disusun vertikal (atas ke bawah).
   - Ada padding kiri agar teks tidak terlalu dekat dengan gambar.

5. TextView (Judul, Penulis, Tahun)
- Judul Buku
* <TextView
    android:id="@+id/tvJudul"
    android:text="Judul_Buku"
    android:textSize="18sp"
    android:textStyle="bold" />
* Menampilkan judul buku dengan huruf besar dan tebal.
- Penulis
   * <TextView
    android:id="@+id/tvPenulis"
    android:text="Penulis" />
   * Menampilkan nama penulis.
- Tahun  terbit
  * <TextView
    android:id="@+id/tvTahun"
    android:text="Tahun_Terbit" />
* Menmpilkan tahun terbit buku
- 
### 5. activity_detail.xml
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/61677746-a903-47ab-948b-4cf56fbce02c" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/a0a25fcb-1b76-431e-be5b-6d5efe96f9ea" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/6f9bd2b8-4199-4700-a1e2-b52556d5f8cc" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/e50066f8-0f5e-48e6-a7ad-0ea2911076a2" />

### 6. BukuAdapter.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/562e34b3-1124-46c5-924a-8cd1c85e525a" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/96cb1e2d-515e-47d9-be15-7d615d793e62" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/dbc27208-f18b-4888-b3ab-d19e1b274f87" />

### 7. Buku.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/5459253d-722e-4150-9e00-bae99e980f8a" />

### 8. ApiService.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/5509e963-7f51-4cf0-8ed7-dddb64d51e3e" />

### 9. RetrofitClient.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/7d462b3f-ea16-47e3-867e-daf1d248e027" />

### 10. DetailActivity.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/06434c95-d229-463a-b77a-624e7c9a9a0f" />
<img width="613" height="329 alt="image" src="https://github.com/user-attachments/assets/cbbfefac-b86d-48be-804a-b365f33dd63f" />

### 11. MainActivity.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/c32695cd-ed0f-4d8a-b5b9-08e9ec2b7d5f" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/b032c713-e548-4f78-bafa-6cbdde479ae0" />

### 12. SplashScreen.kt
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/d8fa869e-cf52-4e04-9dff-9f6d3f239804" />
<img width="613" height="329" alt="image" src="https://github.com/user-attachments/assets/3485d54b-7dd8-47b5-82e2-4fae11ace636" />


## 📸 Screenshot








































