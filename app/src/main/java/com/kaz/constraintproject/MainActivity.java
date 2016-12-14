package com.kaz.constraintproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.kaz.constraintproject.fragment.Main;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Nameable;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements Main.OnFragmentInteractionListener{

    @BindView(R.id.textViewMain) TextView textViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //Fragment fragment = new Main();
        // Fragmentの追加や削除といった変更を行う際は、Transactionを利用します
        //FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        // 新しく追加を行うのでaddを使用します
        // 他にも、メソッドにはreplace removeがあります
        // メソッドの1つ目の引数は対象のVioewGroupのID、2つ目の引数は追加するfragment
        //transaction.add( R.id.frameLayout , fragment);
        // 最後にcommitを使用することで変更を反映します
        //transaction.commit();

        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withTranslucentStatusBar(false)
                .withActionBarDrawerToggle(false)
                .addDrawerItems(
                        //pass your items here
                )
                .build();

    }

    public void btnTapped(View view){
        textViewMain.setText("test");
        //Intent intent = new Intent(getApplication(), Main2Activity.class);
        //startActivity(intent);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}
