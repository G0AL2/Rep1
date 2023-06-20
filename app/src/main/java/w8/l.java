package w8;

import ea.a0;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PsshAtomUtil.java */
/* loaded from: classes2.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PsshAtomUtil.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final UUID f38435a;

        /* renamed from: b  reason: collision with root package name */
        private final int f38436b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f38437c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f38435a = uuid;
            this.f38436b = i10;
            this.f38437c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    private static a d(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        if (a0Var.f() < 32) {
            return null;
        }
        a0Var.P(0);
        if (a0Var.n() == a0Var.a() + 4 && a0Var.n() == 1886614376) {
            int c10 = w8.a.c(a0Var.n());
            if (c10 > 1) {
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unsupported pssh version: ");
                sb2.append(c10);
                ea.r.h("PsshAtomUtil", sb2.toString());
                return null;
            }
            UUID uuid = new UUID(a0Var.w(), a0Var.w());
            if (c10 == 1) {
                a0Var.Q(a0Var.H() * 16);
            }
            int H = a0Var.H();
            if (H != a0Var.a()) {
                return null;
            }
            byte[] bArr2 = new byte[H];
            a0Var.j(bArr2, 0, H);
            return new a(uuid, c10, bArr2);
        }
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f38435a)) {
            return d10.f38437c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(d10.f38435a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
        sb2.append("UUID mismatch. Expected: ");
        sb2.append(valueOf);
        sb2.append(", got: ");
        sb2.append(valueOf2);
        sb2.append(".");
        ea.r.h("PsshAtomUtil", sb2.toString());
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f38435a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f38436b;
    }
}
