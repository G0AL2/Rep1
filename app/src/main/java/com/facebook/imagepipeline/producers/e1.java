package com.facebook.imagepipeline.producers;

/* compiled from: ThumbnailSizeChecker.java */
/* loaded from: classes.dex */
public final class e1 {
    public static int a(int i10) {
        return (int) (i10 * 1.3333334f);
    }

    public static boolean b(int i10, int i11, q5.e eVar) {
        return eVar == null ? ((float) a(i10)) >= 2048.0f && a(i11) >= 2048 : a(i10) >= eVar.f35945a && a(i11) >= eVar.f35946b;
    }

    public static boolean c(w5.e eVar, q5.e eVar2) {
        if (eVar == null) {
            return false;
        }
        int O = eVar.O();
        if (O != 90 && O != 270) {
            return b(eVar.Z(), eVar.z(), eVar2);
        }
        return b(eVar.z(), eVar.Z(), eVar2);
    }
}
