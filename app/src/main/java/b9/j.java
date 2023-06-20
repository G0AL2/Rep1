package b9;

import b9.b;
import b9.l;
import b9.x;
import ea.n0;
import java.io.IOException;

/* compiled from: DefaultMediaCodecAdapterFactory.java */
/* loaded from: classes2.dex */
public final class j implements l.b {

    /* renamed from: b  reason: collision with root package name */
    private boolean f4937b;

    /* renamed from: a  reason: collision with root package name */
    private int f4936a = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4938c = true;

    @Override // b9.l.b
    public l a(l.a aVar) throws IOException {
        int i10 = this.f4936a;
        if ((i10 == 1 && n0.f29709a >= 23) || (i10 == 0 && n0.f29709a >= 31)) {
            int l10 = ea.v.l(aVar.f4946c.f32709l);
            String valueOf = String.valueOf(n0.n0(l10));
            ea.r.f("DMCodecAdapterFactory", valueOf.length() != 0 ? "Creating an asynchronous MediaCodec adapter for track type ".concat(valueOf) : new String("Creating an asynchronous MediaCodec adapter for track type "));
            return new b.C0092b(l10, this.f4937b, this.f4938c).a(aVar);
        }
        return new x.b().a(aVar);
    }
}
