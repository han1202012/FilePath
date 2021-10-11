package com.example.filepath;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateExternalCacheDir();
    }

    /**
     * 应用专属外部存储空间目录下的 cache 目录
     */
    public void generateExternalCacheDir() {
        // 获取应用专属外部存储空间目录下的 cache 目录
        File cacheFile = getExternalCacheDir();
        Log.i(TAG, cacheFile.getAbsolutePath());
        if (!cacheFile.exists()) {
            // 如果 cache 目录不存在 , 则创建一系列目录
            cacheFile.mkdirs();
        }
    }
}