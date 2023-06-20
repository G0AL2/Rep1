package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.b;
import z5.s;
import z5.t;

/* compiled from: GenericByteArrayPool.java */
/* loaded from: classes.dex */
public class g extends b<byte[]> implements b4.a {

    /* renamed from: k  reason: collision with root package name */
    private final int[] f14847k;

    public g(b4.c cVar, s sVar, t tVar) {
        super(cVar, sVar, tVar);
        SparseIntArray sparseIntArray = (SparseIntArray) y3.k.g(sVar.f40057c);
        this.f14847k = new int[sparseIntArray.size()];
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            this.f14847k[i10] = sparseIntArray.keyAt(i10);
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: A */
    public void j(byte[] bArr) {
        y3.k.g(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: B */
    public int n(byte[] bArr) {
        y3.k.g(bArr);
        return bArr.length;
    }

    @Override // com.facebook.imagepipeline.memory.b
    protected int m(int i10) {
        int[] iArr;
        if (i10 > 0) {
            for (int i11 : this.f14847k) {
                if (i11 >= i10) {
                    return i11;
                }
            }
            return i10;
        }
        throw new b.C0197b(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    public int o(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: z */
    public byte[] f(int i10) {
        return new byte[i10];
    }
}
