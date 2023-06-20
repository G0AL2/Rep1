package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: AnimatorFactory.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f9506a;

    private c() {
    }

    public static c a() {
        if (f9506a == null) {
            synchronized (c.class) {
                if (f9506a == null) {
                    f9506a = new c();
                }
            }
        }
        return f9506a;
    }

    public d a(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        if (aVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(aVar.h())) {
            return new h(view, aVar);
        }
        if ("translate".equals(aVar.h())) {
            return new k(view, aVar);
        }
        if ("ripple".equals(aVar.h())) {
            return new f(view, aVar);
        }
        if ("marquee".equals(aVar.h())) {
            return new e(view, aVar);
        }
        if ("waggle".equals(aVar.h())) {
            return new l(view, aVar);
        }
        if ("shine".equals(aVar.h())) {
            return new i(view, aVar);
        }
        if ("swing".equals(aVar.h())) {
            return new j(view, aVar);
        }
        if ("fade".equals(aVar.h())) {
            return new a(view, aVar);
        }
        if ("rubIn".equals(aVar.h())) {
            return new g(view, aVar);
        }
        return null;
    }
}
