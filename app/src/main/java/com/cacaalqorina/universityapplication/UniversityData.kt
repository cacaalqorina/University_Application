package com.cacaalqorina.universityapplication

object UniversityData {
    private val universityNames = arrayOf(
        "Universitas Riau",
        "Universitas Muhammadyah Riau",
        "Universitas Islam Negeri Sultan Syarif Kasim",
        "Universitas Lancang Kuning",
        "Universitas Islam Riau",
        "Universitas Abdurrab",
        "Politeknik Caltex Riau",
        "Sekolah Tinggi Teknologi Pekanbaru",
        "Sekolah Tinggi Ilmu Kesehatan Hang Tuah",
        "Sekolah Tinggi Ilmu Farmasi Riau"
    )

    private val universityAccreditation = arrayOf(
        "A",
        "B",
        "B",
        "B",
        "B",
        "B",
        "B",
        "C",
        "C",
        "B"
    )

    private val universityAddress = arrayOf(
        "Simpang Baru, Kota Pekanbaru, Riau",
        "Jl. KH. Ahmad Dahlan No. 88 Sukajadi, Kota Pekanbaru, Riau",
        "Jl. Subrantas Km.15, Kota Pekanbaru, Riau",
        "Jl. Yos Sudarso Km.8 Rumbai, Kota Pekanbaru, Riau",
        "Jl. Kaharuddin Nasution 113, Kota Pekanbaru, Riau",
        "Jl. Riau Ujung No.73, Kota Pekanbaru, Riau",
        "Jl. Umban Sari No.1, Kota Pekanbaru, Riau",
        "Jl. Dirgantara No.4 Arengka Raya, Kota Pekanbaru, Riau",
        "Jl. Mustafa Sari No.5 Tengkerang Sel, Kota Pekanbaru, Riau",
        "Jl. Kamboja Simpang Baru Tampan, Kota Pekanbaru, Riau"
    )

    private val universitySince = arrayOf(
        1962,
        2008,
        1970,
        1982,
        1962,
        2008,
        2001,
        1992,
        2008,
        2022
    )


