package com.iab.omid.library.ironsrc.walking.a;

import com.iab.omid.library.ironsrc.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    protected final HashSet<String> f24345a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f24346b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f24347c;

    public a(b.InterfaceC0326b interfaceC0326b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0326b);
        this.f24345a = new HashSet<>(hashSet);
        this.f24346b = jSONObject;
        this.f24347c = j10;
    }
}
