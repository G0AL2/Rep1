package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: d  reason: collision with root package name */
    public g f18094d;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f18097g;

    /* renamed from: h  reason: collision with root package name */
    public ShortBuffer f18098h;

    /* renamed from: i  reason: collision with root package name */
    public ByteBuffer f18099i;

    /* renamed from: j  reason: collision with root package name */
    public long f18100j;

    /* renamed from: k  reason: collision with root package name */
    public long f18101k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18102l;

    /* renamed from: e  reason: collision with root package name */
    public float f18095e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f18096f = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public int f18092b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f18093c = -1;

    public h() {
        ByteBuffer byteBuffer = b.f18003a;
        this.f18097g = byteBuffer;
        this.f18098h = byteBuffer.asShortBuffer();
        this.f18099i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean a(int i10, int i11, int i12) throws b.a {
        if (i12 == 2) {
            if (this.f18093c == i10 && this.f18092b == i11) {
                return false;
            }
            this.f18093c = i10;
            this.f18092b = i11;
            return true;
        }
        throw new b.a(i10, i11, i12);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean b() {
        g gVar;
        return this.f18102l && ((gVar = this.f18094d) == null || gVar.f18085r == 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void c() {
        int i10;
        g gVar = this.f18094d;
        int i11 = gVar.f18084q;
        float f10 = gVar.f18082o;
        float f11 = gVar.f18083p;
        int i12 = gVar.f18085r + ((int) ((((i11 / (f10 / f11)) + gVar.f18086s) / f11) + 0.5f));
        gVar.a((gVar.f18072e * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = gVar.f18072e * 2;
            int i14 = gVar.f18069b;
            if (i13 >= i10 * i14) {
                break;
            }
            gVar.f18075h[(i14 * i11) + i13] = 0;
            i13++;
        }
        gVar.f18084q += i10;
        gVar.a();
        if (gVar.f18085r > i12) {
            gVar.f18085r = i12;
        }
        gVar.f18084q = 0;
        gVar.f18087t = 0;
        gVar.f18086s = 0;
        this.f18102l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean d() {
        return Math.abs(this.f18095e - 1.0f) >= 0.01f || Math.abs(this.f18096f - 1.0f) >= 0.01f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public int e() {
        return 2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public int f() {
        return this.f18092b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void flush() {
        g gVar = new g(this.f18093c, this.f18092b);
        this.f18094d = gVar;
        gVar.f18082o = this.f18095e;
        gVar.f18083p = this.f18096f;
        this.f18099i = b.f18003a;
        this.f18100j = 0L;
        this.f18101k = 0L;
        this.f18102l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void g() {
        this.f18094d = null;
        ByteBuffer byteBuffer = b.f18003a;
        this.f18097g = byteBuffer;
        this.f18098h = byteBuffer.asShortBuffer();
        this.f18099i = byteBuffer;
        this.f18092b = -1;
        this.f18093c = -1;
        this.f18100j = 0L;
        this.f18101k = 0L;
        this.f18102l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f18100j += remaining;
            g gVar = this.f18094d;
            gVar.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i10 = gVar.f18069b;
            int i11 = remaining2 / i10;
            gVar.a(i11);
            asShortBuffer.get(gVar.f18075h, gVar.f18084q * gVar.f18069b, ((i10 * i11) * 2) / 2);
            gVar.f18084q += i11;
            gVar.a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i12 = this.f18094d.f18085r * this.f18092b * 2;
        if (i12 > 0) {
            if (this.f18097g.capacity() < i12) {
                ByteBuffer order = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                this.f18097g = order;
                this.f18098h = order.asShortBuffer();
            } else {
                this.f18097g.clear();
                this.f18098h.clear();
            }
            g gVar2 = this.f18094d;
            ShortBuffer shortBuffer = this.f18098h;
            gVar2.getClass();
            int min = Math.min(shortBuffer.remaining() / gVar2.f18069b, gVar2.f18085r);
            shortBuffer.put(gVar2.f18077j, 0, gVar2.f18069b * min);
            int i13 = gVar2.f18085r - min;
            gVar2.f18085r = i13;
            short[] sArr = gVar2.f18077j;
            int i14 = gVar2.f18069b;
            System.arraycopy(sArr, min * i14, sArr, 0, i13 * i14);
            this.f18101k += i12;
            this.f18097g.limit(i12);
            this.f18099i = this.f18097g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f18099i;
        this.f18099i = b.f18003a;
        return byteBuffer;
    }
}
