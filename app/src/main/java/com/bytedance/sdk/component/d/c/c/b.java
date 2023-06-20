package com.bytedance.sdk.component.d.c.c;

import java.io.Closeable;

/* compiled from: IOUtils.java */
/* loaded from: classes.dex */
public class b {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
