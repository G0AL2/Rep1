package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: ITTProvider.java */
/* loaded from: classes.dex */
public interface a {
    int a(Uri uri, ContentValues contentValues, String str, String[] strArr);

    int a(Uri uri, String str, String[] strArr);

    Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri a(Uri uri, ContentValues contentValues);

    String a();

    String a(Uri uri);

    void b();
}
