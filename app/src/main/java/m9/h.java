package m9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;

/* compiled from: ProgramInformation.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f34370a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34371b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34372c;

    /* renamed from: d  reason: collision with root package name */
    public final String f34373d;

    /* renamed from: e  reason: collision with root package name */
    public final String f34374e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f34370a = str;
        this.f34371b = str2;
        this.f34372c = str3;
        this.f34373d = str4;
        this.f34374e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return n0.c(this.f34370a, hVar.f34370a) && n0.c(this.f34371b, hVar.f34371b) && n0.c(this.f34372c, hVar.f34372c) && n0.c(this.f34373d, hVar.f34373d) && n0.c(this.f34374e, hVar.f34374e);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f34370a;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34371b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f34372c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f34373d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f34374e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
