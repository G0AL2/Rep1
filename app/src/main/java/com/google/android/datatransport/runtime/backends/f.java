package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.auto.value.AutoValue;

/* compiled from: CreationContext.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class f {
    public static f a(Context context, h8.a aVar, h8.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context b();

    public abstract String c();

    public abstract h8.a d();

    public abstract h8.a e();
}
