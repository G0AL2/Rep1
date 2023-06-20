package ea;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: MediaFormatUtil.java */
/* loaded from: classes2.dex */
public final class u {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, fa.b bVar) {
        if (bVar != null) {
            d(mediaFormat, "color-transfer", bVar.f30204c);
            d(mediaFormat, "color-standard", bVar.f30202a);
            d(mediaFormat, "color-range", bVar.f30203b);
            a(mediaFormat, "hdr-static-info", bVar.f30205d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i10);
            mediaFormat.setByteBuffer(sb2.toString(), ByteBuffer.wrap(list.get(i10)));
        }
    }
}
