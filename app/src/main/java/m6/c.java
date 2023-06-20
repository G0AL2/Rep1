package m6;

import com.facebook.react.bridge.ReadableArray;

/* compiled from: DispatchStringCommandMountItem.java */
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: b  reason: collision with root package name */
    private final int f34250b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34251c;

    /* renamed from: d  reason: collision with root package name */
    private final String f34252d;

    /* renamed from: e  reason: collision with root package name */
    private final ReadableArray f34253e;

    public c(int i10, int i11, String str, ReadableArray readableArray) {
        this.f34250b = i10;
        this.f34251c = i11;
        this.f34252d = str;
        this.f34253e = readableArray;
    }

    @Override // m6.d
    public int a() {
        return this.f34250b;
    }

    @Override // m6.d
    public void b(l6.c cVar) {
        cVar.n(this.f34250b, this.f34251c, this.f34252d, this.f34253e);
    }

    public String toString() {
        return "DispatchStringCommandMountItem [" + this.f34251c + "] " + this.f34252d;
    }
}
