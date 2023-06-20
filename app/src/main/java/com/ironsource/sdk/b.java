package com.ironsource.sdk;

import java.util.Map;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27606a;

    /* renamed from: b  reason: collision with root package name */
    public String f27607b;

    /* renamed from: c  reason: collision with root package name */
    public String f27608c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27609d;

    /* renamed from: e  reason: collision with root package name */
    public a f27610e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f27611f;

    /* renamed from: g  reason: collision with root package name */
    public com.ironsource.sdk.j.a f27612g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f27613h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, String str2, boolean z10, boolean z11, Map<String, String> map, com.ironsource.sdk.j.a aVar, a aVar2) {
        this.f27607b = str;
        this.f27608c = str2;
        this.f27606a = z10;
        this.f27609d = z11;
        this.f27611f = map;
        this.f27612g = aVar;
        this.f27610e = aVar2;
    }

    public final boolean a() {
        a aVar = this.f27610e;
        if (aVar != null) {
            if (aVar.f27573b > 0 && aVar.f27572a > 0) {
                return true;
            }
        }
        return false;
    }
}
