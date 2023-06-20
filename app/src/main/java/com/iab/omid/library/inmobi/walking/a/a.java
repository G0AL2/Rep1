package com.iab.omid.library.inmobi.walking.a;

import com.iab.omid.library.inmobi.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    protected final HashSet<String> f24231a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f24232b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f24233c;

    public a(b.InterfaceC0323b interfaceC0323b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0323b);
        this.f24231a = new HashSet<>(hashSet);
        this.f24232b = jSONObject;
        this.f24233c = j10;
    }
}
