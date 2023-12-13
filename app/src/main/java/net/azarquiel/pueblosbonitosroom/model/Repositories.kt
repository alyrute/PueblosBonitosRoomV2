package net.azarquiel.pueblosbonitosroom.model


import android.app.Application
import androidx.lifecycle.LiveData

class ComunidadRepository(application: Application) {

    val comunidadDao = PueblosBonitosDB.getDatabase(application).comunidadDao()
    // select
    fun getAllComunidad(): LiveData<List<Comunidad>> {
        return comunidadDao.getAllComunidad()
    }
}

class ProvinciaRepository(application: Application) {

    val provinciaDao = PueblosBonitosDB.getDatabase(application).provinciaDao()
    // select
    fun getProvinciaByComunidad(comunidad:Int): LiveData<List<Provincias>>   {
        return provinciaDao.getProvinciaByComunidad(comunidad)
    }
}

class PueblosRepository(application: Application) {

    val puebloDao = PueblosBonitosDB.getDatabase(application).puebloDao()
    // select
    fun getPueblosByProvincias(provincias: Int): LiveData<List<Pueblos>>   {
        return puebloDao.getPueblosByProvincias(provincias)
    }
    fun update(pueblos: Pueblos){
        puebloDao.update(pueblos)
    }
}


