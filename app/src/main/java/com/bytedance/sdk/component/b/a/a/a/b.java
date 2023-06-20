package com.bytedance.sdk.component.b.a.a.a;

import com.bytedance.sdk.component.b.a.g;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import java.io.IOException;
import java.util.List;

/* compiled from: NetChain.java */
/* loaded from: classes.dex */
public class b implements g.a {

    /* renamed from: a  reason: collision with root package name */
    List<com.bytedance.sdk.component.b.a.g> f9990a;

    /* renamed from: b  reason: collision with root package name */
    k f9991b;

    /* renamed from: c  reason: collision with root package name */
    int f9992c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(List<com.bytedance.sdk.component.b.a.g> list, k kVar) {
        this.f9990a = list;
        this.f9991b = kVar;
    }

    @Override // com.bytedance.sdk.component.b.a.g.a
    public k a() {
        return this.f9991b;
    }

    @Override // com.bytedance.sdk.component.b.a.g.a
    public m a(k kVar) throws IOException {
        this.f9991b = kVar;
        int i10 = this.f9992c + 1;
        this.f9992c = i10;
        return this.f9990a.get(i10).a(this);
    }
}
