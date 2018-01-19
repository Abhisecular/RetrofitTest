package com.example.abhi.retrofittest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Abhi on 16-01-2018.
 */

public interface ApiInterface {

       @POST("readcontacts.php")
     Call<List<Contact>> getContacts();
}
