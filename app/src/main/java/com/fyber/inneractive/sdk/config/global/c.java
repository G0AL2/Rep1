package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public Set<Long> f16944a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public boolean f16945b;

    public c(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long optLong = jSONArray.optLong(i10);
                if (optLong != 0) {
                    this.f16944a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f16945b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public boolean a(e eVar) {
        if (this.f16944a.isEmpty() || eVar == null || eVar.f16946a == null) {
            return false;
        }
        for (Long l10 : this.f16944a) {
            if (l10.equals(eVar.f16946a)) {
                return !this.f16945b;
            }
        }
        return this.f16945b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", "demand", this.f16944a, Boolean.valueOf(this.f16945b));
    }
}
