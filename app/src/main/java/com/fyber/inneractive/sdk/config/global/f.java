package com.fyber.inneractive.sdk.config.global;

import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public String f16949a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16950b;

    public f(String str, boolean z10) {
        this.f16949a = str;
        this.f16950b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public boolean a(e eVar) {
        String str = this.f16949a;
        if (str != null) {
            if (str.equalsIgnoreCase(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID)) {
                return !this.f16950b;
            }
            return this.f16950b;
        }
        return false;
    }

    public String toString() {
        return String.format("%s - %s include: %b", "os", this.f16949a, Boolean.valueOf(this.f16950b));
    }
}
