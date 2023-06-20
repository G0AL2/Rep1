package com.google.android.play.core.assetpacks;

import java.util.Objects;

/* loaded from: classes3.dex */
final class f0 extends AssetPackState {

    /* renamed from: a  reason: collision with root package name */
    private final String f22821a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22822b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22823c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22824d;

    /* renamed from: e  reason: collision with root package name */
    private final long f22825e;

    /* renamed from: f  reason: collision with root package name */
    private final int f22826f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(String str, int i10, int i11, long j10, long j11, int i12) {
        Objects.requireNonNull(str, "Null name");
        this.f22821a = str;
        this.f22822b = i10;
        this.f22823c = i11;
        this.f22824d = j10;
        this.f22825e = j11;
        this.f22826f = i12;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long c() {
        return this.f22824d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int d() {
        return this.f22823c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String e() {
        return this.f22821a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f22821a.equals(assetPackState.e()) && this.f22822b == assetPackState.f() && this.f22823c == assetPackState.d() && this.f22824d == assetPackState.c() && this.f22825e == assetPackState.g() && this.f22826f == assetPackState.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int f() {
        return this.f22822b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long g() {
        return this.f22825e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int h() {
        return this.f22826f;
    }

    public final int hashCode() {
        int hashCode = this.f22821a.hashCode();
        int i10 = this.f22822b;
        int i11 = this.f22823c;
        long j10 = this.f22824d;
        long j11 = this.f22825e;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f22826f;
    }

    public final String toString() {
        String str = this.f22821a;
        int i10 = this.f22822b;
        int i11 = this.f22823c;
        long j10 = this.f22824d;
        long j11 = this.f22825e;
        int i12 = this.f22826f;
        StringBuilder sb2 = new StringBuilder(str.length() + 185);
        sb2.append("AssetPackState{name=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(i10);
        sb2.append(", errorCode=");
        sb2.append(i11);
        sb2.append(", bytesDownloaded=");
        sb2.append(j10);
        sb2.append(", totalBytesToDownload=");
        sb2.append(j11);
        sb2.append(", transferProgressPercentage=");
        sb2.append(i12);
        sb2.append("}");
        return sb2.toString();
    }
}
