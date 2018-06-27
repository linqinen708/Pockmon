package com.linqinen708.pockmon.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.linqinen.library.utils.LogT;
import com.linqinen708.pockmon.bean.PockmonBean;

import java.util.ArrayList;

/**
 * Created by 林 on 2017/9/25.
 */

public class PockmonDBHelper {

    private PockmonSQLite mSQLite;
    private SQLiteDatabase dataBase;

    private ArrayList<PockmonBean> mList = new ArrayList<>();

    public PockmonDBHelper(Context context) {
        if (mSQLite == null) {
            mSQLite = new PockmonSQLite(context);
        }
        dataBase = mSQLite.getWritableDatabase();
    }

    public ArrayList<PockmonBean> queryData() {
        Cursor cursor = dataBase.query(PockmonSQLite.TABLE_NAME, null, null, null, null, null, null);
//        while (cursor.moveToNext()) {
//            mList.add( new PockmonBean(
//                    cursor.getString(cursor.getColumnIndex(mSQLite.getDATE())),
//                    cursor.getInt(cursor.getColumnIndex(mSQLite.getDATE())),
//                    cursor.getString(cursor.getColumnIndex(mSQLite.getTIME_DIFFERENCE_DISPLAY())),
//                    cursor.getInt(cursor.getColumnIndex(mSQLite.getDATE())),
//                    cursor.getInt(cursor.getColumnIndex(mSQLite.getDATE())),
//                    cursor.getInt(cursor.getColumnIndex(mSQLite.getDATE())),
//                    cursor.getInt(cursor.getColumnIndex(mSQLite.getDATE())),
//                    cursor.getInt(cursor.getColumnIndex(mSQLite.getDATE()))
//            ));
//        }
        cursor.close();
        return mList;
    }

    /**
     * 增加数据库条目
     */
    public void insertData(PockmonBean pockmonBean) {
        /*先查询数据库，如果已存在，则更新*/
        Cursor cursor = dataBase.query(PockmonSQLite.TABLE_NAME, null, mSQLite.getDATE() + "=?", new String[]{pockmonBean.getName()}, null, null, null);
        if (!cursor.moveToNext()) {
            LogT.i("插入数据:"+ pockmonBean.toString() );
            cursor.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put(mSQLite.getDATE(), pockmonBean.getDefense());
            contentValues.put(mSQLite.getTIME_DIFFERENCE(), pockmonBean.getStrength());
            contentValues.put(mSQLite.getTIME_DIFFERENCE_DISPLAY(), pockmonBean.getHp());
            contentValues.put(mSQLite.getREMARK(), pockmonBean.getMp());
            dataBase.insert(PockmonSQLite.TABLE_NAME, null, contentValues);
        }else{
            updateData(pockmonBean);
        }

    }
    /**
     * 更新数据库
     */
    public void updateData(PockmonBean pockmonBean) {
//            LogT.i("更新数据:"+pockmonBean.toString() );
        ContentValues contentValues = new ContentValues();
        contentValues.put(mSQLite.getDATE(), pockmonBean.getDefense());
        contentValues.put(mSQLite.getTIME_DIFFERENCE(), pockmonBean.getStrength());
        contentValues.put(mSQLite.getTIME_DIFFERENCE_DISPLAY(), pockmonBean.getHp());
        contentValues.put(mSQLite.getREMARK(), pockmonBean.getMp());
            dataBase.update(PockmonSQLite.TABLE_NAME, contentValues, mSQLite.getDATE() + "=?", new String[]{pockmonBean.getName()});
    }
    /**
     * 更新数据库
     */
    public void updateData(String date,String remark) {
        /*先查询数据库，备注已经存在的时间差*/
//            LogT.i("更新数据:"+timeDifference.toString() );
            ContentValues contentValues = new ContentValues();
            contentValues.put(mSQLite.getREMARK(), remark);
            dataBase.update(PockmonSQLite.TABLE_NAME, contentValues, mSQLite.getDATE() + "=?", new String[]{date});
    }


    /**
     * 用完数据库，都要关闭掉数据库
     */
    public void closeSQLiteDatabase() {
        if (dataBase.isOpen()) {
            dataBase.close();
        }
    }

    //清空存档
    public void resetData() {
        dataBase.delete(PockmonSQLite.TABLE_NAME, null, null);
    }
}
