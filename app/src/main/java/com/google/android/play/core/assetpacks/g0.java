package com.google.android.play.core.assetpacks;

import java.util.Map;

/* loaded from: classes3.dex */
final class g0 extends c {

    /* renamed from: a  reason: collision with root package name */
    private final long f22835a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, AssetPackState> f22836b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(long j10, Map<String, AssetPackState> map) {
        this.f22835a = j10;
        this.f22836b = map;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final Map<String, AssetPackState> e() {
        return this.f22836b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f22835a == cVar.f() && this.f22836b.equals(cVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final long f() {
        return this.f22835a;
    }

    public final int hashCode() {
        long j10 = this.f22835a;
        return this.f22836b.hashCode() ^ ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j10 = this.f22835a;
        String valueOf = String.valueOf(this.f22836b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 61);
        sb2.append("AssetPackStates{totalBytes=");
        sb2.append(j10);
        sb2.append(", packStates=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
