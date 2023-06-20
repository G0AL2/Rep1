package com.google.android.exoplayer2.metadata.scte35;

import c9.d;
import c9.f;
import com.google.android.exoplayer2.metadata.Metadata;
import ea.a0;
import ea.j0;
import ea.z;
import java.nio.ByteBuffer;

/* compiled from: SpliceInfoDecoder.java */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f21268a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private final z f21269b = new z();

    /* renamed from: c  reason: collision with root package name */
    private j0 f21270c;

    @Override // c9.f
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        j0 j0Var = this.f21270c;
        if (j0Var == null || dVar.f5332i != j0Var.e()) {
            j0 j0Var2 = new j0(dVar.f34292e);
            this.f21270c = j0Var2;
            j0Var2.a(dVar.f34292e - dVar.f5332i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f21268a.N(array, limit);
        this.f21269b.o(array, limit);
        this.f21269b.r(39);
        long h10 = (this.f21269b.h(1) << 32) | this.f21269b.h(32);
        this.f21269b.r(20);
        int h11 = this.f21269b.h(12);
        int h12 = this.f21269b.h(8);
        Metadata.Entry entry = null;
        this.f21268a.Q(14);
        if (h12 == 0) {
            entry = new SpliceNullCommand();
        } else if (h12 == 255) {
            entry = PrivateCommand.c(this.f21268a, h11, h10);
        } else if (h12 == 4) {
            entry = SpliceScheduleCommand.c(this.f21268a);
        } else if (h12 == 5) {
            entry = SpliceInsertCommand.c(this.f21268a, h10, this.f21270c);
        } else if (h12 == 6) {
            entry = TimeSignalCommand.c(this.f21268a, h10, this.f21270c);
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}
