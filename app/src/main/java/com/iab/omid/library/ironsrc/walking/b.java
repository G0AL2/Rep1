package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.a.b;
import com.iab.omid.library.ironsrc.walking.a.d;
import com.iab.omid.library.ironsrc.walking.a.e;
import com.iab.omid.library.ironsrc.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements b.InterfaceC0326b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f24354a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.walking.a.c f24355b;

    public b(com.iab.omid.library.ironsrc.walking.a.c cVar) {
        this.f24355b = cVar;
    }

    public void a() {
        this.f24355b.b(new d(this));
    }

    @Override // com.iab.omid.library.ironsrc.walking.a.b.InterfaceC0326b
    public void a(JSONObject jSONObject) {
        this.f24354a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24355b.b(new f(this, hashSet, jSONObject, j10));
    }

    @Override // com.iab.omid.library.ironsrc.walking.a.b.InterfaceC0326b
    public JSONObject b() {
        return this.f24354a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24355b.b(new e(this, hashSet, jSONObject, j10));
    }
}
