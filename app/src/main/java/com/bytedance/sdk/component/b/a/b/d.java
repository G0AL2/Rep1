package com.bytedance.sdk.component.b.a.b;

import com.inmobi.media.fq;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public class d implements Serializable, Comparable<d> {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f10008a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f10009b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    public static final d f10010c = a(new byte[0]);

    /* renamed from: d  reason: collision with root package name */
    final byte[] f10011d;

    /* renamed from: e  reason: collision with root package name */
    transient int f10012e;

    /* renamed from: f  reason: collision with root package name */
    transient String f10013f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(byte[] bArr) {
        this.f10011d = bArr;
    }

    public static d a(byte... bArr) {
        if (bArr != null) {
            return new d((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String b() {
        byte[] bArr = this.f10011d;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f10008a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public int c() {
        return this.f10011d.length;
    }

    public byte[] d() {
        return (byte[]) this.f10011d.clone();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            int c10 = dVar.c();
            byte[] bArr = this.f10011d;
            if (c10 == bArr.length && dVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f10012e;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f10011d);
        this.f10012e = hashCode;
        return hashCode;
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f10011d.length == 0) {
            return "[size=0]";
        }
        String a10 = a();
        int a11 = a(a10, 64);
        if (a11 == -1) {
            if (this.f10011d.length <= 64) {
                return "[hex=" + b() + "]";
            }
            return "[size=" + this.f10011d.length + " hex=" + a(0, 64).b() + "…]";
        }
        String replace = a10.substring(0, a11).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a11 < a10.length()) {
            sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(this.f10011d.length);
            sb2.append(" text=");
            sb2.append(replace);
            sb2.append("…]");
        } else {
            sb2 = new StringBuilder();
            sb2.append("[text=");
            sb2.append(replace);
            sb2.append("]");
        }
        return sb2.toString();
    }

    public String a() {
        String str = this.f10013f;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f10011d, f10009b);
        this.f10013f = str2;
        return str2;
    }

    public d a(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.f10011d;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.f10011d.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new d(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte a(int i10) {
        return this.f10011d[i10];
    }

    public boolean a(int i10, d dVar, int i11, int i12) {
        return dVar.a(i11, this.f10011d, i10, i12);
    }

    public boolean a(int i10, byte[] bArr, int i11, int i12) {
        if (i10 >= 0) {
            byte[] bArr2 = this.f10011d;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && i.a(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(d dVar) {
        int c10 = c();
        int c11 = dVar.c();
        int min = Math.min(c10, c11);
        for (int i10 = 0; i10 < min; i10++) {
            int a10 = a(i10) & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            int a11 = dVar.a(i10) & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            if (a10 != a11) {
                return a10 < a11 ? -1 : 1;
            }
        }
        if (c10 == c11) {
            return 0;
        }
        return c10 < c11 ? -1 : 1;
    }

    static int a(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (i12 == i10) {
                return i11;
            }
            int codePointAt = str.codePointAt(i11);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i12++;
            i11 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
