package app.plantdiary.individualassignment3048q.dto

import com.google.gson.annotations.SerializedName

data class Country(var names: String, @SerializedName("codes") var codes: String) {
    public final var code = names
    public final var name = codes
    override fun toString(): String {
        var stringformat = name + " " + code
        return stringformat

    }
}
