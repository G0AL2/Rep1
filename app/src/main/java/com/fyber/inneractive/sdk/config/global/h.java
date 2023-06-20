package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class h implements d {

    /* renamed from: a  reason: collision with root package name */
    public Set<String> f16967a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public boolean f16968b;

    public h(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String optString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(optString)) {
                    this.f16967a.add(optString);
                }
            }
        }
        this.f16968b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public boolean a(e eVar) {
        if (this.f16967a.isEmpty() || eVar == null || eVar.f16948c == null) {
            return false;
        }
        for (String str : this.f16967a) {
            if (str.equals(eVar.f16948c.value())) {
                return !this.f16968b;
            }
        }
        return this.f16968b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.f16967a, Boolean.valueOf(this.f16968b));
    }
}
