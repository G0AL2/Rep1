package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.a.b;
import com.iab.omid.library.applovin.walking.a.d;
import com.iab.omid.library.applovin.walking.a.e;
import com.iab.omid.library.applovin.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements b.InterfaceC0317b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f24009a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.a.c f24010b;

    public b(com.iab.omid.library.applovin.walking.a.c cVar) {
        this.f24010b = cVar;
    }

    public void a() {
        this.f24010b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.a.b.InterfaceC0317b
    public void a(JSONObject jSONObject) {
        this.f24009a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24010b.b(new f(this, hashSet, jSONObject, j10));
    }

    @Override // com.iab.omid.library.applovin.walking.a.b.InterfaceC0317b
    public JSONObject b() {
        return this.f24009a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24010b.b(new e(this, hashSet, jSONObject, j10));
    }
}
