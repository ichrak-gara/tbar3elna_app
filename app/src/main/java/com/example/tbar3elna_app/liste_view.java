package com.example.tbar3elna_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class liste_view extends AppCompatActivity {

    String[] GROUP = {"A+", "AB-", "O+", "O-"};
    String[] NAMES = {"Ichrak Gara", "Bacem Abroug", "Malek Ghozzi", "Med Amine Boufares"};
    String[] LOCALISATION = {"sousse", "Jammel", "kairaun", "kalaa "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_view);

        ListView listView =(ListView)findViewById(R.id.listView);
        CustomAdopter customAdopter = new CustomAdopter();
        listView.setAdapter(customAdopter);
    }


    class CustomAdopter extends BaseAdapter{


        @Override
        public int getCount() {
            return GROUP.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.listview_layout, null);
            TextView textview_groupe = (TextView) view.findViewById(R.id.textView_groupe);
            TextView textView_name = (TextView) view.findViewById(R.id.textView_name);
            TextView textView_local = (TextView) view.findViewById(R.id.textView_local);

            textview_groupe.setText(GROUP[i]);
            textView_name.setText(NAMES[i]);
            textView_local.setText(LOCALISATION[i]);
            return view;
        }
    }
}