package com.iab.omid.library.applovin.walking.a;

import com.iab.omid.library.applovin.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    protected final HashSet<String> f23998a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f23999b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f24000c;

    public a(b.InterfaceC0317b interfaceC0317b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0317b);
        this.f23998a = new HashSet<>(hashSet);
        this.f23999b = jSONObject;
        this.f24000c = j10;
    }
}
