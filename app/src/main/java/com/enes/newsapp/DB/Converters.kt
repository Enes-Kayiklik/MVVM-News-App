package com.enes.newsapp.DB

import androidx.room.TypeConverter
import com.enes.newsapp.Model.Source


class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}