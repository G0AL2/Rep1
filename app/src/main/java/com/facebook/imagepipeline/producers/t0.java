package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: QualifiedResourceFetchProducer.java */
/* loaded from: classes.dex */
public class t0 extends e0 {

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f15114c;

    public t0(Executor executor, b4.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f15114c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected w5.e d(b6.b bVar) throws IOException {
        InputStream openInputStream = this.f15114c.openInputStream(bVar.q());
        y3.k.h(openInputStream, "ContentResolver returned null InputStream");
        return e(openInputStream, -1);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "QualifiedResourceFetchProducer";
    }
}
