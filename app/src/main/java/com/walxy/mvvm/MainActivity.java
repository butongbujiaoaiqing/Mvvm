package com.walxy.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.walxy.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserEntity userEntity = new UserEntity();

        userEntity.setAge(21);
        userEntity.setNickname("lufei");
        userEntity.setUsername("路飞");
        userEntity.setImage("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=366589626,1283096638&fm=27&gp=0.jpg");

        mainBinding.setUser(userEntity);

    }
}
