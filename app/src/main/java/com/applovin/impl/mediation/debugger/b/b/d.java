package com.applovin.impl.mediation.debugger.b.b;

import android.content.Context;
import com.applovin.impl.sdk.utils.g;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f7542a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7543b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7544c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, String str2, Context context) {
        this.f7542a = str.replace("android.permission.", "");
        this.f7543b = str2;
        this.f7544c = g.a(str, context);
    }

    public String a() {
        return this.f7542a;
    }

    public String b() {
        return this.f7543b;
    }

    public boolean c() {
        return this.f7544c;
    }
}
