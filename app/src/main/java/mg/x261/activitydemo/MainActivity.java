package mg.x261.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

//import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;


    private String[] activityNames = {"ActivityCheckbox", "ActivityDatePicker", "ActivityDatePickerDialog",
            "ActivityListView", "ActivityProgressBar", "ActivityRadioButton", "ActivityRating",
            "ActivityRunnableThreadHandler", "ActivityScrollView", "ActivitySpinner", "ActivitySwitch",
            "ActivityTimePicker", "LoadImage", "MainButton", "MainCalendarView", "MainDialog",
            "MainEditText", "MainImageView", "MainLinearLayout", "MainRelativeLayout", "MainSeekBar",
            "MainTable", "MainTextView", "MainToast"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.activity_list_view);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, activityNames);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Intent intent = null;

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (activityNames[i]) {
                    case "ActivityCheckbox":
                        intent = new Intent(MainActivity.this, ActivityCheckbox.class);
                        break;
                    case "ActivityDatePicker":
                        intent = new Intent(MainActivity.this, ActivityDatePicker.class);
                        break;
                    case "ActivityDatePickerDialog":
                        intent = new Intent(MainActivity.this, ActivityDatePickerDialog.class);
                        break;
                    case "ActivityListView":
                        intent = new Intent(MainActivity.this, ActivityListView.class);
                        break;
                    case "ActivityProgressBar":
                        intent = new Intent(MainActivity.this, ActivityProgressBar.class);
                        break;
                    case "ActivityRadioButton":
                        intent = new Intent(MainActivity.this, ActivityRadioButton.class);
                        break;
                    case "ActivityRating":
                        intent = new Intent(MainActivity.this, ActivityRating.class);
                        break;
                    case "ActivityRunnableThreadHandler":
                        intent = new Intent(MainActivity.this, ActivityRunnableThreadHandler.class);
                        break;
                    case "ActivityScrollView":
                        intent = new Intent(MainActivity.this, ActivityScrollView.class);
                        break;
                    case "ActivitySpinner":
                        intent = new Intent(MainActivity.this, ActivitySpinner.class);
                        break;
                    case "ActivitySwitch":
                        intent = new Intent(MainActivity.this, ActivitySwitch.class);
                        break;
                    case "ActivityTimePicker":
                        intent = new Intent(MainActivity.this, ActivityTimePicker.class);
                        break;
                    case "LoadImage":
                        intent = new Intent(MainActivity.this, LoadImage.class);
                        break;
                    case "MainButton":
                        intent = new Intent(MainActivity.this, MainButton.class);
                        break;
                    case "MainCalendarView":
                        intent = new Intent(MainActivity.this, MainCalendarView.class);
                        break;
                    case "MainDialog":
                        intent = new Intent(MainActivity.this, MainDialog.class);
                        break;
                    case "MainEditText":
                        intent = new Intent(MainActivity.this, MainEditText.class);
                        break;
                    case "MainImageView":
                        intent = new Intent(MainActivity.this, MainImageView.class);
                        break;
                    case "MainLinearLayout":
                        intent = new Intent(MainActivity.this, MainLinearLayout.class);
                        break;
                    case "MainRelativeLayout":
                        intent = new Intent(MainActivity.this, MainRelativeLayout.class);
                        break;
                    case "MainSeekBar":
                        intent = new Intent(MainActivity.this, MainSeekBar.class);
                        break;
                    case "MainTable":
                        intent = new Intent(MainActivity.this, MainTable.class);
                        break;
                    case "MainTextView":
                        intent = new Intent(MainActivity.this, MainTextView.class);
                        break;
                    case "MainToast":
                        intent = new Intent(MainActivity.this, MainToast.class);
                        break;
                    default:
                        break;
                }
                startActivity(intent);
            }
        });
    }
}












