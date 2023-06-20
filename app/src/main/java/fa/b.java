package fa;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j8.g;
import java.util.Arrays;

/* compiled from: ColorInfo.java */
/* loaded from: classes2.dex */
public final class b implements j8.g {

    /* renamed from: f */
    public static final g.a<b> f30201f = new g.a() { // from class: fa.a
        @Override // j8.g.a
        public final j8.g a(Bundle bundle) {
            return b.a(bundle);
        }
    };

    /* renamed from: a */
    public final int f30202a;

    /* renamed from: b */
    public final int f30203b;

    /* renamed from: c */
    public final int f30204c;

    /* renamed from: d */
    public final byte[] f30205d;

    /* renamed from: e */
    private int f30206e;

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f30202a = i10;
        this.f30203b = i11;
        this.f30204c = i12;
        this.f30205d = bArr;
    }

    public static /* synthetic */ b a(Bundle bundle) {
        return e(bundle);
    }

    public static int b(int i10) {
        if (i10 != 1) {
            if (i10 != 9) {
                return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    public static int c(int i10) {
        if (i10 != 1) {
            if (i10 != 16) {
                if (i10 != 18) {
                    return (i10 == 6 || i10 == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ b e(Bundle bundle) {
        return new b(bundle.getInt(d(0), -1), bundle.getInt(d(1), -1), bundle.getInt(d(2), -1), bundle.getByteArray(d(3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f30202a == bVar.f30202a && this.f30203b == bVar.f30203b && this.f30204c == bVar.f30204c && Arrays.equals(this.f30205d, bVar.f30205d);
    }

    public int hashCode() {
        if (this.f30206e == 0) {
            this.f30206e = ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f30202a) * 31) + this.f30203b) * 31) + this.f30204c) * 31) + Arrays.hashCode(this.f30205d);
        }
        return this.f30206e;
    }

    public String toString() {
        int i10 = this.f30202a;
        int i11 = this.f30203b;
        int i12 = this.f30204c;
        boolean z10 = this.f30205d != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}
