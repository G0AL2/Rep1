package com.facebook.imagepipeline.memory;

import z5.s;
import z5.t;

@y3.d
/* loaded from: classes.dex */
public class NativeMemoryChunkPool extends i {
    @y3.d
    public NativeMemoryChunkPool(b4.c cVar, s sVar, t tVar) {
        super(cVar, sVar, tVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.i
    /* renamed from: E */
    public NativeMemoryChunk z(int i10) {
        return new NativeMemoryChunk(i10);
    }
}
