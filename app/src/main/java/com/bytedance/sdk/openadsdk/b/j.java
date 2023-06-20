package com.bytedance.sdk.openadsdk.b;

import org.json.JSONObject;

/* compiled from: AdShowTime.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private long f11114a;

    /* renamed from: b  reason: collision with root package name */
    private long f11115b;

    /* renamed from: c  reason: collision with root package name */
    private long f11116c;

    /* renamed from: d  reason: collision with root package name */
    private long f11117d;

    /* renamed from: e  reason: collision with root package name */
    private long f11118e;

    public JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j10 = this.f11114a;
        if (j10 > 0) {
            jSONObject.put("show_start", j10);
            long j11 = this.f11115b;
            if (j11 > 0) {
                jSONObject.put("show_firstQuartile", j11);
                long j12 = this.f11116c;
                if (j12 > 0) {
                    jSONObject.put("show_mid", j12);
                    long j13 = this.f11117d;
                    if (j13 > 0) {
                        jSONObject.put("show_thirdQuartile", j13);
                        long j14 = this.f11118e;
                        if (j14 > 0) {
                            jSONObject.put("show_full", j14);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public void a(long j10) {
        if (this.f11114a <= 0) {
            this.f11114a = j10;
        }
    }

    public void a(long j10, float f10) {
        if (f10 > 0.0f) {
            a(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            a(j10);
            b(j10);
        }
        if (d10 >= 0.5d) {
            a(j10);
            b(j10);
            c(j10);
        }
        if (d10 >= 0.75d) {
            a(j10);
            b(j10);
            c(j10);
            d(j10);
        }
        if (f10 >= 1.0f) {
            a(j10);
            b(j10);
            c(j10);
            d(j10);
            e(j10);
        }
    }

    public boolean a() {
        return this.f11114a > 0;
    }

    public JSONObject b() {
        return a((JSONObject) null);
    }

    public void b(long j10) {
        if (this.f11115b <= 0) {
            this.f11115b = j10;
        }
    }

    public void c(long j10) {
        if (this.f11116c <= 0) {
            this.f11116c = j10;
        }
    }

    public void d(long j10) {
        if (this.f11117d <= 0) {
            this.f11117d = j10;
        }
    }

    public void e(long j10) {
        if (this.f11118e <= 0) {
            this.f11118e = j10;
        }
    }
}
