package app.plantdiary.individualassignment3048q.dto

import com.google.gson.annotations.SerializedName

data class Country(var name: String, @SerializedName( value = "code") var code: String) {
    override fun toString(): String {
        return name;
    }
}
