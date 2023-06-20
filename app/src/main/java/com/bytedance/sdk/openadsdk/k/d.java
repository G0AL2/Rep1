package com.bytedance.sdk.openadsdk.k;

import java.util.List;

/* compiled from: TrackAdUrlImplEmpty.java */
/* loaded from: classes.dex */
class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f13443a;

    private d() {
    }

    public static d c() {
        if (f13443a == null) {
            synchronized (d.class) {
                if (f13443a == null) {
                    f13443a = new d();
                }
            }
        }
        return f13443a;
    }

    @Override // com.bytedance.sdk.openadsdk.k.a
    public void a() {
    }

    @Override // com.bytedance.sdk.openadsdk.k.a
    public void a(List<String> list) {
    }

    @Override // com.bytedance.sdk.openadsdk.k.a
    public void b() {
    }
}
