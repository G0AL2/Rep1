package com.google.android.play.core.assetpacks;

/* loaded from: classes3.dex */
final class j2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f22884a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22885b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22886c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22887d;

    /* renamed from: e  reason: collision with root package name */
    private final int f22888e;

    j2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j2(int i10, String str, long j10, long j11, int i11) {
        this();
        this.f22884a = i10;
        this.f22885b = str;
        this.f22886c = j10;
        this.f22887d = j11;
        this.f22888e = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f22884a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f22885b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long c() {
        return this.f22886c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long d() {
        return this.f22887d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f22888e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            j2 j2Var = (j2) obj;
            if (this.f22884a == j2Var.a() && ((str = this.f22885b) != null ? str.equals(j2Var.b()) : j2Var.b() == null) && this.f22886c == j2Var.c() && this.f22887d == j2Var.d() && this.f22888e == j2Var.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f22884a ^ 1000003) * 1000003;
        String str = this.f22885b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f22886c;
        long j11 = this.f22887d;
        return ((((((i10 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f22888e;
    }

    public String toString() {
        int i10 = this.f22884a;
        String str = this.f22885b;
        long j10 = this.f22886c;
        long j11 = this.f22887d;
        int i11 = this.f22888e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 157);
        sb2.append("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(i10);
        sb2.append(", filePath=");
        sb2.append(str);
        sb2.append(", fileOffset=");
        sb2.append(j10);
        sb2.append(", remainingBytes=");
        sb2.append(j11);
        sb2.append(", previousChunk=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
