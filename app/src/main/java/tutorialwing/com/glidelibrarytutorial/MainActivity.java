package tutorialwing.com.glidelibrarytutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Initialize ImageView
		ImageView imageView = (ImageView) findViewById(R.id.imageView);

		//Loading image from below url into imageView
		Glide.with(this)
				.load("http://goo.gl/gEgYUd")
				.diskCacheStrategy(DiskCacheStrategy.ALL)
				.placeholder(R.drawable.ani_cat)
				.error(R.drawable.ani_cat)
				.override(200, 200)
				.centerCrop()
				.into(imageView);
	}
}
