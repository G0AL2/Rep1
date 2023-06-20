package com.google.android.gms.iid;

/* loaded from: classes2.dex */
public final class zzaa extends Exception {
    private final int errorCode;

    public zzaa(int i10, String str) {
        super(str);
        this.errorCode = i10;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
