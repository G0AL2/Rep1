package com.iab.omid.library.inmobi.walking;

import com.iab.omid.library.inmobi.walking.a.b;
import com.iab.omid.library.inmobi.walking.a.d;
import com.iab.omid.library.inmobi.walking.a.e;
import com.iab.omid.library.inmobi.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements b.InterfaceC0323b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f24240a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.inmobi.walking.a.c f24241b;

    public b(com.iab.omid.library.inmobi.walking.a.c cVar) {
        this.f24241b = cVar;
    }

    public void a() {
        this.f24241b.b(new d(this));
    }

    @Override // com.iab.omid.library.inmobi.walking.a.b.InterfaceC0323b
    public void a(JSONObject jSONObject) {
        this.f24240a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24241b.b(new f(this, hashSet, jSONObject, j10));
    }

    @Override // com.iab.omid.library.inmobi.walking.a.b.InterfaceC0323b
    public JSONObject b() {
        return this.f24240a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24241b.b(new e(this, hashSet, jSONObject, j10));
    }
}
