package net.azarquiel.pueblosbonitosroom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "comunidad")
data class Comunidad(@PrimaryKey
                    var id: Int=0,          // atributo en entity
                    @ColumnInfo(name = "nombre")
                    var nombre:String="")



@Entity(tableName = "provincia",
    foreignKeys = [ForeignKey(entity = Comunidad::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("comunidad"))])


data class Provincias(@PrimaryKey// nombre columna en tabla
                    var id: Int=0,          // atributo en entity
                    var nombre:String="",
                    var comunidad:Int=0):Serializable





@Entity(tableName = "pueblo",
        foreignKeys = [androidx.room.ForeignKey(
         entity = Provincias::class,
         parentColumns = kotlin.arrayOf("id"),
         childColumns = kotlin.arrayOf("provincia"))])


data class Pueblos(@PrimaryKey// nombre columna en tabla
                    var id: Int=0,        // atributo en entity
                    var nombre:String="",
                    var cantidad:String="",
                    var provincia:Int=0,
                    var link:String="",
                    var fav:Int=0)

