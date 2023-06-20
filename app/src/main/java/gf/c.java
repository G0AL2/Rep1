package gf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import mf.i;

/* compiled from: Header.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final mf.i f30875d;

    /* renamed from: e  reason: collision with root package name */
    public static final mf.i f30876e;

    /* renamed from: f  reason: collision with root package name */
    public static final mf.i f30877f;

    /* renamed from: g  reason: collision with root package name */
    public static final mf.i f30878g;

    /* renamed from: h  reason: collision with root package name */
    public static final mf.i f30879h;

    /* renamed from: i  reason: collision with root package name */
    public static final mf.i f30880i;

    /* renamed from: a  reason: collision with root package name */
    public final int f30881a;

    /* renamed from: b  reason: collision with root package name */
    public final mf.i f30882b;

    /* renamed from: c  reason: collision with root package name */
    public final mf.i f30883c;

    /* compiled from: Header.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
        i.a aVar = mf.i.f34462e;
        f30875d = aVar.d(":");
        f30876e = aVar.d(":status");
        f30877f = aVar.d(":method");
        f30878g = aVar.d(":path");
        f30879h = aVar.d(":scheme");
        f30880i = aVar.d(":authority");
    }

    public c(mf.i iVar, mf.i iVar2) {
        qe.k.f(iVar, "name");
        qe.k.f(iVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f30882b = iVar;
        this.f30883c = iVar2;
        this.f30881a = iVar.A() + 32 + iVar2.A();
    }

    public final mf.i a() {
        return this.f30882b;
    }

    public final mf.i b() {
        return this.f30883c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return qe.k.a(this.f30882b, cVar.f30882b) && qe.k.a(this.f30883c, cVar.f30883c);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        mf.i iVar = this.f30882b;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        mf.i iVar2 = this.f30883c;
        return hashCode + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    public String toString() {
        return this.f30882b.E() + ": " + this.f30883c.E();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            qe.k.f(r2, r0)
            java.lang.String r0 = "value"
            qe.k.f(r3, r0)
            mf.i$a r0 = mf.i.f34462e
            mf.i r2 = r0.d(r2)
            mf.i r3 = r0.d(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.c.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(mf.i iVar, String str) {
        this(iVar, mf.i.f34462e.d(str));
        qe.k.f(iVar, "name");
        qe.k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }
}
