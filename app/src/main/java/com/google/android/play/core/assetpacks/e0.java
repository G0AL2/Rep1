package com.google.android.play.core.assetpacks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e0 extends b {

    /* renamed from: a  reason: collision with root package name */
    private final int f22806a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22807b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22808c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(int i10, String str, String str2) {
        this.f22806a = i10;
        this.f22807b = str;
        this.f22808c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String b() {
        return this.f22808c;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final int c() {
        return this.f22806a;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String d() {
        return this.f22807b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f22806a == bVar.c() && ((str = this.f22807b) != null ? str.equals(bVar.d()) : bVar.d() == null)) {
                String str2 = this.f22808c;
                String b10 = bVar.b();
                if (str2 != null ? str2.equals(b10) : b10 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f22806a ^ 1000003) * 1000003;
        String str = this.f22807b;
        int hashCode = (i10 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f22808c;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i10 = this.f22806a;
        String str = this.f22807b;
        String str2 = this.f22808c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb2.append("AssetPackLocation{packStorageMethod=");
        sb2.append(i10);
        sb2.append(", path=");
        sb2.append(str);
        sb2.append(", assetsPath=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
