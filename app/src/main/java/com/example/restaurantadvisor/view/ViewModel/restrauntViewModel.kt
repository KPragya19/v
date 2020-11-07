package com.example.restaurantadvisor.view.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.restaurantadvisor.model.restaurant

class restrauntViewModel:ViewModel() {

    val restrauntListLivedata = MutableLiveData<ArrayList<restaurant>>()

    fun populatedata(){
        val r1= restaurant("Le Plaisir","Rajkamal Survey No. 759/125, Prabhat Road, Opposite Cox and Kings, Near, Kelkar Nursing Home, Pune","Chicken, Potato Fries",4)
        val r2=restaurant("Little Italy Restaurant","Shivajinagr, Pune.","Burger and Mayo Roll",5)
        val r3=restaurant("Alto Vino","SB Road, Pune","Manchow soup,Schezwan Noodles",3)
        val r4= restaurant("Sai Rachna","Model Colony, Pune","Non - Veg and Veg Thali",5)
        val r5= restaurant("Behrouz Biryani","Shivaginagar Pune","Chicken Tikka Biryani",5)
        val r6=restaurant("Spice Kitchen - JW Marriot","SB Road, Pune","Coffee and Breakfast",5)
        val r7= restaurant("Boteco - Restaurante Brasileiro","Koregaon park, Pune","Exotic Dishes",5)

        val restrauList = ArrayList<restaurant>()
        restrauList.add(r1)
        restrauList.add(r2)
        restrauList.add(r3)
        restrauList.add(r4)
        restrauList.add(r5)
        restrauList.add(r6)
        restrauList.add(r7)

        restrauntListLivedata.postValue(restrauList)
    }
}