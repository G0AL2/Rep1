package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: j  reason: collision with root package name */
    private static final cb.e f23018j = new cb.e("ExtractorLooper");

    /* renamed from: a  reason: collision with root package name */
    private final k1 f23019a;

    /* renamed from: b  reason: collision with root package name */
    private final q0 f23020b;

    /* renamed from: c  reason: collision with root package name */
    private final o2 f23021c;

    /* renamed from: d  reason: collision with root package name */
    private final y1 f23022d;

    /* renamed from: e  reason: collision with root package name */
    private final c2 f23023e;

    /* renamed from: f  reason: collision with root package name */
    private final h2 f23024f;

    /* renamed from: g  reason: collision with root package name */
    private final cb.d0<d3> f23025g;

    /* renamed from: h  reason: collision with root package name */
    private final n1 f23026h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f23027i = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(k1 k1Var, cb.d0<d3> d0Var, q0 q0Var, o2 o2Var, y1 y1Var, c2 c2Var, h2 h2Var, n1 n1Var) {
        this.f23019a = k1Var;
        this.f23025g = d0Var;
        this.f23020b = q0Var;
        this.f23021c = o2Var;
        this.f23022d = y1Var;
        this.f23023e = c2Var;
        this.f23024f = h2Var;
        this.f23026h = n1Var;
    }

    private final void b(int i10, Exception exc) {
        try {
            this.f23019a.p(i10);
            this.f23019a.c(i10);
        } catch (s0 unused) {
            f23018j.e("Error during error handling: %s", exc.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        cb.e eVar = f23018j;
        eVar.c("Run extractor loop", new Object[0]);
        if (!this.f23027i.compareAndSet(false, true)) {
            eVar.g("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            m1 m1Var = null;
            try {
                m1Var = this.f23026h.a();
            } catch (s0 e10) {
                f23018j.e("Error while getting next extraction task: %s", e10.getMessage());
                if (e10.f23007a >= 0) {
                    this.f23025g.a().a(e10.f23007a);
                    b(e10.f23007a, e10);
                }
            }
            if (m1Var == null) {
                this.f23027i.set(false);
                return;
            }
            try {
                if (m1Var instanceof p0) {
                    this.f23020b.a((p0) m1Var);
                } else if (m1Var instanceof n2) {
                    this.f23021c.a((n2) m1Var);
                } else if (m1Var instanceof x1) {
                    this.f23022d.a((x1) m1Var);
                } else if (m1Var instanceof a2) {
                    this.f23023e.a((a2) m1Var);
                } else if (m1Var instanceof g2) {
                    this.f23024f.a((g2) m1Var);
                } else {
                    f23018j.e("Unknown task type: %s", m1Var.getClass().getName());
                }
            } catch (Exception e11) {
                f23018j.e("Error during extraction task: %s", e11.getMessage());
                this.f23025g.a().a(m1Var.f22913a);
                b(m1Var.f22913a, e11);
            }
        }
    }
}
