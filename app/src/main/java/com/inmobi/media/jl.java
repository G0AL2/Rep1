package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UnifiedIDUtils.java */
/* loaded from: classes3.dex */
public final class jl {
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(org.json.JSONObject r9) {
        /*
            java.lang.String r0 = "ufids"
            r1 = 0
            r2 = 1
            boolean r3 = r9.has(r0)     // Catch: org.json.JSONException -> L39
            if (r3 == 0) goto L39
            org.json.JSONArray r9 = r9.getJSONArray(r0)     // Catch: org.json.JSONException -> L39
            if (r9 == 0) goto L39
            int r0 = r9.length()     // Catch: org.json.JSONException -> L39
            if (r0 == 0) goto L39
            r0 = 0
            r3 = 1
        L18:
            int r4 = r9.length()     // Catch: org.json.JSONException -> L37
            if (r0 >= r4) goto L3a
            org.json.JSONObject r4 = r9.getJSONObject(r0)     // Catch: org.json.JSONException -> L37
            long r5 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L37
            java.lang.String r7 = "expiry"
            long r7 = r4.getLong(r7)     // Catch: org.json.JSONException -> L37
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 > 0) goto L32
            r4 = 1
            goto L33
        L32:
            r4 = 0
        L33:
            r3 = r3 & r4
            int r0 = r0 + 1
            goto L18
        L37:
            goto L3a
        L39:
            r3 = 1
        L3a:
            if (r3 != 0) goto L3d
            return r2
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.jl.a(org.json.JSONObject):boolean");
    }

    public static boolean b(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return true;
        }
        try {
            jSONArray = jSONObject.has("ufids") ? jSONObject.getJSONArray("ufids") : null;
        } catch (JSONException unused) {
        }
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean c() {
        iw.a();
        boolean z10 = !iw.f().enabled;
        if (z10) {
            InMobiUnifiedIdService.reset();
        }
        return z10;
    }

    public static JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        JSONObject a10 = jk.a();
        if (a10 != null && a10.has("ufids")) {
            try {
                JSONArray jSONArray2 = a10.getJSONArray("ufids");
                if (jSONArray2 != null) {
                    for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                        String string = jSONArray2.getJSONObject(i10).getString("src");
                        String string2 = jSONArray2.getJSONObject(i10).getString(InAppPurchaseMetaData.KEY_SIGNATURE);
                        boolean z10 = System.currentTimeMillis() > jSONArray2.getJSONObject(i10).getLong("expiry");
                        if (string != null && string2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string);
                            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, string2);
                            jSONObject.put("expired", z10);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public static boolean b() {
        Boolean g10 = iq.a().g();
        boolean z10 = g10 == null || g10.booleanValue();
        if (z10) {
            InMobiUnifiedIdService.reset();
        }
        return z10;
    }

    public static JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int i10 = 0;
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(i10, jSONObject3);
                            i10++;
                        }
                    }
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        if (jSONArray.length() > 0) {
            jSONObject2.put("ufids", jSONArray);
            return jSONObject;
        }
        return null;
    }

    public static ci a() {
        if (c()) {
            return new ci();
        }
        if (b()) {
            return new ci();
        }
        HashMap hashMap = new HashMap();
        JSONObject b10 = jk.b();
        if (b10 != null) {
            Iterator<String> keys = b10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (b10.get(next) != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("src", next);
                        jSONObject.put("envelope", b10.get(next));
                        hashMap.put(next, jSONObject);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        JSONObject a10 = jk.a();
        boolean z10 = false;
        if (a10 != null) {
            try {
                if (a10.has("ufids")) {
                    JSONArray jSONArray = a10.getJSONArray("ufids");
                    boolean z11 = false;
                    boolean z12 = false;
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            String string = jSONArray.getJSONObject(i10).getString("src");
                            String string2 = jSONArray.getJSONObject(i10).getString("envelope");
                            if (System.currentTimeMillis() > jSONArray.getJSONObject(i10).getLong("expiry")) {
                                z11 = true;
                            } else if (string != null && string2 != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("src", string);
                                jSONObject2.put("envelope", string2);
                                hashMap.put(string, jSONObject2);
                                z12 = true;
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                    if (z11) {
                        InMobiUnifiedIdService.a((InMobiUnifiedIdInterface) null);
                    }
                    z10 = z12;
                }
            } catch (JSONException unused3) {
            }
        }
        if (hashMap.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (JSONObject jSONObject3 : hashMap.values()) {
                jSONArray2.put(jSONObject3);
            }
            return new ci(jSONArray2.toString(), z10);
        }
        return new ci();
    }

    public static void a(final InMobiUnifiedIdInterface inMobiUnifiedIdInterface, final JSONObject jSONObject, final Error error) {
        byte a10 = a(error);
        if (a10 >= 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(a10));
            hh.a().a("FetchCallbackFailure ", hashMap);
        }
        if (inMobiUnifiedIdInterface != null) {
            ji.a().a(new Runnable() { // from class: com.inmobi.media.jl.1
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiUnifiedIdInterface.this.onFetchCompleted(jSONObject, error);
                }
            });
        }
    }

    private static byte a(Error error) {
        if (error != null) {
            String message = error.getMessage();
            message.hashCode();
            if (message.equals(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
                return (byte) 93;
            }
            return !message.equals(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (byte) -1 : (byte) 94;
        }
        return (byte) -1;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        HashMap hashMap = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids") && (jSONArray = jSONObject2.getJSONArray("ufids")) != null) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        hashMap.put(jSONArray.getJSONObject(i10).getString("src"), jSONArray.getJSONObject(i10));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null && jSONObject.has("ufids") && (jSONArray2 = jSONObject.getJSONArray("ufids")) != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                hashMap.put(jSONArray2.getJSONObject(i11).getString("src"), jSONArray2.getJSONObject(i11));
            }
        }
        for (JSONObject jSONObject4 : hashMap.values()) {
            jSONArray3.put(jSONObject4);
        }
        jSONObject3.put("ufids", jSONArray3);
        return jSONObject3;
    }
}
