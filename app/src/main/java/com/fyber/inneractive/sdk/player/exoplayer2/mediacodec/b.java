package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.j;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* loaded from: classes2.dex */
public abstract class b extends com.fyber.inneractive.sdk.player.exoplayer2.a {
    public static final byte[] U;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ByteBuffer[] E;
    public ByteBuffer[] F;
    public long G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public DecoderCounters T;

    /* renamed from: i  reason: collision with root package name */
    public final c f19150i;

    /* renamed from: j  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> f19151j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f19152k;

    /* renamed from: l  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.b f19153l;

    /* renamed from: m  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.b f19154m;

    /* renamed from: n  reason: collision with root package name */
    public final j f19155n;

    /* renamed from: o  reason: collision with root package name */
    public final List<Long> f19156o;

    /* renamed from: p  reason: collision with root package name */
    public final MediaCodec.BufferInfo f19157p;

    /* renamed from: q  reason: collision with root package name */
    public i f19158q;

    /* renamed from: r  reason: collision with root package name */
    public MediaCodec f19159r;

    /* renamed from: s  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> f19160s;

    /* renamed from: t  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> f19161t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f19162u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f19163v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f19164w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f19165x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f19166y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f19167z;

    static {
        int i10 = u.f19606a;
        byte[] bArr = new byte[38];
        for (int i11 = 0; i11 < 38; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12 + 1), 16));
        }
        U = bArr;
    }

    public b(int i10, c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> cVar2, boolean z10) {
        super(i10);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(u.f19606a >= 16);
        this.f19150i = (c) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(cVar);
        this.f19151j = cVar2;
        this.f19152k = z10;
        this.f19153l = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.b(0);
        this.f19154m = com.fyber.inneractive.sdk.player.exoplayer2.decoder.b.b();
        this.f19155n = new j();
        this.f19156o = new ArrayList();
        this.f19157p = new MediaCodec.BufferInfo();
        this.L = 0;
        this.M = 0;
    }

    public abstract int a(c cVar, i iVar) throws d.b;

    public com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a(c cVar, i iVar, boolean z10) throws d.b {
        return cVar.a(iVar.f19119f, z10);
    }

    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws com.fyber.inneractive.sdk.player.exoplayer2.d;

    public void a(com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar) {
    }

    public abstract void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, i iVar, MediaCrypto mediaCrypto) throws d.b;

    public abstract void a(String str, long j10, long j11);

    public abstract boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.d;

    public boolean a(MediaCodec mediaCodec, boolean z10, i iVar, i iVar2) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public boolean b() {
        return this.Q;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public boolean isReady() {
        if (this.f19158q != null && !this.R) {
            if ((this.f17976g ? this.f17977h : this.f17974e.isReady()) || this.I >= 0 || (this.G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.G)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void p() {
        this.f19158q = null;
        try {
            v();
            try {
                com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar = this.f19160s;
                if (bVar != null) {
                    this.f19151j.a(bVar);
                }
                try {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar2 = this.f19161t;
                    if (bVar2 != null && bVar2 != this.f19160s) {
                        this.f19151j.a(bVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar3 = this.f19161t;
                    if (bVar3 != null && bVar3 != this.f19160s) {
                        this.f19151j.a(bVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.f19160s != null) {
                    this.f19151j.a(this.f19160s);
                }
                try {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar4 = this.f19161t;
                    if (bVar4 != null && bVar4 != this.f19160s) {
                        this.f19151j.a(bVar4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar5 = this.f19161t;
                    if (bVar5 != null && bVar5 != this.f19160s) {
                        this.f19151j.a(bVar5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b.s():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b.t():void");
    }

    public final void u() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.M == 2) {
            v();
            t();
            return;
        }
        this.Q = true;
        w();
    }

    public void v() {
        if (this.f19159r != null) {
            this.G = -9223372036854775807L;
            this.H = -1;
            this.I = -1;
            this.R = false;
            this.J = false;
            this.f19156o.clear();
            this.E = null;
            this.F = null;
            this.K = false;
            this.N = false;
            this.f19162u = false;
            this.f19163v = false;
            this.f19164w = false;
            this.f19165x = false;
            this.f19166y = false;
            this.f19167z = false;
            this.B = false;
            this.C = false;
            this.D = false;
            this.O = false;
            this.L = 0;
            this.M = 0;
            this.T.decoderReleaseCount++;
            this.f19153l.f18124c = null;
            try {
                this.f19159r.stop();
                try {
                    this.f19159r.release();
                    this.f19159r = null;
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar = this.f19160s;
                    if (bVar == null || this.f19161t == bVar) {
                        return;
                    }
                    try {
                        this.f19151j.a(bVar);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.f19159r = null;
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar2 = this.f19160s;
                    if (bVar2 != null && this.f19161t != bVar2) {
                        try {
                            this.f19151j.a(bVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.f19159r.release();
                    this.f19159r = null;
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar3 = this.f19160s;
                    if (bVar3 != null && this.f19161t != bVar3) {
                        try {
                            this.f19151j.a(bVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.f19159r = null;
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar4 = this.f19160s;
                    if (bVar4 != null && this.f19161t != bVar4) {
                        try {
                            this.f19151j.a(bVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void w() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
    }

    public boolean x() {
        return this.f19159r == null && this.f19158q != null;
    }

    /* loaded from: classes2.dex */
    public static class a extends Exception {
        public a(i iVar, Throwable th, boolean z10, int i10) {
            super("Decoder init failed: [" + i10 + "], " + iVar, th);
            String str = iVar.f19119f;
            a(i10);
        }

