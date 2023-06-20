package com.facebook.datasource;

/* compiled from: BaseDataSubscriber.java */
/* loaded from: classes.dex */
public abstract class b<T> implements e<T> {
    @Override // com.facebook.datasource.e
    public void a(c<T> cVar) {
    }

    @Override // com.facebook.datasource.e
    public void b(c<T> cVar) {
        try {
            e(cVar);
        } finally {
            cVar.close();
        }
    }

    @Override // com.facebook.datasource.e
    public void c(c<T> cVar) {
        boolean c10 = cVar.c();
        try {
            f(cVar);
        } finally {
            if (c10) {
                cVar.close();
            }
        }
    }

    @Override // com.facebook.datasource.e
    public void d(c<T> cVar) {
    }

    protected abstract void e(c<T> cVar);

    protected abstract void f(c<T> cVar);
}
