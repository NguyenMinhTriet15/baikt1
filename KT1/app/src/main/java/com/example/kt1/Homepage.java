package com.example.kt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Homepage extends AppCompatActivity {
    ListView lvca;
    ArrayList<CongAn> arrayCA;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Anhxa();
        adapter = new Adapter(this, R.layout.dong,arrayCA);
        lvca.setAdapter(adapter);
    }

    private void Anhxa() {
        lvca = (ListView) findViewById(R.id.lvCA);
        arrayCA = new ArrayList<>();
        arrayCA.add(new CongAn("Nguyen Minh Triet","Thuong ta", "Da Nang", "So sao: 5", R.drawable.logoca));
        arrayCA.add(new CongAn("Nguyen Minh Thanh","Thieu ta", "Ha Noi", "So sao: 4", R.drawable.logoca));
        arrayCA.add(new CongAn("Nguyen Minh Nghia","Dai ta", "Ho Chi Minh", "So sao: 3", R.drawable.logoca));
        arrayCA.add(new CongAn("Nguyen Minh","Thieu Uy", "Nha Trang", "So sao: 6", R.drawable.logoca));

    }
}