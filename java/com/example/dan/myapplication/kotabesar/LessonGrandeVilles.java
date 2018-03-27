package com.example.dan.myapplication.kotabesar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.dan.myapplication.R;
import com.example.dan.myapplication.kotabesar.adapter.VilleAdapter;
import com.example.dan.myapplication.kotabesar.model.Ville;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LessonGrandeVilles extends AppCompatActivity {

    RecyclerView mRecyclerView;
    VilleAdapter mVilleAdapter;
    List<Ville> mVilleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_grande_villes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_grande_villes);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        //data
        generateDataKota();

        mVilleAdapter = new VilleAdapter(this,mVilleList);
        mRecyclerView.setAdapter(mVilleAdapter);
    }

    private void generateDataKota(){
        mVilleList = new ArrayList<>();
        
        mVilleList.add(
                new Ville("La Picardie",1,R.drawable.la_picardie,
                        R.drawable.la_picardie, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar3
                        "- c’est une regions agricole (le blé et l’orge)\n" +
                                "- La Capitale régionale est Amiens (environ 140.000 habitants)\n" +
                                "- Les départments sont Aisne, Oise, et Somme \n",
                        "textOnly")
        );
        mVilleList.add(
                new Ville("Le Nord-Pas-de-Calais",2,R.drawable.le_nord_pas_de_calais,
                        R.drawable.detil_le_nord_pas_de_calais, //gambar1
                        R.drawable.detil_le_nord_pas_de_calais2, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- c’est le carrefour de l’Europe par sa positon entre Nord et Sud,  Est et Ouest.\n" +
                                "- cette région a vécu grâce aux mines de charbon, mais a été farméé en 1990\n" +
                                "- la capitale régionale est Lille ( environ 200.000 habitants)\n" +
                                "- Les départments sont Nord et Pas-de-Calais \n",
                        "bergambar2")
        );
        mVilleList.add(
                new Ville("La Champagne-Ardenne",3,
                        R.drawable.la_champagne_ardenne, //imageVille
                        R.drawable.detil_la_champagne_ardenne, //imageDetailVille1
                        R.drawable.detil_la_champagne_ardenne2, //imageDetailVille2
                        R.drawable.la_picardie, //imageDetailVille2
                        "- trés connu grâce à le champagne et ses caves\n" +
                                "- Le succèss de vin se traduit en chiffres : en 1999, 327 millions de bouteilles ont été vendues\n" +
                                "- La Capitale régionale est Châlons-en-Champagne (environ 50.000 habitants)\n" +
                                "- Les départments sont Ardennes, Aube, Marne, et Marne(haute) \n",
                        "bergambar2") //materi
        );
        mVilleList.add(
                new Ville("L’Alsace / La Lorraine",4,R.drawable.alsace_lorraine,
                        R.drawable.la_picardie, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- Elles sont deux régions frontaliéres avec une forte identité culturelle et une histoire tourmentée\n" +
                                "- Elles sont les seules régions de France où s’applique le concordat\n" +
                                "- Starsbourg est la capitale régionale de l’Alsace et Metz est la capitale régionale de la Lorraine \n" +
                                "- Il y a environ 267.000 habitants à l’Alsace et 127.000 habitants à la Lorraine\n" +
                                "- Les départements de l’Alsace sont Rhin (Bas) et Rhin (Haute)\n" +
                                "- Les départements de Lorraine sont Meurthe-et-Moselle, Meuse, Moselle, et Vosges\n",
                        "textOnly")
        );
        mVilleList.add(
                new Ville("La Bourgogne",5,R.drawable.bourgogne,
                        R.drawable.detil_la_bourgogne, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- Trés vite, les vins de Bourgogne ont connu une grande rénomée\n" +
                                "- Le plus beau et le plus appécie de ces paysages est le vignoble \n" +
                                "- Le vignoble de la côte d’Or s’étend sur plus de 60 kilomètres  c’est la voie royale pour les gastronomes\n" +
                                "- La capitale regionale est Dijon (environ 150.000 habitants)\n" +
                                "- Les départements sont Côte d'or, Nievre, Saône-et-loire, Yonne \n",
                        "bergambar1")
        );

        //6
        mVilleList.add(
                new Ville("La Franche-Comté",6,R.drawable.la_franche_comte,
                        R.drawable.detil_la_franche_comte, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- Cette région deviant française en 1678\n" +
                                "- À la demande de louis XIV, qui souhaite une ville fortifé à l’est du pays, Vauban construit une citadelle\n" +
                                "- La capitale regional est Besançon (environ 120.000 habitants)\n" +
                                "- Les départements sont Doubs, Jura, Saône (haute), Belfort (Ter.de)\n",
                        "bergambar1")
        );
        mVilleList.add(
                new Ville("La Normandie (haute) / La Normandie (Basse)",7,R.drawable.la_normandie,
                        R.drawable.la_picardie, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- La Normandie comprend la Haute-Normandie et la Basse-Normandie\n" +
                                "- La capitale regionals de la Haute-Normandie est Rouen (environ 105.000 habitants)\n" +
                                "- La capitale regionale de la Basse-Normandie est Caen (environ 115.000 habitants)\n" +
                                "- C’est une région la plus pluvieuse de France\n" +
                                "- C’est ici que les américains ont débarque en 1944\n" +
                                "- Les départements de la Haute-Normandie sont Eure et Seine-Mariim\n" +
                                "- Les départements de la Basse-Normanide sont Calvados, Manche,et Orne \n",
                        "textOnly")
        );
        mVilleList.add(
                new Ville("La Bretagne",8,R.drawable.la_bretagne,
                        R.drawable.la_picardie, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- Elle est la région la plus à l’ouest de la France\n" +
                                "- Grâce à la variété de ses côtes et à sa vingtaine d’îles (les plus importantes sont Batz, Bréhat, Ouessant, Belle-île, Groix) grâce à ses villages de grannit et à ses églises, c’est \n" +
                                "- une région touristique\n" +
                                "- La pêche reste active (Lorient, douarnenez)\n" +
                                "- Elle est aussi devenue une région d’industries et de services\n" +
                                "- La capitale régionale est Rennes (environ 250.000 habitants)\n" +
                                "- Les départements sont Côtes-D’armor, Finistère, Ille-et-Vilaine, Morbihan\n",
                        "textOnly")
        );
        mVilleList.add(
                new Ville("Le Centre",9,R.drawable.le_centre,
                        R.drawable.detil_le_centre_1, //gambar1
                        R.drawable.detil_le_centre_2, //gambar2
                        R.drawable.detil_le_centre_3, //gambar2
                        "- Il se distingue principalement pour ses plaines et ses fôrets\n" +
                                "- Il est la région riches d’histoire et de vestiges du passé comme La Cathédrale de Chartres, La Cathédrale de Bourges et La Vieille ville de Tours\n" +
                                "- La capitale régionale est Orléans (environ 113.000 habitants)\n" +
                                "- Les départements sont Cher, Eure-et-Loire, Indre, Indre-et-Loire, Loir-et-cher, et loiret \n",
                        "bergambar3")
        );
        mVilleList.add(
                new Ville("Les Pays de la Loire",10,R.drawable.les_pays_de_la_loire,
                        R.drawable.detil_le_centre_1, //gambar1
                        R.drawable.detil_le_centre_2, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- La variété des paysages, la douceur du climat et, bien entendu, les châteaux royaux de la Renaissance\n" +
                                "- Cette région se distingue surtout pour ses côtes trés fréquentées par les families en été (vendée)\n" +
                                "- Elle est la région riches d’histoire et de vestiges du passé, comme la cathédrale de Chartres et la Cathédrale de Bourges\n" +
                                "- La capitale régionale est Nantes (environ 270.000 habitants)\n" +
                                "- Les départements sont Loire-Atlantique, Maine-et-Loire, Mayenne, Sarthe, et Vandée \n",
                        "bergambar2")
        );

        //11
        mVilleList.add(
                new Ville("Ile-de-France",11,R.drawable.lle_de_france,
                        R.drawable.la_picardie, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- L-île-de-France est la région située autour de Paris\n" +
                                "- Malgré la décentralisation, I’ île-de-France occupe une place centrale administrativement, démographiquement, économiquement et politiquement\n" +
                                "- La plus peuplée de France, environ 11 milions d’habitants\n" +
                                "- La première destination touristique du monde, 21 miillion de visiteur par un\n" +
                                "- On trouve dans la région les monument de <<Paris historique>> et les nouvelles réalisations parisiennes, comme la bibliothéque nationale de France les nouveaux jardins comme le parc citroën, de nombreux théâtres, des salles de concerts ou de cinema, et des musées\n" +
                                "- Les départmenets sont Seine-et-Marne,Yvelines, Essonne, Val-d’Oise \n",
                        "DKI")
        );
        mVilleList.add(
                new Ville("Auvergne / Limousin",12,R.drawable.auvergne_limousin,
                        R.drawable.detil_auvergne_limousin, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- Ils se situent dans le Massif Central\n" +
                                "- En ce qui concerne le paysage, ce sont des régions très vertes et très riches en eau, grâce aux nombreuses sources et à l’humidité du climat\n" +
                                "- L’Auvergne est la terre des volcans (aujourd’hui éteints) des lacs et des sources thermals (Vichy, Mont-Dore)\n" +
                                "- Le Limousin présente des plateaux couverts de prairies et de forêts\n" +
                                "- La capitale régionale de l’Auvergne est Clermont-ferrand (environ 141.000 habitants)\n" +
                                "- La capitale régionale du Limousin est Limoges (environ 137.000 habitants)\n" +
                                "- Les départements de l’Auvergne sont Allier, Cantal, Loire (haute), Puy-de-dôme  \n" +
                                "- Les départements du Limousin sont Corréze, Creuse, Vienne (haute) \n",
                        "bergambar1")
        );
        mVilleList.add(
                new Ville("Rhône-Alpes",13,R.drawable.rhone_alpes,
                        R.drawable.detil_rhone_alpes, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- Rhône-Alpes est la deuxième région économique de France, grâce à une économie diversifiée  et un bon réseau de communication\n" +
                                "- Cette vaste région aux paysages variés (haute montagnes dans les Alpes, large vallée author des fleuves saôneet Rhône, montagnes douces dans le Massif Central)\n" +
                                "- La capitale région de Rhône-Alpes est Lyon (environs 1.600.000 habitants) \n" +
                                "- Les département sont Ain, Ardéche, Drôme, Isère, Rhône, Savoie, Savoie (haute), et Loire\n",
                        "bergambar1")
        );
        mVilleList.add(
                new Ville("Paca",14,R.drawable.paca,
                        R.drawable.la_picardie, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- La région Provence-Alpes-Côte d’Azur (PACA)\n" +
                                "- La région vit surtout de l’industrie touristique, mais présente des aspects contrastés\n" +
                                "- Sur la Côte d’Azur, à l’est, se trouvent les stations balnéaires mais aussi des activités de haute technologie\n" +
                                "- À l’intérieur, la beauté des vieilles villes et des villages, les couleurs et les ordeurs de la Provence attirent l’été de nombreux touristes\n" +
                                "- À l’ouest, autour de Marseille, capitale régionale (environ 1.400.000 habitants) et premier port français , une activité industrielle s’est développée\n" +
                                "- Située au bord de la Méditerranée, cette terre est aussi une terre d’immigration où richesse et pauvreté coexistent\n",
                        "textOnly")
        );
        mVilleList.add(
                new Ville("Corse",15,R.drawable.corse,
                        R.drawable.la_picardie, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- L’île de Beauté se caratérise par la varié de ses côtes et la presence de la montagne\n" +
                                "- Grâce à la beauté des paysages et à la douceur de climat, elle bénéficie du tourisme\n" +
                                "- Mais, dans les autres secteurs économiques, est difficultés \n" +
                                "- L’identité culturelle est forte et s’exprime en particulier par l’usage de la langue Corse\n" +
                                "- La capitale régionale est Ajaccio (environ 54.000 habitants)\n",
                        "textOnly")
        );

        //16
        mVilleList.add(
                new Ville("Le Languedoc-Roussillon",16,R.drawable.languedoc_roussillon,
                        R.drawable.la_picardie, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- La langue française n’a pas toujours été homogène\n" +
                                "- Dans la France du Nord, on parlait la langue d’oïl et dans la France du Sud, la langue d’oc (un petit mot qui est devenu <<oui>>)\n" +
                                "- Le Languedoc-Roussillon est tourné au Sud vers la mer Méditerranée (on y compte 40 plages)\n" +
                                "- Parmi les cinq département de la région, trois sont situés au bord de la mer (Aude, Hérault, et Pyrénées-orientales\n" +
                                "- On trouve des montagnes au nord (dans le Maissf Central) et au sud-ouest (dans les Pyrénées)\n" +
                                "- Le Languedoc oriental est plus dynamique que la Languedoc occidental: c’est à l’est que se trouvent les villes les plus importantes\n" +
                                "- Nîmes, et surtout Montpellier, capitale régionale de 230.000 habitants environ\n" +
                                "- Montpellier est aussi un pole technologique\n" +
                                "- Les départements sont Aude, Gard, Hérault, Lozère, et Pyrénées-orientales\n",
                        "textOnly")
        );
        mVilleList.add(
                new Ville("Poitou-Charentes / Aquitaine",17,R.drawable.poitou_charentes,
                        R.drawable.la_picardie, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- Ces deux regions se caractérisent par la douceur des temperatures, un ensoleillement important sur le littoral et l’abondance des pluies au printemps\n" +
                                "- Le Poitu-Charentes est une région de plateau (au nord), de plaines (au sud) et de marais (du nord au sud)\n" +
                                "- Une grande partie de ses activités sont orientées vers la mer\n" +
                                "- La capitale régionale de Poitou-Charentes est Poitiers (environ 87.000 habitants)\n" +
                                "- Les départements de Poitou-Charentes sont Ch. Maritime, Charente, Sèvres (deux), et Vienne\n" +
                                "- Le nom “Aquitaine” vient du latin <<pays deseaux>> \n" +
                                "- L’Aquitaine est connue pour la qualité de son vignoble, don’t le plus apprécié est le bordelaise, et pour son industrie aérospatiale\n" +
                                "- La capitale régionale de Aquitaine est Bordeaux (environ 218.000 habitants)\n" +
                                "- Les départements sont Dordogne, Gironde, Landes, Lot-et-Garonne, et Pyrénées-Atlantique\n",
                        "textOnly")
        );
        mVilleList.add(
                new Ville("Midi-Pyrénées",18,R.drawable.midi_pyrenees,
                        R.drawable.la_picardie, //gambar1
                        R.drawable.la_picardie, //gambar2
                        R.drawable.la_picardie, //gambar2
                        "- La population de Midi-Pyrénées ne cesse d’augmenter depuis la Seconde Guerre Mondiale\n" +
                                "- ce phénomène tient à la fois au dynamism économique de la région et au fait que, malgré les departs d’une partie de la population vers d’autres regions, Midi-Pyrénées attire beaucoup d’habitants pour sa qualité de vie\n" +
                                "- Midi-Pyrénées est ainsi une des regions les plus visitées de France\n" +
                                "- Elle est le premiere pole national de recherché en microbiologie et un important centre d’industrie aéronautique\n" +
                                "- La capitale régionale est Toulouse (environ 398.000 habitants)\n" +
                                "- Toulous appellee <<Ville Rose>> por la couleur de ses édifices\n" +
                                "- Les départements sont Ariège, Aveyron, Garonne (Haute), Gers, Lot, Pyrénées (Hautes), Tarn, et Tarn-et Garonne\n",
                        "textOnly")
        );

    }
}
