package com.iab.omid.library.fyber.walking;

import com.iab.omid.library.fyber.walking.a.b;
import com.iab.omid.library.fyber.walking.a.d;
import com.iab.omid.library.fyber.walking.a.e;
import com.iab.omid.library.fyber.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements b.InterfaceC0320b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f24127a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.fyber.walking.a.c f24128b;

    public b(com.iab.omid.library.fyber.walking.a.c cVar) {
        this.f24128b = cVar;
    }

    public void a() {
        this.f24128b.b(new d(this));
    }

    @Override // com.iab.omid.library.fyber.walking.a.b.InterfaceC0320b
    public void a(JSONObject jSONObject) {
        this.f24127a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24128b.b(new f(this, hashSet, jSONObject, j10));
    }

    @Override // com.iab.omid.library.fyber.walking.a.b.InterfaceC0320b
    public JSONObject b() {
        return this.f24127a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24128b.b(new e(this, hashSet, jSONObject, j10));
    }
}
