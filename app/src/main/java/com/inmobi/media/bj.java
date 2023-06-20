package com.inmobi.media;

import android.content.ContentValues;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ClickDao.java */
/* loaded from: classes3.dex */
public class bj {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f24747a = {"id", "pending_attempts", ImagesContract.URL, "ping_in_webview", "follow_redirect", "ts", "created_ts", "track_extras"};

    /* renamed from: b  reason: collision with root package name */
    private static final String f24748b = "bj";

    /* JADX INFO: Access modifiers changed from: package-private */
    public bj() {
        he a10 = he.a();
        a10.a(au.CLICK_BEACON, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )");
        a10.b();
    }

    public static boolean a() {
        return he.a().a(au.CLICK_BEACON) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ContentValues b(bi biVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(biVar.f24738a));
        contentValues.put(ImagesContract.URL, biVar.f24739b);
        contentValues.put("pending_attempts", Integer.valueOf(biVar.f24743f));
        contentValues.put("ts", Long.toString(biVar.f24741d));
        contentValues.put("created_ts", Long.toString(biVar.f24742e));
        contentValues.put("follow_redirect", Boolean.toString(biVar.f24746i));
        contentValues.put("ping_in_webview", Boolean.toString(biVar.f24745h));
        Map<String, String> map = biVar.f24740c;
        if (map != null && map.size() > 0) {
            contentValues.put("track_extras", new JSONObject(biVar.f24740c).toString());
        }
        return contentValues;
    }

    public final synchronized void a(bi biVar, int i10) {
        ContentValues b10 = b(biVar);
        he a10 = he.a();
        if (a10.a(au.CLICK_BEACON) >= i10) {
            a(a(a10.a(au.CLICK_BEACON, f24747a, "ts= (SELECT MIN(ts) FROM click LIMIT 1)", null, null, null, null, null).get(0)));
        }
        a10.a(au.CLICK_BEACON, b10);
        a10.b();
    }

    public static void a(bi biVar) {
        he a10 = he.a();
        a10.a(au.CLICK_BEACON, "id = ?", new String[]{String.valueOf(biVar.f24738a)});
        a10.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bi a(ContentValues contentValues) {
        int intValue = contentValues.getAsInteger("id").intValue();
        int intValue2 = contentValues.getAsInteger("pending_attempts").intValue();
        String asString = contentValues.getAsString(ImagesContract.URL);
        long longValue = Long.valueOf(contentValues.getAsString("ts")).longValue();
        long longValue2 = Long.valueOf(contentValues.getAsString("created_ts")).longValue();
        boolean booleanValue = Boolean.valueOf(contentValues.getAsString("follow_redirect")).booleanValue();
        boolean booleanValue2 = Boolean.valueOf(contentValues.getAsString("ping_in_webview")).booleanValue();
        String asString2 = contentValues.getAsString("track_extras");
        HashMap hashMap = new HashMap();
        if (asString2 != null) {
            try {
                hashMap.putAll(a(new JSONObject(asString2)));
            } catch (JSONException | Exception unused) {
            }
        }
        return new bi(intValue, asString, hashMap, booleanValue, booleanValue2, intValue2, longValue, longValue2);
    }

    private static Map<String, String> a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, (String) jSONObject.get(next));
        }
        return hashMap;
    }
}
