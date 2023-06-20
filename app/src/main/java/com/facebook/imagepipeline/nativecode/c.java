package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;

/* compiled from: NativeImageTranscoderFactory.java */
/* loaded from: classes.dex */
public final class c {
    public static d6.d a(int i10, boolean z10, boolean z11) {
        try {
            Class cls = Boolean.TYPE;
            return (d6.d) NativeJpegTranscoderFactory.class.getConstructor(Integer.TYPE, cls, cls).newInstance(Integer.valueOf(i10), Boolean.valueOf(z10), Boolean.valueOf(z11));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e10) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e10);
        }
    }
}
