package com.example.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataPublications {

    @SerializedName("_id")
    @Expose
    private String idpublication;

    @SerializedName("marca")
    @Expose
    private String namepublication;

    @SerializedName("tipo")
    @Expose
    private String descriptpublication;

    @SerializedName("desperfecto")
    @Expose
    private String desperfectopublication;

    public String getIdpublication() {
        return idpublication;
    }

    public String getDesperfectopublication() {
        return desperfectopublication;
    }

    public String getNamepublication() {
        return namepublication;
    }

    public String getDescriptpublication() {
        return descriptpublication;
    }
}
