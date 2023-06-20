package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: d  reason: collision with root package name */
    public static final s f19332d = new s(new r[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f19333a;

    /* renamed from: b  reason: collision with root package name */
    public final r[] f19334b;

    /* renamed from: c  reason: collision with root package name */
    public int f19335c;

    public s(r... rVarArr) {
        this.f19334b = rVarArr;
        this.f19333a = rVarArr.length;
    }

    public int a(r rVar) {
        for (int i10 = 0; i10 < this.f19333a; i10++) {
            if (this.f19334b[i10] == rVar) {
                return i10;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f19333a == sVar.f19333a && Arrays.equals(this.f19334b, sVar.f19334b);
    }

    public int hashCode() {
        if (this.f19335c == 0) {
            this.f19335c = Arrays.hashCode(this.f19334b);
        }
        return this.f19335c;
    }
}
