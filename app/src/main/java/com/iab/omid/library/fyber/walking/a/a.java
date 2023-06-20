package com.iab.omid.library.fyber.walking.a;

import com.iab.omid.library.fyber.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    protected final HashSet<String> f24118a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f24119b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f24120c;

    public a(b.InterfaceC0320b interfaceC0320b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0320b);
        this.f24118a = new HashSet<>(hashSet);
        this.f24119b = jSONObject;
        this.f24120c = j10;
    }
}
