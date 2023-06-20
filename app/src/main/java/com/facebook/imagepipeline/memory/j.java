package com.facebook.imagepipeline.memory;

/* compiled from: MemoryChunkUtil.java */
/* loaded from: classes.dex */
public class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10, int i11, int i12) {
        return Math.min(Math.max(0, i12 - i10), i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int i10, int i11, int i12, int i13, int i14) {
        y3.k.b(Boolean.valueOf(i13 >= 0));
        y3.k.b(Boolean.valueOf(i10 >= 0));
        y3.k.b(Boolean.valueOf(i12 >= 0));
        y3.k.b(Boolean.valueOf(i10 + i13 <= i14));
        y3.k.b(Boolean.valueOf(i12 + i13 <= i11));
    }
}
