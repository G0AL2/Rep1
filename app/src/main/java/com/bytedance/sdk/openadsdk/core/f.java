package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DBHelper.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f12233c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private c f12234a;

    /* renamed from: b  reason: collision with root package name */
    private Context f12235b;

    /* compiled from: DBHelper.java */
    /* loaded from: classes.dex */
    private class b extends AbstractCursor {
        private b() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context) {
        try {
            this.f12235b = context == null ? m.a() : context.getApplicationContext();
            if (this.f12234a == null) {
                this.f12234a = new c();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context c() {
        Context context = this.f12235b;
        return context == null ? m.a() : context;
    }

    public c a() {
        return this.f12234a;
    }

    /* compiled from: DBHelper.java */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: b  reason: collision with root package name */
        private SQLiteDatabase f12252b = null;

        public c() {
        }

        private synchronized void d() {
            try {
                synchronized (f.f12233c) {
                    SQLiteDatabase sQLiteDatabase = this.f12252b;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        f fVar = f.this;
                        SQLiteDatabase writableDatabase = new a(fVar.c()).getWritableDatabase();
                        this.f12252b = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } finally {
            }
        }

        private synchronized boolean e() {
            boolean z10;
            SQLiteDatabase sQLiteDatabase = this.f12252b;
            if (sQLiteDatabase != null) {
                z10 = sQLiteDatabase.inTransaction();
            }
            return z10;
        }

        public synchronized void a(String str) throws SQLException {
            try {
                d();
                this.f12252b.execSQL(str);
            } catch (Throwable th) {
                if (e()) {
                    throw th;
                }
            }
        }

        public synchronized void b() {
            d();
            SQLiteDatabase sQLiteDatabase = this.f12252b;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void c() {
            d();
            SQLiteDatabase sQLiteDatabase = this.f12252b;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public synchronized Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                d();
                cursor = this.f12252b.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                th.printStackTrace();
                b bVar = new b();
                if (e()) {
                    throw th;
                }
                cursor = bVar;
            }
            return cursor;
        }

        public synchronized int a(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i10;
            try {
                d();
                i10 = this.f12252b.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                e10.printStackTrace();
                if (e()) {
                    throw e10;
                }
                i10 = 0;
            }
            return i10;
        }

        public synchronized long a(String str, String str2, ContentValues contentValues) {
            long j10;
            try {
                d();
                j10 = this.f12252b.replace(str, str2, contentValues);
            } catch (Exception e10) {
                e10.printStackTrace();
                if (e()) {
                    throw e10;
                }
                j10 = -1;
            }
            return j10;
        }

        public synchronized int a(String str, String str2, String[] strArr) {
            int i10;
            try {
                d();
                i10 = this.f12252b.delete(str, str2, strArr);
            } catch (Exception e10) {
                e10.printStackTrace();
                if (e()) {
                    throw e10;
                }
                i10 = 0;
            }
            return i10;
        }

        public synchronized void a() {
            d();
            SQLiteDatabase sQLiteDatabase = this.f12252b;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DBHelper.java */
    /* loaded from: classes.dex */
    public class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        final Context f12236a;

        public a(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 6);
            this.f12236a = context;
        }

        private void a(SQLiteDatabase sQLiteDatabase, Context context) {
            com.bytedance.sdk.component.utils.l.b("DBHelper", "initDB........");
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.b.g.e());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.b.m.f());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.b.s.f());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.b.q.d());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.k.h.b());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.a.b.a.c());
        }

        private ArrayList<String> b(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (rawQuery != null) {
                    while (rawQuery.moveToNext()) {
                        String string = rawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                    rawQuery.close();
                }
            } catch (Exception unused) {
            }
            return arrayList;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                a(sQLiteDatabase, this.f12236a);
            } catch (Throwable unused) {
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            try {
                com.bytedance.sdk.component.utils.l.b("DBHelper", "onUpgrade....Database version upgrade.....old:" + i10 + ",new:" + i11);
                if (i10 <= i11) {
                    a(sQLiteDatabase, f.this.f12235b);
                } else {
                    a(sQLiteDatabase);
                    a(sQLiteDatabase, f.this.f12235b);
                    com.bytedance.sdk.component.utils.l.b("DBHelper", "onUpgrade...Reverse installation. Database reset and create table.....");
                }
                if (i10 == 1) {
                    com.bytedance.sdk.component.utils.l.b("DBHelper", "onUpgrade.....perform table creation.....");
                } else if (i10 == 2) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                } else if (i10 == 3) {
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.b.s.f());
                } else if (i10 == 4) {
                    sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.a.b.a.c());
                } else if (i10 != 5) {
                } else {
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.b.q.d());
                }
            } catch (Throwable unused) {
            }
        }

        private void a(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> b10 = b(sQLiteDatabase);
            if (b10 == null || b10.size() <= 0) {
                return;
            }
            Iterator<String> it = b10.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }
    }
}
