package com.example.myroomsatu09.view.route

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur untuk composable
     */
    val route: String

    /**
     * string resources id yang berisi judul takan akan di tampilkan di layar halaman.
     */
    val titleRes: Int
}