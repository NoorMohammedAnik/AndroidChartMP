package com.anik.androidchartmp;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class LineChartActivity extends AppCompatActivity {


    private  static final String TAG="MAIN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);

        // in this example, a LineChart is initialized from xml
        LineChart mChart = (LineChart) findViewById(R.id.linechart);

//        mChart.setOnChartGestureListener(this);
//        mChart.setOnChartValueSelectedListener(LineChartActivity.this);

        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(true);



        ArrayList<Entry> yValues=new ArrayList<>();

        yValues.add(new Entry(0,55f));
        yValues.add(new Entry(1,65f));
        yValues.add(new Entry(2,75f));
        yValues.add(new Entry(3,65f));
        yValues.add(new Entry(4,70f));
        yValues.add(new Entry(5,65f));
        yValues.add(new Entry(6,75f));
        yValues.add(new Entry(7,60f));




        ArrayList<Entry> yValues2=new ArrayList<>();

        yValues2.add(new Entry(0,50f));
        yValues2.add(new Entry(1,600f));
        yValues2.add(new Entry(2,60f));
        yValues2.add(new Entry(3,70f));


        LineDataSet set1=new LineDataSet(yValues,"Data Set 1");
        set1.setFillAlpha(110);
        set1.setColor(Color.RED);
        set1.setLineWidth(3f);
        set1.setValueTextSize(10f);
        set1.setValueTextColor(Color.GREEN);





        ArrayList<ILineDataSet>dataSets=new ArrayList<>();
        dataSets.add(set1);

        LineData data=new LineData(dataSets);
        mChart.setData(data);






    }
}
