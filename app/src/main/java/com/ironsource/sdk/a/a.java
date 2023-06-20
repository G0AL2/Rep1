package com.ironsource.sdk.a;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Object> f27575a = new HashMap<>();

    public final a a(String str, Object obj) {
        if (obj != null) {
            this.f27575a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
