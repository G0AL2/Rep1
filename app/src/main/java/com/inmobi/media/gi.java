package com.inmobi.media;

import android.content.ContentValues;
import android.util.Log;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CrashEvent.java */
/* loaded from: classes3.dex */
public class gi {

    /* renamed from: g  reason: collision with root package name */
    private static final String f25539g = "gi";

    /* renamed from: a  reason: collision with root package name */
    int f25540a;

    /* renamed from: b  reason: collision with root package name */
    String f25541b;

    /* renamed from: c  reason: collision with root package name */
    String f25542c;

    /* renamed from: d  reason: collision with root package name */
    String f25543d;

    /* renamed from: e  reason: collision with root package name */
    long f25544e;

    /* renamed from: f  reason: collision with root package name */
    protected String f25545f;

    public gi(Thread thread, Throwable th) {
        this("crashReporting", "CrashEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", th.getClass().getSimpleName());
            jSONObject.put("message", th.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(th));
            jSONObject.put("thread", thread.getName());
            this.f25545f = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public final String a() {
        String str = this.f25545f;
        return str == null ? "" : str;
    }

    public String toString() {
        return this.f25542c + "@" + this.f25543d + " ";
    }

    public static gi a(ContentValues contentValues) {
        String asString = contentValues.getAsString("eventId");
        String asString2 = contentValues.getAsString("eventType");
        String asString3 = contentValues.getAsString("componentType");
        String asString4 = contentValues.getAsString("payload");
        long longValue = Long.valueOf(contentValues.getAsString("ts")).longValue();
        gi giVar = new gi(asString, asString3, asString2, asString4);
        giVar.f25544e = longValue;
        giVar.f25540a = contentValues.getAsInteger("id").intValue();
        return giVar;
    }

    public gi(String str, String str2) {
        this.f25541b = UUID.randomUUID().toString();
        this.f25543d = str;
        this.f25542c = str2;
        this.f25545f = null;
        this.f25544e = System.currentTimeMillis();
    }

    private gi(String str, String str2, String str3, String str4) {
        this.f25541b = str;
        this.f25543d = str2;
        this.f25542c = str3;
        this.f25545f = str4;
        this.f25544e = System.currentTimeMillis();
    }
}
