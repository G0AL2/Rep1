package com.airbnb.lottie;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PerformanceTracker.java */
/* loaded from: classes.dex */
public class m0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5847a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Set<b> f5848b = new androidx.collection.b();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, i2.f> f5849c = new HashMap();

    /* compiled from: PerformanceTracker.java */
    /* loaded from: classes.dex */
    class a implements Comparator<h0.d<String, Float>> {
        a(m0 m0Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(h0.d<String, Float> dVar, h0.d<String, Float> dVar2) {
            float floatValue = dVar.f31050b.floatValue();
            float floatValue2 = dVar2.f31050b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(float f10);
    }

    public m0() {
        new a(this);
    }

    public void a(String str, float f10) {
        if (this.f5847a) {
            i2.f fVar = this.f5849c.get(str);
            if (fVar == null) {
                fVar = new i2.f();
                this.f5849c.put(str, fVar);
            }
            fVar.a(f10);
            if (str.equals("__container")) {
                for (b bVar : this.f5848b) {
                    bVar.a(f10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z10) {
        this.f5847a = z10;
    }
}
