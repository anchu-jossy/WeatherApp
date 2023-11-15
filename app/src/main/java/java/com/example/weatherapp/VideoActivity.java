package java.com.example.weatherapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weatherapp.R;


public class VideoActivity extends AppCompatActivity {

    String videopath;
    TextView tvDesc, tvheader;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tvDesc = findViewById(R.id.textView);
        tvheader = findViewById(R.id.tv_header);
        VideoView videoView = findViewById(R.id.videoView);

        Intent mIntent = getIntent();
        String weatherCondition = mIntent.getStringExtra("Weather-Type");
        tvheader.setText(weatherCondition+" "+"Weather");
        if (weatherCondition != null) {
//            if (weatherCondition.equals(WeatherConstants.THUNDERSTORM)) {
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.thunderstome;
//                tvDesc.setText(R.string.thunderstorm);
//            } else if (weatherCondition.equals(WeatherConstants.DRIZZLE)) {
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.rainfall;
//                tvDesc.setText(R.string.drizzle);
//
//            } else if (weatherCondition.equals(WeatherConstants.RAIN)) {
//                tvDesc.setText(R.string.rainfall);
//
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.rainfall;
//            } else if (weatherCondition.equals(WeatherConstants.SNOW)) {
//                tvDesc.setText(R.string.snow);
//
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.snowfall;
//            } else if (weatherCondition.equals(WeatherConstants.MIST)) {
//                tvDesc.setText(R.string.mist);
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.misty;
//            } else if (weatherCondition.equals(WeatherConstants.SMOKE)) {
//                tvDesc.setText(R.string.smoke);
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.misty;
//
//            } else if (weatherCondition.equals(WeatherConstants.HAZE)) {
//                tvDesc.setText(R.string.haze);
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.misty;
//            } else if (weatherCondition.equals(WeatherConstants.DUST)) {
//                tvDesc.setText(R.string.dusty);
//
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.sandy;
//            } else if (weatherCondition.equals(WeatherConstants.FOG)) {
//                tvDesc.setText(R.string.fog);
//
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.fog;
//            } else if (weatherCondition.equals(WeatherConstants.SAND)) {
//                tvDesc.setText(R.string.sandy);
//
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.sandy;
//            } else if (weatherCondition.equals(WeatherConstants.ASH)) {
//                tvDesc.setText(R.string.ash);
//
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.ash;
//            } else if (weatherCondition.equals(WeatherConstants.SQUALL)) {
//                tvDesc.setText(R.string.squal);
//
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.ash;
//            } else if (weatherCondition.equals(WeatherConstants.CLEAR)) {
//                tvDesc.setText(R.string.clear);
//
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.clear;
//            } else if (weatherCondition.equals(WeatherConstants.CLOUDY)) {
//                tvDesc.setText(R.string.cloudy);
//
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.cloudy;
//            } else {
//                tvDesc.setText(R.string.ash);
//
//                videopath = "android.resource://" + getPackageName() + "/" + R.raw.ash;
//            }
        } else {
            tvDesc.setText(R.string.clear);
          //  videopath = "android.resource://" + getPackageName() + "/" + R.raw.water;
        }
        Uri uri = Uri.parse(videopath);
        videoView.setVideoPath(uri.toString());


        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        mediaController.setAnchorView(videoView);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // Handle the custom action for the back button

            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

