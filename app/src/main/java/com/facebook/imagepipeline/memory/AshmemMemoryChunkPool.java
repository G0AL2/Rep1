package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import z5.s;
import z5.t;

@y3.d
@TargetApi(27)
/* loaded from: classes.dex */
public class AshmemMemoryChunkPool extends i {
    @y3.d
    public AshmemMemoryChunkPool(b4.c cVar, s sVar, t tVar) {
        super(cVar, sVar, tVar);
    }

    @Override // com.facebook.imagepipeline.memory.i
    /* renamed from: E */
    public a z(int i10) {
        return new a(i10);
    }
}
