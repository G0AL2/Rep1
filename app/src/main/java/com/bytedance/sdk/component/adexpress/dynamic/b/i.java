package com.bytedance.sdk.component.adexpress.dynamic.b;

import java.util.Arrays;

/* compiled from: DynamicPoint.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public float f9625a;

    /* renamed from: b  reason: collision with root package name */
    public float f9626b;

    public i(float f10, float f11) {
        this.f9625a = f10;
        this.f9626b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(iVar.f9625a, this.f9625a) == 0 && Float.compare(iVar.f9626b, this.f9626b) == 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9625a), Float.valueOf(this.f9626b)});
    }
}
