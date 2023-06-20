package j8;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: ExoPlaybackException.java */
/* loaded from: classes2.dex */
public final class n extends m2 {

    /* renamed from: c  reason: collision with root package name */
    public final int f32626c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32627d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32628e;

    /* renamed from: f  reason: collision with root package name */
    public final p1 f32629f;

    /* renamed from: g  reason: collision with root package name */
    public final int f32630g;

    /* renamed from: h  reason: collision with root package name */
    public final i9.s f32631h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f32632i;

    private n(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    public static n c(Throwable th, String str, int i10, p1 p1Var, int i11, boolean z10, int i12) {
        return new n(1, th, null, i12, str, i10, p1Var, p1Var == null ? 4 : i11, z10);
    }

    public static n d(IOException iOException, int i10) {
        return new n(0, iOException, i10);
    }

    @Deprecated
    public static n e(RuntimeException runtimeException) {
        return f(runtimeException, 1000);
    }

    public static n f(RuntimeException runtimeException, int i10) {
        return new n(2, runtimeException, i10);
    }

    private static String g(int i10, String str, String str2, int i11, p1 p1Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String valueOf = String.valueOf(p1Var);
            String Y = ea.n0.Y(i12);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 53 + valueOf.length() + String.valueOf(Y).length());
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i11);
            sb2.append(", format=");
            sb2.append(valueOf);
            sb2.append(", format_supported=");
            sb2.append(Y);
            str3 = sb2.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        String valueOf2 = String.valueOf(str3);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 2 + String.valueOf(str).length());
        sb3.append(valueOf2);
        sb3.append(": ");
        sb3.append(str);
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n b(i9.s sVar) {
        return new n((String) ea.n0.j(getMessage()), getCause(), this.f32623a, this.f32626c, this.f32627d, this.f32628e, this.f32629f, this.f32630g, sVar, this.f32624b, this.f32632i);
    }

    private n(int i10, Throwable th, String str, int i11, String str2, int i12, p1 p1Var, int i13, boolean z10) {
        this(g(i10, str, str2, i12, p1Var, i13), th, i11, i10, str2, i12, p1Var, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private n(String str, Throwable th, int i10, int i11, String str2, int i12, p1 p1Var, int i13, i9.s sVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        boolean z11 = false;
        ea.a.a(!z10 || i11 == 1);
        ea.a.a((th != null || i11 == 3) ? true : true);
        this.f32626c = i11;
        this.f32627d = str2;
        this.f32628e = i12;
        this.f32629f = p1Var;
        this.f32630g = i13;
        this.f32631h = sVar;
        this.f32632i = z10;
    }
}
