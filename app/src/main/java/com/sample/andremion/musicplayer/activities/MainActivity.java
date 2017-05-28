/*
 * Copyright (c) 2016. André Mion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sample.andremion.musicplayer.activities;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import java.text.SimpleDateFormat;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.sample.andremion.musicplayer.R;
import com.sample.andremion.musicplayer.music.MusicContent;
import com.sample.andremion.musicplayer.view.RecyclerViewAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends PlayerActivity {

    private View mCoverView;
    private View mTitleView;
    private View mTimeView;
    private View mDurationView;
    private View mProgressView;
    private View mFabView;
    public String ClassName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ClassName="MainActivity";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Log.d("AlertMessage","Activity "+ClassName+"正在执行onCreate 被创建了  时间:"+formatter.format(new Date()));
        super.onCreate(savedInstanceState);

        setContentView(R.layout.content_list);

        //
        mCoverView = findViewById(R.id.cover);
        mTitleView = findViewById(R.id.title);
        mTimeView = findViewById(R.id.time);
        mDurationView = findViewById(R.id.duration);
        mProgressView = findViewById(R.id.progress);
        mFabView = findViewById(R.id.fab);

        // Set the recycler adapter
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tracks);
        assert recyclerView != null;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerViewAdapter(MusicContent.ITEMS));
        Log.d("AlertMessage","Activity "+ClassName+"完成执行onCreate 时间:"+formatter.format(new Date()));
    }

    public void onFabClick(View view) {
        //noinspection unchecked
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                new Pair<>(mCoverView, ViewCompat.getTransitionName(mCoverView)),
                new Pair<>(mTitleView, ViewCompat.getTransitionName(mTitleView)),
                new Pair<>(mTimeView, ViewCompat.getTransitionName(mTimeView)),
                new Pair<>(mDurationView, ViewCompat.getTransitionName(mDurationView)),
                new Pair<>(mProgressView, ViewCompat.getTransitionName(mProgressView)),
                new Pair<>(mFabView, ViewCompat.getTransitionName(mFabView)));
        ActivityCompat.startActivity(this, new Intent(this, DetailActivity.class), options.toBundle());
    }
    @Override
    protected void onDestroy() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Log.d("AlertMessage","Activity "+ClassName+"正在执行onDestroy 被销毁了  时间:"+formatter.format(new Date()));
        super.onDestroy();
        Log.d("AlertMessage","Activity "+ClassName+"完成执行onDestroy 时间:"+formatter.format(new Date()));
    }
    @Override
    protected void onStart() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Log.d("AlertMessage","Activity "+ClassName+"正在执行onStart 正在显示出来  时间:"+formatter.format(new Date()));
        super.onStart();
        Log.d("AlertMessage","Activity "+ClassName+"完成执行onStart 时间:"+formatter.format(new Date()));
    }
    @Override
    protected void onStop() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Log.d("AlertMessage","Activity "+ClassName+"正在执行onStop 退出前台了  时间:"+formatter.format(new Date()));
        super.onStop();
        Log.d("AlertMessage","Activity "+ClassName+"完成执行onStop 时间:"+formatter.format(new Date()));
    }
    @Override
    protected void onResume() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Log.d("AlertMessage","Activity "+ClassName+"正在执行onResume 正要已经出现  时间:"+formatter.format(new Date()));
        super.onResume();
        Log.d("AlertMessage","Activity "+ClassName+"完成执行onResume 时间:"+formatter.format(new Date()));
    }
    @Override
    protected void onPostResume(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Log.d("AlertMessage","Activity "+ClassName+"正在执行onPostResume 正要已经出现  时间:"+formatter.format(new Date()));
        super.onPostResume();
        Log.d("AlertMessage","Activity "+ClassName+"完成执行onPostResume 时间:"+formatter.format(new Date()));
    }
    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Log.d("AlertMessage","Activity "+ClassName+"正在执行onTitleChanged 正要已经出现  时间:"+formatter.format(new Date()));
        super.onTitleChanged(title, color);
        Log.d("AlertMessage","Activity "+ClassName+"完成执行onTitleChanged时间:"+formatter.format(new Date()));
    }
    protected void onPause() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Log.d("AlertMessage","Activity "+ClassName+"正在执行onPause 看不到了 时间:"+formatter.format(new Date()));
        super.onPause();

        Log.d("AlertMessage","Activity "+ClassName+"完成执行onResume 时间:"+formatter.format(new Date()));
    }
}

