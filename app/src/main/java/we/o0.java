package we;

/* compiled from: Dispatched.kt */
/* loaded from: classes3.dex */
public final class o0<T> extends r0<T> implements kotlin.coroutines.jvm.internal.e, ie.d<T> {

    /* renamed from: d  reason: collision with root package name */
    public Object f38625d;

    /* renamed from: e  reason: collision with root package name */
    private final kotlin.coroutines.jvm.internal.e f38626e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f38627f;

    /* renamed from: g  reason: collision with root package name */
    public final z f38628g;

    /* renamed from: h  reason: collision with root package name */
    public final ie.d<T> f38629h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(z zVar, ie.d<? super T> dVar) {
        super(0);
        qe.k.g(zVar, "dispatcher");
        qe.k.g(dVar, "continuation");
        this.f38628g = zVar;
        this.f38629h = dVar;
        this.f38625d = q0.a();
        this.f38626e = (kotlin.coroutines.jvm.internal.e) (dVar instanceof kotlin.coroutines.jvm.internal.e ? dVar : (ie.d<? super T>) false);
        this.f38627f = kotlinx.coroutines.internal.y.b(getContext());
    }

    @Override // we.r0
    public ie.d<T> d() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        return this.f38626e;
    }

    @Override // ie.d
    public ie.g getContext() {
        return this.f38629h.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // we.r0
    public Object k() {
        Object obj = this.f38625d;
        if (i0.a()) {
            if (!(obj != q0.a())) {
                throw new AssertionError();
            }
        }
        this.f38625d = q0.a();
        return obj;
    }

    @Override // ie.d
    public void resumeWith(Object obj) {
        ie.g context = this.f38629h.getContext();
        Object a10 = s.a(obj);
        if (this.f38628g.h0(context)) {
            this.f38625d = a10;
            this.f38651c = 0;
            this.f38628g.g0(context, this);
            return;
        }
        w0 a11 = e2.f38598b.a();
        if (a11.E0()) {
            this.f38625d = a10;
            this.f38651c = 0;
            a11.r0(this);
            return;
        }
        a11.z0(true);
        try {
            ie.g context2 = getContext();
            Object c10 = kotlinx.coroutines.internal.y.c(context2, this.f38627f);
            this.f38629h.resumeWith(obj);
            ee.u uVar = ee.u.f29813a;
            kotlinx.coroutines.internal.y.a(context2, c10);
            do {
            } while (a11.K0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f38628g + ", " + j0.c(this.f38629h) + ']';
    }
}
