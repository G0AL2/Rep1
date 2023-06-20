package i9;

import java.io.IOException;

/* compiled from: BundledExtractorsAdapter.java */
/* loaded from: classes2.dex */
public final class c implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final p8.n f31566a;

    /* renamed from: b  reason: collision with root package name */
    private p8.i f31567b;

    /* renamed from: c  reason: collision with root package name */
    private p8.j f31568c;

    public c(p8.n nVar) {
        this.f31566a = nVar;
    }

    @Override // i9.e0
    public void a(long j10, long j11) {
        ((p8.i) ea.a.e(this.f31567b)).a(j10, j11);
    }

    @Override // i9.e0
    public void b() {
        p8.i iVar = this.f31567b;
        if (iVar instanceof v8.f) {
            ((v8.f) iVar).j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r6.getPosition() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (r6.getPosition() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        r1 = false;
     */
    @Override // i9.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(da.i r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p8.k r15) throws java.io.IOException {
        /*
            r7 = this;
            p8.f r6 = new p8.f
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f31568c = r6
            p8.i r8 = r7.f31567b
            if (r8 == 0) goto L10
            return
        L10:
            p8.n r8 = r7.f31566a
            p8.i[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f31567b = r8
            goto L75
        L20:
            int r10 = r8.length
            r0 = 0
        L22:
            if (r0 >= r10) goto L71
            r1 = r8[r0]
            boolean r2 = r1.h(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f31567b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            ea.a.f(r14)
            r6.f()
            goto L71
        L35:
            p8.i r1 = r7.f31567b
            if (r1 != 0) goto L67
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L42:
            r8 = move-exception
            p8.i r9 = r7.f31567b
            if (r9 != 0) goto L4f
            long r9 = r6.getPosition()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L50
        L4f:
            r13 = 1
        L50:
            ea.a.f(r13)
            r6.f()
            throw r8
        L57:
            p8.i r1 = r7.f31567b
            if (r1 != 0) goto L67
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L65:
            r1 = 0
            goto L68
        L67:
            r1 = 1
        L68:
            ea.a.f(r1)
            r6.f()
            int r0 = r0 + 1
            goto L22
        L71:
            p8.i r10 = r7.f31567b
            if (r10 == 0) goto L7b
        L75:
            p8.i r8 = r7.f31567b
            r8.c(r15)
            return
        L7b:
            i9.z0 r10 = new i9.z0
            java.lang.String r8 = ea.n0.M(r8)
            java.lang.String r11 = java.lang.String.valueOf(r8)
            int r11 = r11.length()
            int r11 = r11 + 58
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = ea.a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.c.c(da.i, android.net.Uri, java.util.Map, long, long, p8.k):void");
    }

    @Override // i9.e0
    public long d() {
        p8.j jVar = this.f31568c;
        if (jVar != null) {
            return jVar.getPosition();
        }
        return -1L;
    }

    @Override // i9.e0
    public int e(p8.w wVar) throws IOException {
        return ((p8.i) ea.a.e(this.f31567b)).g((p8.j) ea.a.e(this.f31568c), wVar);
    }

    @Override // i9.e0
    public void release() {
        p8.i iVar = this.f31567b;
        if (iVar != null) {
            iVar.release();
            this.f31567b = null;
        }
        this.f31568c = null;
    }
}
