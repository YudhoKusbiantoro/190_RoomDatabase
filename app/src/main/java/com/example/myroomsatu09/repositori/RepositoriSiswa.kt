package com.example.myroomsatu09.repositori

import com.example.myroomsatu09.room.Siswa
import com.example.myroomsatu09.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
    //edit 1 : tambah 3 fungsi berikut
    fun getSiswaStream(id: Int): Flow<Siswa?>
    suspend fun deleteSiswa(siswa:Siswa)
    //suspend fun updateSiswa(siswa:Siswa)
    suspend fun updateSiswa(siswa: Siswa)
}
class OffLineRepositoriSiswa(
    private val siswaDao: SiswaDao
): RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)

    //edit 2: tambah 2ovverage berikut
    override fun getSiswaStream(id : Int): Flow<Siswa?> =siswaDao.getSiswa(id)
    override suspend fun deleteSiswa(siswa:Siswa) =siswaDao.delete(siswa)
    //override suspend fun updateSiswa(siswa: Siswa) = siswaDao.update(siswa)

    override suspend fun updateSiswa(siswa: Siswa) = siswaDao.update(siswa)
    }

