package j8;

import java.util.HashSet;

/* compiled from: ExoPlayerLibraryInfo.java */
/* loaded from: classes2.dex */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<String> f32620a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static String f32621b = "goog.exo.core";

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f32622c = 0;

    private m1() {
    }

    public static synchronized void a(String str) {
        synchronized (m1.class) {
            if (f32620a.add(str)) {
                String str2 = f32621b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(str);
                f32621b = sb2.toString();
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (m1.class) {
            str = f32621b;
        }
        return str;
    }
}
