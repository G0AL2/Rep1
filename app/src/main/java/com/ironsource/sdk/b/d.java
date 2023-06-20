package com.ironsource.sdk.b;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    int f27626b = 4;

    /* renamed from: c  reason: collision with root package name */
    int f27627c = 4;

    /* renamed from: a  reason: collision with root package name */
    HashMap<String, Boolean> f27625a = new a();

    /* loaded from: classes3.dex */
    final class a extends HashMap<String, Boolean> {
        a() {
            put("isVisible", Boolean.valueOf(d.this.f27626b == 0));
            put("isWindowVisible", Boolean.valueOf(d.this.f27627c == 0));
            Boolean bool = Boolean.FALSE;
            put("isShown", bool);
            put("isViewVisible", bool);
        }
    }

    public final JSONObject a() {
        return new JSONObject(this.f27625a);
    }
}
