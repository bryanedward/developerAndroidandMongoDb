package com.example.myapplication.connectMongodb;

import com.example.myapplication.models.ListPublications;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Router {

    @GET("projectsCars")
    Call<ListPublications> obtenerPublcaciones();

}
