package oc;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes3.dex */
public class i implements lc.g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f35236a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f35237b = false;

    /* renamed from: c  reason: collision with root package name */
    private lc.c f35238c;

    /* renamed from: d  reason: collision with root package name */
    private final f f35239d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f35239d = fVar;
    }

    private void b() {
        if (!this.f35236a) {
            this.f35236a = true;
            return;
        }
        throw new lc.b("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // lc.g
    public lc.g a(String str) throws IOException {
        b();
        this.f35239d.h(this.f35238c, str, this.f35237b);
        return this;
    }

    @Override // lc.g
    public lc.g c(boolean z10) throws IOException {
        b();
        this.f35239d.n(this.f35238c, z10, this.f35237b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(lc.c cVar, boolean z10) {
        this.f35236a = false;
        this.f35238c = cVar;
        this.f35237b = z10;
    }
}
