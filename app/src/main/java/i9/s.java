package i9;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: MediaPeriodId.java */
/* loaded from: classes2.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Object f31793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31794b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31795c;

    /* renamed from: d  reason: collision with root package name */
    public final long f31796d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31797e;

    public s(Object obj) {
        this(obj, -1L);
    }

    public s a(Object obj) {
        return this.f31793a.equals(obj) ? this : new s(obj, this.f31794b, this.f31795c, this.f31796d, this.f31797e);
    }

    public boolean b() {
        return this.f31794b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f31793a.equals(sVar.f31793a) && this.f31794b == sVar.f31794b && this.f31795c == sVar.f31795c && this.f31796d == sVar.f31796d && this.f31797e == sVar.f31797e;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f31793a.hashCode()) * 31) + this.f31794b) * 31) + this.f31795c) * 31) + ((int) this.f31796d)) * 31) + this.f31797e;
    }

    public s(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public s(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public s(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s(s sVar) {
        this.f31793a = sVar.f31793a;
        this.f31794b = sVar.f31794b;
        this.f31795c = sVar.f31795c;
        this.f31796d = sVar.f31796d;
        this.f31797e = sVar.f31797e;
    }

    private s(Object obj, int i10, int i11, long j10, int i12) {
        this.f31793a = obj;
        this.f31794b = i10;
        this.f31795c = i11;
        this.f31796d = j10;
        this.f31797e = i12;
    }
}
