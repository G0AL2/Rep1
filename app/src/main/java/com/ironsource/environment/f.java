package com.ironsource.environment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class f extends SQLiteOpenHelper {
    public f(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static Cursor a(int i10) {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            readableDatabase = new f(e.a().f26148f).getReadableDatabase();
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTSWHERE id= " + i10 + ";", null);
            readableDatabase.close();
            return rawQuery;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = readableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static List<c> a() {
        SQLiteDatabase readableDatabase;
        f fVar = new f(e.a().f26148f);
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            readableDatabase = fVar.getReadableDatabase();
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTS ;", null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                readableDatabase.close();
                return arrayList;
            }
            do {
                arrayList.add(new c(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getString(2), rawQuery.getString(3)));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            readableDatabase.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = readableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static void a(c cVar) {
        SQLiteDatabase writableDatabase;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = new f(e.a().f26148f).getWritableDatabase();
        } catch (Throwable th) {
            th = th;
        }
        try {
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            String a10 = cVar.a();
            String b10 = cVar.b();
            String c10 = cVar.c();
            contentValues.put("stack_trace", a10);
            contentValues.put("crash_date", b10);
            contentValues.put("crashType", c10);
            writableDatabase.insert("REPORTS", null, contentValues);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static Cursor b() {
        f fVar = new f(e.a().f26148f);
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase readableDatabase = fVar.getReadableDatabase();
            try {
                Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTS;", null);
                readableDatabase.close();
                return rawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = readableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void c() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = new f(e.a().f26148f).getWritableDatabase();
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = null;
        }
        try {
            sQLiteDatabase.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabase.close();
        } catch (Throwable th2) {
            th = th2;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
