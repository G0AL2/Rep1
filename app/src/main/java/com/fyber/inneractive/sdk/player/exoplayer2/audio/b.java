package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f18003a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(int i10, int i11, int i12) {
            super("Unhandled format: " + i10 + " Hz, " + i11 + " channels in encoding " + i12);
        }
    }

    ByteBuffer a();

    void a(ByteBuffer byteBuffer);

    boolean a(int i10, int i11, int i12) throws a;

    boolean b();

    void c();

    boolean d();

    int e();

    int f();

    void flush();

    void g();
}
