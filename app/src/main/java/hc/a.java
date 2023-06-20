package hc;

import android.text.TextUtils;
import cc.c;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import vb.f;
import yb.l;

/* compiled from: DefaultSettingsSpiCall.java */
/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f31410a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.b f31411b;

    /* renamed from: c  reason: collision with root package name */
    private final f f31412c;

    public a(String str, cc.b bVar) {
        this(str, bVar, f.f());
    }

    private cc.a b(cc.a aVar, gc.f fVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.f30822a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", l.i());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f30823b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f30824c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.f30825d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", fVar.f30826e.a());
        return aVar;
    }

    private void c(cc.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            f fVar = this.f31412c;
            fVar.l("Failed to parse settings JSON from " + this.f31410a, e10);
            f fVar2 = this.f31412c;
            fVar2.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(gc.f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f30829h);
        hashMap.put("display_version", fVar.f30828g);
        hashMap.put("source", Integer.toString(fVar.f30830i));
        String str = fVar.f30827f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // hc.b
    public JSONObject a(gc.f fVar, boolean z10) {
        if (z10) {
            try {
                Map<String, String> f10 = f(fVar);
                cc.a b10 = b(d(f10), fVar);
                f fVar2 = this.f31412c;
                fVar2.b("Requesting settings from " + this.f31410a);
                f fVar3 = this.f31412c;
                fVar3.i("Settings query params were: " + f10);
                return g(b10.c());
            } catch (IOException e10) {
                this.f31412c.e("Settings request failed.", e10);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    protected cc.a d(Map<String, String> map) {
        cc.a a10 = this.f31411b.a(this.f31410a, map);
        return a10.d("User-Agent", "Crashlytics Android SDK/" + l.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(c cVar) {
        int b10 = cVar.b();
        f fVar = this.f31412c;
        fVar.i("Settings response code was: " + b10);
        if (h(b10)) {
            return e(cVar.a());
        }
        f fVar2 = this.f31412c;
        fVar2.d("Settings request failed; (status: " + b10 + ") from " + this.f31410a);
        return null;
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    a(String str, cc.b bVar, f fVar) {
        if (str != null) {
            this.f31412c = fVar;
            this.f31411b = bVar;
            this.f31410a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
