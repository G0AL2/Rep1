package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import java.util.Map;

/* compiled from: UIImplementation.java */
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    protected Object f15927a;

    /* renamed from: b  reason: collision with root package name */
    protected final com.facebook.react.uimanager.events.d f15928b;

    /* renamed from: c  reason: collision with root package name */
    protected final ReactApplicationContext f15929c;

    /* renamed from: d  reason: collision with root package name */
    protected final k0 f15930d;

    /* renamed from: e  reason: collision with root package name */
    private final c1 f15931e;

    /* renamed from: f  reason: collision with root package name */
    private final x0 f15932f;

    /* renamed from: g  reason: collision with root package name */
    private final o f15933g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f15934h;

    /* renamed from: i  reason: collision with root package name */
    private long f15935i;

    /* renamed from: j  reason: collision with root package name */
    protected b f15936j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f15937k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UIImplementation.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f15938a;

        a(d0 d0Var) {
            this.f15938a = d0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.f15930d.b(this.f15938a);
        }
    }

    /* compiled from: UIImplementation.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(d0 d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(ReactApplicationContext reactApplicationContext, c1 c1Var, com.facebook.react.uimanager.events.d dVar, int i10) {
        this(reactApplicationContext, c1Var, new x0(reactApplicationContext, new n(c1Var), i10), dVar);
    }

    private void A(int i10, int[] iArr) {
        d0 c10 = this.f15930d.c(i10);
        if (c10 != null) {
            d0 parent = c10.getParent();
            if (parent != null) {
                B(c10, parent, iArr);
                return;
            }
            throw new h("View with tag " + i10 + " doesn't have a parent!");
        }
        throw new h("No native view for tag " + i10 + " exists!");
    }

    private void B(d0 d0Var, d0 d0Var2, int[] iArr) {
        int i10;
        int i11;
        if (d0Var == d0Var2 || d0Var.R()) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = Math.round(d0Var.E());
            i11 = Math.round(d0Var.B());
            for (d0 parent = d0Var.getParent(); parent != d0Var2; parent = parent.getParent()) {
                f6.a.c(parent);
                c(parent);
                i10 += Math.round(parent.E());
                i11 += Math.round(parent.B());
            }
            c(d0Var2);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = d0Var.T();
        iArr[3] = d0Var.I();
    }

    private void C(d0 d0Var) {
        if (d0Var.l()) {
            for (int i10 = 0; i10 < d0Var.b(); i10++) {
                C(d0Var.a(i10));
            }
            d0Var.a0(this.f15933g);
        }
    }

    private void N(d0 d0Var) {
        o.j(d0Var);
        this.f15930d.g(d0Var.O());
        for (int b10 = d0Var.b() - 1; b10 >= 0; b10--) {
            N(d0Var.a(b10));
        }
        d0Var.n();
    }

    private void c(d0 d0Var) {
        ViewManager viewManager = (ViewManager) f6.a.c(this.f15931e.a(d0Var.y()));
        if (viewManager instanceof g) {
            g gVar = (g) viewManager;
            if (gVar == null || !gVar.needsCustomLayoutForChildren()) {
                return;
            }
            throw new h("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + d0Var.y() + "). Use measure instead.");
        }
        throw new h("Trying to use view " + d0Var.y() + " as a parent, but its Manager doesn't extends ViewGroupManager");
    }

    private void d(int i10, String str) {
        if (this.f15930d.c(i10) != null) {
            return;
        }
        throw new h("Unable to execute operation " + str + " on view with tag: " + i10 + ", since the view does not exists");
    }

    private void o() {
        if (this.f15932f.W()) {
            n(-1);
        }
    }

    private void y(int i10, int i11, int[] iArr) {
        d0 c10 = this.f15930d.c(i10);
        d0 c11 = this.f15930d.c(i11);
        if (c10 != null && c11 != null) {
            if (c10 != c11) {
                for (d0 parent = c10.getParent(); parent != c11; parent = parent.getParent()) {
                    if (parent == null) {
                        throw new h("Tag " + i11 + " is not an ancestor of tag " + i10);
                    }
                }
            }
            B(c10, c11, iArr);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tag ");
        if (c10 != null) {
            i10 = i11;
        }
        sb2.append(i10);
        sb2.append(" does not exist");
        throw new h(sb2.toString());
    }

    public void D() {
        this.f15937k = false;
    }

    public void E() {
    }

    public void F() {
        this.f15932f.X();
    }

    public void G() {
        this.f15932f.a0();
    }

    public void H(q0 q0Var) {
        this.f15932f.Y(q0Var);
    }

    public void I() {
        this.f15932f.Z();
    }

    public <T extends View> void J(T t10, int i10, n0 n0Var) {
        synchronized (this.f15927a) {
            d0 h10 = h();
            h10.A(i10);
            h10.t(n0Var);
            n0Var.runOnNativeModulesQueueThread(new a(h10));
            this.f15932f.x(i10, t10);
        }
    }

    public void K(int i10) {
        synchronized (this.f15927a) {
            this.f15930d.h(i10);
        }
    }

    public void L(int i10) {
        K(i10);
        this.f15932f.K(i10);
    }

    protected final void M(d0 d0Var) {
        N(d0Var);
        d0Var.f();
    }

    public void O(int i10) {
        d0 c10 = this.f15930d.c(i10);
        if (c10 != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i11 = 0; i11 < c10.b(); i11++) {
                createArray.pushInt(i11);
            }
            u(i10, null, null, null, null, createArray);
            return;
        }
        throw new h("Trying to remove subviews of an unknown view tag: " + i10);
    }

    public void P(int i10, int i11) {
        if (!this.f15930d.f(i10) && !this.f15930d.f(i11)) {
            d0 c10 = this.f15930d.c(i10);
            if (c10 != null) {
                d0 parent = c10.getParent();
                if (parent != null) {
                    int Y = parent.Y(c10);
                    if (Y >= 0) {
                        WritableArray createArray = Arguments.createArray();
                        createArray.pushInt(i11);
                        WritableArray createArray2 = Arguments.createArray();
                        createArray2.pushInt(Y);
                        WritableArray createArray3 = Arguments.createArray();
                        createArray3.pushInt(Y);
                        u(parent.O(), null, null, createArray, createArray2, createArray3);
                        return;
                    }
                    throw new IllegalStateException("Didn't find child tag in parent");
                }
                throw new h("Node is not attached to a parent: " + i10);
            }
            throw new h("Trying to replace unknown view tag: " + i10);
        }
        throw new h("Trying to add or replace a root tag!");
    }

    public int Q(int i10) {
        if (this.f15930d.f(i10)) {
            return i10;
        }
        d0 R = R(i10);
        if (R != null) {
            return R.W();
        }
        z3.a.G("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i10);
        return 0;
    }

    public final d0 R(int i10) {
        return this.f15930d.c(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ViewManager S(String str) {
        return this.f15931e.c(str);
    }

    public void T(int i10, int i11) {
        this.f15932f.L(i10, i11);
    }

    public void U(int i10, ReadableArray readableArray) {
        if (this.f15937k) {
            synchronized (this.f15927a) {
                d0 c10 = this.f15930d.c(i10);
                for (int i11 = 0; i11 < readableArray.size(); i11++) {
                    d0 c11 = this.f15930d.c(readableArray.getInt(i11));
                    if (c11 != null) {
                        c10.x(c11, i11);
                    } else {
                        throw new h("Trying to add unknown view tag: " + readableArray.getInt(i11));
                    }
                }
                this.f15933g.k(c10, readableArray);
            }
        }
    }

    public void V(int i10, boolean z10) {
        d0 c10 = this.f15930d.c(i10);
        if (c10 == null) {
            return;
        }
        while (c10.V() == m.NONE) {
            c10 = c10.getParent();
        }
        this.f15932f.M(c10.O(), i10, z10);
    }

    public void W(boolean z10) {
        this.f15932f.N(z10);
    }

    public void X(y6.a aVar) {
        this.f15932f.b0(aVar);
    }

    public void Y(int i10, Object obj) {
        d0 c10 = this.f15930d.c(i10);
        if (c10 == null) {
            z3.a.G("ReactNative", "Attempt to set local data for view with unknown tag: " + i10);
            return;
        }
        c10.w(obj);
        o();
    }

    public void Z(int i10, ReadableArray readableArray, Callback callback, Callback callback2) {
        d(i10, "showPopupMenu");
        this.f15932f.O(i10, readableArray, callback, callback2);
    }

    public void a(q0 q0Var) {
        this.f15932f.P(q0Var);
    }

    public void a0(int i10, f0 f0Var) {
        UiThreadUtil.assertOnUiThread();
        this.f15932f.U().E(i10, f0Var);
    }

    protected void b(d0 d0Var, float f10, float f11) {
        if (d0Var.l()) {
            Iterable<? extends d0> N = d0Var.N();
            if (N != null) {
                for (d0 d0Var2 : N) {
                    b(d0Var2, d0Var.E() + f10, d0Var.B() + f11);
                }
            }
            int O = d0Var.O();
            if (!this.f15930d.f(O) && d0Var.m(f10, f11, this.f15932f, this.f15933g) && d0Var.X()) {
                this.f15928b.g(q.b(-1, O, d0Var.C(), d0Var.v(), d0Var.T(), d0Var.I()));
            }
            d0Var.g();
            this.f15933g.p(d0Var);
        }
    }

    public void b0(int i10, int i11, int i12) {
        d0 c10 = this.f15930d.c(i10);
        if (c10 == null) {
            z3.a.G("ReactNative", "Tried to update size of non-existent tag: " + i10);
            return;
        }
        c10.S(i11);
        c10.h(i12);
        o();
    }

    public void c0(int i10, int i11, int i12) {
        d0 c10 = this.f15930d.c(i10);
        if (c10 == null) {
            z3.a.G("ReactNative", "Tried to update non-existent root tag: " + i10);
            return;
        }
        d0(c10, i11, i12);
    }

    public void d0(d0 d0Var, int i10, int i11) {
        d0Var.i(i10, i11);
    }

    protected void e(d0 d0Var) {
        com.facebook.systrace.b.a(0L, "cssRoot.calculateLayout").a("rootTag", d0Var.O()).c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            int intValue = d0Var.getWidthMeasureSpec().intValue();
            int intValue2 = d0Var.getHeightMeasureSpec().intValue();
            float f10 = Float.NaN;
            float size = View.MeasureSpec.getMode(intValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(intValue);
            if (View.MeasureSpec.getMode(intValue2) != 0) {
                f10 = View.MeasureSpec.getSize(intValue2);
            }
            d0Var.Z(size, f10);
        } finally {
            com.facebook.systrace.a.g(0L);
            this.f15935i = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    public void e0(int i10, String str, ReadableMap readableMap) {
        if (this.f15937k) {
            if (this.f15931e.a(str) != null) {
                d0 c10 = this.f15930d.c(i10);
                if (c10 == null) {
                    throw new h("Trying to update non-existent view with tag " + i10);
                } else if (readableMap != null) {
                    f0 f0Var = new f0(readableMap);
                    c10.H(f0Var);
                    t(c10, str, f0Var);
                    return;
                } else {
                    return;
                }
            }
            throw new h("Got unknown view type: " + str);
        }
    }

    public void f() {
        this.f15932f.z();
    }

    protected void f0() {
        com.facebook.systrace.a.c(0L, "UIImplementation.updateViewHierarchy");
        for (int i10 = 0; i10 < this.f15930d.d(); i10++) {
            try {
                d0 c10 = this.f15930d.c(this.f15930d.e(i10));
                if (c10.getWidthMeasureSpec() != null && c10.getHeightMeasureSpec() != null) {
                    com.facebook.systrace.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").a("rootTag", c10.O()).c();
                    C(c10);
                    com.facebook.systrace.a.g(0L);
                    e(c10);
                    com.facebook.systrace.b.a(0L, "UIImplementation.applyUpdatesRecursive").a("rootTag", c10.O()).c();
                    b(c10, 0.0f, 0.0f);
                    com.facebook.systrace.a.g(0L);
                    b bVar = this.f15936j;
                    if (bVar != null) {
                        this.f15932f.G(c10, bVar);
                    }
                }
            } finally {
                com.facebook.systrace.a.g(0L);
            }
        }
    }

    public void g(ReadableMap readableMap, Callback callback) {
        this.f15932f.A(readableMap, callback);
    }

    @Deprecated
    public void g0(int i10, int i11, Callback callback) {
        d0 c10 = this.f15930d.c(i10);
        d0 c11 = this.f15930d.c(i11);
        if (c10 == null || c11 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(c10.F(c11)));
        }
    }

    protected d0 h() {
        e0 e0Var = new e0();
        if (s6.a.d().g(this.f15929c)) {
            e0Var.j(com.facebook.yoga.h.RTL);
        }
        e0Var.L("Root");
        return e0Var;
    }

    protected d0 i(String str) {
        return this.f15931e.a(str).createShadowNodeInstance(this.f15929c);
    }

    public void j(int i10, String str, int i11, ReadableMap readableMap) {
        if (this.f15937k) {
            synchronized (this.f15927a) {
                d0 i12 = i(str);
                d0 c10 = this.f15930d.c(i11);
                f6.a.d(c10, "Root node with tag " + i11 + " doesn't exist");
                i12.A(i10);
                i12.L(str);
                i12.s(c10.O());
                i12.t(c10.U());
                this.f15930d.a(i12);
                f0 f0Var = null;
                if (readableMap != null) {
                    f0Var = new f0(readableMap);
                    i12.H(f0Var);
                }
                s(i12, i11, f0Var);
            }
        }
    }

    public void k() {
        this.f15932f.C();
    }

    @Deprecated
    public void l(int i10, int i11, ReadableArray readableArray) {
        d(i10, "dispatchViewManagerCommand: " + i11);
        this.f15932f.D(i10, i11, readableArray);
    }

    public void m(int i10, String str, ReadableArray readableArray) {
        d(i10, "dispatchViewManagerCommand: " + str);
        this.f15932f.E(i10, str, readableArray);
    }

    public void n(int i10) {
        com.facebook.systrace.b.a(0L, "UIImplementation.dispatchViewUpdates").a("batchId", i10).c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            f0();
            this.f15933g.o();
            this.f15932f.y(i10, uptimeMillis, this.f15935i);
        } finally {
            com.facebook.systrace.a.g(0L);
        }
    }

    public void p(int i10, float f10, float f11, Callback callback) {
        this.f15932f.F(i10, f10, f11, callback);
    }

    public Map<String, Long> q() {
        return this.f15932f.V();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0 r() {
        return this.f15932f;
    }

    protected void s(d0 d0Var, int i10, f0 f0Var) {
        if (d0Var.R()) {
            return;
        }
        this.f15933g.g(d0Var, d0Var.U(), f0Var);
    }

    protected void t(d0 d0Var, String str, f0 f0Var) {
        if (d0Var.R()) {
            return;
        }
        this.f15933g.m(d0Var, str, f0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r25 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (r11 != r25.size()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        throw new com.facebook.react.uimanager.h("Size of addChildTags != size of addAtIndices!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(int r21, com.facebook.react.bridge.ReadableArray r22, com.facebook.react.bridge.ReadableArray r23, com.facebook.react.bridge.ReadableArray r24, com.facebook.react.bridge.ReadableArray r25, com.facebook.react.bridge.ReadableArray r26) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.r0.u(int, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray):void");
    }

    public void v(int i10, Callback callback) {
        if (this.f15937k) {
            this.f15932f.I(i10, callback);
        }
    }

    public void w(int i10, Callback callback) {
        if (this.f15937k) {
            this.f15932f.J(i10, callback);
        }
    }

    public void x(int i10, int i11, Callback callback, Callback callback2) {
        if (this.f15937k) {
            try {
                y(i10, i11, this.f15934h);
                callback2.invoke(Float.valueOf(r.a(this.f15934h[0])), Float.valueOf(r.a(this.f15934h[1])), Float.valueOf(r.a(this.f15934h[2])), Float.valueOf(r.a(this.f15934h[3])));
            } catch (h e10) {
                callback.invoke(e10.getMessage());
            }
        }
    }

    public void z(int i10, Callback callback, Callback callback2) {
        if (this.f15937k) {
            try {
                A(i10, this.f15934h);
                callback2.invoke(Float.valueOf(r.a(this.f15934h[0])), Float.valueOf(r.a(this.f15934h[1])), Float.valueOf(r.a(this.f15934h[2])), Float.valueOf(r.a(this.f15934h[3])));
            } catch (h e10) {
                callback.invoke(e10.getMessage());
            }
        }
    }

    protected r0(ReactApplicationContext reactApplicationContext, c1 c1Var, x0 x0Var, com.facebook.react.uimanager.events.d dVar) {
        this.f15927a = new Object();
        k0 k0Var = new k0();
        this.f15930d = k0Var;
        this.f15934h = new int[4];
        this.f15935i = 0L;
        this.f15937k = true;
        this.f15929c = reactApplicationContext;
        this.f15931e = c1Var;
        this.f15932f = x0Var;
        this.f15933g = new o(x0Var, k0Var);
        this.f15928b = dVar;
    }
}
