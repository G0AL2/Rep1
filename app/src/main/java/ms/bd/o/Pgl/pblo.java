package ms.bd.o.Pgl;

import android.content.Context;
import android.os.Process;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
public abstract class pblo extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, int i11, long j10, String str, Object obj) throws Throwable {
        boolean z10;
        Context b10;
        int i12;
        String[] strArr = {(String) pblk.a(16777217, 0, 0L, "ce879f", new byte[]{115, 105, 79, 81, 9, 120, 100, 10, 121, 98, 96, 106, 66, 80, 21, 120, 111, 74, 39, 78, 92, 83, 110, 113, 40, 84, 84})};
        try {
            b10 = pgla.a().b();
        } catch (Throwable unused) {
        }
        for (i12 = 0; i12 < 1; i12++) {
            if (b10.checkPermission(strArr[i12], Process.myPid(), Process.myUid()) != 0) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        if (z10) {
            switch (i10) {
                case 196609:
                    Object[] objArr = (Object[]) obj;
                    return a(str, (byte[]) objArr[0], (String) objArr[1], (String) objArr[2]);
                case 196610:
                    Object[] objArr2 = (Object[]) obj;
                    return b(str, (String) objArr2[0], (String) objArr2[1]);
                case 196611:
                    Object[] objArr3 = (Object[]) obj;
                    return a(str, (String) objArr3[0], (String) objArr3[1]);
                default:
                    return super.a(i10, i11, j10, str, obj);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                String str = (String) pblk.a(16777217, 0, 0L, "c3cb49", new byte[]{Byte.MAX_VALUE, 50, 47, 21, 2});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                String str = (String) pblk.a(16777217, 0, 0L, "cfc1d9", new byte[]{Byte.MAX_VALUE, 103, 47, 70, 84});
            }
        }
    }

    public abstract Object[] a(String str, String str2, String str3);

    public abstract Object[] a(String str, byte[] bArr, String str2, String str3);

    public abstract Object[] b(String str, String str2, String str3);
}
