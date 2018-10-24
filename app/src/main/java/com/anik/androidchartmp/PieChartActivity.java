package com.anik.androidchartmp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart pieChart=findViewById(R.id.piechart);
        pieChart.setUsePercentValues(false); //if use true the original values not show, show as % value
        pieChart.getDescription().setEnabled(false);

        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);



        ArrayList<PieEntry> yValues=new ArrayList<>();
        yValues.add(new PieEntry(74f,"Canada"));
        yValues.add(new PieEntry(54f,"USA"));
        yValues.add(new PieEntry(44f,"UK"));
        yValues.add(new PieEntry(94f,"Bangladesh"));
        yValues.add(new PieEntry(64f,"India"));
        yValues.add(new PieEntry(44f,"Pakistan"));

        pieChart.animateY(1000, Easing.EasingOption.EaseInOutCubic);

        PieDataSet dataSet=new PieDataSet(yValues,"Countries");
        dataSet.setSliceSpace(3f);

        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData data=new PieData(dataSet);
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.YELLOW);
        pieChart.setData(data);

        pieChart.setCenterText("Comparision");



    }
}
