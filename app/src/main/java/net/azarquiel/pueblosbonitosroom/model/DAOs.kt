package net.azarquiel.pueblosbonitosroom.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.Delete
import androidx.room.Update

@Dao
interface ComunidadDao {
    @Query("SELECT * from comunidad ORDER BY nombre ASC")
    fun getAllComunidad(): LiveData<List<Comunidad>>

}

interface ProvinciaDao {


    @Query("SELECT * from provincia where comunidad= :comunidad")
    fun getProvinciaByComunidad(comunidad:Int): LiveData<List<Provincias>>



}


interface PuebloDao {
    @Query("SELECT * from pueblo where provincia=:provincia")
    fun getPueblosByProvincias(provincia:Int): LiveData<List<Pueblos>>

    @Update
    fun update(pueblos: Pueblos)





}
