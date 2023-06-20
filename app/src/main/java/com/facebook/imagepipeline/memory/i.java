package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.b;
import z5.s;
import z5.t;

/* compiled from: MemoryChunkPool.java */
/* loaded from: classes.dex */
public abstract class i extends b<h> {

    /* renamed from: k  reason: collision with root package name */
    private final int[] f14848k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(b4.c cVar, s sVar, t tVar) {
        super(cVar, sVar, tVar);
        SparseIntArray sparseIntArray = (SparseIntArray) y3.k.g(sVar.f40057c);
        this.f14848k = new int[sparseIntArray.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f14848k;
            if (i10 < iArr.length) {
                iArr[i10] = sparseIntArray.keyAt(i10);
                i10++;
            } else {
                r();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: A */
    public void j(h hVar) {
        y3.k.g(hVar);
        hVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: B */
    public int n(h hVar) {
        y3.k.g(hVar);
        return hVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int C() {
        return this.f14848k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: D */
    public boolean t(h hVar) {
        y3.k.g(hVar);
        return !hVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.b
    protected int m(int i10) {
        int[] iArr;
        if (i10 > 0) {
            for (int i11 : this.f14848k) {
                if (i11 >= i10) {
                    return i11;
                }
            }
            return i10;
        }
        throw new b.C0197b(Integer.valueOf(i10));
    }

    @Override // com.facebook.imagepipeline.memory.b
    protected int o(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: z */
    public abstract h f(int i10);
}
