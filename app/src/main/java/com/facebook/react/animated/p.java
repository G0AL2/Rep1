package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: SubtractionAnimatedNode.java */
/* loaded from: classes.dex */
class p extends s {

    /* renamed from: i  reason: collision with root package name */
    private final l f15320i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f15321j;

    public p(ReadableMap readableMap, l lVar) {
        this.f15320i = lVar;
        ReadableArray array = readableMap.getArray("input");
        this.f15321j = new int[array.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f15321j;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = array.getInt(i10);
            i10++;
        }
    }

    @Override // com.facebook.react.animated.s, com.facebook.react.animated.b
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SubtractionAnimatedNode[");
        sb2.append(this.f15238d);
        sb2.append("]: input nodes: ");
        int[] iArr = this.f15321j;
        sb2.append(iArr != null ? iArr.toString() : "null");
        sb2.append(" - super: ");
        sb2.append(super.d());
        return sb2.toString();
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f15321j;
            if (i10 >= iArr.length) {
                return;
            }
            b o10 = this.f15320i.o(iArr[i10]);
            if (o10 == null || !(o10 instanceof s)) {
                break;
            }
            double k10 = ((s) o10).k();
            if (i10 == 0) {
                this.f15333f = k10;
            } else {
                this.f15333f -= k10;
            }
            i10++;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
    }
}
