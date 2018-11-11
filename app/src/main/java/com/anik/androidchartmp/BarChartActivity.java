package com.anik.androidchartmp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        barChart=findViewById(R.id.barchart);

        barChart.setDrawBarShadow(false);

        barChart.setDrawValueAboveBar(true);

        barChart.setMaxVisibleValueCount(50);
        barChart.setPinchZoom(false);
        barChart.setDrawGridBackground(true);

        ArrayList<BarEntry> barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1,35f));
        barEntries.add(new BarEntry(2,44f));
        barEntries.add(new BarEntry(3,60f));
        barEntries.add(new BarEntry(4,54f));


        BarDataSet barDataSet=new BarDataSet(barEntries,"Data Set 1");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        BarData barData=new BarData(barDataSet);
        barData.setBarWidth(0.9f);

        barChart.setData(barData);




    }
}
