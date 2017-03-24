package jp.techacademy.katsuhito.muratomi.javalog;

import android.util.Log;

/**
 * Created by katsu on 2017/03/24.
 */

public class Human extends Animal implements Thinkable{

    String name;
    String hobby;
    int age;



    public Human(String name ,String hobby,int age){
        this.name=name;
        this.hobby=hobby;
        this.age=age;
    }

    public void say(){
        Log.d("javatest","「私の名前は"+this.name+"です。年は"+this.age+"歳です。」");
    }

    @Override
    public void think() {
        Log.d("javatest","「私は"+this.hobby+"について考える。」");
    }
}
