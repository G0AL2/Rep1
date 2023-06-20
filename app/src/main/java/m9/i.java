package m9;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.l0;

/* compiled from: RangedUri.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f34375a;

    /* renamed from: b  reason: collision with root package name */
    public final long f34376b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34377c;

    /* renamed from: d  reason: collision with root package name */
    private int f34378d;

    public i(String str, long j10, long j11) {
        this.f34377c = str == null ? "" : str;
        this.f34375a = j10;
        this.f34376b = j11;
    }

    public i a(i iVar, String str) {
        String c10 = c(str);
        if (iVar != null && c10.equals(iVar.c(str))) {
            long j10 = this.f34376b;
            if (j10 != -1) {
                long j11 = this.f34375a;
                if (j11 + j10 == iVar.f34375a) {
                    long j12 = iVar.f34376b;
                    return new i(c10, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f34376b;
            if (j13 != -1) {
                long j14 = iVar.f34375a;
                if (j14 + j13 == this.f34375a) {
                    return new i(c10, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return l0.e(str, this.f34377c);
    }

    public String c(String str) {
        return l0.d(str, this.f34377c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f34375a == iVar.f34375a && this.f34376b == iVar.f34376b && this.f34377c.equals(iVar.f34377c);
    }

    public int hashCode() {
        if (this.f34378d == 0) {
            this.f34378d = ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.f34375a)) * 31) + ((int) this.f34376b)) * 31) + this.f34377c.hashCode();
        }
        return this.f34378d;
    }

    public String toString() {
        String str = this.f34377c;
        long j10 = this.f34375a;
        long j11 = this.f34376b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 81);
        sb2.append("RangedUri(referenceUri=");
        sb2.append(str);
        sb2.append(", start=");
        sb2.append(j10);
        sb2.append(", length=");
        sb2.append(j11);
        sb2.append(")");
        return sb2.toString();
    }
}
