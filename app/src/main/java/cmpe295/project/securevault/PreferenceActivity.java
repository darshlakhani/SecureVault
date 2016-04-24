package cmpe295.project.securevault;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Robin on 4/22/2016.
 */
public class PreferenceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preference_activity);

        Spinner category = (Spinner) findViewById(R.id.spCategory);

        ArrayAdapter<CharSequence> cAdapter = ArrayAdapter.createFromResource(this,R.array.app_category, android.R.layout.simple_spinner_item);
        cAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        category.setAdapter(cAdapter);


    }
}
