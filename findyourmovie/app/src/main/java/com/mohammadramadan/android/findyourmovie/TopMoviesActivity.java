package com.mohammadramadan.android.findyourmovie;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TopMoviesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<Items> item = new ArrayList<Items>();

        item.add(new Items("Gladiator", "8.5/ 10", "Maximus is a powerful Roman general, loved by the people and the aging Emperor, Marcus Aurelius. Before his death, the Emperor chooses Maximus to be his heir over his own son, Commodus, and a power struggle leaves Maximus and his family condemned to death. The powerful general is unable to save his family, and his loss of will allows him to get captured and put into the Gladiator games until he dies. The only desire that fuels him now is the chance to rise to the top so that he will be able to look into the eyes of the man who will feel his revenge. Written by Chris \"Morphy\" Terry", R.drawable.gladiator));
        item.add(new Items("Inception", "8.8 / 10", "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobb's rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at redemption. One last job could give him his life back but only if he can accomplish the impossible - inception. Instead of the perfect heist, Cobb and his team of specialists have to pull off the reverse: their task is not to steal an idea but to plant one. If they succeed, it could be the perfect crime. But no amount of careful planning or expertise can prepare the team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb could have seen coming. Written by Warner Bros. Pictures", R.drawable.inception));
        item.add(new Items("Step Brothers", "6.9 / 10", "Brennan Huff and Dale Doback are both about 40 when Brennan's mom and Dale's dad marry. The sons still live with the parents so they must now share a room. Initial antipathy threatens the household's peace and the parents' relationship. Dad lays down the law: both slackers have a week to find a job. Out of the job search and their love of music comes a pact that leads to friendship but more domestic disarray compounded by the boys' sleepwalking. Hovering nearby are Brennan's successful brother and his lonely wife: the brother wants to help sell his step-father's house, the wife wants Dale's attention, and the newlyweds want to retire and sail the seven seas. Can harmony come from the discord?", R.drawable.step_brothers));
        item.add(new Items("White Chicks", "5.5 / 10", "After an unsuccessful mission, FBI agents Kevin Copeland and Marcus Copeland fall in disgrace in the agency. They decide to swap their bad position with his superior Section Chief Elliott Gordon working undercover in an abduction case, disguised in the two spoiled white daughters of a tycoon, Brittany and Tiffany Wilson, getting in hilarious situations. Written by Claudio Carvalho, Rio de Janeiro, Brazil", R.drawable.white_chicks));
        item.add(new Items("Silver Linings Playbook", "7.7 / 10", "Against medical advice and without the knowledge of her husband Pat Solatano Sr., caring Dolores Solatano discharges her adult son, Pat Solatano Jr., from a Maryland mental health institution after his minimum eight month court ordered stint. The condition of the release includes Pat Jr. moving back in with his parents in their Philadelphia home. Although Pat Jr.'s institutionalization was due to him beating up the lover of his wife Nikki, he was diagnosed with bipolar disorder. Nikki has since left him and has received a restraining order against him. Although he is on medication (which he doesn't take because of the way it makes him feel) and has mandatory therapy sessions, Pat Jr. feels like he can manage on the outside solely by healthy living and looking for the \"silver linings\" in his life. His goals are to get his old job back as a substitute teacher, but more importantly reunite with Nikki. He finds there are certain instances where he doesn't cope well, however no less so ... Written by Huggo", R.drawable.silver_linings_playbook));
        item.add(new Items("The Avengers", "8.1 / 10", "Nick Fury is the director of S.H.I.E.L.D., an international peace-keeping agency. The agency is a who's who of Marvel Super Heroes, with Iron Man, The Incredible Hulk, Thor, Captain America, Hawkeye and Black Widow. When global security is threatened by Loki and his cohorts, Nick Fury and his team will need all their powers to save the world from disaster which is formed by Loki and his team Written by WellardRockard", R.drawable.avengers));
        item.add(new Items("John Wick", "7.3 / 10", "With the untimely death of his beloved wife still bitter in his mouth, John Wick, the expert former assassin, receives one final gift from her--a precious keepsake to help John find a new meaning in life now that she is gone. But when the arrogant Russian mob prince, Iosef Tarasov, and his men pay Wick a rather unwelcome visit to rob him of his prized 1969 Mustang and his wife's present, the legendary hitman will be forced to unearth his meticulously concealed identity. Blind with revenge, John will immediately unleash a carefully orchestrated maelstrom of destruction against the sophisticated kingpin, Viggo Tarasov, and his family, who are fully aware of his lethal capacity. Now, only blood can quench the boogeyman's thirst for retribution. Written by Nick Riganas", R.drawable.johnwick));
        item.add(new Items("The Notebook", "7.9 / 10", "In a nursing home, resident Duke reads a romance story to an old woman who has senile dementia with memory loss. In the late 1930s, wealthy seventeen year-old Allie Hamilton is spending summer vacation in Seabrook. Local worker Noah Calhoun meets Allie at a carnival and they soon fall in love with each other. One day, Noah brings Allie to an ancient house that he dreams of buying and restoring and they attempt to make love but get interrupted by their friend. Allie's parents do not approve of their romance since Noah belongs to another social class, and they move to New York with her. Noah writes 365 letters (A Year) to Allie, but her mother Anne Hamilton does not deliver them to her daughter. Three years later, the United States joins the World War II and Noah and his best friend Fin enlist in the army, and Allie works as an army nurse. She meets injured soldier Lon Hammond in the hospital. After the war, they meet each other again going on dates and then, Lon, who is wealthy and ... Written by Claudio Carvalho, Rio de Janeiro, Brazil", R.drawable.the_notebook));

        ItemsAdapter adapter = new ItemsAdapter(this, item);
        ListView listVIew = (ListView) findViewById(R.id.list);
        listVIew.setAdapter(adapter);

    }
}
