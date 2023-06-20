package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public String f17577a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Object> f17578b;

    /* renamed from: c  reason: collision with root package name */
    public String f17579c = null;

    public k(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f17578b = new HashMap();
            this.f17577a = str;
            return;
        }
        throw new InvalidParameterException();
    }

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.f17578b.put(str, obj);
    }
}
