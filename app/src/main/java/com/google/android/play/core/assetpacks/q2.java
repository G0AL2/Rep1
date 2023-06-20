package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class q2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f22989a;

    /* renamed from: b  reason: collision with root package name */
    private final long f22990b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22991c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f22992d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f22993e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f22994f;

    q2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q2(String str, long j10, int i10, boolean z10, boolean z11, byte[] bArr) {
        this();
        this.f22989a = str;
        this.f22990b = j10;
        this.f22991c = i10;
        this.f22992d = z10;
        this.f22993e = z11;
        this.f22994f = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q2 a(String str, long j10, int i10, boolean z10, byte[] bArr, boolean z11) {
        return new q2(str, j10, i10, z10, z11, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        if (d() == null) {
            return false;
        }
        return d().endsWith("/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return f() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f22989a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long e() {
        return this.f22990b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q2) {
            q2 q2Var = (q2) obj;
            String str = this.f22989a;
            if (str != null ? str.equals(q2Var.d()) : q2Var.d() == null) {
                if (this.f22990b == q2Var.e() && this.f22991c == q2Var.f() && this.f22992d == q2Var.g() && this.f22993e == q2Var.h() && Arrays.equals(this.f22994f, q2Var.f22994f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f22991c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f22992d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.f22993e;
    }

    public int hashCode() {
        String str = this.f22989a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f22990b;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f22991c) * 1000003) ^ (true != this.f22992d ? 1237 : 1231)) * 1000003) ^ (true == this.f22993e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f22994f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] i() {
        return this.f22994f;
    }

    public String toString() {
        String str = this.f22989a;
        long j10 = this.f22990b;
        int i10 = this.f22991c;
        boolean z10 = this.f22992d;
        boolean z11 = this.f22993e;
        String arrays = Arrays.toString(this.f22994f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb2.append("ZipEntry{name=");
        sb2.append(str);
        sb2.append(", size=");
        sb2.append(j10);
        sb2.append(", compressionMethod=");
        sb2.append(i10);
        sb2.append(", isPartial=");
        sb2.append(z10);
        sb2.append(", isEndOfArchive=");
        sb2.append(z11);
        sb2.append(", headerBytes=");
        sb2.append(arrays);
        sb2.append("}");
        return sb2.toString();
    }
}
