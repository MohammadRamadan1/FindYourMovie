package com.mohammadramadan.android.findyourmovie;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ComedyActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<Items> item = new ArrayList<Items>();
        item.add(new Items("Step Brothers", "6.9 / 10", "Brennan Huff and Dale Doback are both about 40 when Brennan's mom and Dale's dad marry. The sons still live with the parents so they must now share a room. Initial antipathy threatens the household's peace and the parents' relationship. Dad lays down the law: both slackers have a week to find a job. Out of the job search and their love of music comes a pact that leads to friendship but more domestic disarray compounded by the boys' sleepwalking. Hovering nearby are Brennan's successful brother and his lonely wife: the brother wants to help sell his step-father's house, the wife wants Dale's attention, and the newlyweds want to retire and sail the seven seas. Can harmony come from the discord?", R.drawable.step_brothers));
        item.add(new Items("White Chicks", "5.5 / 10", "After an unsuccessful mission, FBI agents Kevin Copeland and Marcus Copeland fall in disgrace in the agency. They decide to swap their bad position with his superior Section Chief Elliott Gordon working undercover in an abduction case, disguised in the two spoiled white daughters of a tycoon, Brittany and Tiffany Wilson, getting in hilarious situations. Written by Claudio Carvalho, Rio de Janeiro, Brazil", R.drawable.white_chicks));
        item.add(new Items("The Hot Chicks", "5.5 / 10", "Jessica Spencer is the hottest, most popular girl in high school. Jessica, her best friend April, and a couple of other hot girls Lulu and Keecia visit the mall to hang out and do some shopping. They enter a new age store, where they check out a pair of ancient earrings. Unbeknownst to Jessica, these are magical ones set in ancient Abyssinia. A princess known as Princess Nawa is disgusted by the groom of her arranged marriage and switches bodies with a slave girl by means of an enchanted set of earrings. Since the earrings are not for sale, Jessica steals them. But the next morning she gets a big dose of reality when she wakes up in the body of a 30-something lowlife male, Clive, a career criminal. Clive finds himself in Jessica's body. Now it's up to Jessica (in Clive's body) to find a way to get her body back, while Clive (in Jessica's body) takes advantage of his new body to set in motion a crime spree to put the blame on Jessica! Written by Anthony Pereyra <hypersonic91@yahoo.com>", R.drawable.the_hot_chick));
        item.add(new Items("The Hangover", "7.7 / 10", "Angelenos Doug Billings and Tracy Garner are about to get married. Two days before the wedding, the four men in the wedding party - Doug, Doug's two best buddies Phil Wenneck and Stu Price, and Tracy's brother Alan Garner - hop into Tracy's father's beloved Mercedes convertible for a 24-hour stag party to Las Vegas. Phil, a married high school teacher, has the same maturity level as his students when he's with his pals. Stu, a dentist, is worried about everything, especially what his controlling girlfriend Melissa thinks. Because she disapproves of traditional male bonding rituals, Stu has to lie to her about the stag, he telling her that they are going on a wine tasting tour in the Napa Valley. Regardless, he intends on eventually marrying her, against the advice and wishes of his friends. And Alan seems to be unaware of what are considered the social graces of the western world. The morning after their arrival in Las Vegas, they awaken in their hotel suite each with the worst ... Written by Huggo", R.drawable.hangover));
        item.add(new Items("Horrible Bosses", "6.9 / 10", "Nick hates his boss, mostly because he's expected to work from before sunrise to after sunset and his boss, Mr. Harken, calls him out for being a minute late and blackmails him so he can't quit. Dale hates his boss, Dr. Julia Harris, because she makes unwelcome sexual advances when he's about to get married. But Dale is on that pesky list of child offenders so he can't quit. Kurt actually likes his job and his boss, well, up until his boss dies and the boss's coked-out, psychopathic son takes over. But who would be crazy enough to quit their jobs in such poor economic times? Instead Nick, Dale and Kurt drunkenly and hypothetically discuss how to kill their bosses, and before they know it, they've hired a murder consultant to help them pull off the three deeds. Written by napierslogs", R.drawable.horrible_bosses));
        item.add(new Items("Drillbit Taylor", "5.7 / 10", "Homeless veteran Bob 'Drillbit' Taylor manages to enjoy life anyhow and even saves some cash for his dream, an 'all-paid' move to Alaska, even if that may take many years. His dream comes within reach when clever nerd Wade, has fat friend Ryan 'T-dog' and cocky shrimp Jim, all new to high-school, are bullied so badly by emancipated Filkins and his buddies that they advertise for a bodyguard. Only Drillbit seems affordable and not crazy, so he's hired and drains their pocket-money and home content. He's clueless how to protect them but gives them (bogus) self-defense classes. Written by KGF Vissers", R.drawable.taylor));

        ItemsAdapter adapter = new ItemsAdapter(this, item);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}

