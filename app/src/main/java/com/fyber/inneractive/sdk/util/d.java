package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public static d f20241b = new d();

    /* renamed from: a  reason: collision with root package name */
    public Queue<ByteBuffer> f20242a = new ConcurrentLinkedQueue();

    public d() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f20242a.offer(a());
        }
    }

    public final ByteBuffer a() {
        return ByteBuffer.allocateDirect(16384);
    }

    public ByteBuffer b() {
        ByteBuffer poll = this.f20242a.poll();
        return poll == null ? ByteBuffer.allocateDirect(16384) : poll;
    }
}
