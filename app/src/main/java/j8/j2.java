package j8;

import java.io.IOException;

/* compiled from: ParserException.java */
/* loaded from: classes2.dex */
public class j2 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32504a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32505b;

    /* JADX INFO: Access modifiers changed from: protected */
    public j2(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f32504a = z10;
        this.f32505b = i10;
    }

    public static j2 a(String str, Throwable th) {
        return new j2(str, th, true, 1);
    }

    public static j2 b(String str, Throwable th) {
        return new j2(str, th, true, 0);
    }

    public static j2 c(String str, Throwable th) {
        return new j2(str, th, true, 4);
    }

    public static j2 d(String str) {
        return new j2(str, null, false, 1);
    }
}
