package com.linqinen708.pockmon.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.linqinen.library.utils.LogT;

/**
 * Created by 林 on 2017/9/25.
 */

public class PockmonSQLite extends SQLiteOpenHelper {


    public static String TABLE_NAME = "pockmon";
    public static int version = 1;

    private final String DATE = "DATE";
    private final String TIME_DIFFERENCE = "TIME_DIFFERENCE";
    private final String TIME_DIFFERENCE_DISPLAY = "TIME_DIFFERENCE_DISPLAY";
    private final String REMARK = "REMARK";


    public String getDATE() {
        return DATE;
    }

    public String getTIME_DIFFERENCE() {
        return TIME_DIFFERENCE;
    }

    public String getTIME_DIFFERENCE_DISPLAY() {
        return TIME_DIFFERENCE_DISPLAY;
    }

    public String getREMARK() {
        return REMARK;
    }

    PockmonSQLite(Context context){
        this(context,TABLE_NAME+".db"/*数据库名*/, null/*factory 一般不用*/, version);
    }

    private PockmonSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        LogT.i("创建数据库");
        db.execSQL("create table " + TABLE_NAME + "(id integer primary key autoincrement , "+DATE+" varchar,"+TIME_DIFFERENCE+" varchar,"+TIME_DIFFERENCE_DISPLAY+" bigint(20),"+REMARK+" varchar)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        LogT.i("更新数据库");
    }
}
