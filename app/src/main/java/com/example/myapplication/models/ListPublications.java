package com.example.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ListPublications {

    @SerializedName("publications")
    @Expose
    private ArrayList<DataPublications> modelsPublicationsLists = null;

    public ArrayList<DataPublications> getModelsPublicationsLists() {
        return modelsPublicationsLists;
    }

}
