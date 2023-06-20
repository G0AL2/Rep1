package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.gms.ads.AdRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: LocalContentUriThumbnailFetchProducer.java */
/* loaded from: classes.dex */
public class d0 extends e0 implements d1<w5.e> {

    /* renamed from: d  reason: collision with root package name */
    private static final Class<?> f14936d = d0.class;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f14937e = {"_id", "_data"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f14938f = {"_data"};

    /* renamed from: g  reason: collision with root package name */
    private static final Rect f14939g = new Rect(0, 0, AdRequest.MAX_CONTENT_URL_LENGTH, 384);

    /* renamed from: h  reason: collision with root package name */
    private static final Rect f14940h = new Rect(0, 0, 96, 96);

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f14941c;

    public d0(Executor executor, b4.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f14941c = contentResolver;
    }

    private w5.e g(Uri uri, q5.e eVar) throws IOException {
        Cursor query;
        w5.e j10;
        if (eVar == null || (query = this.f14941c.query(uri, f14937e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (j10 = j(eVar, query.getLong(query.getColumnIndex("_id")))) == null) {
                return null;
            }
            j10.T0(i(query.getString(query.getColumnIndex("_data"))));
            return j10;
        } finally {
            query.close();
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int i(String str) {
        if (str != null) {
            try {
                return com.facebook.imageutils.c.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e10) {
                z3.a.i(f14936d, e10, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    private w5.e j(q5.e eVar, long j10) throws IOException {
        Cursor queryMiniThumbnail;
        int k10 = k(eVar);
        if (k10 == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f14941c, j10, k10, f14938f)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst()) {
                String str = (String) y3.k.g(queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data")));
                if (new File(str).exists()) {
                    return e(new FileInputStream(str), h(str));
                }
            }
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }

    private static int k(q5.e eVar) {
        Rect rect = f14940h;
        if (e1.b(rect.width(), rect.height(), eVar)) {
            return 3;
        }
        Rect rect2 = f14939g;
        return e1.b(rect2.width(), rect2.height(), eVar) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public boolean a(q5.e eVar) {
        Rect rect = f14939g;
        return e1.b(rect.width(), rect.height(), eVar);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected w5.e d(b6.b bVar) throws IOException {
        Uri q10 = bVar.q();
        if (g4.f.g(q10)) {
            return g(q10, bVar.m());
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
