package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.Iterator;
import java.util.List;

/* compiled from: ContinueDownloadTask.java */
/* loaded from: classes.dex */
public class a extends com.bytedance.sdk.component.f.g {

    /* renamed from: a  reason: collision with root package name */
    private final List<? extends com.bytedance.sdk.component.f.g> f11410a;

    public a(String str, List<? extends com.bytedance.sdk.component.f.g> list) {
        super(str);
        this.f11410a = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.f.g> list;
        if (o.c(m.a()) != 0 && (list = this.f11410a) != null) {
            Iterator<? extends com.bytedance.sdk.component.f.g> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.f.e.a(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.h.a().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
