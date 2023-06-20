package com.bytedance.sdk.openadsdk.core.j.b;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastFractionalProgressTracker.java */
/* loaded from: classes.dex */
public class b extends c implements Comparable<b> {

    /* renamed from: a  reason: collision with root package name */
    private float f12425a;

    /* compiled from: VastFractionalProgressTracker.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f12426a;

        /* renamed from: b  reason: collision with root package name */
        private float f12427b;

        /* renamed from: c  reason: collision with root package name */
        private c.b f12428c = c.b.TRACKING_URL;

        /* renamed from: d  reason: collision with root package name */
        private boolean f12429d = false;

        public a(String str, float f10) {
            this.f12426a = str;
            this.f12427b = f10;
        }

        public b a() {
            return new b(this.f12427b, this.f12426a, this.f12428c, Boolean.valueOf(this.f12429d));
        }
    }

    public boolean a(float f10) {
        return this.f12425a <= f10 && !e();
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, c());
        jSONObject.put("trackingFraction", this.f12425a);
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.j.b.c
    public void f_() {
        super.f_();
    }

    private b(float f10, String str, c.b bVar, Boolean bool) {
        super(str, bVar, bool);
        this.f12425a = f10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(b bVar) {
        if (bVar != null) {
            float f10 = this.f12425a;
            float f11 = bVar.f12425a;
            if (f10 > f11) {
                return 1;
            }
            return f10 < f11 ? -1 : 0;
        }
        return 1;
    }
}
