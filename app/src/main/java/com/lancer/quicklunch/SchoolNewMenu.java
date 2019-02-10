package com.lancer.quicklunch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class SchoolNewMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_new_menu);
        Button btn = (Button)findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SchoolNewMenu.this, SchoolLiveMenu.class));
            }
        });
        /* Find Tablelayout defined in main.xml */
        TableLayout tl = (TableLayout) findViewById(R.id.tableLayout1);
        /* Create a new row to be added. */
        TableRow tr = new TableRow(this);
        tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
        /* Create a Button to be the row-content. */
        Button b = new Button(this);
        b.setText("Dynamic Button");
        b.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
        /* Add Button to row. */
        tr.addView(b);
        /* Add row to TableLayout. */
//tr.setBackgroundResource(R.drawable.sf_gradient_03);
        tl.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
    }
}
