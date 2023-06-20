package ib;

import java.util.logging.Logger;

/* compiled from: Platform.java */
/* loaded from: classes3.dex */
final class k {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Platform.java */
    /* loaded from: classes3.dex */
    public static final class b implements j {
        private b() {
        }
    }

    static {
        Logger.getLogger(k.class.getName());
        b();
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }

    private static j b() {
        return new b();
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
