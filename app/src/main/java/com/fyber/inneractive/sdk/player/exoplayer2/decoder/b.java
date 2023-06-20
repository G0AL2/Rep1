package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f18122a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18123b = new a();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f18124c;

    /* renamed from: d  reason: collision with root package name */
    public long f18125d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18126e;

    public b(int i10) {
        this.f18126e = i10;
    }

    public static b b() {
        return new b(0);
    }

    public void a() {
        this.f18122a = 0;
        ByteBuffer byteBuffer = this.f18124c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean b(int i10) {
        return (this.f18122a & i10) == i10;
    }

    public final ByteBuffer a(int i10) {
        int i11 = this.f18126e;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f18124c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }
}
