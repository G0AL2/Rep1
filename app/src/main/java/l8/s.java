package l8;

import j8.o2;
import j8.p1;
import java.nio.ByteBuffer;
import k8.o1;

/* compiled from: AudioSink.java */
/* loaded from: classes2.dex */
public interface s {

    /* compiled from: AudioSink.java */
    /* loaded from: classes2.dex */
    public static final class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f33901a;

        /* renamed from: b  reason: collision with root package name */
        public final p1 f33902b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r4, int r5, int r6, int r7, j8.p1 r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                if (r9 == 0) goto L5
                java.lang.String r0 = " (recoverable)"
                goto L7
            L5:
                java.lang.String r0 = ""
            L7:
                int r1 = r0.length()
                int r1 = r1 + 80
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r4 = " "
                r2.append(r4)
                java.lang.String r4 = "Config("
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = ", "
                r2.append(r4)
                r2.append(r6)
                r2.append(r4)
                r2.append(r7)
                java.lang.String r4 = ")"
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4, r10)
                r3.f33901a = r9
                r3.f33902b = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l8.s.b.<init>(int, int, int, int, j8.p1, boolean, java.lang.Exception):void");
        }
    }

    /* compiled from: AudioSink.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(boolean z10);

        void b(Exception exc);

        void c(long j10);

        void d(long j10);

        void e(int i10, long j10, long j11);

        void f();

        void g();
    }

    /* compiled from: AudioSink.java */
    /* loaded from: classes2.dex */
    public static final class d extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(long r3, long r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 103(0x67, float:1.44E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = ", got "
                r0.append(r5)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l8.s.d.<init>(long, long):void");
        }
    }

    /* compiled from: AudioSink.java */
    /* loaded from: classes2.dex */
    public static final class e extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f33903a;

        /* renamed from: b  reason: collision with root package name */
        public final p1 f33904b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public e(int r3, j8.p1 r4, boolean r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 36
                r0.<init>(r1)
                java.lang.String r1 = "AudioTrack write failed: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                r2.f33903a = r5
                r2.f33904b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l8.s.e.<init>(int, j8.p1, boolean):void");
        }
    }

    boolean a(p1 p1Var);

    void b(o2 o2Var);

    o2 c();

    boolean d();

    void e(l8.d dVar);

    boolean f();

    void flush();

    void g(int i10);

    void h(o1 o1Var);

    void i();

    void j(v vVar);

    void k(c cVar);

    boolean l(ByteBuffer byteBuffer, long j10, int i10) throws b, e;

    void m();

    int n(p1 p1Var);

    void o() throws e;

    void p(p1 p1Var, int i10, int[] iArr) throws a;

    void pause();

    void play();

    long q(boolean z10);

    void r();

    void reset();

    void s();

    void setVolume(float f10);

    void t(boolean z10);

    /* compiled from: AudioSink.java */
    /* loaded from: classes2.dex */
    public static final class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final p1 f33900a;

        public a(Throwable th, p1 p1Var) {
            super(th);
            this.f33900a = p1Var;
        }

        public a(String str, p1 p1Var) {
            super(str);
            this.f33900a = p1Var;
        }
    }
}
