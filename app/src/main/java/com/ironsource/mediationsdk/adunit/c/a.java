package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    IronSource.AD_UNIT f26856a;

    /* renamed from: b  reason: collision with root package name */
    String f26857b;

    /* renamed from: c  reason: collision with root package name */
    List<NetworkSettings> f26858c;

    /* renamed from: d  reason: collision with root package name */
    com.ironsource.mediationsdk.utils.c f26859d;

    /* renamed from: e  reason: collision with root package name */
    int f26860e;

    /* renamed from: f  reason: collision with root package name */
    int f26861f;

    /* renamed from: g  reason: collision with root package name */
    int f26862g;

    /* renamed from: h  reason: collision with root package name */
    com.ironsource.mediationsdk.adunit.c.b.a f26863h;

    /* renamed from: i  reason: collision with root package name */
    int f26864i;

    public a(IronSource.AD_UNIT ad_unit, String str, List<NetworkSettings> list, com.ironsource.mediationsdk.utils.c cVar, int i10, int i11, int i12, int i13, com.ironsource.mediationsdk.adunit.c.b.a aVar) {
        this.f26856a = ad_unit;
        this.f26857b = str;
        this.f26858c = list;
        this.f26859d = cVar;
        this.f26860e = i10;
        this.f26862g = i11;
        this.f26861f = i12;
        this.f26863h = aVar;
        this.f26864i = i13;
    }

    public final NetworkSettings a(String str) {
        for (NetworkSettings networkSettings : this.f26858c) {
            if (networkSettings.getProviderInstanceName().equals(str)) {
                return networkSettings;
            }
        }
        return null;
    }

    public final boolean a() {
        return this.f26859d.f27412e > 0;
    }
}
