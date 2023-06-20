package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;

/* compiled from: SoSource.java */
/* loaded from: classes.dex */
public abstract class q {
    public abstract int a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i10) throws IOException {
    }

    public abstract File c(String str) throws IOException;

    public String toString() {
        return getClass().getName();
    }
}
