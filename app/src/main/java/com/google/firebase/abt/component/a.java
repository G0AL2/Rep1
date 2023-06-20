package com.google.firebase.abt.component;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import pb.c;
import sc.b;

/* compiled from: AbtComponent.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, c> f23163a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f23164b;

    /* renamed from: c  reason: collision with root package name */
    private final b<rb.a> f23165c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, b<rb.a> bVar) {
        this.f23164b = context;
        this.f23165c = bVar;
    }

    protected c a(String str) {
        return new c(this.f23164b, this.f23165c, str);
    }

    public synchronized c b(String str) {
        if (!this.f23163a.containsKey(str)) {
            this.f23163a.put(str, a(str));
        }
        return this.f23163a.get(str);
    }
}
