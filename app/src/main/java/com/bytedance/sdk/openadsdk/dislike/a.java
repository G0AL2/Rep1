package com.bytedance.sdk.openadsdk.dislike;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import java.util.List;

/* compiled from: DislikeDispatcher.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f13210a;

    /* renamed from: b  reason: collision with root package name */
    private final n<com.bytedance.sdk.openadsdk.b.a> f13211b = m.f();

    private a() {
    }

    public static a a() {
        if (f13210a == null) {
            synchronized (a.class) {
                if (f13210a == null) {
                    f13210a = new a();
                }
            }
        }
        return f13210a;
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar, List<FilterWord> list) {
        this.f13211b.a(nVar, list);
    }
}
