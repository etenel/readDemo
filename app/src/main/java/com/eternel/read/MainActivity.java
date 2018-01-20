package com.eternel.read;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.eternel.read.adapter.BookShelfAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.shelf_books)
    RecyclerView shelfBooks;
    private BookShelfAdapter bookShelfAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initListener();

    }

    private void initListener() {
        bookShelfAdapter = new BookShelfAdapter(R.layout.item_bookshelf);
        shelfBooks.setAdapter(bookShelfAdapter);
        shelfBooks.setLayoutManager(new GridLayoutManager(this, LinearLayoutManager.HORIZONTAL,3,false));

    }
}
