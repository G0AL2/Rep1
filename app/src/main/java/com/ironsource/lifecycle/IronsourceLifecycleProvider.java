package com.ironsource.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes3.dex */
public class IronsourceLifecycleProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26183a = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return f26183a;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Application application;
        f26183a = true;
        d a10 = d.a();
        Context context = getContext();
        if (d.f26188j.compareAndSet(false, true) && (application = (Application) context.getApplicationContext()) != null) {
            application.registerActivityLifecycleCallbacks(a10);
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