    private val universitySynopsis = arrayOf(
        "Universitas Riau atau UNRI adalah universitas negeri terbaik di Riau yang didirikan pada tanggal 1 Oktober 1962 oleh Yayasan Universitas Riau. ",
        "Universitas Muhammadiyah Riau adalah salah satu univesitas terbaik di Riau yang didirikan pada tanggal 5 Juni 2008. Universitas Muhammadiyah Riau gabungan dari Akademi Teknologi Otomotif (ATOM) dan Akademi Keperawatan (AKPER). Sejak awal berdirinya, Universitas Muhammadiyah Riau memiliki 8 fakultas yang terdiri dari beberapa jurusan yaitu, Fakultas Teknik, Matematika, Ekonomi, Ilmu Komputer, Ilmu Komunikasi, Keguruan & Ilmu Pendidikan, Hukum, dan Studi Islam.",
        "Universitas Islam Negeri Sultan Syarif Kasim atau UIN SUSKA adalah universitas negeri di Riau yang didirikan pada tanggal 19 September 1970 dengan nama Institut Islam Negeri (IAIN) Sultan Syarif Kasim. Nama universitas ini diambil dari Sultan Kerajaan Siak Sri Indrapura ke-12 sekaligus pejuang nasional yang berasal dari Riau. Universitas Islam Negeri Sultan Syarif Kasim memiliki 8 fakultas dengan 40 jurusan dan memiliki program Pascasarjana serta Doktor. UIN SUSKA juga menjadi universitas kebidanan terbaik di riau.",
        "Universitas Lancang Kuning atau yang biasa disebut dengan Unilak adalah salah satu universitas terbaik di Riau yang didirikan oleh Yayasan Raja Ali pada tanggal 9 Juni 1982. Berdirinya universitas terbaik di pekanbaru ini diprakarsai oleh tokoh masyarakat Riau dan Pemerintah Provinsi Riau. Universitas Lancang Kuning saat ini memiliki 9 fakultas yang terdiri dari beberapa jurusan yaitu, Ilmu Administrasi, Ekonomi, Teknik, Pertanian, Hukum, Ilmu Budaya, Kehutanan, FKIP, dan program Pascasarjana.",
        "Universitas Islam Riau adalah salah satu universitas terbaik di Riau sekaligus menjadi universitas tertua di Riau yang didirikan pada tanggal 4 September 1962 di bawah naungan Yayasan Lembaga Pendidikan Islam (YLPI) Riau. Universitas Islam Riau memiliki 9 fakultas, Program Pascasarjana, dan Doktor. Nah bagi kamu yang sedang mencari universitas keperawatan terbaik di riau, Universitas yang satu ini sangat direkomendasikan.",
        "Universitas Abdurrab atau yang biasa disingkat dengan nama UNIVRAB adalah salah satu universitas terbaik di Riau. Universitas Abdurrab adalah gabungan dari Akademi Keperawatan, Akademi Analis Farmasi Makanan, Akademi Fisioterapi, dan Akademi Kebidanan. Universitas Abdurrab memiliki 4 fakultas, yaitu Fakultas Kedokteran, Fakultas Teknik, Fakultas Ilmu Sosial, dan Fakultas Psikologi. UNIVRAB juga menjadi salah satu universitas swasta terbaik di Riau.",
        "Politeknik Caltex Riau adalah Perguruan Tinggi Swasta di Riau yang didirikan oleh Pemerintah Provinsi Aceh dengan PT. Caltex Pacifix Indonesia pada tahun 2001. Selain itu, Politeknik Caltex  Riau juga menjadi perguruan tinggi vokasi swasta terbaik di Indonesia. Politeknik Caltex Riau memiliki 4 jurusan yaitu, Teknologi Rekayasa Komputer, Teknologi Rekayasa Sistem Elektronika, Teknologi Rekayasa Jaringan Telekomunikasi, dan Akuntansi Perpajakan.",
        "Sekolah Tinggi Teknologi Pekanbaru atau STTP menjadi salah satu universitas terbaik di Riau yang didirikan pada tanggal 22 Juni 1992. Sekolah Tinggi Teknologi Pekanbaru memiliki beberapa jurusan yaitu Teknik Elektro, Teknik Mesin, dan Teknik Sipil.",
        "Sekolah Tinggi Ilmu Kesehatan Hang Tuah atau STIKES Hang Tuah adalah salah satu universitas terbaik di Riau. Sekolah tinggi ini sangat direkomendasikan bagi Anda yang ingin mempelajari ilmu di bidang kesehatan. STIKES Hang Tuah memiliki beberapa jurusan yaitu Kesehatan Masyarakat, Keperawatan & Profesi, Kebidanan dan Profesi, dan Rekam Medik.",
        "Sekolah Tinggi Ilmu Farmasi Riau menjadi universitas terbaik di Riau yang terakhir. Kampus ini didirikan pada 14 Agustus 2022. Nah jika anda ingin belajar lebih dalam tentang farmasi, kampus ini sangat direkomendasikan."
    )

    private val universityCover = arrayOf(
        R.drawable.unri,
        R.drawable.umri,
        R.drawable.uin_suska,
        R.drawable.unilak,
        R.drawable.uir,
        R.drawable.univrab,
        R.drawable.pcr,
        R.drawable.sktt,
        R.drawable.stikes,
        R.drawable.stifar,
    )

    val UniversityListData: ArrayList<University>
        get() {
            val list = arrayListOf<University>()
            for (i in universityNames.indices) {
                val university = University()
                university.name = universityNames[i]
                university.accreditation = universityAccreditation[i]
                university.address = universityAddress[i]
                university.standingYear = universitySince[i]
                university.synopsis = universitySynopsis[i]
                university.cover = universityCover[i]
                list.add(university)
            }
            return list
        }
}