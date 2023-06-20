package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: b  reason: collision with root package name */
    public int f18051b;

    /* renamed from: c  reason: collision with root package name */
    public int f18052c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f18053d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18054e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f18055f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f18056g;

    /* renamed from: h  reason: collision with root package name */
    public ByteBuffer f18057h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18058i;

    public d() {
        ByteBuffer byteBuffer = b.f18003a;
        this.f18056g = byteBuffer;
        this.f18057h = byteBuffer;
        this.f18051b = -1;
        this.f18052c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean a(int i10, int i11, int i12) throws b.a {
        boolean z10 = !Arrays.equals(this.f18053d, this.f18055f);
        int[] iArr = this.f18053d;
        this.f18055f = iArr;
        if (iArr == null) {
            this.f18054e = false;
            return z10;
        } else if (i12 == 2) {
            if (!z10 && this.f18052c == i10 && this.f18051b == i11) {
                return false;
            }
            this.f18052c = i10;
            this.f18051b = i11;
            this.f18054e = i11 != iArr.length;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f18055f;
                if (i13 >= iArr2.length) {
                    return true;
                }
                int i14 = iArr2[i13];
                if (i14 < i11) {
                    this.f18054e = (i14 != i13) | this.f18054e;
                    i13++;
                } else {
                    throw new b.a(i10, i11, i12);
                }
            }
        } else {
            throw new b.a(i10, i11, i12);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean b() {
        return this.f18058i && this.f18057h == b.f18003a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void c() {
        this.f18058i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public boolean d() {
        return this.f18054e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public int e() {
        return 2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public int f() {
        int[] iArr = this.f18055f;
        return iArr == null ? this.f18051b : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void flush() {
        this.f18057h = b.f18003a;
        this.f18058i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void g() {
        flush();
        this.f18056g = b.f18003a;
        this.f18051b = -1;
        this.f18052c = -1;
        this.f18055f = null;
        this.f18054e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f18051b * 2)) * this.f18055f.length * 2;
        if (this.f18056g.capacity() < length) {
            this.f18056g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f18056g.clear();
        }
        while (position < limit) {
            for (int i10 : this.f18055f) {
                this.f18056g.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f18051b * 2;
        }
        byteBuffer.position(limit);
        this.f18056g.flip();
        this.f18057h = this.f18056g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.b
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f18057h;
        this.f18057h = b.f18003a;
        return byteBuffer;
    }
}
