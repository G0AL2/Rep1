package com.bytedance.sdk.component.b.a.b;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentedByteString.java */
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: g  reason: collision with root package name */
    final transient byte[][] f10023g;

    /* renamed from: h  reason: collision with root package name */
    final transient int[] f10024h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(a aVar, int i10) {
        super(null);
        i.a(aVar.f10007b, 0L, i10);
        e eVar = aVar.f10006a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = eVar.f10016c;
            int i15 = eVar.f10015b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                eVar = eVar.f10019f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f10023g = new byte[i13];
        this.f10024h = new int[i13 * 2];
        e eVar2 = aVar.f10006a;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f10023g;
            bArr[i16] = eVar2.f10014a;
            int i17 = eVar2.f10016c;
            int i18 = eVar2.f10015b;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.f10024h;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            eVar2.f10017d = true;
            i16++;
            eVar2 = eVar2.f10019f;
        }
    }

    private d e() {
        return new d(d());
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public String a() {
        return e().a();
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public String b() {
        return e().b();
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public int c() {
        return this.f10024h[this.f10023g.length - 1];
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public byte[] d() {
        int[] iArr = this.f10024h;
        byte[][] bArr = this.f10023g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f10024h;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f10023g[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.c() == c() && a(0, dVar, 0, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public int hashCode() {
        int i10 = this.f10012e;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f10023g.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < length) {
            byte[] bArr = this.f10023g[i11];
            int[] iArr = this.f10024h;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i12) + i14;
            while (i14 < i16) {
                i13 = (i13 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i12 = i15;
        }
        this.f10012e = i13;
        return i13;
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public String toString() {
        return e().toString();
    }

    private int b(int i10) {
        int binarySearch = Arrays.binarySearch(this.f10024h, 0, this.f10023g.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public d a(int i10, int i11) {
        return e().a(i10, i11);
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public byte a(int i10) {
        i.a(this.f10024h[this.f10023g.length - 1], i10, 1L);
        int b10 = b(i10);
        int i11 = b10 == 0 ? 0 : this.f10024h[b10 - 1];
        int[] iArr = this.f10024h;
        byte[][] bArr = this.f10023g;
        return bArr[b10][(i10 - i11) + iArr[bArr.length + b10]];
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public boolean a(int i10, d dVar, int i11, int i12) {
        if (i10 < 0 || i10 > c() - i12) {
            return false;
        }
        int b10 = b(i10);
        while (i12 > 0) {
            int i13 = b10 == 0 ? 0 : this.f10024h[b10 - 1];
            int min = Math.min(i12, ((this.f10024h[b10] - i13) + i13) - i10);
            int[] iArr = this.f10024h;
            byte[][] bArr = this.f10023g;
            if (!dVar.a(i11, bArr[b10], (i10 - i13) + iArr[bArr.length + b10], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            b10++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.b.a.b.d
    public boolean a(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > c() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int b10 = b(i10);
        while (i12 > 0) {
            int i13 = b10 == 0 ? 0 : this.f10024h[b10 - 1];
            int min = Math.min(i12, ((this.f10024h[b10] - i13) + i13) - i10);
            int[] iArr = this.f10024h;
            byte[][] bArr2 = this.f10023g;
            if (!i.a(bArr2[b10], (i10 - i13) + iArr[bArr2.length + b10], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            b10++;
        }
        return true;
    }
}