        @TargetApi(21)
        public static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public static String a(int i10) {
            String str = i10 < 0 ? "neg_" : "";
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i10);
        }

        public a(i iVar, Throwable th, boolean z10, String str) {
            super("Decoder init failed: " + str + ", " + iVar, th);
            String str2 = iVar.f19119f;
            if (u.f19606a >= 21) {
                a(th);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(long j10, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.P = false;
        this.Q = false;
        if (this.f19159r != null) {
            this.G = -9223372036854775807L;
            this.H = -1;
            this.I = -1;
            this.S = true;
            this.R = false;
            this.J = false;
            this.f19156o.clear();
            this.C = false;
            this.D = false;
            if (!this.f19164w && (!this.f19167z || !this.O)) {
                if (this.M != 0) {
                    v();
                    t();
                } else {
                    this.f19159r.flush();
                    this.N = false;
                }
            } else {
                v();
                t();
            }
            if (!this.K || this.f19158q == null) {
                return;
            }
            this.L = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0189 A[EDGE_INSN: B:101:0x0189->B:86:0x0189 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0186 A[LOOP:0: B:17:0x0047->B:85:0x0186, LOOP_END] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r18, long r20) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b.a(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r5.f19124k == r0.f19124k) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.i r5) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r4.f19158q
            r4.f19158q = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r5.f19122i
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = r0.f19122i
        Ld:
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L47
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r4.f19158q
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r5.f19122i
            if (r5 == 0) goto L45
            com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r5 = r4.f19151j
            if (r5 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r4.f19158q
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r3 = r3.f19122i
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b r5 = r5.a(r1, r3)
            r4.f19161t = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f19160s
            if (r5 != r1) goto L47
            com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f19151j
            r1.a(r5)
            goto L47
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.f17972c
            com.fyber.inneractive.sdk.player.exoplayer2.d r5 = com.fyber.inneractive.sdk.player.exoplayer2.d.a(r5, r0)
            throw r5
        L45:
            r4.f19161t = r1
        L47:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r5 = r4.f19161t
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f19160s
            if (r5 != r1) goto L76
            android.media.MediaCodec r5 = r4.f19159r
            if (r5 == 0) goto L76
            boolean r1 = r4.f19162u
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r4.f19158q
            boolean r5 = r4.a(r5, r1, r0, r3)
            if (r5 == 0) goto L76
            r4.K = r2
            r4.L = r2
            boolean r5 = r4.f19165x
            if (r5 == 0) goto L72
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r4.f19158q
            int r1 = r5.f19123j
            int r3 = r0.f19123j
            if (r1 != r3) goto L72
            int r5 = r5.f19124k
            int r0 = r0.f19124k
            if (r5 != r0) goto L72
            goto L73
        L72:
            r2 = 0
        L73:
            r4.C = r2
            goto L83
        L76:
            boolean r5 = r4.N
            if (r5 == 0) goto L7d
            r4.M = r2
            goto L83
        L7d:
            r4.v()
            r4.t()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b.a(com.fyber.inneractive.sdk.player.exoplayer2.i):void");
    }
}
