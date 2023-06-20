package com.inmobi.media;

import android.content.ContentValues;

/* compiled from: TelemetryEvent.java */
/* loaded from: classes3.dex */
public class hj {

    /* renamed from: a  reason: collision with root package name */
    int f25671a;

    /* renamed from: b  reason: collision with root package name */
    String f25672b;

    /* renamed from: c  reason: collision with root package name */
    long f25673c;

    /* renamed from: d  reason: collision with root package name */
    String f25674d;

    public hj(String str) {
        this.f25672b = str;
        this.f25674d = null;
        this.f25673c = System.currentTimeMillis();
    }

    public final String a() {
        String str = this.f25674d;
        return str == null ? "" : str;
    }

    public String toString() {
        return this.f25672b + " ";
    }

    public static hj a(ContentValues contentValues) {
        String asString = contentValues.getAsString("eventType");
        String asString2 = contentValues.getAsString("payload");
        long longValue = Long.valueOf(contentValues.getAsString("ts")).longValue();
        hj hjVar = new hj(asString, asString2);
        hjVar.f25673c = longValue;
        hjVar.f25671a = contentValues.getAsInteger("id").intValue();
        return hjVar;
    }

    private hj(String str, String str2) {
        this.f25672b = str;
        this.f25674d = str2;
        this.f25673c = System.currentTimeMillis();
    }
}
