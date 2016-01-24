package h5games.handsomel.com.h5games.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import h5games.handsomel.com.h5games.R;
import h5games.handsomel.com.h5games.ui.widget.MyWebView;

public class H5Activity extends BaseActivity {


    MyWebView myWebView;

    public static void startActivity(Context context ){
        Intent intent = new Intent(context, H5Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initGame();
    }

    private void initGame(){
        myWebView = new MyWebView(this);
        setContentView(R.layout.activity_h5);
        myWebView.loadUrl("/assets/fruit_cuting/index.html");
    }

    public void startGame(){

    }


}
