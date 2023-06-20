package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxq  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzxq {
    public static zzrm zza(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        Log.e(str, "Failed to parse " + str + " for string [" + str2 + "] with exception: " + message);
        return new zzrm("Failed to parse " + str + " for string [" + str2 + "]", exc);
    }

    public static List zzb(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
        }
        return arrayList;
    }
}
