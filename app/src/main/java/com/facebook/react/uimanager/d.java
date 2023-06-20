package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* compiled from: FabricViewStateManager.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private m0 f15758a = null;

    /* compiled from: FabricViewStateManager.java */
    /* loaded from: classes.dex */
    public interface a {
        d getFabricViewStateManager();
    }

    /* compiled from: FabricViewStateManager.java */
    /* loaded from: classes.dex */
    public interface b {
        WritableMap a();
    }

    private void d(m0 m0Var, b bVar, int i10) {
        WritableMap a10;
        if (m0Var == null) {
            z3.a.j("FabricViewStateManager", "setState called without a StateWrapper");
        } else if (m0Var == this.f15758a && i10 <= 60 && (a10 = bVar.a()) != null) {
            m0Var.a(a10);
        }
    }

    public ReadableMap a() {
        m0 m0Var = this.f15758a;
        if (m0Var != null) {
            return m0Var.b();
        }
        return null;
    }

    public boolean b() {
        return this.f15758a != null;
    }

    public void c(b bVar) {
        d(this.f15758a, bVar, 0);
    }

    public void e(m0 m0Var) {
        this.f15758a = m0Var;
    }
}
