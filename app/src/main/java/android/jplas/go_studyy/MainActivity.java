package android.jplas.go_studyy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView a = (TextView)findViewById(R.id.b1);
        TextView b = (TextView)findViewById(R.id.b2);
        TextView c = (TextView)findViewById(R.id.b3);
        TextView d = (TextView)findViewById(R.id.b4);
        TextView e = (TextView)findViewById(R.id.b5);
        TextView f = (TextView)findViewById(R.id.b6);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                Intent b = new Intent( MainActivity.this, alphabet.class);
                startActivity(b);
            }


        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {
                Intent z = new Intent (MainActivity.this, angka.class);
                startActivity(z);
            }

        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                Intent z = new Intent (MainActivity.this, hewan.class);
                startActivity(z);
            }

        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View d) {
                Intent z = new Intent (MainActivity.this, buah.class);
                startActivity(z);
            }

        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent z = new Intent (MainActivity.this, menghitung.class);
                startActivity(z);
            }

        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View f) {
                Intent z = new Intent (MainActivity.this, Teman.class);
                startActivity(z);
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.biodata){
            startActivity(new Intent(MainActivity.this, About.class));
        } else if (item.getItemId()==R.id.pengujian){
            startActivity(new Intent(MainActivity.this, Membaca.class));
        } else if (item.getItemId()==R.id.about){
            startActivity(new Intent(MainActivity.this, Riwayat.class));
        }else if (item.getItemId()==R.id.login){
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
        return true;

    }
}
