package com.anik.androidchartmp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLineChart,btnPieChart,btnBarChart,btnMultiLine,btnBarChartMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnBarChart=findViewById(R.id.btn_bar_chart);
        btnPieChart=findViewById(R.id.btn_pie_chart);
        btnLineChart=findViewById(R.id.btn_line_chart);
        btnMultiLine=findViewById(R.id.btn_multi_line);
        btnBarChartMonth=findViewById(R.id.btn_bar_chart_month);

        btnMultiLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LineChartMultiActivity.class);
                startActivity(intent);
            }
        });


        btnLineChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, LineChartActivity.class);
                startActivity(intent);
            }
        });


        btnPieChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, PieChartActivity.class);
                startActivity(intent);
            }
        });

        btnBarChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,BarChartActivity.class);
                startActivity(intent);
            }
        });


        btnBarChartMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,BarChartMonthActivity.class);
                startActivity(intent);
            }
        });


    }
}
