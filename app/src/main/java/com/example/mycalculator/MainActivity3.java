package com.example.mycalculator;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity3 extends AppCompatActivity implements GalleryAdapter.OnItemClickListener {
    private RecyclerView recyclerView;
    private GalleryAdapter adapter;
    private List<String> imageUrls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        imageUrls = getImageUrls(); // Replace with your method to fetch image URLs

        adapter = new GalleryAdapter(this, imageUrls);
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {
        String imageUrl = imageUrls.get(position);
        // Handle click event for an image item
        Toast.makeText(this, "Clicked image URL: " + imageUrl, Toast.LENGTH_SHORT).show();
    }

    private List<String> getImageUrls() {
        // Replace with your method to fetch image URLs from your data source
        List<String> urls = new ArrayList<>();
        urls.add("https://example.com/image1.jpg");
        urls.add("https://example.com/image2.jpg");
        urls.add("https://example.com/image3.jpg");
        // Add more image URLs as needed
        return urls;
    }
}
