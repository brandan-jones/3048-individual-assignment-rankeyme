package app.plantdiary.individualassignment3048q

import app.plantdiary.individualassignment3048q.dto.Country
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


public interface ICountryDAO {

    @GET("/core/country-list")
    fun getAllCountries(): Call<ArrayList<Country>>

    @GET("/core/country-list")
    fun getCountries(@Query("Combined_Name") countryName:String) : Call<ArrayList<Country>>


}
