package com.example.dan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class LessonPolitique extends AppCompatActivity {

    ExpandableTextView expandTV;
    String longtext = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_politique);

        loadTeksMateri();
        expandTV = (ExpandableTextView) findViewById(R.id.expandableTextViewLessonPoltique);
        expandTV.setText(longtext);
    }

    private void loadTeksMateri(){
        longtext = "•\tIl ne faut pas oublier que la France a été le premier pays à posséder un réseau d’ambassadeurs et que le français a été, jusqu’à la Première Guerre mondiale, la langue de la diplomatie\n" +
                "•\tLe premier principe qui guide la politique étrangère, sous l’impulsion du general de Gaulle, dans les années soixante, est celui d’indépendance. La second principe official est celui de la recherché de la solidarité avec les autres pays (afin de favoriser le progress de la paix, de la démocratie et du développement)\n" +
                "•\tLa France est l’un des cinq membres permanents du Conseil de sécurité des Nations unies (ONU) depuis sa creation en 1945.\n" +
                "•\tLe siege de l’UNESCO est à Paris.\n" +
                "•\tEn 1948, c’est à Paris que la Déclaration universelle des droits de l’homme a été adoptée.\n" +
                "•\tLa France contribute financièrement et techniquement au développement de ces pays et mène une action hummanitaire pour secourir les populations civiles en situation d’urgence.\n ";
    }
}
