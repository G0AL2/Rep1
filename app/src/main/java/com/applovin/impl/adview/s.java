package com.applovin.impl.adview;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final int f7112a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7113b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7114c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7115d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7116e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7117f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7118g;

    /* renamed from: h  reason: collision with root package name */
    private final int f7119h;

    /* renamed from: i  reason: collision with root package name */
    private final float f7120i;

    /* renamed from: j  reason: collision with root package name */
    private final float f7121j;

    public s(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v A = mVar.A();
            A.c("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f7112a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f7113b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f7114c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f7115d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f7116e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f7117f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f7118g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f7119h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f7120i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f7121j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public int a() {
        return this.f7112a;
    }

    public int b() {
        return this.f7113b;
    }

    public int c() {
        return this.f7114c;
    }

    public int d() {
        return this.f7115d;
    }

    public boolean e() {
        return this.f7116e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f7112a == sVar.f7112a && this.f7113b == sVar.f7113b && this.f7114c == sVar.f7114c && this.f7115d == sVar.f7115d && this.f7116e == sVar.f7116e && this.f7117f == sVar.f7117f && this.f7118g == sVar.f7118g && this.f7119h == sVar.f7119h && Float.compare(sVar.f7120i, this.f7120i) == 0 && Float.compare(sVar.f7121j, this.f7121j) == 0;
    }

    public long f() {
        return this.f7117f;
    }

    public long g() {
        return this.f7118g;
    }

    public long h() {
        return this.f7119h;
    }

    public int hashCode() {
        int i10 = ((((((((((((((this.f7112a * 31) + this.f7113b) * 31) + this.f7114c) * 31) + this.f7115d) * 31) + (this.f7116e ? 1 : 0)) * 31) + this.f7117f) * 31) + this.f7118g) * 31) + this.f7119h) * 31;
        float f10 = this.f7120i;
        int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f7121j;
        return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public float i() {
        return this.f7120i;
    }

    public float j() {
        return this.f7121j;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f7112a + ", heightPercentOfScreen=" + this.f7113b + ", margin=" + this.f7114c + ", gravity=" + this.f7115d + ", tapToFade=" + this.f7116e + ", tapToFadeDurationMillis=" + this.f7117f + ", fadeInDurationMillis=" + this.f7118g + ", fadeOutDurationMillis=" + this.f7119h + ", fadeInDelay=" + this.f7120i + ", fadeOutDelay=" + this.f7121j + '}';
    }
}
