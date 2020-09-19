package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterRecyclerView;
import com.example.myapplication.connectMongodb.Router;
import com.example.myapplication.models.DataPublications;
import com.example.myapplication.models.ListPublications;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private AdapterRecyclerView adapterRecyclerView;
    private Router router;
    private ArrayList<DataPublications> dataPublications;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerViewHome);
        recyclerView.setHasFixedSize(true);

        Call<ListPublications> listPublicationsCall =  router.obtenerPublcaciones();

        listPublicationsCall.enqueue(new Callback<ListPublications>() {
            @Override
            public void onResponse(Call<ListPublications> call, Response<ListPublications> response) {
                if (response.isSuccessful()){
                    // use a linear layout manager
                    layoutManager = new LinearLayoutManager(getBaseContext());
                    recyclerView.setLayoutManager(layoutManager);
                    // specify an adapter (see also next example)
                    dataPublications = response.body().getModelsPublicationsLists();
                    adapterRecyclerView = new AdapterRecyclerView(dataPublications,getBaseContext());
                    recyclerView.setAdapter(adapterRecyclerView);
                    recyclerView.setHasFixedSize(true);
                }
            }

            @Override
            public void onFailure(Call<ListPublications> call, Throwable t) {

            }
        });


    }
}
