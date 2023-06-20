package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: MultiplicationAnimatedNode.java */
/* loaded from: classes.dex */
class k extends s {

    /* renamed from: i  reason: collision with root package name */
    private final l f15278i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f15279j;

    public k(ReadableMap readableMap, l lVar) {
        this.f15278i = lVar;
        ReadableArray array = readableMap.getArray("input");
        this.f15279j = new int[array.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f15279j;
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
        sb2.append("MultiplicationAnimatedNode[");
        sb2.append(this.f15238d);
        sb2.append("]: input nodes: ");
        int[] iArr = this.f15279j;
        sb2.append(iArr != null ? iArr.toString() : "null");
        sb2.append(" - super: ");
        sb2.append(super.d());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        throw new com.facebook.react.bridge.JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.multiply node");
     */
    @Override // com.facebook.react.animated.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            r6 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6.f15333f = r0
            r0 = 0
        L5:
            int[] r1 = r6.f15279j
            int r2 = r1.length
            if (r0 >= r2) goto L2f
            com.facebook.react.animated.l r2 = r6.f15278i
            r1 = r1[r0]
            com.facebook.react.animated.b r1 = r2.o(r1)
            if (r1 == 0) goto L27
            boolean r2 = r1 instanceof com.facebook.react.animated.s
            if (r2 == 0) goto L27
            double r2 = r6.f15333f
            com.facebook.react.animated.s r1 = (com.facebook.react.animated.s) r1
            double r4 = r1.k()
            double r2 = r2 * r4
            r6.f15333f = r2
            int r0 = r0 + 1
            goto L5
        L27:
            com.facebook.react.bridge.JSApplicationCausedNativeException r0 = new com.facebook.react.bridge.JSApplicationCausedNativeException
            java.lang.String r1 = "Illegal node ID set as an input for Animated.multiply node"
            r0.<init>(r1)
            throw r0
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.k.g():void");
    }
}
