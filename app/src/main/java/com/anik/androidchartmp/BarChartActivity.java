package com.anik.androidchartmp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
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

        barEntries.add(new BarEntry(5,35f));
        barEntries.add(new BarEntry(6,44f));
        barEntries.add(new BarEntry(7,60f));
        barEntries.add(new BarEntry(8,54f));

        barEntries.add(new BarEntry(9,35f));
        barEntries.add(new BarEntry(10,44f));
        barEntries.add(new BarEntry(11,60f));
        barEntries.add(new BarEntry(12,54f));


        String []monthList={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        XAxis xAxis = barChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(monthList));
        xAxis.setCenterAxisLabels(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGranularity(1);
        xAxis.setGranularityEnabled(true);
        xAxis.setLabelCount(12);

        BarDataSet barDataSet=new BarDataSet(barEntries,"Data Set 1");
        barDataSet.setColors(ColorTemplate.LIBERTY_COLORS);
        //barDataSet.setColors(ColorTemplate.PASTEL_COLORS);
        BarData barData=new BarData(barDataSet);
        barData.setBarWidth(0.9f);

        barChart.setData(barData);

        barChart.setScaleEnabled(false);  //for fixed bar chart,no zoom


    }
}
