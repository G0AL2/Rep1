package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f implements b {

    /* renamed from: b  reason: collision with root package name */
    public int f18062b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f18063c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f18064d = 0;

    /* renamed from: e  reason: collision with root package name */
    public ByteBuffer f18065e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f18066f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18067g;

    public f() {
        ByteBuffer byteBuffer = b.f18003a;
        this.f18065e = byteBuffer;
        this.f18066f = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean a(int i10, int i11, int i12) throws b.a {
        if (i12 != 3 && i12 != 2 && i12 != Integer.MIN_VALUE && i12 != 1073741824) {
            throw new b.a(i10, i11, i12);
        }
        if (this.f18062b == i10 && this.f18063c == i11 && this.f18064d == i12) {
            return false;
        }
        this.f18062b = i10;
        this.f18063c = i11;
        this.f18064d = i12;
        if (i12 == 2) {
            this.f18065e = b.f18003a;
            return true;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean b() {
        return this.f18067g && this.f18066f == b.f18003a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void c() {
        this.f18067g = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean d() {
        int i10 = this.f18064d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public int e() {
        return 2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public int f() {
        return this.f18063c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void flush() {
        this.f18066f = b.f18003a;
        this.f18067g = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void g() {
        flush();
        this.f18065e = b.f18003a;
        this.f18062b = -1;
        this.f18063c = -1;
        this.f18064d = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f18064d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 * 2
        L23:
            java.nio.ByteBuffer r3 = r7.f18065e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f18065e = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.f18065e
            r2.clear()
        L3f:
            int r2 = r7.f18064d
            if (r2 == r5) goto L81
            if (r2 == r6) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f18065e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f18065e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f18065e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f18065e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f18065e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f18065e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f18065e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f18065e
            r7.f18066f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.f.a(java.nio.ByteBuffer):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f18066f;
        this.f18066f = b.f18003a;
        return byteBuffer;
    }
}
