package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

/* compiled from: TouchEventCoalescingKeyHelper.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f15842a = new SparseIntArray();

    public void a(long j10) {
        this.f15842a.put((int) j10, 0);
    }

    public short b(long j10) {
        int i10 = this.f15842a.get((int) j10, -1);
        if (i10 != -1) {
            return (short) (65535 & i10);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public boolean c(long j10) {
        return this.f15842a.get((int) j10, -1) != -1;
    }

    public void d(long j10) {
        int i10 = (int) j10;
        int i11 = this.f15842a.get(i10, -1);
        if (i11 != -1) {
            this.f15842a.put(i10, i11 + 1);
            return;
        }
        throw new RuntimeException("Tried to increment non-existent cookie");
    }

    public void e(long j10) {
        this.f15842a.delete((int) j10);
    }
}
