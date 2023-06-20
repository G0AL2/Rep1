package com.inmobi.media;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: DbHelper.java */
/* loaded from: classes3.dex */
public final class hd extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25647a = "com.im_" + hp.b() + ".db";

    public hd(Context context) {
        super(context, f25647a, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
