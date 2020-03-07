package com.example.shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

        ImageView i = findViewById(R.id.imageView);
        i.setBackground(new BitmapDrawable(this.getResources(),bg));

        Canvas canvas = new Canvas(bg);

        Paint paint,textcolor;
        paint = new Paint();
        textcolor=new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(50);
        textcolor.setColor(Color.BLACK);
        textcolor.setTextSize(50);

        canvas.drawText("Rectangle", 420, 150, textcolor);
        canvas.drawRect(400, 200, 650, 700, paint);

        canvas.drawText("Circle", 120, 150, textcolor);
        canvas.drawCircle(200, 350, 150, paint);

        canvas.drawText("Square", 120, 800, textcolor);
        canvas.drawRect(50, 850, 350, 1150, paint);

        canvas.drawText("Line", 480, 800, textcolor);
        canvas.drawLine(520, 850, 520, 1150, paint);
    }
}
