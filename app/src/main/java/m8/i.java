package m8;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j8.p1;

/* compiled from: DecoderReuseEvaluation.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f34297a;

    /* renamed from: b  reason: collision with root package name */
    public final p1 f34298b;

    /* renamed from: c  reason: collision with root package name */
    public final p1 f34299c;

    /* renamed from: d  reason: collision with root package name */
    public final int f34300d;

    /* renamed from: e  reason: collision with root package name */
    public final int f34301e;

    public i(String str, p1 p1Var, p1 p1Var2, int i10, int i11) {
        ea.a.a(i10 == 0 || i11 == 0);
        this.f34297a = ea.a.d(str);
        this.f34298b = (p1) ea.a.e(p1Var);
        this.f34299c = (p1) ea.a.e(p1Var2);
        this.f34300d = i10;
        this.f34301e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f34300d == iVar.f34300d && this.f34301e == iVar.f34301e && this.f34297a.equals(iVar.f34297a) && this.f34298b.equals(iVar.f34298b) && this.f34299c.equals(iVar.f34299c);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f34300d) * 31) + this.f34301e) * 31) + this.f34297a.hashCode()) * 31) + this.f34298b.hashCode()) * 31) + this.f34299c.hashCode();
    }
}
