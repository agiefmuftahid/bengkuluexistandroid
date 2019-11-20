package com.example.bengkuluexist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

public class DetailActivity extends AppCompatActivity {
    public static final String nama = "nama";
    public static final String deskripsi = "deskripsi";
    public static final String foto = "foto";
    public static final String kategori = "kategori";

    //Class for download IMAGE
    public class GetImageFromURL extends AsyncTask<String, Void, Bitmap> {
        ImageView imgView;
        Bitmap bitmap;

        public GetImageFromURL(ImageView imgV){
            this.imgView = imgV;
        }

        @Override
        protected Bitmap doInBackground(String... url) {
            String urldisplay = url[0];
            bitmap = null;
            try {
                InputStream srt = new java.net.URL(urldisplay).openStream();
                bitmap = BitmapFactory.decodeStream(srt);
            } catch (Exception e){
                e.printStackTrace();
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            imgView.setImageBitmap(bitmap);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView_nama = findViewById(R.id.detail_nama);
        String detail_nama = getIntent().getStringExtra(nama);
        textView_nama.setText(detail_nama);
        setActionBarTitle("Detail "+detail_nama);

        TextView textView_deskripsi = findViewById(R.id.detail_deskripsi);
        String detail_deskripsi = getIntent().getStringExtra(deskripsi);
        textView_deskripsi.setText(detail_deskripsi);

        TextView textView_kategori= findViewById(R.id.detail_kategori);
        String detail_kategori = getIntent().getStringExtra(kategori);
        textView_kategori.setText(detail_kategori);

        ImageView img = (ImageView) findViewById(R.id.detail_gambar);
        String detail_foto= getIntent().getStringExtra(foto);
        new GetImageFromURL(img).execute(detail_foto);
    }


    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
