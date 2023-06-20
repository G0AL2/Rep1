package m6;

import com.facebook.react.bridge.ReadableArray;

/* compiled from: DispatchIntCommandMountItem.java */
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private final int f34246b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34247c;

    /* renamed from: d  reason: collision with root package name */
    private final int f34248d;

    /* renamed from: e  reason: collision with root package name */
    private final ReadableArray f34249e;

    public b(int i10, int i11, int i12, ReadableArray readableArray) {
        this.f34246b = i10;
        this.f34247c = i11;
        this.f34248d = i12;
        this.f34249e = readableArray;
    }

    @Override // m6.d
    public int a() {
        return this.f34246b;
    }

    @Override // m6.d
    public void b(l6.c cVar) {
        cVar.m(this.f34246b, this.f34247c, this.f34248d, this.f34249e);
    }

    public String toString() {
        return "DispatchIntCommandMountItem [" + this.f34247c + "] " + this.f34248d;
    }
}
