package h5games.handsomel.com.h5games.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

import h5games.handsomel.com.h5games.R;

public class HostActivity extends Activity implements View.OnClickListener {

    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
        initWidget();
    }

    private void initWidget(){
        fab = (FloatingActionButton)findViewById(R.id.host_fab);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.host_fab:
                H5Activity.startActivity(HostActivity.this);
                break;
        }
    }
}
