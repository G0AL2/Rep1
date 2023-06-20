package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: ReactDatabaseSupplier.java */
/* loaded from: classes.dex */
public class c extends SQLiteOpenHelper {

    /* renamed from: d  reason: collision with root package name */
    private static c f15644d;

    /* renamed from: a  reason: collision with root package name */
    private Context f15645a;

    /* renamed from: b  reason: collision with root package name */
    private SQLiteDatabase f15646b;

    /* renamed from: c  reason: collision with root package name */
    private long f15647c;

    private c(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f15647c = 6291456L;
        this.f15645a = context;
    }

    private synchronized void d() {
        SQLiteDatabase sQLiteDatabase = this.f15646b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f15646b.close();
            this.f15646b = null;
        }
    }

    private synchronized boolean e() {
        d();
        return this.f15645a.deleteDatabase("RKStorage");
    }

    public static c q(Context context) {
        if (f15644d == null) {
            f15644d = new c(context.getApplicationContext());
        }
        return f15644d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        l().delete("catalystLocalStorage", null, null);
    }

    public synchronized void b() throws RuntimeException {
        try {
            a();
            d();
            z3.a.b("ReactNative", "Cleaned RKStorage");
        } catch (Exception unused) {
            if (e()) {
                z3.a.b("ReactNative", "Deleted Local Database RKStorage");
                return;
            }
            throw new RuntimeException("Clearing and deleting database RKStorage failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean h() {
        SQLiteDatabase sQLiteDatabase = this.f15646b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            SQLiteException e10 = null;
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 > 0) {
                    try {
                        e();
                    } catch (SQLiteException e11) {
                        e10 = e11;
                        try {
                            Thread.sleep(30L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.f15646b = getWritableDatabase();
            }
            SQLiteDatabase sQLiteDatabase2 = this.f15646b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.setMaximumSize(this.f15647c);
                return true;
            }
            throw e10;
        }
        return true;
    }

    public synchronized SQLiteDatabase l() {
        h();
        return this.f15646b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 != i11) {
            e();
            onCreate(sQLiteDatabase);
        }
    }
}
