package com.example.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataPublications {

    @SerializedName("_id")
    @Expose
    private String idpublication;

    @SerializedName("tipo")
    @Expose
    private String namepublication;
    private String descriptpublication;
    private String urgencia;
    private String tipo;
    private String fecha;


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
