package jp.techacademy.katsuhito.muratomi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human =new Human("muratomi","java",30);

        human.say();
        human.think();

    }
}
