package androidx.work;

import android.os.Build;
import androidx.work.x;

/* compiled from: OneTimeWorkRequest.kt */
/* loaded from: classes.dex */
public final class n extends x {

    /* renamed from: d  reason: collision with root package name */
    public static final b f4725d = new b(null);

    /* compiled from: OneTimeWorkRequest.kt */
    /* loaded from: classes.dex */
    public static final class a extends x.a<a, n> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends k> cls) {
            super(cls);
            qe.k.f(cls, "workerClass");
            h().f34908d = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.x.a
        /* renamed from: n */
        public n c() {
            if ((d() && Build.VERSION.SDK_INT >= 23 && h().f34914j.h()) ? false : true) {
                return new n(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        @Override // androidx.work.x.a
        /* renamed from: o */
        public a g() {
            return this;
        }
    }

    /* compiled from: OneTimeWorkRequest.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }

        public final n a(Class<? extends k> cls) {
            qe.k.f(cls, "workerClass");
            return new a(cls).b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar) {
        super(aVar.e(), aVar.h(), aVar.f());
        qe.k.f(aVar, "builder");
    }

    public static final n e(Class<? extends k> cls) {
        return f4725d.a(cls);
    }
}
