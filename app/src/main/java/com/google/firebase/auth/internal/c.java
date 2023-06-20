package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p002firebaseauthapi.zzad;
import com.google.android.gms.internal.p002firebaseauthapi.zznd;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f23281a = new Logger("JSONParser", new String[0]);

    @VisibleForTesting
    static List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        Preconditions.checkNotEmpty(str);
        List zzd = zzad.zzb('.').zzd(str);
        if (zzd.size() < 2) {
            f23281a.e("Invalid idToken ".concat(String.valueOf(str)), new Object[0]);
            return new HashMap();
        }
        try {
            Map c10 = c(new String(Base64Utils.decodeUrlSafeNoPadding((String) zzd.get(1)), "UTF-8"));
            return c10 == null ? new HashMap() : c10;
        } catch (UnsupportedEncodingException e10) {
            f23281a.e("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zznd(e10);
        }
    }

    @VisibleForTesting
    static Map d(JSONObject jSONObject) throws JSONException {
        androidx.collection.a aVar = new androidx.collection.a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            aVar.put(next, obj);
        }
        return aVar;
    }
}
