package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<j> f27248a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public j f27249b;

    /* renamed from: c  reason: collision with root package name */
    public com.ironsource.sdk.g.d f27250c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f27251d;

    public i(com.ironsource.sdk.g.d dVar) {
        this.f27250c = dVar;
    }

    public final j a() {
        Iterator<j> it = this.f27248a.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (next.f27254c) {
                return next;
            }
        }
        return this.f27249b;
    }

    public final j a(String str) {
        Iterator<j> it = this.f27248a.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (next.f27253b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    public final String b() {
        JSONObject jSONObject = this.f27251d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("adapterName"))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.f27251d.optString("adapterName");
    }
}
