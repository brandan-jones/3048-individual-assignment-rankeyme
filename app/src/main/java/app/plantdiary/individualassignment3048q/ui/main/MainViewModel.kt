package app.plantdiary.individualassignment3048q.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import app.plantdiary.individualassignment3048q.dto.Country
import app.plantdiary.individualassignment3048q.service.CountryService

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private  var _countries: MutableLiveData<ArrayList<Country>> = MutableLiveData<ArrayList<Country>>()
    var countryService: CountryService = CountryService()

    init {
        fetchCountries()
    }

    fun fetchCountries() {
        _countries = countryService.fetchCountries()
    }

    internal var countries:MutableLiveData<ArrayList<Country>>
        get() {return _countries}
        set(value) {_countries = value}


}
