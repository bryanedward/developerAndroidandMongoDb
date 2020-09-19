package com.example.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataPublications {

    @SerializedName("_id")
    @Expose
    private String idpublication;

    @SerializedName("first_name")
    @Expose
    private String namepublication;

    @SerializedName("last_name")
    @Expose
    private String descriptpublication;

    public String getIdpublication() {
        return idpublication;
    }

    public String getNamepublication() {
        return namepublication;
    }

    public String getDescriptpublication() {
        return descriptpublication;
    }
}
