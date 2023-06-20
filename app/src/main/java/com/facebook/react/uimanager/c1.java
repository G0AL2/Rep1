package com.facebook.react.uimanager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ViewManagerRegistry.java */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ViewManager> f15756a;

    /* renamed from: b  reason: collision with root package name */
    private final d1 f15757b;

    public c1(d1 d1Var) {
        this.f15756a = h6.e.b();
        this.f15757b = d1Var;
    }

    private ViewManager b(String str) {
        ViewManager b10 = this.f15757b.b(str);
        if (b10 != null) {
            this.f15756a.put(str, b10);
        }
        return b10;
    }

    public ViewManager a(String str) {
        ViewManager viewManager = this.f15756a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f15757b != null) {
            ViewManager b10 = b(str);
            if (b10 != null) {
                return b10;
            }
            throw new h("ViewManagerResolver returned null for " + str + ", existing names are: " + this.f15757b.a());
        }
        throw new h("No ViewManager found for class " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewManager c(String str) {
        ViewManager viewManager = this.f15756a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f15757b != null) {
            return b(str);
        }
        return null;
    }

    public c1(List<ViewManager> list) {
        HashMap b10 = h6.e.b();
        for (ViewManager viewManager : list) {
            b10.put(viewManager.getName(), viewManager);
        }
        this.f15756a = b10;
        this.f15757b = null;
    }
}
