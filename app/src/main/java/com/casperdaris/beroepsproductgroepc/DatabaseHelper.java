package com.casperdaris.beroepsproductgroepc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.casperdaris.beroepsproductgroepc.Objecten.Regio;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Deze strings zijn de namen van een tabel en columns in de database
    public static final String REGIO_TABLE = "REGIO_TABLE";
    public static final String COLUMN_REGIO_NAAM = "REGIO_NAAM";
    public static final String COLUMN_REGIO_BESCHRIJVING = "REGIO_BESCHRIJVING";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "regioDatabase", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // Een string aanmaken om vervolgens een tabel mee te maken in de database
        String tableMakenStatement = "CREATE TABLE " + REGIO_TABLE + " (" + COLUMN_REGIO_NAAM + " TEXT PRIMARY KEY, " + COLUMN_REGIO_BESCHRIJVING + " TEXT)";

        db.execSQL(tableMakenStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // Methode maken om regio's toe te voegen aan de database
    public boolean regioToevoegen(Regio regio) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_REGIO_NAAM, regio.getRegioNaam());
        cv.put(COLUMN_REGIO_BESCHRIJVING, regio.getBeschrijving());

        // Als het toevoegen succesvol is, krijg je 1 terug, anders -1
        long insert = db.insert(REGIO_TABLE, null, cv);

        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }

    // Een lijst maken welke weergegeven kan worden in de ListView
    public List<String> regioLijstLaden() {

        // Een lijst maken welke wordt teruggegeven aan het einde van de methode
        List<String> returnList = new ArrayList<>();

        // StringQuery maken om de gewenste data uit de database op te halen
        String query = "SELECT * FROM " + REGIO_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();

        // De cursor is een soort van ResultSet
        Cursor cursor = db.rawQuery(query, null);

        // Eerst kijken of er data opgehaald kan worden
        if (cursor.moveToFirst()) {

            // Vervolgens de data die wordt opgehaald in de return lijst plaatsten zolang er nieuwe data is
            do {
                String regioNaam = cursor.getString(0);
                String regioBeschrijving = cursor.getString(1);

                Regio nieuweRegio = new Regio(regioNaam, regioBeschrijving, null, null, null, null, null, null);
                returnList.add(nieuweRegio.getRegioNaam());

            } while (cursor.moveToNext());

            // Anders gebeurt er niets
        } else {

        }

        // Connectie met de database sluiten (als je een lokale database al een connectie wilt noemen)
        cursor.close();
        db.close();

        return returnList;
    }
}
