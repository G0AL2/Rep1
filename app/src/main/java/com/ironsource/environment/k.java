package com.ironsource.environment;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26178a = "k";

    /* renamed from: b  reason: collision with root package name */
    private static final ArrayList<String> f26179b = new a();

    /* loaded from: classes3.dex */
    static class a extends ArrayList<String> {
        a() {
            add("com.google.market");
            add("com.android.vending");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ boolean f26180a;

        b(boolean z10) {
            this.f26180a = z10;
            put("isInstalled", this.f26180a);
        }
    }

    private static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> b10 = b(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                jSONObject.put(next, new b(b10.contains(next.trim().toLowerCase())));
            }
        } catch (Exception unused) {
            Log.d(f26178a, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    public static boolean a(Context context) {
        JSONObject a10 = a(context, f26179b);
        Iterator<String> keys = a10.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a10.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    private static ArrayList<String> b(Context context) {
        List<ApplicationInfo> p10 = h.p(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : p10) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase());
            }
        }
        return arrayList;
    }
}
