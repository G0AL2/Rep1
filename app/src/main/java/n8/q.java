package n8;

import ea.n0;
import java.util.UUID;

/* compiled from: FrameworkCryptoConfig.java */
/* loaded from: classes2.dex */
public final class q implements m8.b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f34712d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f34713a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f34714b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f34715c;

    static {
        boolean z10;
        if ("Amazon".equals(n0.f29711c)) {
            String str = n0.f29712d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f34712d = z10;
            }
        }
        z10 = false;
        f34712d = z10;
    }

    public q(UUID uuid, byte[] bArr, boolean z10) {
        this.f34713a = uuid;
        this.f34714b = bArr;
        this.f34715c = z10;
    }
}
