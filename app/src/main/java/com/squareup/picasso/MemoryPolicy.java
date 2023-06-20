package com.squareup.picasso;

/* loaded from: classes3.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int index;

    MemoryPolicy(int i10) {
        this.index = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean shouldReadFromMemoryCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean shouldWriteToMemoryCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
