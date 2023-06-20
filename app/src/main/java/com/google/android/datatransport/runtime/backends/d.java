package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.a;
import com.google.auto.value.AutoValue;
import w7.i;

/* compiled from: BackendRequest.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class d {

    /* compiled from: BackendRequest.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract d a();

        public abstract a b(Iterable<i> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<i> b();

    public abstract byte[] c();
}
