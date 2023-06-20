package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjt {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", "width", "height"};
    static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject zza(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / zza);
            jSONObject.put("y", i11 / zza);
            jSONObject.put("width", i12 / zza);
            jSONObject.put("height", i13 / zza);
        } catch (JSONException e10) {
            zzfju.zza("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void zzb(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            zzfju.zza("Error with setting ad session id", e10);
        }
    }

    public static void zzc(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void zzd(JSONObject jSONObject, zzfjx zzfjxVar) {
        zzfjf zza2 = zzfjxVar.zza();
        JSONArray jSONArray = new JSONArray();
        ArrayList zzb2 = zzfjxVar.zzb();
        int size = zzb2.size();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put((String) zzb2.get(i10));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", zza2.zzd());
            jSONObject.put("friendlyObstructionPurpose", zza2.zza());
            jSONObject.put("friendlyObstructionReason", zza2.zzc());
        } catch (JSONException e10) {
            zzfju.zza("Error with setting friendly obstruction", e10);
        }
    }

    public static void zze(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            zzfju.zza("Error with setting not visible reason", e10);
        }
    }

    public static void zzf(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zzg(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e10) {
            zzfju.zza("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void zzh(JSONObject jSONObject) {
        float f10;
        float f11 = 0.0f;
        if (zzb != null) {
            Point point = new Point(0, 0);
            zzb.getDefaultDisplay().getRealSize(point);
            float f12 = zza;
            f11 = point.x / f12;
            f10 = point.y / f12;
        } else {
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", f11);
            jSONObject.put("height", f10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean zzi(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            int i10 = 0;
            while (true) {
                if (i10 < 4) {
                    String str = strArr[i10];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i10++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (zzj(optJSONArray, optJSONArray2)) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                if (!optJSONArray.optString(i11, "").equals(optJSONArray2.optString(i11, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (zzj(optJSONArray3, optJSONArray4)) {
                            for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                                if (zzi(optJSONArray3.optJSONObject(i12), optJSONArray4.optJSONObject(i12))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzj(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
