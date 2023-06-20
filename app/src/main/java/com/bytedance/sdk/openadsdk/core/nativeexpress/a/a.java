package com.bytedance.sdk.openadsdk.core.nativeexpress.a;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.google.android.gms.common.internal.ImagesContract;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TemplateUtils.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f12588a = "";

    public static boolean a(n.a aVar) {
        return (aVar == null || TextUtils.isEmpty(aVar.b()) || TextUtils.isEmpty(aVar.e())) ? false : true;
    }

    public static boolean a(n nVar) {
        return true;
    }

    public static Map<String, String> b(n nVar) {
        HashMap hashMap = null;
        if (nVar == null) {
            return null;
        }
        List<k> P = nVar.P();
        if (P != null && P.size() > 0) {
            hashMap = new HashMap();
            for (k kVar : P) {
                if (kVar != null) {
                    hashMap.put(kVar.a(), kVar.g());
                }
            }
        }
        return hashMap;
    }

    public static JSONObject a(float f10, float f11, boolean z10, n nVar) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!a(nVar.G())) {
                f12588a = "";
            }
            jSONObject.put("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z10) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", a(false, nVar));
            if (nVar.G() != null) {
                str = nVar.G().e();
                str2 = nVar.G().f();
            } else {
                str = null;
                str2 = null;
            }
            if (!TextUtils.isEmpty(str)) {
                f12588a = str;
            } else if (nVar.G() != null && com.bytedance.sdk.component.adexpress.a.b.a.c(nVar.G().b()) != null) {
                f12588a = com.bytedance.sdk.component.adexpress.a.b.a.c(nVar.G().b()).e();
            }
            jSONObject.put("template_Plugin", f12588a);
            jSONObject.put("diff_template_Plugin", str2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject a(boolean z10, n nVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", nVar.W());
            if (nVar.M() != null) {
                if (nVar.M() != null && !TextUtils.isEmpty(nVar.M().a())) {
                    jSONObject.put("icon", nVar.M().a());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (nVar.P() != null) {
                for (int i10 = 0; i10 < nVar.P().size(); i10++) {
                    k kVar = nVar.P().get(i10);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", kVar.c());
                    jSONObject2.put("width", kVar.b());
                    jSONObject2.put(ImagesContract.URL, kVar.a());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", nVar.ad());
            jSONObject.put("interaction_type", nVar.L());
            jSONObject.put("interaction_method", nVar.g());
            jSONObject.put("is_compliance_template", a(nVar));
            jSONObject.put("title", nVar.U());
            jSONObject.put("description", nVar.V());
            jSONObject.put("source", nVar.K());
            if (nVar.aa() != null) {
                jSONObject.put("comment_num", nVar.aa().e());
                jSONObject.put("score", nVar.aa().d());
                jSONObject.put("app_size", nVar.aa().f());
                jSONObject.put("app", nVar.aa().g());
            }
            if (nVar.J() != null) {
                jSONObject.put(DownloadResource.TYPE_VIDEO, nVar.J().G());
            }
            if (nVar.G() != null) {
                jSONObject.put("dynamic_creative", nVar.G().g());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(n nVar, String str) {
        List<k> P;
        if (nVar != null && (P = nVar.P()) != null && P.size() > 0) {
            for (k kVar : P) {
                if (kVar != null && TextUtils.equals(str, kVar.a())) {
                    return kVar.g();
                }
            }
        }
        return null;
    }
}
