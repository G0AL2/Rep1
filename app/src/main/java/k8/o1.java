package k8;

import android.media.metrics.LogSessionId;

/* compiled from: PlayerId.java */
/* loaded from: classes2.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    private final a f33301a;

    /* compiled from: PlayerId.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f33302b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a  reason: collision with root package name */
        public final LogSessionId f33303a;

        public a(LogSessionId logSessionId) {
            this.f33303a = logSessionId;
        }
    }

    static {
        if (ea.n0.f29709a < 31) {
            new o1();
        } else {
            new o1(a.f33302b);
        }
    }

    public o1() {
        this((a) null);
        ea.a.f(ea.n0.f29709a < 31);
    }

    public LogSessionId a() {
        return ((a) ea.a.e(this.f33301a)).f33303a;
    }

    public o1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private o1(a aVar) {
        this.f33301a = aVar;
    }
}
