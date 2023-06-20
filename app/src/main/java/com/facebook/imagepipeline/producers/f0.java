package com.facebook.imagepipeline.producers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: LocalFileFetchProducer.java */
/* loaded from: classes.dex */
public class f0 extends e0 {
    public f0(Executor executor, b4.h hVar) {
        super(executor, hVar);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected w5.e d(b6.b bVar) throws IOException {
        return e(new FileInputStream(bVar.p().toString()), (int) bVar.p().length());
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "LocalFileFetchProducer";
    }
}
