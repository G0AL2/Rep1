package com.facebook.datasource;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: DataSource.java */
/* loaded from: classes.dex */
public interface c<T> {
    T a();

    boolean b();

    boolean c();

    boolean close();

    Throwable d();

    void e(e<T> eVar, Executor executor);

    float f();

    boolean g();

    Map<String, Object> getExtras();
}
