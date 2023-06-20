package com.ironsource.mediationsdk.a;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
abstract class a {

    /* renamed from: a  reason: collision with root package name */
    JSONObject f26666a;

    /* renamed from: b  reason: collision with root package name */
    int f26667b;

    /* renamed from: c  reason: collision with root package name */
    String f26668c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26669d = "eventId";

    /* renamed from: e  reason: collision with root package name */
    private final String f26670e = "timestamp";

    /* renamed from: f  reason: collision with root package name */
    private final String f26671f = "InterstitialEvents";

    /* renamed from: g  reason: collision with root package name */
    private final String f26672g = "events";

    /* renamed from: h  reason: collision with root package name */
    private final String f26673h = "events";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(c cVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(cVar.c()) ? new JSONObject(cVar.c()) : new JSONObject();
            jSONObject.put("eventId", cVar.a());
            jSONObject.put("timestamp", cVar.b());
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return TextUtils.isEmpty(this.f26668c) ? b() : this.f26668c;
    }

    public abstract String a(ArrayList<c> arrayList, JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(JSONArray jSONArray) {
        try {
            if (this.f26666a != null) {
                JSONObject jSONObject = new JSONObject(this.f26666a.toString());
                jSONObject.put("timestamp", IronSourceUtils.getTimeStamp());
                jSONObject.put(this.f26667b == 2 ? "InterstitialEvents" : "events", jSONArray);
                return jSONObject.toString();
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    protected abstract String b();

    public abstract String c();
}
