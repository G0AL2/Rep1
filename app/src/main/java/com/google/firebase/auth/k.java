package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* loaded from: classes3.dex */
public class k extends ob.k {

    /* renamed from: a  reason: collision with root package name */
    private final String f23323a;

    public k(String str, String str2) {
        super(str2);
        this.f23323a = Preconditions.checkNotEmpty(str);
    }

    public String a() {
        return this.f23323a;
    }
}
