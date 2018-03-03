package com.taobao.remotebunle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RemoteBundleActivity extends Activity {
private TextView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote_bundle);
        a= (TextView) findViewById(R.id.txta);
    }
}
