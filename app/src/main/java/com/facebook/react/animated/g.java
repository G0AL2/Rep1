package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: DivisionAnimatedNode.java */
/* loaded from: classes.dex */
class g extends s {

    /* renamed from: i  reason: collision with root package name */
    private final l f15255i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f15256j;

    public g(ReadableMap readableMap, l lVar) {
        this.f15255i = lVar;
        ReadableArray array = readableMap.getArray("input");
        this.f15256j = new int[array.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f15256j;
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
        sb2.append("DivisionAnimatedNode[");
        sb2.append(this.f15238d);
        sb2.append("]: input nodes: ");
        int[] iArr = this.f15256j;
        sb2.append(iArr != null ? iArr.toString() : "null");
        sb2.append(" - super: ");
        sb2.append(super.d());
        return sb2.toString();
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f15256j;
            if (i10 >= iArr.length) {
                return;
            }
            b o10 = this.f15255i.o(iArr[i10]);
            if (o10 == null || !(o10 instanceof s)) {
                break;
            }
            double k10 = ((s) o10).k();
            if (i10 == 0) {
                this.f15333f = k10;
            } else if (k10 != 0.0d) {
                this.f15333f /= k10;
            } else {
                throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node with Animated ID " + this.f15238d);
            }
            i10++;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node with Animated ID " + this.f15238d);
    }
}
