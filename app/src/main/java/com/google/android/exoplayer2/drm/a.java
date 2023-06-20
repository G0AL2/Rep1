package com.google.android.exoplayer2.drm;

import ea.n0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ClearKeyUtil.java */
/* loaded from: classes2.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return n0.f29709a >= 27 ? bArr : n0.p0(c(n0.D(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (n0.f29709a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(n0.D(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return n0.p0(sb2.toString());
        } catch (JSONException e10) {
            String valueOf = String.valueOf(n0.D(bArr));
            ea.r.d("ClearKeyUtil", valueOf.length() != 0 ? "Failed to adjust response data: ".concat(valueOf) : new String("Failed to adjust response data: "), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
