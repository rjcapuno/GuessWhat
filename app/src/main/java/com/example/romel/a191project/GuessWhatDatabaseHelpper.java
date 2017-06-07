package com.example.romel.a191project;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Romel on 12/9/2016.
 */

public class GuessWhatDatabaseHelpper extends SQLiteOpenHelper{
    private static final String DB_NAME = "QnA";
    private static final int DB_VERSION = 1;

    GuessWhatDatabaseHelpper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE QUESTIONS ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "QUESTION TEXT, "
                + "A TEXT, "
                + "B TEXT, "
                + "C TEXT, "
                + "D TEXT, "
                + "ANSWER TEXT);");

        insertQuestion(db, "Which Filipino boxer is known for his nickname “Pac-Man”?", "Efren 'Bata' Reyes", "Manny Pacquiao", "Lydia de Vega", "Paeng Nepomuceno", "1");
        insertQuestion(db, "Who said this immortal words “A Filipino is worth dying for”?", "Ninoy Aquino", "Ferdinand Marcos", "Diosdado Macapagal", "Ramon Magsaysay", "0");
        insertQuestion(db, "Gloria Diaz won the Miss Universe contest in what year?", "1980", "1979", "1969", "1970", "2");
        insertQuestion(db, "What is a fertilized duck egg called?", "Kwek-kwek", "Balut", "Itlog", "Tukneneng", "1");
        insertQuestion(db, "What are the provinces that consist the acronym CALABARZON?", "Cagayan, Landusan, Baguio, Rizal, Quezon", "Cagayan, Landusan, Baguio, Romblon, Quinaguitman", "Capiz, Langob, Bohol, Rosario, Quirhat", "Cavite, Laguna, Batangas, Rizal, Quezon", "3");
        insertQuestion(db, "Who was the youngest general in Aguinaldo's army?", "Andres Bonifacio", "Manuel Tinio", "Gregorio del Pilar", "Antonio Luna", "1");
        insertQuestion(db, "What is the LRT 2 station whose name is the Spanish word for purity?", "Pureza", "Santolan", "Anonas", "Legarda", "0");
        insertQuestion(db, "Who coined the name of the longest-running noontime show 'Eat Bulaga!'?", "Ruby Rodriguez", "Vic Sotto", "Tito Sotto", "Joey de Leon", "3");
        insertQuestion(db, "What is the children's television show which means 'small but strong'?", "Kulit Bulilit", "Batibot", "Sineskwela", "ATBP.", "1");
        insertQuestion(db, "Who waved the flag during the Philippine independence proclamation in 1898?", "Emilio Aguinaldo", "Ambrosio Rianzares Bautista", "Juan Felipe", "Manuel Quezon", "1");
        insertQuestion(db, "Together with Gen. Fidel Ramos, this person helped oust Marcos in the 1986 bloodless revolution. Who is he?", "Gregorio Honasan", "Fabian Ver", "Juan Ponce Enrile", "Rodrigo Duterte", "2");
        insertQuestion(db, "How many films were there in the Filipino horror movie series, 'Shake, Rattle & Roll'?", "14", "15", "16", "18", "1");
        insertQuestion(db, "Which Filipino subculture was originated because of the use of short-handed language in texting?", "Jologs", "Conyo", "Bakya", "Jejemon", "3");
        insertQuestion(db, "What is the most trending Google search in the Philippines in the year 2014?", "Vhong Navarro", "Jennifer Lawrence", "Flappy Bird", "Meteor Garden", "0");
        insertQuestion(db, "What is the most used word in the Philippines in the year 2016?", "photobam", "chos", "selpi", "bes", "0");
        insertQuestion(db, "What Filipino monkey is the smallest in the world?", "Lemur", "Baboon", "Langur", "Tarsier", "3");
        insertQuestion(db, "What is the longest bridge in the Philippines?", "San Joaquin", "San Juanico", "San Joachim", "San Juanita", "1");
        insertQuestion(db, "What is the largest Catholic University in the world?", "Holy Angel University", "De La Salle University Manila", "University of Santo Tomas", "Saint Louis University", "2");
        insertQuestion(db, "What city has the highest population?", "Quezon City", "Caloocan", "Davao City", "Manila", "0");
        insertQuestion(db, "What is the largest coral reef in the Philippines?", "Honda Bay", "Tubbataha Reef", "Apo Reef", "Puerto Galera Reef", "2");
        insertQuestion(db, "The Philippines was named in honor of which King of Spain?", "King Philip I", "King Philip II", "King Philip III", "King Philip IV", "1");
        insertQuestion(db, "When did Mt. Pinatubo erupted?", "September 13, 1991", "July 19, 1991", "June 15, 1991", "April 10, 1991", "2");
        insertQuestion(db, "Who invented the Karaoke machine in 1975?", "Ricardo Francisco", "Mark Santiago", "Mark Bernardo", "Roberto del Rosario", "3");
        insertQuestion(db, "When did the Philippines won its first Miss Universe?", "1987", "1954", "1969", "1973", "2");
        insertQuestion(db, " What is the land area of the Philippines?", "200,000 square kilometers", "300,000 square kilometers", "400,000 square kilometers", "500,000 square kilometers", "1");
        insertQuestion(db, "When did the Philippines welcomed its 100-millionth citizen?", "July 27, 2014", "October 27, 2013", "January 27, 2010", "November 27, 2012", "0");
        insertQuestion(db, "What is the oldest city in the country?", "Cebu", "Davao", "Naga", "Cagayan", "0");
        insertQuestion(db, "What is considered as the largest Philippine wild animal?", "Elephant", "Carabao", "Lion", "Tamaraw", "3");
        insertQuestion(db, " What is the favorite color of Cory Aquino?", "Green", "Yellow", "Pink", "Red", "3");
        insertQuestion(db, "What is the Christmas Capital of the Philippines?", "San Fernando, Pampanga", "Angeles, Pampanga", "Porac, Pampanga", "Mexico, Pampanga", "0");
        insertQuestion(db, "What fruit is most commonly associated with Davao City?", "Mango", "Durian", "Mangosteen", "Langka", "1");
        insertQuestion(db, "Who was the first National Artist for Historical Literature in the Philippines?", "Nick Joaquin", "Francisco Arcellana", "Carlos Quirino", "Ramon Valera", "2");
        insertQuestion(db, "What is considered as the rarest and most expensive seashell in the world which can be found here in the Philippines?", "Conus Gloriamus", "Scrotch Bonnet", "Lion's Paw", "Scaphella Junonia", "0");
        insertQuestion(db, "Manila was named after ... ?", "a desert", "a filipino businessman", "a specie of bird", "a mangrove", "3");
        insertQuestion(db, "Who was the official first National Artist of the Philippines?", "Fernando Amorsolo", "Napoleon Abueva", "Carlos Francisco", "Jose Nepomuceno", "0");
        insertQuestion(db, "What is the world's shortest and lightest freshwater fish?", "Paedocypris", "Dwarf Pygmy Gobi", "Stout infant fish", "Danios", "1");
        insertQuestion(db, "Out of 500 known coral species in the world, who many coral species can be found in the Philippines?", "15", "192", "310", "488", "3");
        insertQuestion(db, "What is the only steel church in the Asia?", "Basilica of San Sebastian", "San Agustin Church", "Church of San Juan del Monte", "Santo Nino Basilica", "0");
        insertQuestion(db, "What is considered as the youngest city in the Philippines?", "Bacolod", "Tagaytay", "Dumaguete", "Isabela", "3");
        insertQuestion(db, "Who designed the Holy Rosary Cathedral in Dipolog City?", "Leonardo Locsin", "Jose Rizal", "Pablo Antonio", "Juan Nakpil", "1");
        insertQuestion(db, "What is the biggest dam project at the time of its construction in Asia?", "San Roque Dam", "La Mesa Dam and Reservoir", "Magat Dam", "Angat Dam", "2");
        insertQuestion(db, "What is the longest and widest river in the Philippines?", "Rio Grande de Mindanao", "Cagayan River", "Agusan River", "Pampanga River", "1");
        insertQuestion(db, "Tagala - the Philippines first Filipino-Spanish dictionary was printed in what year?", "1613", "1635", "1647", "1670", "0");
        insertQuestion(db, "What is the narrowest straight in the Philippines?", "San Bernardino Straight", "San Juanico Straight", "Cebu Straight", "Sibutu Passage", "1");
        insertQuestion(db, "What is the height of Mt. Apo?", "2741 m", "2865 m", "2954 m", "3129 m", "2");
        insertQuestion(db, "What is the first television station in the Philippines?", "Alto Broadcasting System", "GMA Network", "People's Television Network", "Intercontinental Broadcasting Corporation", "0");
        insertQuestion(db, "What city is dubbed as the 'Rome of the Philippines' because of the number of seminaries, convents, monasteries, retreat houses, and a famous cathedral located in it?", "Iloilo", "Cagayan de Oro", "Roxas", "Lipa", "3");
        insertQuestion(db, "Which of this cities is not included in the first four cities of Metropolitan Manila?", "Pasig", "Pasay", "Quezon", "Caloocan", "0");
        insertQuestion(db, "Who coined the symbolic name 'Juan dela Cruz'?", "Mars Ravelo", "R. McCulloch-Dick", "Ingrid Chua-Go", "Carlos Bulosan", "1");
        insertQuestion(db, "What is the largest province in the Philippines?", "Palawan", "Isabela", "Cebu", "Iloilo", "0");
        insertQuestion(db, " In which church can you find the largest bamboo organ?", "San Sebastian Church", "Manila Cathedral", "St. Joseph Church", "San Agustin Church", "2");
        insertQuestion(db, "What is the county's largest high school in terms of student population?", "Philippine Science High School", "Rizal High School", "Pedro Guevarra Memorial High School", "Cagayan National High School", "1");
        insertQuestion(db, "What is the longest bridge in the Philippines?", "Marcelo Ferman Bridge", "San JUanico Bridge", "Ayala Bridge", "Buntin Bridge", "1");
        insertQuestion(db, "This person was a 19th-century Katipunero who had rivalries with his group mates. Due to this, he exposed the secret society of Katipunan. Who was he?", "Andres Bonifacio", "Emilio Jacinto", "Teodoro Patino", "Pio Valenzuela", "2");
        insertQuestion(db, "The Bamboo Organ of Las Piñas, Philippines is a musical instrument made up of 1,031 pipes, 902 of which are bamboo (the rest are metal). Who created the famous Bamboo Organ?", "Father Diego Cera", "Father Fernando Suarez", "Father Joey Faller", "Father Nelson Osorio", "0");
        insertQuestion(db, "Where can you find Tarsiers?", "Cabu", "Davao", "Iloilo", "Bohol", "3");
        insertQuestion(db, "Filipino author Dr. Jose Rizal used pen names as a writer. What pen name did he use when he was a contributor of poems and articles for the newspaper 'La Solidaridad'?", "Jomapa", "May Pagasa", "Laong-Laan", "Taga-Ilog", "2");
        insertQuestion(db, "How many years is the term of a president in the Philippines?", "4", "5", "6", "7", "2");
        insertQuestion(db, "When is the Philippine Independence Day?", "June 12", "July 4", "November 30", "August 21", "0");
        insertQuestion(db, "What is the smallest volcano called?", "Mt. Pinatubo", "Mt. Mayon", "Mt. Apo", "Mt. Taal", "3");
        insertQuestion(db, "How many islands are there in the Philippines?", "6107", "7107", "7117", "6117", "1");
        insertQuestion(db, "Which country had the Philippines as its colony for more than 300 years?", "Spain", "Italy", "Portugal", "France", "0");
        insertQuestion(db, "Who of the explorers arrived in the Philippines in 1521?", "Christopher Columbus", "Ferdinand Magellan", "Vasco da Gama", "James Cook", "1");
        insertQuestion(db, "What is the predominant religion of the Philippines?", "Christianity", "Islam", "Buddhism", "Judaism", "0");
        insertQuestion(db, "Which of the following groups is the Philippines a part of?", "NATO", "ISIS", "ASEAN", "EU", "2");
    }

    public static void insertQuestion(SQLiteDatabase db, String question, String a, String b, String c, String d, String answer){
        ContentValues questionValues = new ContentValues();
        questionValues.put("QUESTION",question);
        questionValues.put("A",a);
        questionValues.put("B",b);
        questionValues.put("C",c);
        questionValues.put("D",d);
        questionValues.put("ANSWER",answer);

        db.insert("QUESTIONS",null,questionValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }
}
