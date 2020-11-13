package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.ImageAdapter

class BeritaActivity : AppCompatActivity(){
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        val imageList = listOf<Image>(
            Image(
                R.drawable.berita1,
                "Pendidikan Daring",
            "Sejak kasus virus korona mulai meningkat,  sekolah atau universitas saat ini tidak lagi melakukan aktivitas seperti biasanya, karena pemerintah memberlakukan sistem di rumah saja maka kegiatan belajar mengajar baik formal atau informal yang setiap hari dilakukan oleh peserta didik semuanya harus dilakukan dirumah saja.\n" +
                    "\n" +
                    "Salah satu langkah yang tepat dalam situasi seperti ini adalah memanfaatkan teknologi jaringan dan teknologi informasi bagi pengembangan sistem pembelajaran di sekolah atau perguruan tinggi yaitu dengan model pembelajaran daring (dalam jaringan) atau online learning model (OLM) antar sekolah atau perguruan tinggi."
            ),
            Image(
                R.drawable.berita2,
                "Potret Pendidikan",
                "COVID-19 datang menguji kemampuan negara di dunia. Banyak pelajaran berharga yang dapat dipetik dari pandemi ini, salah satunya sektor pendidikan. Pendidikan juga mendapat imbasnya sehingga dilaksanakannya PJJ (Pendidikan Jarak Jauh) se-Indonesia.\n" +
                        "\n" +
                        "Sebelum adanya PJJ, pendidikan layak untuk daerah 3T (Daerah Tertinggal, Terdepan dan Terluar) ataupun daerah pelosok terasa berat. Belakangan pendidikan di daerah pusat mulai menjalankan kelas daring dengan mudah, kepemilikan gawai serta akses internet yang lancar sudah menjadi keuntungan dalam menjalankan PJJ.\n" +
                        "\n" +
                        "Lalu bagaimana dengan PJJ di daerah pelosok? Gawai menjadi benda mewah, kuota yang cukup mahal seperti pembayaran listrik bulanan dan belum lagi akses internet yang belum tentu menjangkau daerah tersebut."
            ),
            Image(
                R.drawable.berita3,
                "Kesenjangan Pendidikan",
                "Indonesia sedang melakukan banyak usaha pemerataan pendidikan, namun usaha tersebut nampaknya masih belum terwujudkan melihat sampai saat ini masih banyak terjadi kesenjangan dalam dunia pendidikan Indonesia baik dalam mutu maupun fasilitas.  Kesenjangan sosial sendiri diartikan sebagai keadaan yang tidak sesuai dengan harapan, terjadi perbedaan yang begitu mencolok dan dapat dilihat dengan sangat jelas. Darmaningtyas (pengamat pendidikan) menilai hambatan perkembangan Indonesia ada di kesenjangan infrastruktur, geografis, dan telekomunikasi. Untuk memperbaiki pendidikan, kata Darmaningtyas, pemerintah harus membenahi kesenjangan itu terlebih dahulu (dikutip dari kbr.nasional (7 april 2020)).\n" +
                        "\n" +
                        "Kondisi ini menjadi bukti bahwa belum terciptanya pendidikan yang merata dan dapat ditempuh oleh segala kalangan. Kesenjangan dalam pendidikan ini dapat dibuktikan dengan masih banyaknya angka anak putus sekolah berikut jumlah anak putus sekolah merurt data statistic kemendikbud RI pada tahun ajaran 2018/2019 ada sebanyak 57,426 anak yang terdaftar dalam daftar anak putus sekolah pada jenjang SD, sedangkan pada jenjang SMP sebanyak 51,190 anak putus sekolah, serta pada jenjang SMA sebanyak 52,142 anak putus sekolah. (sumber Data kemendikbud RI)"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}

