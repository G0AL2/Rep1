package mf;

/* compiled from: PeekSource.kt */
/* loaded from: classes3.dex */
public final class w implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final f f34494a;

    /* renamed from: b  reason: collision with root package name */
    private z f34495b;

    /* renamed from: c  reason: collision with root package name */
    private int f34496c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f34497d;

    /* renamed from: e  reason: collision with root package name */
    private long f34498e;

    /* renamed from: f  reason: collision with root package name */
    private final h f34499f;

    public w(h hVar) {
        qe.k.f(hVar, "upstream");
        this.f34499f = hVar;
        f j10 = hVar.j();
        this.f34494a = j10;
        z zVar = j10.f34446a;
        this.f34495b = zVar;
        this.f34496c = zVar != null ? zVar.f34509b : -1;
    }

    @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34497d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 == r6.f34509b) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // mf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long e0(mf.f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            qe.k.f(r9, r0)
            r0 = 0
            r1 = 0
            r3 = 1
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 < 0) goto Lf
            r5 = 1
            goto L10
        Lf:
            r5 = 0
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f34497d
            r5 = r5 ^ r3
            if (r5 == 0) goto L7b
            mf.z r5 = r8.f34495b
            if (r5 == 0) goto L2a
            mf.f r6 = r8.f34494a
            mf.z r6 = r6.f34446a
            if (r5 != r6) goto L2b
            int r5 = r8.f34496c
            qe.k.c(r6)
            int r6 = r6.f34509b
            if (r5 != r6) goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r0 == 0) goto L6f
            if (r4 != 0) goto L30
            return r1
        L30:
            mf.h r0 = r8.f34499f
            long r1 = r8.f34498e
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.W(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            mf.z r0 = r8.f34495b
            if (r0 != 0) goto L53
            mf.f r0 = r8.f34494a
            mf.z r0 = r0.f34446a
            if (r0 == 0) goto L53
            r8.f34495b = r0
            qe.k.c(r0)
            int r0 = r0.f34509b
            r8.f34496c = r0
        L53:
            mf.f r0 = r8.f34494a
            long r0 = r0.C0()
            long r2 = r8.f34498e
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            mf.f r2 = r8.f34494a
            long r4 = r8.f34498e
            r3 = r9
            r6 = r10
            r2.w(r3, r4, r6)
            long r0 = r8.f34498e
            long r0 = r0 + r10
            r8.f34498e = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.w.e0(mf.f, long):long");
    }

    @Override // mf.e0
    public f0 k() {
        return this.f34499f.k();
    }
}
