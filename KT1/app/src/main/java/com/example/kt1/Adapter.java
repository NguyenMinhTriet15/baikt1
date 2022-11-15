package com.example.kt1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter  extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CongAn> congAnList;

    public Adapter(Context context, int layout, List<CongAn> congAnList) {
        this.context = context;
        this.layout = layout;
        this.congAnList = congAnList;
    }

    @Override
    public int getCount() {
        return congAnList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        TextView txtten =   (TextView) view.findViewById(R.id.ten);
        TextView txtcapbac = (TextView) view.findViewById(R.id.capbac);
        TextView txtnoicongtac = (TextView) view.findViewById(R.id.noicongtac);
        TextView txtsosao = (TextView) view.findViewById(R.id.sosao);
        ImageView img = (ImageView) view.findViewById(R.id.hinh);
        CongAn congAn = congAnList.get(i);
        txtten.setText(congAn.getTen());
        txtcapbac.setText(congAn.getCapbac());
        txtnoicongtac.setText(congAn.getNoicongtac());
        txtsosao.setText(congAn.getSosao());
        img.setImageResource(congAn.getHinh());
        return view;
    }
}
