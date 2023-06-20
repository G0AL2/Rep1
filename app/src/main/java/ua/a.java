package ua;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f37679a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0516a f37680b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37681c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: ua.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0516a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0516a interfaceC0516a, Typeface typeface) {
        this.f37679a = typeface;
        this.f37680b = interfaceC0516a;
    }

    private void d(Typeface typeface) {
        if (this.f37681c) {
            return;
        }
        this.f37680b.a(typeface);
    }

    @Override // ua.f
    public void a(int i10) {
        d(this.f37679a);
    }

    @Override // ua.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f37681c = true;
    }
}
