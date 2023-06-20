package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes3.dex */
public class CrashProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    private Context f26103a;

    /* renamed from: b  reason: collision with root package name */
    private String f26104b;

    /* renamed from: c  reason: collision with root package name */
    private UriMatcher f26105c = new UriMatcher(-1);

    /* renamed from: d  reason: collision with root package name */
    private String f26106d;

    /* renamed from: e  reason: collision with root package name */
    private String f26107e;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.f26105c.match(uri);
        if (match != 1) {
            if (match == 2) {
                return this.f26107e;
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return this.f26106d;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f26103a = getContext();
        new f(this.f26103a);
        this.f26104b = this.f26103a.getPackageName();
        Uri.parse("content://" + this.f26104b + "/REPORTS");
        this.f26106d = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f26107e = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f26105c.match(uri);
        if (match != 1) {
            if (match == 2) {
                return f.a(Integer.parseInt(uri.getLastPathSegment()));
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return f.b();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
