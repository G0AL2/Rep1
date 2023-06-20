package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public Set<Long> f16969a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public boolean f16970b;

    public i(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long optLong = jSONArray.optLong(i10);
                if (optLong != 0) {
                    this.f16969a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f16970b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public boolean a(e eVar) {
        if (this.f16969a.isEmpty() || eVar == null || eVar.f16947b == null) {
            return false;
        }
        for (Long l10 : this.f16969a) {
            if (l10.equals(eVar.f16947b)) {
                return !this.f16970b;
            }
        }
        return this.f16970b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.f16969a, Boolean.valueOf(this.f16970b));
    }
}
