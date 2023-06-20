package com.inmobi.media;

import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.internal.ImagesContract;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdFactory.java */
/* loaded from: classes3.dex */
public final class ay {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24659a = au.class.getSimpleName();

    private static void a(au auVar, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("pubContent");
            if (jSONObject2.isNull("rootContainer")) {
                return;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("rootContainer");
            JSONArray jSONArray = new JSONArray();
            for (String str : e(jSONObject3)) {
                a(jSONArray, str, (byte) 2);
            }
            for (String str2 : f(jSONObject3)) {
                a(jSONArray, str2, (byte) 1);
            }
            boolean d10 = d(jSONObject3);
            auVar.assetUrls = jSONArray;
            auVar.mIsPreloadWebView = d10;
        } catch (Exception e10) {
            gg.a().a(new hg(e10));
        }
    }

    private static List<String> b(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (!jSONArray.getJSONObject(i10).isNull("rootContainer")) {
                    arrayList.addAll(f(jSONArray.getJSONObject(i10).getJSONObject("rootContainer")));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    private static String c(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return "";
            }
            String string = jSONObject.getString("assetType");
            if (DownloadResource.TYPE_VIDEO.equalsIgnoreCase(string)) {
                return jSONArray.getString(0);
            }
            if ("container".equalsIgnoreCase(string)) {
                String str = "";
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    str = c(jSONArray.getJSONObject(i10));
                    if (str.trim().length() != 0) {
                        break;
                    }
                }
                return str;
            }
            return "";
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return "";
        }
    }

    private static boolean d(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return false;
            }
            String string = jSONObject.getString("assetType");
            if ("webview".equalsIgnoreCase(string)) {
                return !jSONObject.isNull("preload") && jSONObject.getBoolean("preload");
            } else if ("container".equalsIgnoreCase(string)) {
                boolean z10 = false;
                for (int i10 = 0; i10 < jSONArray.length() && !(z10 = d(jSONArray.getJSONObject(i10))); i10++) {
                }
                return z10;
            } else {
                return false;
            }
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return false;
        }
    }

    private static List<String> e(JSONObject jSONObject) {
        JSONArray jSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            jSONArray = jSONObject.getJSONArray("assetValue");
        } catch (JSONException unused) {
        }
        if (jSONArray.length() == 0) {
            return arrayList;
        }
        String string = jSONObject.getString("assetType");
        if ("image".equalsIgnoreCase(string)) {
            if (!jSONObject.isNull("preload") && jSONObject.getBoolean("preload")) {
                arrayList.add(jSONArray.getString(0));
            }
            return arrayList;
        }
        if ("container".equalsIgnoreCase(string)) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.addAll(e(jSONArray.getJSONObject(i10)));
            }
        }
        return arrayList;
    }

    private static List<String> f(JSONObject jSONObject) {
        JSONArray jSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            jSONArray = jSONObject.getJSONArray("assetValue");
        } catch (JSONException unused) {
        }
        if (jSONArray.length() == 0) {
            return arrayList;
        }
        String string = jSONObject.getString("assetType");
        if ("gif".equalsIgnoreCase(string)) {
            arrayList.add(jSONArray.getString(0));
            return arrayList;
        }
        if ("container".equalsIgnoreCase(string)) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.addAll(f(jSONArray.getJSONObject(i10)));
            }
        }
        return arrayList;
    }

    public static au a(au auVar, fq fqVar) throws JSONException, br {
        if ("inmobiJson".equals(auVar.i())) {
            JSONObject jSONObject = new JSONObject(auVar.j());
            String c10 = c(jSONObject.getJSONObject("rootContainer"));
            if (c10.trim().length() == 0) {
                return auVar;
            }
            ds a10 = new dp(fqVar.vastVideo).a(c10);
            JSONArray jSONArray = auVar.assetUrls;
            if (a10.f25173f == 0) {
                String b10 = a10.b();
                if (b10 != null && !b10.isEmpty()) {
                    a(jSONArray, b10, (byte) 0);
                    List<String> a11 = a(jSONObject, fqVar.vastVideo);
                    a11.size();
                    for (String str : a11) {
                        a(jSONArray, str, (byte) 0);
                    }
                    for (String str2 : a(jSONObject)) {
                        a(jSONArray, str2, (byte) 2);
                    }
                    for (String str3 : b(jSONObject)) {
                        a(jSONArray, str3, (byte) 1);
                    }
                    return new bl(auVar, jSONArray, a10.b(), a10.f25169b, a10.f25170c, a10.f25171d, a10.f25172e);
                }
                throw new br(TTAdConstant.MATE_IS_NULL_CODE);
            }
            throw new br(a10.f25173f);
        }
        return auVar;
    }

    private static void a(JSONArray jSONArray, String str, byte b10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (int) b10);
        jSONObject.put(ImagesContract.URL, str);
        jSONArray.put(jSONObject);
    }

    private static List<String> a(JSONObject jSONObject, fq.k kVar) {
        ds a10;
        String b10;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (!jSONArray.getJSONObject(i10).isNull("rootContainer")) {
                    String c10 = c(jSONArray.getJSONObject(i10).getJSONObject("rootContainer"));
                    if (c10.trim().length() != 0 && (a10 = new dp(kVar).a(c10)) != null && a10.f25173f == 0 && (b10 = a10.b()) != null && !b10.isEmpty()) {
                        arrayList.add(b10);
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    private static List<String> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (!jSONArray.getJSONObject(i10).isNull("rootContainer")) {
                    arrayList.addAll(e(jSONArray.getJSONObject(i10).getJSONObject("rootContainer")));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    public static void a(au auVar, JSONObject jSONObject, String str, long j10) throws JSONException, IllegalStateException {
        if (!DtbDeviceDataRetriever.ORIENTATION_UNKNOWN.equals(auVar.markupType) && !TextUtils.isEmpty(auVar.impressionId)) {
            long optLong = jSONObject.optLong("expiry", TimeUnit.MILLISECONDS.toSeconds(j10));
            long millis = optLong <= 0 ? -1L : TimeUnit.SECONDS.toMillis(optLong);
            auVar.mAdContent = jSONObject;
            auVar.mAdType = str;
            auVar.mInsertionTimestampInMillis = System.currentTimeMillis();
            auVar.mExpiryDurationInMillis = millis;
            if ("inmobiJson".equals(auVar.i())) {
                a(auVar, jSONObject);
                return;
            }
            return;
        }
        throw new IllegalStateException("Invalid Ad");
    }
}
