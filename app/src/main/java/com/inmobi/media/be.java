package com.inmobi.media;

import android.content.ContentValues;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* compiled from: AssetDao.java */
/* loaded from: classes3.dex */
public class be {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f24702a = {"id", "pending_attempts", ImagesContract.URL, "disk_uri", "ts", "created_ts", "ttl", "soft_ttl"};

    /* renamed from: b  reason: collision with root package name */
    private static final String f24703b = "be";

    /* compiled from: AssetDao.java */
    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        static final be f24704a = new be((byte) 0);
    }

    /* synthetic */ be(byte b10) {
        this();
    }

    public static be a() {
        return a.f24704a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static av b() {
        List<ContentValues> a10 = he.a().a("asset", f24702a, null, null, null, null, "ts ASC ", null);
        if (a10.size() == 0) {
            return null;
        }
        return a(a10.get(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<av> c() {
        ArrayList<av> arrayList = new ArrayList();
        he a10 = he.a();
        for (ContentValues contentValues : a10.a("asset", f24702a, null, null, null, null, "ts ASC ", null)) {
            arrayList.add(a(contentValues));
        }
        a10.b();
        ArrayList arrayList2 = new ArrayList();
        for (av avVar : arrayList) {
            if (!avVar.a()) {
                arrayList2.add(avVar);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<av> d() {
        ArrayList arrayList = new ArrayList();
        he a10 = he.a();
        if (a10.a("asset") == 0) {
            return arrayList;
        }
        List<ContentValues> a11 = a10.a("asset", f24702a, "disk_uri IS NOT NULL", null, null, null, "created_ts DESC ", null);
        a10.b();
        for (ContentValues contentValues : a11) {
            arrayList.add(a(contentValues));
        }
        return arrayList;
    }

    public static String e() {
        List<av> d10 = d();
        if (d10.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (av avVar : d10) {
            try {
                jSONArray.put(URLEncoder.encode(avVar.f24630d, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return jSONArray.toString();
    }

    public static List<String> f() {
        ArrayList arrayList = new ArrayList();
        he a10 = he.a();
        if (a10.a("asset") == 0) {
            return arrayList;
        }
        List<ContentValues> a11 = a10.a("asset", new String[]{ImagesContract.URL}, null, null, null, null, "created_ts DESC ", null);
        a10.b();
        for (ContentValues contentValues : a11) {
            arrayList.add(contentValues.getAsString(ImagesContract.URL));
        }
        return arrayList;
    }

    private be() {
        he a10 = he.a();
        a10.a("asset", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, disk_uri TEXT, ts TEXT NOT NULL, created_ts TEXT NOT NULL, ttl TEXT NOT NULL, soft_ttl TEXT NOT NULL)");
        a10.b();
    }

    public final synchronized void a(av avVar) {
        if (b(avVar) <= 0) {
            ContentValues d10 = d(avVar);
            he a10 = he.a();
            a10.a("asset", d10);
            a10.b();
        }
    }

    public static av b(String str) {
        he a10 = he.a();
        List<ContentValues> a11 = a10.a("asset", f24702a, "url=? ", new String[]{str}, null, null, "created_ts DESC ", "1");
        a10.b();
        if (a11.isEmpty()) {
            return null;
        }
        return a(a11.get(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static av a(String str) {
        he a10 = he.a();
        List<ContentValues> a11 = a10.a("asset", f24702a, "url=? ", new String[]{str}, null, null, "created_ts DESC ", "1");
        a10.b();
        if (a11.isEmpty()) {
            return null;
        }
        return a(a11.get(0));
    }

    public static int b(av avVar) {
        he a10 = he.a();
        int b10 = a10.b("asset", d(avVar), "url = ?", new String[]{String.valueOf(avVar.f24630d)});
        a10.b();
        return b10;
    }

    private static ContentValues d(av avVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(avVar.f24628b));
        contentValues.put(ImagesContract.URL, avVar.f24630d);
        contentValues.put("disk_uri", avVar.f24631e);
        contentValues.put("pending_attempts", Integer.valueOf(avVar.f24629c));
        contentValues.put("ts", Long.toString(avVar.f24632f));
        contentValues.put("created_ts", Long.toString(avVar.f24633g));
        contentValues.put("ttl", Long.toString(avVar.f24634h));
        contentValues.put("soft_ttl", Long.toString(avVar.f24635i));
        return contentValues;
    }

    public static void c(av avVar) {
        he a10 = he.a();
        a10.a("asset", "id = ?", new String[]{String.valueOf(avVar.f24628b)});
        a10.b();
    }

    public static av a(ContentValues contentValues) {
        return new av(contentValues.getAsInteger("id").intValue(), contentValues.getAsString(ImagesContract.URL), contentValues.getAsString("disk_uri"), contentValues.getAsInteger("pending_attempts").intValue(), Long.valueOf(contentValues.getAsString("ts")).longValue(), Long.valueOf(contentValues.getAsString("created_ts")).longValue(), Long.valueOf(contentValues.getAsString("ttl")).longValue(), Long.valueOf(contentValues.getAsString("soft_ttl")).longValue());
    }
}
