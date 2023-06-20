package w5;

import com.google.android.gms.common.api.Api;

/* compiled from: ImmutableQualityInfo.java */
/* loaded from: classes.dex */
public class i implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final j f38227d = d(Api.BaseClientBuilder.API_PRIORITY_OTHER, true, true);

    /* renamed from: a  reason: collision with root package name */
    int f38228a;

    /* renamed from: b  reason: collision with root package name */
    boolean f38229b;

    /* renamed from: c  reason: collision with root package name */
    boolean f38230c;

    private i(int i10, boolean z10, boolean z11) {
        this.f38228a = i10;
        this.f38229b = z10;
        this.f38230c = z11;
    }

    public static j d(int i10, boolean z10, boolean z11) {
        return new i(i10, z10, z11);
    }

    @Override // w5.j
    public boolean a() {
        return this.f38230c;
    }

    @Override // w5.j
    public boolean b() {
        return this.f38229b;
    }

    @Override // w5.j
    public int c() {
        return this.f38228a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f38228a == iVar.f38228a && this.f38229b == iVar.f38229b && this.f38230c == iVar.f38230c;
        }
        return false;
    }

    public int hashCode() {
        return (this.f38228a ^ (this.f38229b ? 4194304 : 0)) ^ (this.f38230c ? 8388608 : 0);
    }
}
